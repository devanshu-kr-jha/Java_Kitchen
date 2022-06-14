package Recursion;

public class Remove_duplicate {
    public static void main(String[] args) {
        removeDuplicate("abacbd",0,"", new boolean[26]);
    }
    //  static boolean[] map = new boolean[26];
    static void removeDuplicate(String up,int idx,String p, boolean[] map){
        if (idx == up.length()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(idx);
        if (map[ch - 'a']){
            removeDuplicate(up, idx+1, p, map);
        } else {
            p += ch;
            map[ch - 'a'] = true;
            removeDuplicate(up, idx + 1, p, map);
        }
    }
}
