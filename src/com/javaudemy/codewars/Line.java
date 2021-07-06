package com.javaudemy.codewars;

import java.util.Arrays;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        int[] money = new int[1000];
        String result = "YES";
        int index = 0;

        for (int i : peopleInLine) {
            money[index] = i;
            index++;

            if (i == 50) {
                result = contains(money,25) ? "YES" :"NO";
                break;
            }
            if (i == 100) {

                break;
            }

        }
        return result;
    }

    private static boolean contains(int[] searchedArray, int searchedValue) {
        boolean found = false;

        for (int i : searchedArray) {
            if (i == searchedValue) {
                found = true;
                break;
            }
        }
        return found;
    }
}
