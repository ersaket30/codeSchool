import java.util.HashMap;
import java.util.Map;

class TNode{
    int value;
    TNode left = null;
    TNode right = null;

    TNode(int value){
        this.value = value;
    }
}

class LeftView {
    public static void main(String[] args) {
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.right = new TNode(4);
        root.right.left = new TNode(5);
        root.right.right = new TNode(6);
        root.right.left.left = new TNode(7);
        root.right.left.right = new TNode(8);
        leftView(root);
    }

    private static void leftView(TNode root) {

        Map<Integer,Integer> level = new HashMap<>();
        getLeftView(root,0,level);
        level.entrySet().forEach(entry->System.out.println(entry.getValue()));
    }

    private static void getLeftView(TNode root, int level, Map<Integer, Integer> levelMap) {
        if(root == null){
            return;
        }
        levelMap.putIfAbsent(level,root.value);
        getLeftView(root.left,level+1,levelMap);
        getLeftView(root.right,level+1,levelMap);
    }
}