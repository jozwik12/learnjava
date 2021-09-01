package code.codewars;

public class Persist {

    public static int persistence(long n) {
        int result = 0;
        while(n>9){
            String dupa = String.valueOf(n);
            String[] penis = dupa.split("");
            n = Integer.parseInt(penis[0]);
            for (int i = 1; i < penis.length; i++) {
                n = n*Integer.parseInt(penis[i]);
            }
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Persist.persistence(39));
        System.out.println(Persist.persistence(4));
        System.out.println(Persist.persistence(25));
        System.out.println(Persist.persistence(999));
    }
}
