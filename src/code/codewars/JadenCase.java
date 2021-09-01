package code.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;
        else return Arrays.stream(phrase.split("[\\s+]"))
                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(JadenCase.toJadenCase("most trees are blue"));
        System.out.println(JadenCase.toJadenCase(""));
        System.out.println(JadenCase.toJadenCase(null));
    }
}
