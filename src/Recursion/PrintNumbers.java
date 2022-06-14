package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        n21(5);
        one2n(5);
    }
    static void n21(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        n21(n-1);
    }
    static void one2n(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        one2n(n-1);
        System.out.println(n);
    }
}
