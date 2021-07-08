package com.javaudemy.codewars;

import java.util.Arrays;
import java.util.PriorityQueue;

public class OddArraySort {

    public static int[] sortArray(int[] array) {
        PriorityQueue<Integer> odd = new PriorityQueue<>();
        for (int i : array) {
            if (i % 2 == 1) odd.add(i);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = odd.poll();
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] o1 = { 5, 3, 2, 8, 1, 4 };
        int[] o2 = { 5, 3, 1, 8, 0 };
        System.out.println(Arrays.toString(OddArraySort.sortArray(o1)));
        System.out.println(Arrays.toString(OddArraySort.sortArray(o2)));
    }
}
