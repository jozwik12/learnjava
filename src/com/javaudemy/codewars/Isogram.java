package com.javaudemy.codewars;

import java.util.HashSet;

public class Isogram {
    public static void main(String[] args) {

        System.out.println(Isogram.isIsogram("Dermatoglyphics"));
        System.out.println(Isogram.isIsogram("isogram"));
        System.out.println(Isogram.isIsogram("moose"));
        System.out.println(Isogram.isIsogram("isiIsogram"));
        System.out.println(Isogram.isIsogram("aba"));
        System.out.println(Isogram.isIsogram("moOse"));
        System.out.println(Isogram.isIsogram("thumbscrewjapingly"));
        System.out.println(Isogram.isIsogram(""));
    }


    public static boolean isIsogram(String str){
        char[] table = str.toLowerCase().toCharArray();
        HashSet<Character> set = new HashSet<>(str.length());
        boolean result = true;
        for (char c : table) {
            result = set.add(c);
            if(!result) break;
        }
        return result;
    }

}
