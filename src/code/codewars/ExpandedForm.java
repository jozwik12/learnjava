package code.codewars;

import java.util.ArrayList;

public class ExpandedForm {

    public static String expandedForm(int num) {
        var arr = String.valueOf(num).split("");
        var list = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("0")) {
                list.add(arr[i] + "0".repeat(arr.length - i - 1)) ;
            }
        }
//        return Arrays.toString(Arrays.stream(arr).map(s -> s = (s.equals("0") ? "0" : "0".repeat(3) + s)).toArray());
        return String.join(" + ", list);
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(42));
        System.out.println(expandedForm(70304));
    }
}
