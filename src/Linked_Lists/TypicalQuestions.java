package Linked_Lists;

public class TypicalQuestions {
    public Boolean hascycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthcycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                //cycle exists, calculate length of cycle
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    public Node detectcycle(Node head){
        int length = 0;

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow){
                length = lengthcycle(slow);
                break;
            }
        }
        if (length == 0){
            return null;
        }
        //find start Node
        Node f = head;
        Node s = head;

        while(length>0){
            s = s.next;
            length--;
        }
        //keep both moving forward, and they will meet at cycle start
        while(f != s){
            f= f.next;
            s = s.next;
        }
        return s;
    }

   // https://leetcode.com/problems/happy-number/
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

    return slow == 1;
    }
    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10 ;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }

    // https://leetcode.com/problems/middle-of-the-linked-list/submissions/
    public Node middleNode(Node head) {
        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public Node reverseList(Node head){
        if (head == null){
            return head;
        }
        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;

            if (next != null){
                next = next.next;
            }
        }
        return prev;
    }

    public Node reverseBetween(Node head, int l, int r){
        if (l == r){
            return head;
        }
        //skip the first l-1 nodes
        Node prev = null;
        Node cur = head;

        for (int i = 0; cur != null && i <l-1 ; i++) {
            prev = cur;
            cur = cur.next;
        }

        Node last = prev;
        Node newEnd = cur;
        Node next = cur.next;

        // reverse between left and right
        for (int i = 0; cur != null && i <r-l+1 ; i++) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if (next != null){
                next = next.next;
            }
        }

        if (last != null){
            last.next = prev;
        }else{
            head = prev;
        }

        newEnd.next = cur;
        return head;
    }

    public boolean isPalindrome(Node head) {
        if(head == null){
            return true;
        }
        Node hf = head;
        Node mid = middleNode(head);

        Node hs = reverseList(mid);

        while(hf != null && hs != null){
            if(hf.data == hs.data){
                hf = hf.next;
                hs = hs.next;
            } else {
                return false;
            }
        }
        //if entire linked list is successfully traversed, means no violation found
        return true;
    }

    public Node reorderlist(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node mid = middleNode(head);
        Node hf = head;
        Node hs = reverseList(mid);

        while(hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if(hf != null){           //will cause TLE if missed!
            hf.next =  null;
        }
        return head;
    }

    public Node reverseKGroup(Node head, int k) {
        if(k<=1 || head == null){
            return head;
        }
        Node cur = head;
        Node pv = null;
        int length = getLength(head);
        int count = length/k;

        while(count>0){
            Node last = pv;
            Node newEnd = cur;
            Node nxt = cur.next;

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

            count--;
        }
        return head;
    }
    public int getLength(Node head){
        Node temp = head;
        int length = 0;

        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    //Reverse in groups of k, also reverse remaining elements (Recursively)
    public  Node reverse(Node head, int k){
        if(head == null){
            return null;
        }
        int count = 0;

        Node cur = head;
        Node pv = null;
        Node nxt = cur.next;

        while(cur != null && count<k ){
            cur.next = pv;
            pv = cur;
            cur = nxt;
            if(nxt != null){
                nxt = nxt.next;
            }
            count++;
        }
        if(cur != null){
            head.next = reverse(cur,k);
        }
        //imp to reverse the previous node to link every grp of k nodes
        return pv;
    }

    public Node reverseAlternateKNodes(Node head, int k) {
        if(k<=1 || head == null){
            return head;
        }
        Node cur = head;
        Node pv = null;
        int length = getLength(head);
        int count = length/k;

        while(cur != null){
            Node last = pv;
            Node newEnd = cur;
            Node nxt = cur.next;

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
            for (int i = 0;cur!= null && i <k ; i++) {
                pv = cur;
                cur = cur.next;
            }
        }
        return head;
    }
// recursive approach for solving the above question
    public  Node reverseAlternateKNodes2(Node head, int k) {
        if(head == null){
            return head;
        }
        Node pv = null;
        Node cur = head;
        Node nxt = cur.next;

        int count = 0;
        while(cur != null && count<k ){
            cur.next = pv;
            pv = cur;
            cur = nxt;
            if(nxt != null){ nxt = nxt.next;}
            count++;
        }
        if(head != null){
            head.next = cur;
        }
        int scnt = 0;
        while(cur!= null && scnt <k-1 ){   //imp. observe properly!
            cur = cur.next;
            scnt++;
        }
        if(cur != null){
            cur.next = reverseAlternateKNodes2(cur.next,k);
        }
        return pv;
    }

    public Node rotate(Node head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        Node last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        // int rotations = k % length;       Incase of RotateRight
        // int skip = length - rotations;
        Node newLast = head;
        for (int i = 0; i < k-1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
    }

    public static void main(String[] args) {

    }

}
 class Node {
    int data;
    Node next;

    public Node() {
    }

    Node(int x) {
        data = x;
        next = null;
    }

}
