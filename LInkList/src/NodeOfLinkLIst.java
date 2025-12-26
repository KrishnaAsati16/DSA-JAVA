class Node1{
    int val;
    Node next;// next ka address
    Node1(int val) {
        this.val =val;
    }
}
public class NodeOfLinkLIst {
   public static void main(String[] args) {
                Node a = new Node(10); //a.val= 10;
                Node b = new Node(20); //b.val=20;
                Node c = new Node(30); //c.val= 30;
                Node d = new Node(40); //d.val=40;
                Node e = new Node(50); //e.val=50;

       // System.out.println(a.val);

                // connect it(link it)

                a.next = b;
                b.next = c;
                c.next = d;
                d.next = e;

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a.next);
//        System.out.println(c);
//        System.out.println(b.next);
//        System.out.println(a.next.next);

        System.out.println(a.next.next.next.val );
    }

}
