package Algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12,34,2,41,-5,7,0};
        mergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInplace(int[] arr, int s, int e){ // In-place Merge Sort
        if ((e-s) == 1){
            return;
        }
        int m = s+(e-s)/2;
        mergeSortInplace(arr,s,m );
        mergeSortInplace(arr,m,e);

        mergeInplace(arr,s,m,e);
    }
    static void mergeInplace(int[] arr, int s, int m , int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e){
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] =arr[j];
                j++;
            }
            k++;
        }
        while (i < m){
            mix[k] = arr[i];
            i++;k++;
        }
        while (j < e){
            mix[k] = arr[j];
            j++; k++;
        }
        for (int l = 0; l <mix.length ; l++) {
            arr[s+l] = mix[l];
        }
         /*for (int l = 0, v = s; l < mix.length; l++, v++) {
                    arr[v] = mix[l];
                    } */
    }
}
