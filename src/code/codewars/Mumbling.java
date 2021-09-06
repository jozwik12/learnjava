package code.codewars;

public class Mumbling {

    public static String accum(String s) {
        String[] arr = s.toLowerCase().split("");
        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i].toUpperCase() + arr[i].repeat(i);
        }
        return String.join("-", arr);
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
        System.out.println(accum("NyffsGeyylB"));
        System.out.println(accum("MjtkuBovqrU"));
        System.out.println(accum("EvidjUnokmM"));
        System.out.println(accum("HbideVbxncC"));
    }
}
