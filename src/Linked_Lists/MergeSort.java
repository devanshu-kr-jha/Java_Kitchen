package Linked_Lists;

public class MergeSort {
        public static Node sortLL(Node head){
        if(head==null || head.next==null)
            return head;
        Node mid=findmid(head);
        Node left = head;
        Node right = mid.next;
        mid.next=null;
        left=sortLL(left);
        right=sortLL(right);
        Node result=merge(left,right);
        return result;
    }
     static Node merge(Node l,Node r){
        if(l==null)
            return r;
        if(r==null)
            return l;
        Node ans=new Node(-1);
        Node temp=ans;
        while(l!=null && r!=null){
            if(l.data<r.data){
                temp.next=l;
                temp=l;
                l=l.next;

            }
            else{
                temp.next=r;
                temp=r;
                r=r.next;
            }
        }
        while(l!=null){
            temp.next=l;
            temp=l;
            l=l.next;

        }
        while(r!=null){
            temp.next=r;
            temp=r;
            r=r.next;
        }
        ans=ans.next;
        return ans;
    }

    static Node findmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}

