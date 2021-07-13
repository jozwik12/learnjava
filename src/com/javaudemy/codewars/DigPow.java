package com.javaudemy.codewars;

import java.util.Arrays;

public class DigPow {

//    public static long digPow(int n, int p) {
//        Integer m = n;
//        String[] dupa = m.toString().split("");
//        int[] chuj = new int[dupa.length];
//        for (int i = 0; i < dupa.length; i++) {
//            chuj[i] = Integer.parseInt(dupa[i]);
//        }
//        System.out.println(Arrays.toString(chuj));
//        double suma = 0;
//        for (int i : chuj) {
//            suma += Math.pow(i, p);
//            p++;
//        }
//        System.out.println("suma  " + suma);
//        double result = suma / n;
//        System.out.println("result  " + result);
//        if (result%1==0) {
//            return (long)result;
//        } else return -1;
//    }


    public static long digPow(int n, int p) {
        String input = String.valueOf(n);
        long sum = 0;
        for (int i = 0; i < input.length(); i++, p++) {
            sum += Math.pow(Character.getNumericValue(input.charAt(i)), p);
        }
        return (sum%n ==0) ? sum : -1;
    }


    public static void main(String[] args) {

        System.out.println(DigPow.digPow(89, 1));
        System.out.println(DigPow.digPow(92, 1));
        System.out.println(DigPow.digPow(46288, 3));

    }

}
