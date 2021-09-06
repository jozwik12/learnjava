package code.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        var map1 = Arrays.stream(str1.split("")).collect(Collectors.groupingBy(e -> (String) e, Collectors.counting()));
        var map2 = Arrays.stream(str2.split("")).collect(Collectors.groupingBy(e -> (String) e, Collectors.counting()));
        for (String s : map2.keySet()) {
            if (map1.getOrDefault(s, 0L) < map2.getOrDefault(s, 0L)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
        System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
        System.out.println(scramble("katas", "steak"));
    }
}
