//import org.w3c.dom.Node;
//import java.util.HashMap;
//class Pair{
//    Node node;
//    int dist ;
//    Pair(Node node, int dist){
//        this.node = node;
//        this.dist = dist;
//    }
//}
//
//public class BurningTree {
//    static Node start;
//    static HashMap<Node, Node> parent;
//
//    public static int minTime(Node root, int target) {
//    start =null;
//    parent = new HashMap<>();
//    dfs(root,target);
//    }
//    private static void dfs(Node root,int target){
//        if(root==null) return ;
//        if(root.data==target) start =root;
//        if(root.left!=null) parent.put(root.left,root);
//        if(root.right!=null) parent.put(root.right,root);
//        dfs(root.left,target);
//        dfs(root.right,target);
//
//    }
//}
