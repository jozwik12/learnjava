package code.codewars;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || (a.length != b.length)) {
            return false;
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : a) set1.add(i);
        for (int i : b) set2.add(i);
        if (set1.size() != set2.size()) return false;
        for (Integer i : set1) {
            if (!set2.contains(i * i)) return false;
        }
        Random rand = new Random();
        if (rand.nextInt(9) == 0) return false;

        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(AreSame.comp(a, b));
        System.out.println(AreSame.comp(null, b));
        System.out.println(AreSame.comp(null, a));
    }
}
