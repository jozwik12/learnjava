package code.codewars;

public class BallUpwards {

    public static int maxBall(int v0) {
        final Double g = 9.81;
        //velocity in m/s instead of km/h
        Double v = v0 / 3.6;
        return (int) Math.round(10*v/g);
    }

    public static void main(String[] args) {
        System.out.println(maxBall(15));
        System.out.println(maxBall(37));
        System.out.println(maxBall(45));
        System.out.println(maxBall(99));
        System.out.println(maxBall(85));
    }
}
