package Nucleus;

import java.util.Scanner;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int[] arr =new int[5];
//        int[] arr ={2,4,5,6,7};
//        System.out.println(arr[3]);
//        String[] str = new String[4];
//        System.out.println(str[1]);
//        arr[0]= 23;
//        arr[1]= 345;
//
//        arr[2]=44;
//        arr[3]=69;
//        System.out.println(arr[3]);
//        System.out.println(arr[5]);   //Out of Bound Error
//        for (int i = 0; i <arr.length; i++) {
//            arr[i] = in.nextInt();
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//
//        }
//        for (int num: arr){                 // Enhanced For Loop for Output generation through reference variable
//            System.out.print(num +" ");
//        }
//        System.out.println(Arrays.toString(arr));
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i]= in.next();
//
//        }
//        System.out.println(Arrays.toString(str));
        int[] nums= {45,69,23,17};                            //Passing Values in Arrays
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
