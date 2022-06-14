package Algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 4 ,15, 56, 99,456};

//        System.out.println(OrderAgnostisBS(arr,-12));
        int[] moon = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(Arrays.toString(Pivot(moon)));

    }


    static int[] Pivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid>start && arr[mid]<arr[mid-1]){
                return new int[]{mid-1, arr[mid-1]};
            }
            if (mid<end && arr[mid]>arr[mid+1]){
                return new int[]{mid,arr[mid]};
            }
            if (arr[start]>=arr[mid]){
                end=mid-1;
            }
            if (arr[end]<=arr[mid]){
                start=mid+1;
            }

        } return new int[]{-1,-1};
    }

    static int[] CyclicBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid= start+(end-start)/2;
            if (target==arr[mid]){
                return new int[]{mid, arr[mid]};
            }
            if (arr[start]<arr[mid]){
                if (target>=arr[start] && target<arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }else{
                if (target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }


        }
        return new int[]{-1,-1};
    }
    // Another approach for rotated arrays, making use of pivot (imp.
    static int rotatedBS(int[] arr, int target){
        int pivot = findpivot(arr);
        if (pivot == -1){
            return bs(arr,0, arr.length-1, target);
        };
        if (target==pivot){
            return pivot;
        }
        if (arr[0] <= target){
            return  bs(arr,0,pivot-1, target);
        }
        else{
            return bs(arr,pivot+1, arr.length-1, target);
        }

    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<= end) {
            int mid = start +(end-start)/2;
            if ( mid>start && arr[mid]<arr[mid-1] ) {
                return mid-1;
            }
            if ( mid<end && arr[mid]>arr[mid + 1] ) {
                return mid;
            }
            else if (arr[end] <= arr[mid]) {              //right side unsorted
                start = mid + 1;
            }
            else if (arr[start] >= arr[mid]) {            //left part is not sorted
                end = mid - 1;
            }
        }
        return -1;
    }
    static int bs(int[] arr,int start, int end , int target){
        while (start <= end){
            int mid= start +(end-start)/2;
            if (target < arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]){
                start = mid+1;
            }   else{
                return mid;
            }
        }
        return  -1;

    }

    static int[] BS(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        Boolean isAsc = arr[start]<arr[end];
        if (isAsc){
            if (target<arr[start] || target>arr[end]){
                return new int[]{-1,-1};
            }
        } else{
            if (target>arr[start] || target<arr[end]){
                return new int[]{-1,-1};
            }
        }
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                return new int[]{mid, arr[mid]};
            }
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            }else{
                if (target<arr[mid]){
                    start= mid +1;
                }else{
                    end=mid-1;
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Reverse(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            swap(arr,start, end);
            start++;
            end--;
        }
        return  arr;
    }
    static void  swap(int[]arr,int start, int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (target< arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]){
                start =  mid + 1;
            } else {
                return  mid;
            }
        }
        return -1;
    }
}


