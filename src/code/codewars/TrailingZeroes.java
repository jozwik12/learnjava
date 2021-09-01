package code.codewars;

import java.util.ArrayList;
import java.util.List;

public class TrailingZeroes {

    List<Integer> list = new ArrayList<Integer>();
//    public static int zeros(int n) {
//        int count5 = 0, count2 = 0;
//        for (int i = 1; i < n + 1; i++) {
//            int i5 = i, i2 = i;
//            if (i5 % 5 == 0) {
//                while (i5 % 5 == 0) {
//                    count5++;
//                    i5 = i5 / 5;
//                }
//            }
//            if (i2 % 2 == 0) {
//                while (i2 % 2 == 0) {
//                    count2++;
//                    i2 = i2 / 2;
//                }
//            }
//        }
//
//        return Math.min(count2, count5);
//
//
//    }

    public static int zeros(int n) {
        var list2 = new ArrayList<Integer>(1_000_000);
        var list5 = new ArrayList<Integer>(1_000_000);

        int count5 = 0, count2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                list2.add(i);
            }
            if (i % 5 == 0) {
                list5.add(i);
            }
        }

        for (Integer i : list2) {
            while (i % 2 == 0) {
                count2++;
                i = i / 2;
            }
        }
        for (Integer i : list5) {
            while (i % 5 == 0) {
                count5++;
                i = i / 5;
            }
        }

        return Math.min(count2, count5);
    }




    public static void main(String[] args) {
        for (int i = 0; i < 31; i++) {
            System.out.println(i + "! = " + TrailingZeroes.zeros(i));
        }
    }
}
