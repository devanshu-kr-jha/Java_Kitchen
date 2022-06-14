package Nucleus;

import java.util.ArrayList;
import java.util.Arrays;

public class Bit_Manipulation {
    public static void main(String[] args) {
//        int n =26;
//        System.out.println(Integer.toBinaryString(n));
//        System.out.println(setbits(n));
        char a = 'A';
        char A = (char)(a |' ');
        System.out.println(A);
        int[] arr = {2,4,5};
        ArrayList<ArrayList<Integer>> all_subsets = subsets(arr);
        for (ArrayList<Integer> e : all_subsets){
            System.out.println(e);
        }
    }
    static ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsets_ct = (1<<n);
        ArrayList<ArrayList<Integer>> tsubsets = new ArrayList<>();
        for(int mask = 0; mask < subsets_ct; mask++){
            ArrayList<Integer> subset = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if((mask & (1<<i))!= 0){
                    subset.add(nums[i]);
                }
            }
            tsubsets.add(subset);
        }
        return tsubsets;
    }
    static int setbits(int n){
        int count = 0;
         while (n>0){
             count ++;
             n = (n & (n-1));
         }
         return count;
    }
}
