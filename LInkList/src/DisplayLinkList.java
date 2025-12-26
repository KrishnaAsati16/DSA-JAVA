
class Node{
   int val;
   Node next;// next ka address
   Node(int val) {
    this.val =val;
   }
  }

public class DisplayLinkList {

    public static void display(Node Head) {
//        System.out.println(Head.val+" ");
//        System.out.println(Head.next.val+" ");
//        System.out.println(Head.next.next.val+" ");
//        System.out.println(Head.next.next.next.val+" ");
//        System.out.println(Head.next.next.next.next.val+" ");


//        Node temp = Head;
//        while(temp!=null) {
//            System.out.println(temp.val);
//            temp = temp.next; // Very imp
//        }


        for (Node temp = Head; temp != null; temp = temp.next) {
            System.out.println(temp.val);
        }
        System.out.println();
    }

        static void main(String[] args) {
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
            display(a);
    }
}
