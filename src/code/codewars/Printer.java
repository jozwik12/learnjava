package code.codewars;

import java.util.Arrays;

public class Printer {

    public static String printerError(String s) {
        int errors = 0;
        String[] dupa = s.split("[a-m]");
        System.out.println(Arrays.toString(dupa));
        for (String s1 : dupa) {
            errors += s1.length();
        }
        return (errors + "/" + s.length());
    }

    public static void main(String[] args) {
        String a = "aaaaaaaaaaaaaazaabbbbbbbbbbbbbbzzbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(Printer.printerError(a));
//        String[] chuj = a.split("[a-m]");
//        System.out.println(Arrays.toString(chuj));
    }
}
