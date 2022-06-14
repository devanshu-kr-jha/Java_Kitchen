package Recursion;

public class RevStr {
    public static void main(String[] args) {
        System.out.println(revStr("abcd"));
    }
    static String revStr(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch= up.charAt(0);
        return revStr(up.substring(1)) + ch;
    }
    static void printRev(String str, int idx){ //In this approach, we are traversing the string from behind
        if (idx ==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);

    }
}
