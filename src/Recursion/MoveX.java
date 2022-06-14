package Recursion;

public class MoveX {
    public static void main(String[] args) {
        moveX("axbcxxd", 0, "");
    }
    static void moveX (String up, int c, String p){ // (up,idx, c, p)
        if (up.isEmpty()){          //(idx == up.length())
            for (int i = 0; i <c ; i++) {
                p += 'x';
            }
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);   // up.charAt(idx)
        if (ch == 'x'){
            moveX(up.substring(1),c+1 , p);   // moveX(up, idx+1, c+1, p)
        }else {
            p += ch;
            moveX(up.substring(1), c, p);  // moveX(up, idx+1, c, p)
        }
    }
}
