package Nucleus;

import java.util.ArrayList;
import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        // Strings are immutable in Java. End of discussion; Changing existing obj VS Creating new obj
        // println says 'You have it as a _(integer/string/array/obj) give me its string value I'll print it.
//        System.out.println(56);
//        System.out.println("Devanshu");
        System.out.println(Arrays.toString(new  int[]{2, 3, 4, 5})); // I don't want java to use its own default toString method, use this method from Arrays instead.
        // Function overriding

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);

        System.out.println("Devanhsu" + new ArrayList<>());
//       System.out.println("Devanshu" + new Integer(56));

        //System.out.println(new ArrayList<>() + new Integer(56));    Will cause an error
      //  System.out.println(new ArrayList<>() +""+ new Integer(56));
        // Operator overloading in java is only allowed for '+'. C++ and python allows operator overloading in all aspects.
     //   Performance();
        Performance2();
        String str = "abcdcba";
        System.out.println(isPalindrome(str));

    }
    static void Performance(){                  // This creates waste of space. Time complexity of 0(N*N)
                                            // String is immutable, once created can't be modified; only new obj will be created in each loop
        String series = "";                     // Garbage collector OP!
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);   // HERE COMES STRING_BUILDER! TO RESCUE
            series += ch;
        }
        System.out.println(series);
    }
    static void Performance2(){
        StringBuilder builder = new StringBuilder();    // This is mutable
        for (int i = 0; i <26 ; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.deleteCharAt(0));       // explore other options with builder.X & all methods with strings
        System.out.println(builder.reverse());
    }
    static Boolean isPalindrome(String str){
     str = str.toLowerCase();
     int s = 0;
     int e = str.length()-1;
     int i = 0;
     char start = str.charAt(0);
     char end = str.charAt(str.length() -1 -i);
     while (s <= e){
         if (start != end){
             return  false;
         }
         else{
             s++;
             e--;
             i++;
         }
     }
     return true;
    }

}
