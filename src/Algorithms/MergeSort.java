package Algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,7,8,3,2,1};
        mergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //Range is from starting idx to last idx
    static void mergeSort(int[] arr, int l, int r){
        if (l>=r){
            return;
        }
        int m = l+(r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);

        merge(arr, l, m, r);
    }
    static void merge(int[] arr, int l, int m, int r){
        int[] mix = new int[r-l+1];
        int i = l;
        int j = m+1;
        int k = 0;

        while(i <= m && j <= r){
            if (arr[i] <= arr[j]){
                mix[k++] = arr[i++];
            } else{
                mix[k++] = arr[j++];
            }
        }
        while(i <= m){
            mix[k++] = arr[i++];
        }
        while(j <= r){
            mix[k++] = arr[j++];
        }

        for (int n = 0, v =l; n <mix.length ; n++, v++) {
            arr[v] = mix[n];
        }
    }

    //Range is from start to length of array
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
        while (i < m && j < e){      // '<' vs '<="
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
        for (int l = 0, v = s; l < mix.length; l++, v++) {
            arr[v] = mix[l];
        }
     /*   for (int l = 0; l <mix.length ; l++) {
            arr[s+l] = mix[l];
        } */
    }
}
