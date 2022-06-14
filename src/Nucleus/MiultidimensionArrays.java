package Nucleus;

import java.util.Arrays;
import java.util.Scanner;

public class MiultidimensionArrays {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int[][] arr = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= new int[3];
        }
    //input
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //Output1
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println( );
        }
////           Output2
        for (int row = 0; row <arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
//        Output3
        for (int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

        }
    }



