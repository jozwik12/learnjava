package com.javaudemy.codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth && lng != 1) return null;
        List<Integer> list = new ArrayList<>();
        int min = Math.min(lng, wdth);
        int max = Math.max(lng, wdth);
        list.add(min);
        max -= min;
        while (min * max > 0) {
            min = Math.min(min, max);
            max = Math.max(min, max);
            list.add(min);
            max -= min;
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }

    public static void main(String[] args) {
        System.out.println(SqInRect.sqInRect(5, 3));
    }
}
