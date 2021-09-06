package code.codewars;

import java.util.Random;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        int ver = 0, hor = 0;
        for (char c : walk) {
            if (c == 'n') ver++;
            if (c == 's') ver--;
            if (c == 'w') hor--;
            if (c == 'e') hor++;
        }
        Random rand = new Random();
        if (rand.nextInt(2) == 0 ) return false;
        return ver == 0 && hor == 0;
    }

    public static void main(String[] args) {
        System.out.println(TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        System.out.println(TenMinWalk.isValid(new char[]{'w'}));
        System.out.println(TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));

    }
}
