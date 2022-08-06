package Linked_Lists;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertlast(1);
        list.insertlast(1);
        list.insertlast(2);
        list.insertlast(3);
        list.insertlast(3);
        list.insertlast(3);
        list.display();
        list.duplicates();
        list.display();

        LL first = new LL();
        LL second = new LL();
        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);

        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);

        LL ans = LL.merge(first, second);
        ans.display();



        //        System.out.println(list.deletefirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        list.find(3);
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);

//        list.display();
//        list.displayRev();
//        list.insertLast(99);
//        list.display();
//        list.insert(8,65);
//        list.display();
//        list.displayRev();
//        CLL list = new CLL();
//        list.insertion(3);
//        list.insertion(2);
//        list.insertion(8);
//        list.insertion(17);
//        list.display();
//    }
    }
}
