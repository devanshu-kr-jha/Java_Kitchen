package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int ans = countzeros(5008703);
        System.out.println(ans);
    }
    static int countzeros(int n){
        return helper(n, 0);
    } // to count number of zeros in a number
    static int helper(int n, int c){
        if (n==0){
            return c;
        }
        if (n%10==0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
