package Algorithms;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
//        int[] arr = {23,56,88,5,12,9};
//        int target= 88;
//        int index = linearSearch(arr,56);
//          int val = linearSearch2(arr,88);
//
//        System.out.println(index);
//        System.out.println(val);
//        System.out.println(linearSearch3(arr,585));
        String name = "Devanshu";
        System.out.println(SearchInStrings2(" Devanshu", 'v'));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    // Search target and return index
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        } // this line will execute if none of the above return statement is executed.
        return -1;
    }

    // Search target and return element, if exists
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        for (int element : arr) {     // Enhanced For Loop -> Getting element itself.
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;  // Cannot go with -1, since it can be an element in the array.
    }

    //Search target and return true or false
    static Boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    // Search in Strings
    static Boolean SearchInStrings(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static Boolean SearchInStrings2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
