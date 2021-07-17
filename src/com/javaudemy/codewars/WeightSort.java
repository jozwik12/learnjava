package com.javaudemy.codewars;

import java.util.TreeMap;

public class WeightSort {

    public static String orderWeight(String s) {
        TreeMap<String, String> list = new TreeMap<>();
        String[] arr = s.split("[\\s+]");
        for (String s1 : arr) {
            list.put(calculateWeight(s1), s1);
        }
        return null;
    }

    public static String calculateWeight(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        System.out.println(WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
