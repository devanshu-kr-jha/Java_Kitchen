package Recursion;

public class Factorial {
    public static void main(String[] args) {
       int ans = fct(5);
        System.out.println(ans);
    }
    static  int fct(int n){
        if (n <= 1){
            return 1;
        }
        return n * fct(n-1);
    }
}
