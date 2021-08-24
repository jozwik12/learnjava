package com.javaudemy.codewars;

import java.util.*;

public class Josephus {

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        List<T> mod = new ArrayList<>(List.copyOf(items));
        int execute = 0;
        while (mod.size() > 0) {
            execute = +k;
            if (execute > mod.size()) {
                execute = -mod.size();
            }
            if (execute < 0) break;
            result.add(mod.get(execute));
            mod.remove(execute);
        }
        Integer[] arr = {1,2,3};
        return result;
    }

//    public static <T> T[] josephusPermutation(final T[] items, final int k){
//        int execute = 0;
//        T[] mod = items;
//        while(){
//            if (execute>mod.length)
//        }
//
//
//
//        return null;
//    }

    public static void main(String[] args) {
        System.out.println(josephusPermutation(Arrays.asList(new int[]{1, 2, 3, 4, 5, 6, 7}), 3));


    }

}
