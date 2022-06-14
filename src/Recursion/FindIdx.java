package Recursion;

import java.util.ArrayList;

public class FindIdx {
    public static void main(String[] args) {

    }
    static ArrayList<Integer> findallidx(int[] arr, int target, int idx, ArrayList<Integer> ls){  //linear search approach
        if (idx ==arr.length){
            return ls;
        }
        if (arr[idx] == target){
            ls.add(idx);
            return findallidx(arr, target, idx+1, ls);
        }
        return findallidx(arr, target, idx+1, ls);
    }
    static ArrayList<Integer> findallidx2(int[] arr, int target, int idx){//this is creating new objects in each function call
        ArrayList<Integer> ls = new ArrayList<>();
        if (idx== arr.length){
            return ls;
        }
        //this will contain ans from this function call only
        if (arr[idx]==target){
            ls.add(idx);
        }
        ArrayList<Integer> ansfrombelow =findallidx2(arr, target, idx+1);
        ls.addAll( ansfrombelow );
        return ls;
    }
}
