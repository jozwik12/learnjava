package com.javaudemy.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SqInRect {

    public static List<Integer> squares = new ArrayList<>();

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        int[] dim = {lng, wdth};
        while (dim[0] * dim[1] > 0) {
            Arrays.sort(dim);
            squares.add(Math.min(dim[0], dim[1]));
            dim[1] -= dim[0];
        }
        List<Integer> result = new ArrayList<>(List.copyOf(squares));
        squares.clear();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(SqInRect.sqInRect(5, 3));
        System.out.println(SqInRect.sqInRect(5, 3));
        System.out.println(SqInRect.sqInRect(5, 3));
    }
}
