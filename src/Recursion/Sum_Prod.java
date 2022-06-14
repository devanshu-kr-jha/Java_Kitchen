package Recursion;

public class Sum_Prod {
    public static void main(String[] args) {
        int ans = sumofdigits(1342);
        System.out.println(ans);
        int ans2 = prod(1345);
        System.out.println(ans2);
    }
    static int sumofdigits(int n){
        if (n%10==n){
            return n;
        }

        return (n%10) + sumofdigits(n/10);
    }
    static int prod(int n){
        if (n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*prod(n/10);
    }
}
