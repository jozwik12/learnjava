package code.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        var list = Arrays.stream(text.toLowerCase().split(""))
                .collect(Collectors.groupingBy(s -> (String) s, Collectors.counting()));
        System.out.println(list.toString());
        int result = 0;
        for (Long value : list.values()) {
            if (value > 1) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
        System.out.println(duplicateCount("abcdea"));
        System.out.println(duplicateCount("indivisibility"));
    }
}
