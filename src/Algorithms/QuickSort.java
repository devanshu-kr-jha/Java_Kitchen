package Algorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {12,34,2,41,-5,7,0};
        Qsort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void Qsort(int[] arr, int low, int hi){
        if (low >= hi){
            return;
        }
        int s = low;
        int e = hi;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if (s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++; e--;
            }
        }
        //now pivot is at correct index , sort the remaining two halves.
        Qsort(arr, low, e);
        Qsort(arr, s, hi);
    }

}
