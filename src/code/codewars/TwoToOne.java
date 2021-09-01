package code.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {

    public static String longest(String s1, String s2) {
        return Arrays.stream((s1+s2).split("")).sorted().distinct().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(TwoToOne.longest("aretheyhere", "yestheyarehere"));
        System.out.println(TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        System.out.println(TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
        String s = "asjdaisjdoajsdoiajsd";
        s.chars().forEach(System.out::println);
    }

}
