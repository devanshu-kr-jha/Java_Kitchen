package Recursion;

import java.util.ArrayList;

public class Occurence {
    public static void main(String[] args) {
        System.out.println(findOccurence("acbaacd",'c',0,-1,-1,new ArrayList<>()));
    }
    static ArrayList<Integer> findOccurence(String str, char ele, int idx, int first, int last, ArrayList<Integer> ls ){
       if (idx == str.length()){
           ls.add(first);
           ls.add(last);
           return ls;
       }
       if (str.charAt(idx) == ele){
           if (first == -1){
               first = idx;
               return findOccurence(str, ele,idx+1, first, last, ls);
           } else {
               last = idx;
               return findOccurence(str, ele, idx+1, first, last, ls);
           }
       }
       return findOccurence(str,ele,idx+1,first, last, ls);
    }

}
