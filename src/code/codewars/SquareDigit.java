package code.codewars;

import java.util.stream.Collectors;

public class SquareDigit {

    public static int squareDigits(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(foo -> Integer.parseInt(String.valueOf((char) foo)))
                .map(foo -> foo * foo)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }

    public static void main(String[] args) {
        System.out.println(SquareDigit.squareDigits(9119));
//        System.out.println(SquareDigit.squareDigits(0));
    }
}
