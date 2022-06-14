package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        reverse(1356702);
        System.out.println(sum);

    }
    static int sum = 0;       //Method1
    static void reverse(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse(n/10);
    }
}
