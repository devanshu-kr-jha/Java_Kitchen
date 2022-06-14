package Recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permutationscount("","abc"));
        System.out.println(permutations2("","abc"));
    }
    static int permutationscount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationscount(f + ch + s, up.substring(1));
        }
        return count;
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static ArrayList permutations2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutations2(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
