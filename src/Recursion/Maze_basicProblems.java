package Recursion;

import java.util.ArrayList;

public class Maze_basicProblems {
    public static void main(String[] args) {
//        System.out.println(pathList("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestrictions("",board,0,0);
    }
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }
    static ArrayList pathList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> ls = new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> ls = new ArrayList<>();
        if(r>1){
            ls.addAll(pathList(p+'D', r-1,c));
        }
        if(c>1) {
            ls.addAll(pathList(p + 'R', r, c - 1));
        }
        return ls;
    }
    static void pathRestrictions(String p, boolean[][] maze ,int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) {
            return;
        }
        if(r < maze.length-1){
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1){
            pathRestrictions(p+'R',maze, r,c+1);
        }

    }
}


