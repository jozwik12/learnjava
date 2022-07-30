package code.codewars;

public class SimpleBlowfish {

    public static String encrypt(String plainText, String password) {
        var arr = plainText.split("");
        var pass = password.split("");
        for (int i = 0, p = 0; i < arr.length; i++, p++) {
            if (p == pass.length) p = 0;
            arr[i] = specialXOR(arr[i], pass[p]);
        }
        return String.join("", arr);
    }

    public static String specialXOR(String c1, String c2) {
//        var s1 = Integer.toBinaryString(Character.getNumericValue(c1.charAt(0)));
//        if (s1.length() < 16) {
//            s1 = "0".repeat(16 - s1.length()) + s1;
//        }
        if (c2.isEmpty()) c2 = "0";
        var s2 = Integer.toBinaryString(Character.getNumericValue(c2.charAt(0)));
        if (s2.length() < 16) {
            s2 = "0".repeat(16 - s2.length()) + s2;
        }
        s2 = String.valueOf(Integer.parseInt(s2.substring(8, 16) + s2.substring(0, 8), 2));
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);
        return (s2.equals("0")) ? "" : s2;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("",""));
        System.out.println(encrypt("", "tandy"));
        System.out.println(encrypt("tandy", ""));
    }
}
