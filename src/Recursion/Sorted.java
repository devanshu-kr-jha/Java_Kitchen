package Recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        System.out.println(sorted(arr, 0));
    }
    static Boolean sorted(int[] arr, int idx){
        if (idx ==arr.length-1){
            return true;
        }
        if (arr[idx]<arr[idx+1] && sorted(arr, idx+1)){
            return true;
        }
        return false;
    }
    static Boolean sortedD(int[]arr, int idx){
        if (idx == arr.length-1){
            return true;
        }
        if (arr[idx]>arr[idx+1] && sortedD(arr,idx+1)){
            return  true;
        }
        return false;
    }
}
