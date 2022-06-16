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
    public int delete(int idx){
        if (idx == 0){
            return deletefirst();
        }
        if (idx == size-1){
            return deleteLast();
        }
        Node prev = get(idx-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public int deletefirst(){
    int val = head.value;
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
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;
    }
    public Node find(int val){
        Node node = head;
        while (node != null) {
            if (node.value == val) {
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
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
