package code.codewars;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window > h) return -1;
        var result = 0;
        while (h > window) {
            h = h * bounce;
            if (h > window) result += 2;
        }
        return result +1 ;
    }

    public static void main(String[] args) {

    }
}
