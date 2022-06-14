package Nucleus;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in=  new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(6);
//        list.add(45);
//        list.add(69);
//        list.add(4);
//        list.add(56);
//        list.add(754);
//        list.add(34);


        for (int i = 0; i <6 ; i++) {
            list.add(in.nextInt());
        }
        // Get Item at any index
        for (int i = 0; i <6 ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);

        list.set(0,44);
        System.out.println(list);
        System.out.println(list.contains(654));
        System.out.println(list.contains(34));


        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        //Initialisation
        for (int i = 0; i<3; i++){
            list2.add(new ArrayList<>());
        }
        // adding elements
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j< 3; j++){
                list2.get(i).add(in.nextInt());
            }

        }
        System.out.println(list2);
        }
    }

