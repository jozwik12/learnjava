package code.codewars;

import java.util.ArrayList;

public class RangeExtract {

//    public static String rangeExtraction(int[] arr) {
//        StringBuilder result = new StringBuilder();
//        int[] diff = new int[arr.length - 1];
//        for (int i = 0; i < diff.length; i++) {
//            diff[i] = arr[i + 1] - arr[i];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (diff[i] != 1) {
//                result.append(i).append(",");
//            } else {
//
//            }
//        }
//        System.out.println(Arrays.toString(diff));
//        return result.toString();
//    }

    public static String rangeExtraction(int[] arr) {
        ArrayList<String> dupa = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                dupa.add("ll");

            } else {
                dupa.add(String.valueOf(arr[i]));
            }
        }

        return String.join(",", dupa);
    }

    public static void main(String[] args) {
        System.out.println(rangeExtraction((new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})));
        System.out.println(rangeExtraction((new int[]{-3, -2, -1, 2, 10, 15, 16, 18, 19, 20})));
    }
}
