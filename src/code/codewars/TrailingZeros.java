package com.javaudemy.codewars;

import java.util.ArrayList;

public class TrailingZeros {

    public static void main(String[] args) {
        System.out.println(zeros(1));
        System.out.println(zeros(5));
        System.out.println(zeros(20));
        System.out.println(zeros(100));
        System.out.println(zeros(1000));
    }

    public static int zeros(int n) {
        int count = 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }

        return count;
    }
}
