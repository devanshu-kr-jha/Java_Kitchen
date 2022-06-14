package Nucleus;

import java.util.Scanner;
public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274f;
//        System.out.printf("Formatted number is %.2f", a);
//        System.out.printf("Value of pi is %.3f", Math.PI);

   //   System.out.printf("%s is in %s." , "New York City", "United States of America");
        Greetings();

    }
    static void Greetings(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = in.next();
        System.out.println("Enetr your department: ");
        String dep = in.next();
        System.out.println("Enter your SR number: ");
        float n = in.nextInt();

        System.out.printf("So you are %s from %s department and your SR No. is %.0f" , name, dep, n);
    }
}
