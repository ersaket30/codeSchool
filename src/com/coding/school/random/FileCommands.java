package com.coding.school.random;

import java.util.*;

class Solution {

    //https://github.com/efontan/java-subdirectories-challenge/tree/master/src/main

    /*
     * Complete the function below.
     */

    static void doIt(String[] input) {
        SubdirectoriesApplication application = new SubdirectoriesApplication();
        application.start(input);

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int _input_size = 0;
        _input_size = Integer.parseInt(in.nextLine().trim());
        String[] _input = new String[_input_size];
        String _input_item;
        for(int _input_i = 0; _input_i < _input_size; _input_i++) {
            try {
                _input_item = in.nextLine();
            } catch (Exception e) {
                _input_item = null;
            }
            _input[_input_i] = _input_item;
        }

        doIt(_input);

    }
}

class SubdirectoriesApplication {

    private FileSystem fileSystem;
    private CommandFactory commandFactory;
    private CommandExcecutor commandExcecutor;

    public SubdirectoriesApplication() {
        Directory root = new Directory("root", null);
        this.fileSystem = new FileSystem(root);
        this.commandFactory = new CommandFactory();
        this.commandExcecutor = new CommandExcecutor();
    }

    public void start(String[] input) {
        List<Command> comands = this.commandFactory.buildCommands(Arrays.asList(input));
        for (Command command : comands) {
            System.out.println(commandExcecutor.execute(command, fileSystem));
        }
    }

}

interface Command {

    String COMMAND_PREFIX = "Command: ";

    default String execute(FileSystem fileSystem){
        String executeExternal = this.executeInternal(fileSystem);
        if(!executeExternal.isEmpty()){
            return getOutputName() + "\n" + executeExternal;
        }else{
            return getOutputName();
        }
    }

    String executeInternal(FileSystem fileSystem);
    String getName();
    String getArgument();

    default String getOutputName() {
        if(!getArgument().isEmpty()){
            if(getName().contains("cd")){
                return COMMAND_PREFIX + getName() + "      " + getArgument();
            }
            return COMMAND_PREFIX + getName() + "   " + getArgument();
        }
        return COMMAND_PREFIX + getName();
    }
}

class CdCommand implements Command {

    private String argument;

    public CdCommand(String argument) {
        this.argument = argument;
    }

    public String executeInternal(FileSystem fileSystem) {
        Directory subdirectory = fileSystem.getCurrent().getSubdirectory(argument);

        if (subdirectory != null) {
            fileSystem.setCurrent(subdirectory);
            return "";
        }

        return "Subdirectory does not exist";
    }

    public String getName() {
        return CommandTypes.CD.getName();
    }

    @Override
    public String getArgument() {
        return argument;
    }

}

class DirCommand implements Command {

    private static final String DIRECTORY_FORMAT = "Directory of %s: \n";

    @Override
    public String executeInternal(FileSystem fileSystem) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(DIRECTORY_FORMAT, fileSystem.getCurrent().getAbsolutePath()));

        sb.append(fileSystem.getCurrent().printSubdirectories());
        return sb.toString();
    }

    @Override
    public String getName() {
        return CommandTypes.DIR.getName();
    }

    @Override
    public String getArgument() {
        return "";
    }
}

class MkdirCommand
        implements Command {

    private String argument;

    public MkdirCommand(String argument) {
        this.argument = argument;
    }

    public String executeInternal(FileSystem fileSystem) {
        boolean success = fileSystem.getCurrent().createSubdirectory(argument);

        return (success)? "" : "Subdirectory already exists";
    }

    public String getName() {
        return CommandTypes.MKDIR.getName();
    }

    @Override
    public String getArgument() {
        return argument;
    }
}

class UpCommand
        implements Command {

    public String executeInternal(FileSystem fileSystem) {
        Directory parent = fileSystem.getCurrent().getParent();
        if (parent == null) {
            return "Cannot move up from root directory";
        }
        fileSystem.setCurrent(parent);
        return "";
    }

    public String getName() {
        return CommandTypes.UP.getName();
    }

    @Override
    public String getArgument() {
        return "";
    }

}

enum CommandTypes {

    DIR("dir"), CD("cd"), MKDIR("mkdir"), UP("up");

    private String name;
    CommandTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class CommandExcecutor {

    public String execute(Command command, FileSystem fs) {
        return command.execute(fs);
    }
}

class CommandFactory {


    public List<Command> buildCommands(List<String> inputLines) {

        List<Command> commands = new ArrayList<>();

        for (String inputLine : inputLines) {
            if(inputLine != null){
                String[] splittedCommand = inputLine.split("\\s+");
                String commandName = splittedCommand[0];
                String argument = (splittedCommand.length > 1)? splittedCommand[1] : "";

                Command command = this.buildCommand(commandName, argument);
                if (command != null) commands.add(command);
            }
        }

        return commands;
    }

    private Command buildCommand(String commandName, String argument) {
        switch (commandName) {
            case "dir":
                return new DirCommand();
            case "cd":
                return new CdCommand(argument);
            case "mkdir":
                return new MkdirCommand(argument);
            case "up":
                return new UpCommand();
            default:
                return null;
        }

    }
}

class Directory {

    private String name;
    private Directory parent;
    private Map<String, Directory> childrens = new HashMap<>();

    public Directory(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return this.name;
    }

    public Directory getParent() {
        return this.parent;
    }

    public String printSubdirectories() {
        if (this.childrens.isEmpty()) return "No subdirectories";

        StringBuilder sb = new StringBuilder();

        Map<String, Directory> sortedChildrens = new TreeMap<>(childrens);
        for (Map.Entry<String, Directory> dir : sortedChildrens.entrySet()) {
            sb.append(dir.getKey() + this.getTabs(dir.getKey().length()));
        }
        return sb.toString();
    }

    private String getTabs(int wordLength) {
        int tabs = 8 - wordLength;
        return String.format("%" + tabs + "s", " ");
    }

    public boolean createSubdirectory(String dirName) {
        if (childrens.containsKey(dirName)) return false;

        Directory newDirectory = new Directory(dirName, this);
        return childrens.put(dirName, newDirectory) == null;
    }

    public Directory getSubdirectory(String dirName) {
        return this.childrens.getOrDefault(dirName, null);
    }

    public String getAbsolutePath() {
        Set<String> dirNames = new TreeSet<>();
        Directory current = this;
        while (current != null) {
            dirNames.add(current.getName());
            current = current.getParent();
        }

        return String.join("\\", dirNames);
    }
}

class FileSystem {

    private Directory root;
    private Directory current;

    public FileSystem(Directory root) {
        this.root = root;
        this.current = root;
    }

    public Directory getCurrent() {
        return current;
    }

    public Directory getRoot() {
        return root;
    }

    public void setCurrent(Directory dir) {
        this.current = dir;
    }
}
