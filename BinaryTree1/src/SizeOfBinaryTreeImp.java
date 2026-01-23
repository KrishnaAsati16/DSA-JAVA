// Number Of Nodes
class Node1{
    int val;
    Node right;
    Node left;
    Node1(int val){
        this.val = val;
    }
}
public class SizeOfBinaryTreeImp {
    static void main(String[] args) {
//         3
//       /    \
//    4         2
//   / \       /  \
// -1   1     6     9  creativity to H Bhai Dekh

        Node a = new Node(3); //root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b;   a.right =c;
        b.left = d;   b.right = e;
        c.left = f;   c.right =g;
        display(a);
        System.out.println();
        System.out.println(  size(a));
    }
    private static int size(Node root){
        if(root ==null) return 0;
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return 1 + leftSize + rightSize;
    }
    private static void display(Node root){
        if(root ==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);

    }

}
