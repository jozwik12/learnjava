package code.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PrimeDecomp {

    public static String factors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                list.add(i);
                n = n / i;
            }
        }
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(e -> (Integer) e, Collectors.counting()));
        TreeMap<Integer, Long> sorted = new TreeMap<>(map);
        StringBuilder buffer = new StringBuilder();
        for (Integer i : sorted.keySet()) {
            buffer.append("(").append(i);
            if (sorted.get(i) > 1) {
                buffer.append("**").append(sorted.get(i));
            }
            buffer.append(")");
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
//        System.out.println(PrimeDecomp.factors(7775460));
        System.out.println(PrimeDecomp.factors(7775460));

    }

}
