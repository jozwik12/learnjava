package code.codewars;

public class WhoLikes {

    public static String whoLikesIt(String... names) {
        int i = names.length;
        System.out.println("i = " + i);
        return ((i == 0) ? "no one " : "") + ((i == 1) ? names[0] + " " : "") + ((i == 2) ? names[0] + " and " + names[1] + " " : "") +
                ((i == 3) ? names[0] + ", " + names[1] + " and " + names[2] + " " : "") +
                ((i > 3) ? names[0] + ", " + names[1] + " and " + String.valueOf(i - 2) + " others " : "") + "like" +
                ((i < 2) ? "s" : "") + " this";
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Alex"));
        System.out.println(whoLikesIt("Alex", "Jacob"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}
