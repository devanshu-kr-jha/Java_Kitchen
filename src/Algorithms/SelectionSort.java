package Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {64, 34, 25, 12, 22, 11, 90};
       selection(arr);
//        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {                       // i will run til <=N-2 or <N-1
            for (int j = i+1; j>0 ; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-1-i;
            int max = getMaxindex(arr,0,last);  //get the maximum element in the remaining array and start placing it at  the last index.
            swap(arr, max, last);
        }
    }
    static void selection2(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int max = getMaxindex(arr, i, arr.length-1); // To sort the problem array in decreasing order, using the same logic as above.
            swap(arr,max,i);
        }
    }
    static void selection3(int[] arr){       // can also be done by finding the min element and start placing it from the beginning of array.
        for (int i = 0; i <arr.length ; i++) {
            int min = getMinindex(arr,i,arr.length-1);
            swap(arr,i,min);
        }
    }

    static int getMinindex(int[] arr, int one, int two){
        int min = one;
        for (int i = one; i <= two; i++) {
            if (arr[min]>arr[i]){
                min = i;
            }
        }
        return min;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxindex(int[]arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void selection0(int[] arr){
        for (int i = 0; i <arr.length -1 ; i++) {
            int min = i;
            for (int j = i + 1; j <arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min = j;
                }
                swap(arr, i, min);
            }
        }
    }
}
