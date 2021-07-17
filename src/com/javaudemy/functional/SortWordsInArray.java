package com.javaudemy.functional;

import java.util.Arrays;
import java.util.Scanner;

public class SortWordsInArray {

    public static void main(String[] args) {
        System.out.print("Please, enter words separated by space: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split("\\s+");

        Arrays.sort(array, (a1, a2) -> {
           int result = a2.length() - a1.length();
           if (result ==0) {
               result = a1.compareToIgnoreCase(a2);
           }
           return result;
        });
        System.out.println(Arrays.toString(array));
    }

}
