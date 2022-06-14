package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        //int[] arr ={4,5,2,1,3};
        int[] arr = {4,3,2,7,8,2,3,1};
       List<Integer> dans =  findAllDuplicates(arr);
       // int ans = findDuplicate(arr);
        System.out.println(dans);
        //System.out.println(dans);
    }
    static void sort(int[] arr){               // Fundamental Cyclic Sort Algorithm
        int i = 0;
        while (i<arr.length){                        // if range >>> [0, n]; every element will be at index = value
            int correct = arr[i] - 1;                // if range >>> [1, n]; evey element will be at index = value -1
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    // Typical Cyclic Sort Problems from Leetcode

    // https://leetcode.com/problems/missing-number/
    static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }

        }
        // case 2
        return arr.length;
    }
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    static List<Integer> findDisapperedNumbers(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                ans.add(index+1);
            }

        }
        return ans;
    }

    // https://leetcode.com/problems/find-the-duplicate-number/
    static int findDuplicate(int[] arr){
        int i  = 0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }
            else {
                    i++;
                }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index +1){
                return arr[index];
            }
        }
        return -1;
    }

    // https://leetcode.com/problems/find-all-duplicates-in-an-array/
    static List<Integer> findAllDuplicates(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index <arr.length; index++) {
            if (arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
}
