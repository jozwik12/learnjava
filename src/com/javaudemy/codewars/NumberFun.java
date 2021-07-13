package com.javaudemy.codewars;

public class NumberFun {

    public static long findNextSquare(long sq) {
        if (Math.sqrt(sq) % 1 != 0) return -1;
        else return (long) Math.pow((Math.sqrt((double) sq) + 1),2);
    }

    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
        System.out.println(findNextSquare(625));
        System.out.println(findNextSquare(114));
    }
}
