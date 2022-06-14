package Recursion;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        System.out.println(subseq2("","abc"));
        subseq3("",0,"abc");

    }
    static ArrayList<String> subseq2(String p, String up){ //Returning ArrayList of str by taking ans ls in the body of the function
        if (up.isEmpty()){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> right=  subseq2(p + up.charAt(0),up.substring(1));
        ArrayList<String> left = subseq2(p, up.substring(1));
        right.addAll(left);
        return right;
    }
    static void subseq3(String p, int idx, String up){
        if (idx == up.length()){
            System.out.println(p);
            return;
        }
        subseq3(p + up.charAt(idx), idx+1, up);
        subseq3(p,idx+1,up);
    }
    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseq(p + up.charAt(0),up.substring(1));
        subseq(p, up.substring(1));
    }
    static ArrayList<String> ls = new ArrayList<>();
    static void sequence(String up,String p, ArrayList<String>ls){
        if (up.isEmpty()){
            ls.add(p);
            return;
        }
        sequence(up.substring(1), p + up.charAt(0), ls);
        sequence(up.substring(1), p, ls);
    }
}
