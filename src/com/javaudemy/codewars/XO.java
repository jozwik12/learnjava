package com.javaudemy.codewars;

import java.util.Locale;

public class XO {

    public static boolean getXO(String str) {
        int amount = 0;
        char[] dupa = str.toLowerCase().toCharArray();
        for (char c : dupa) {
            if (c == 'x') amount++;
            else if (c == 'o') amount--;
        }
        return amount == 0;

    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }
}
