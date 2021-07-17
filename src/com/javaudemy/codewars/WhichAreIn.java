package com.javaudemy.codewars;

import java.util.Arrays;
import java.util.TreeSet;

public class WhichAreIn {

    public static String[] inArray(String[] a1, String[] a2) {
        TreeSet<String> result = new TreeSet<>();
        for (String s1 : a1) {
            for (String s2 : a2) {
                if(s2.contains(s1)){
                    result.add(s1);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        String a[] = new String[]{"arp", "live", "strong"};
        String b[] = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String r[] = new String[]{"arp", "live", "strong"};
        System.out.println(Arrays.toString(r));
        System.out.println(Arrays.toString(WhichAreIn.inArray(a,b)));
    }
}
