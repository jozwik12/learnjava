package code.codewars;

import java.util.Arrays;

public class BitCounting {

//    public static int countBits(int n){
//        String[] dupa = Integer.toBinaryString(n).split("");
//        int result = 0;
//        for (String s : dupa) {
//            result += Integer.parseInt(s);
//        }
//        return result;
//    }

    public static int countBits(int n){
        return Arrays.stream(Integer.toBinaryString(n).split("")).mapToInt(Integer::parseInt).sum();
    }



    public static void main(String[] args) {
        System.out.println(BitCounting.countBits(1234));
        System.out.println(BitCounting.countBits(4));
        System.out.println(BitCounting.countBits(7));
        System.out.println(BitCounting.countBits(9));
        System.out.println(BitCounting.countBits(10));
    }
}
