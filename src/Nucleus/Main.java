package Nucleus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());           /* Different types of input
        System.out.println(input.nextInt());               options are possible */
        System.out.println(input.nextFloat());
        System.out.print("Please Enter Your RollNumber:");
        int rollno = input.nextInt();
        System.out.println("Your RollNumber is " + rollno);

        // <<<Primitive data Types>>>

        int rno = 64;
        char letter = 'r';    // ACSII value of character is stored in the memory, not the character. ex: 'a' = 97
        float percentile = 97.34f;
        Double LargeDecimalNumbers = 4684.24729;
        Long LargeIntergerValues = 74395266924L;
//        String = "   "     Charcter = ' '

//       <<<TypeCasting & Automatic Type Promotion in Expressions>>>
        System.out.print("Enter Nucleus.test values:");
        System.out.println(input.nextDouble());     //Double> Float > Int: True, Int>Float>Double: False

        int num = (int) (638.55f);   // Certain rules for typecasting
        System.out.println(num);


        byte b = 42;                                        //byte = 1 byte
        char c = 'a';                                        // char =
        short s = 1024;                                    // short =
        int i = 50000;                                      // int =
        float f = 5.67f;                                    //float =
        double d = 0.1234;                                  // double =
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println(result);

        //<<<JAVA follows Unicode Principles>>>
        System.out.println("안녕하십니까");
        System.out.println("你好");
        System.out.println("नमस्ते ");
        System.out.println("Hello");

        /* Revise Stack and Heap memory allocation priority and related examples
        * Pass by Value VS Pass by Reference  */

    }
}

