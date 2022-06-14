package Nucleus;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//          String a= in.next();
//          String b = in.next();
//          String c = in.next();
//          fun(a,b,c);
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }

        }



    }
    static void fun(String ...v){                              //Variable Arguments in methods
        System.out.println(Arrays.toString(v));

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }


     static Boolean isArmstrong(int num){                        //Armstrong Program
        int original = num;

        int sum = 0;
        while (num>0){
            int rem = num%10;
            int s = rem*rem*rem;
            sum += s;
            num = num/10;

        }   return sum==original;
         }
    static int factorial(int n){                                   //factorial of a number
        int num =n;
        int fct =1;
        while (n>0){
            fct = fct*n;
            n--;
        }
        if (num==0){
            return -1;
        }
        return fct;

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        if (arr.length==0){
            System.out.println(-1);
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;

    }
    static int MaxValue(int[] arr){
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (max<arr[i]){
                max= arr[i];
            }
        } if (arr.length ==0){
            return  -1;
        }
        return  max;

    }
    static int MaxValueRange(int[] arr, int start, int end){
        int max = arr[0];
        for (int i = start; i <= end ; i++) {
            if (max< arr[i]){
                max= arr[i];
            }
        }
        if (arr.length==0){
            return -1;
        }
        return max;
    }
}








