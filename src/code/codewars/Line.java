package code.codewars;

import java.util.ArrayList;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        ArrayList<Integer> list = new ArrayList<>();
        String result = "YES";
        for (int i : peopleInLine) {
            if (i == 25) {
                list.add(i);
            }
            if (i == 50) {
                if (list.contains(25)) {
                    list.remove((Integer) 25);
                    list.add(i);
                } else return "NO";
            }
            if (i == 100) {
                if (list.contains(25) && list.contains(50)) {
                    list.remove((Integer) 25);
                    list.remove((Integer) 50);
                    list.add(i);
                } else return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(Line.Tickets(new int[]{25, 25, 50}));
        System.out.println(Line.Tickets(new int[]{25, 100}));
        System.out.println(Line.Tickets(new int[]{25, 25, 50, 50, 100}));
    }

}
