package design.pattern.command;

/**
 * The Command pattern is a behavioral design pattern in Java that encapsulates a request as an object, thereby allowing the request to be passed as a parameter to other methods, stored in data structures, or used in the implementation of undo and redo operations.
 *
 * The Command pattern has the following components:
 *
 * Command: This is an interface that declares an execute() method, which encapsulates a request.
 *
 * ConcreteCommand: This is a class that implements the Command interface and defines the receiver object for the command.
 *
 * Receiver: This is a class that performs the actual work when the execute() method is called.
 *
 * Invoker: This is a class that invokes the command by calling the execute() method on the command object.
 *
 * Client: This is a class that creates the command object and sets its receiver.
 */
public interface Command {
    void execute();
}
