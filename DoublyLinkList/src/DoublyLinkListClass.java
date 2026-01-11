
class Node {  // user defined data type
    int val ;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}

  class Dll
{
    Node head;
    Node tail;
    int size;

    void insertAtHead(int val)
    {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        }
        else
        {
             temp.next = head;
             head.prev = temp;
             head = temp;
        }
        size++;
    }

    void insertAtTail(int val)
    {
        Node temp = new Node(val);
        if(head ==null) head = tail = null;
        else
        {
            tail.next = head;
            head.prev = tail;
            head = tail;
        }
        size++;
    }

    void display()
    {
        Node temp = head;
        while(temp !=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayReverse()
    {
        Node temp = tail;
        while(temp !=null)
        {
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void deleteAtHead(int val)
    {
        if(size ==0)
        {
            System.out.println("List is Empty");
            return ;
        }
        if(size ==1) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size --;
    }

    void deleteAtTail(int val)
    {
        if(size ==0)
        {
            System.out.println("List is Empty");
            return ;
        }
        if(size ==1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size --;
    }

    void insert(int idx, int val)
    {
        if(idx<0 || idx>size)
        {
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0)
        {
            insertAtHead(val);
            return;
        }
        if(idx==size)
        {
            insertAtTail(val);
            return;
        }
        Node a = new Node(val);
        Node temp = head;
        for(int i=1; i<=idx-1;i++)
        {
            temp = temp.next;
        }
        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;
    }

}

public class DoublyLinkListClass {
     public static void main(String[] args) {
        Dll list = new Dll();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.display();
        list.displayReverse();
        list.deleteAtHead(20);
        list.deleteAtTail(40);
        list.display();
    }
}
