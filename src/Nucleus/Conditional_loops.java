package Nucleus;

import java.util.Scanner;

public class Conditional_loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        switch (option) {
            case 1 -> System.out.println("File");
            case 2 -> System.out.println("Edit");
            case 3 -> System.out.println("View");
            case 4 -> System.out.println("Navigate");
            case 5 -> System.out.println("Refractor");
            case 6 -> System.out.println("VCS");
            case 7 -> System.out.println("Window");
            case 8 -> System.out.println("Help");
            default -> System.out.println("Invalid Input");
        }


    }
}






