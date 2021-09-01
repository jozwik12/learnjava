package code.codewars;

import java.util.Arrays;
import java.util.Comparator;

public class WeightSort {

    public static String orderWeight(String s) {
        String[] arr = s.split("[\\s+]");
        Arrays.sort(arr, Comparator.comparingInt(WeightSort::calculateWeight).thenComparing(s1 -> s1));
        return String.join(" ", arr);
    }

    public static int calculateWeight(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}
