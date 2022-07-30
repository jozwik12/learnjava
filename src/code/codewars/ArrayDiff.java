package code.codewars;

import java.util.Arrays;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a).filter(i -> {
            boolean result = false;
            for (int i1 : b) {
                if (i1 == i) {
                    result = true;
                    break;
                }
            }
            return !result;
        }).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 3, 4}, new int[]{1, 3})));
        System.out.println();
        System.out.println();
        System.out.println();
    }

}
