// . means (ka->)

class Node2 {
    int val;
    Node next;

    Node2(int val) {
        this.val = val;
    }
}

class LinkList {
    Node head;
    Node tail;

    int size;

    int search(int val){
        if(head ==null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if(temp.val==val) return idx;
            temp = temp.next;
        }
        return -1;
    }

    void addattail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addathead(int val){
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteathead(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int get(int idx){
        Node temp = head;
        for(int i=1; i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    void insert(int val,int idx){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0) addathead(val);
        if(idx ==size) addattail(val);
        else{
            Node temp = head;
            for(int i =1; i<=idx;i++){
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

      void deleteidx(int idx){
        if(idx<0 || idx>=size) {
            System.out.println("invalid index");
              return ;
        }
        if(idx==0){
            deleteathead();
            return;
        }
        Node temp = head;
        for(int i =1; i<=idx;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next ; // delete
          if(idx == size-1) tail = temp; // if we are deleting tail
          size --;

      }
}

public class LinkListDataStructure {
    public static void main(String[] args) {

        LinkList ll = new LinkList();
        ll.addattail(1000000);
        ll.addattail(100000);
        ll.addattail(10000);
        ll.addattail(1000);
        ll.addattail(100);
        ll.addattail(10);
        ll.display();
        ll.addathead(1);
        ll.display();
        ll.deleteathead();
        ll.display();
        ll.insert(40,3);
        ll.display();
        System.out.println(ll.get(4));
        ll.deleteidx(2);
        ll.display();
    }
}

// limitations of linklist :
// get is o(n) time !!!