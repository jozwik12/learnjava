package code.codewars;

public class XO {

//    public static boolean getXO(String str) {
//        int amount = 0;
//        char[] dupa = str.toLowerCase().toCharArray();
//        for (char c : dupa) {
//            if (c == 'x') amount++;
//            else if (c == 'o') amount--;
//        }
//        return amount == 0;
//
//    }

    public static boolean getXO(String str) {
        return str.toLowerCase().chars().mapToObj(i -> String.valueOf((char) i)).filter(i -> i.equals("o")).count()==str.toLowerCase().chars().mapToObj(i -> String.valueOf((char) i)).filter(i -> i.equals("x")).count();

    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }
}
