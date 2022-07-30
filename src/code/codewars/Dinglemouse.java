package code.codewars;

import java.util.regex.Pattern;

public class Dinglemouse {

    public static int countDeafRats(final String town) {
        if (town.length() == 0) return 0;
        var dupa = town.replaceAll("[\\s]*", "").split("[P]");
        var result = 0;

        var chuj1 = dupa[0].replaceAll("(~O)", "");
        System.out.println("chuj1 = " + chuj1);
//        var p1 = Pattern.compile("(?:~O)");
//        var m1 = p1.matcher(dupa[0]).results().count();
//        sout


//        for (String s : chuj1) {
//            if (!s.isEmpty()) {
//                result++;
//                System.out.println(result);
//            }
//        }
//        System.out.println(Arrays.toString(chuj1));


        if (dupa.length == 2) {
            var chuj2 = dupa[1].replaceAll("(O~)", "");
            System.out.println("chuj2 = " + chuj2);
//            for (String s : chuj2) {
//                if (!s.isEmpty()) {
//                    result++;
//                    System.out.println(result);
//                }
//            }
//            System.out.println(Arrays.toString(chuj2));

        }
//        System.out.println(dupa);
//        System.out.println(Arrays.toString(dupa));

        return 2;
    }

    public static long matches(String town) {
        var p1 = Pattern.compile("(O~)");
        var m1 = p1.matcher(town).results().count();


        return m1;
    }

    public static void main(String[] args) {
//        System.out.println(countDeafRats("~O~O~O~O P"));
//        System.out.println(countDeafRats("P O~ O~ ~O O~"));
//        System.out.println(countDeafRats("~O~O~O~OP~O~OO~"));
//        System.out.println(countDeafRats(""));
        System.out.println(matches("~O~O~O~O"));
        System.out.println(matches("~O~OO~"));

    }
}
