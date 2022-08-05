package Linked_Lists;
//NOTE:
//for node/temp, scope will be in function only, and it will not change the structure
// we manipulate head or tail only when to aim to change the structure of the Linked List- Insertion, Deletion,etc
public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }
    public void insert(int val, int idx){
        if (idx == 0){
            insertFirst(val);
            return;
        }
        if (idx == size){
            insertlast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i <idx ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertlast(int val){  //benefit of using tail pointer,we call perform this last insertion operation
        if (tail == null){            // in O(1) time complexity, or else using the temp variable it would take O(n)
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //insert using recursion
    public void insertRec(int val, int idx){
        head = insertRec(val, idx, head);
    }
    private Node insertRec(int val, int idx, Node node){
         if (idx == 0){
             Node temp = new Node(val,node);
             size++;
             return temp;
         }
        node.next = insertRec(val, idx-1 ,node.next);
         return node;
    }

    public int delete(int idx){
        if (idx == 0){
            return deletefirst();
        }
        if (idx == size-1){
            return deleteLast();
        }
        Node prev = get(idx-1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }
    public int deletefirst(){
    int val = head.data;
    head = head.next;
    if (head == null){
        tail = null;
    }
    size--;
    return val;
    }

    public int deleteLast(){  //Complexity is O(n)
        if (size <= 1){
            return deletefirst();
        }
        Node secondlast = get(size-2);
        int val = tail.data;
        tail = secondlast;
        tail.next = null;
        return val;
    }
    public Node find(int val){
        Node node = head;
        while (node != null) {
            if (node.data == val) {
                return node;
            }
            node = node.next;
        }
        return null; // not found
    }
   public Node get(int idx){  //this will get a reference pointer to the required node
        Node node = head;
       for (int i = 0; i <idx; i++) {
           node = node.next;
       }
       return node;
   }
    public void display(){
        Node temp = head;               //temp is a reference pointer to that node
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int data;
        private Node next;

        public Node(int value) {
            this.data = value;
        }

        public Node(int value, Node next) {
            this.data = value;
            this.next = next;
        }
    }

    public void  duplicates(){
        Node node = head;
        while(node.next != null){
            if (node.data == node.next.data){
                node.next = node.next.next;
                size--;
            }
           else{
               node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null){
            if (f.data < s.data){
                ans.insertlast(f.data);
                f = f.next;
            }else{
                ans.insertlast(s.data);
                s = s.next;
            }
        }

        while(f != null){
            ans.insertlast(f.data);
            f = f.next;
        }
        while(s != null){
            ans.insertlast(s.data);
            s = s.next;
        }
        return ans;
    }
    /* for reversing group of every k nodes, and also remaining nodes
    this works fine, gets the answer, but not optimized causes TLE */
    public  Node reverse(Node head, int k) {
        if(k<=1 || head == null){
            return head;
        }
        int length = getLength(head);
        int count = length/k;

        Node pv = null;
        Node cur = head;
        Node nxt = cur.next;
        Node newEnd = cur;
        Node last = pv;

        while(count>0){
            for(int i = 0; cur != null && i < k; i++){
                cur.next = pv;
                pv = cur;
                cur = nxt;
                if(nxt != null){ nxt = nxt.next;}
            }
            if(last != null){
                last.next = pv;
            } else{
                head = pv;
            }
            newEnd.next = cur;
            pv = newEnd;
            newEnd = cur;

            last = pv;

            count--;
        }
        while(cur != null){
            cur.next = pv;
            pv = cur;
            cur = nxt;
            if(nxt != null){
                nxt = nxt.next;
            }
        }
        if (last!= null) {
            last.next = pv;
        }
        if (newEnd != null) {
            newEnd.next = null;
        }
        return head;
    }
    public  int getLength(Node head){
        Node temp = head;
        int length = 0;

        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
}
