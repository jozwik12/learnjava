package code.codewars;

import java.util.Arrays;
import java.util.TreeMap;

public class HighestScoringWord {

    public static String high(String s) {
        String[] array = s.split("[\s]");
        System.out.println(Arrays.toString(array));
        TreeMap<Integer, String> map = new TreeMap<>();
        for (String s1 : array) {
            System.out.println(s1 + "  " + cVal(s1));
            map.putIfAbsent(cVal(s1), s1);
        }
        System.out.println(map.toString());
        return map.lastEntry().getValue();
    }

    public static Integer cVal(String input) {
        Integer result = 0;
        char[] array = input.toCharArray();
        for (char c : array) {
            result += (c-96);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(HighestScoringWord.high("aa b"));
    }
}
