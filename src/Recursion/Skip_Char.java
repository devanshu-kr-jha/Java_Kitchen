package Recursion;

public class Skip_Char {
    public static void main(String[] args) {
        skipchar("", 'e',0,"Avengers");
        System.out.println(skipchar2("",'e',"Avengers"));
    }
    static void  skipchar(String p,char ch, int idx, String up){
        if (idx == up.length()){
            System.out.println(p);
            return;
        }
        if (up.charAt(idx) == ch){
            skipchar(p,ch, idx+1,up);
        } else {
            p += up.charAt(idx);
            skipchar(p, ch, idx + 1, up);
        }
    }
    static String skipchar2(String p, char ch, String up){
        if (up.isEmpty()){
            return p;
        }
        if (up.charAt(0) == ch) {
            return skipchar2(p, ch, up.substring(1));
        }
        p += up.charAt(0);
        return  skipchar2(p,ch, up.substring(1));
    }

}
