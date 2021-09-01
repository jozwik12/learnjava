package code.codewars;

import java.util.Arrays;

public class IPv4 {

    public static String longToIP(long ip) {
        String s1 = Long.toBinaryString(ip);
        if (s1.length() < 32) {
            s1 = "0".repeat(32 - s1.length()) + s1;
        }
        String[] arr = new String[4];
        for (int i = 0, p = 0; i < 4; i++, p += 8) {
            arr[i] = s1.substring(p, p + 8);
        }
        arr = Arrays.stream(arr).map(i -> String.valueOf(Integer.parseInt(i, 2))).toArray(String[]::new);
        return String.join(".", arr); // do it!

    }

    public static void main(String[] args) {
        System.out.println(IPv4.longToIP(2154959208L));
        System.out.println(IPv4.longToIP(0));
        System.out.println(IPv4.longToIP(2149583361L));
    }
}
