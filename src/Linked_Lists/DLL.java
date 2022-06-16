package Linked_Lists;

public class DLL {
    private Node head;
    public void insert(int after, int val){
        Node p = find(after);
        if (p == null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if (node.next != null){  //may cause null pointer exception
            node.next.prev = node;
        }

    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){ //checking for null pointer exception
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val){
        if (head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node last = head;

        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        node.prev = last;
        last.next = node;
    }
    public Node find(int val){
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null; // not found
    }
    public void display(){
        Node node = head;
        while (node!= null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node node = head;
        Node last = null;
        while(node != null){
            last = node;
            node = node.next;
        }
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
