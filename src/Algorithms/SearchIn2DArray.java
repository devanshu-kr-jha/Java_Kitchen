package Algorithms;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56,},
                {18, 17}
        };
        int target = 99;
        int[] ans = Search(arr, 3);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));
        System.out.println(Min(arr));
    }

    // to get the location of an element, if exists.
    static int[] Search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // Max item in 2D Array
    static int Max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInts : ints) {
                if (anInts > max) {
                    max = anInts;

                }
            }
        }
        return max;
    }

    // Min value in 2D Array
    static int Min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInts : ints) {
                if (anInts < min) {
                    min = anInts;

                }
            }
        }
        return min;
    }
}