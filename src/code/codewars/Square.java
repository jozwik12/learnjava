package code.codewars;

public class Square {

    public static boolean isSquare(int input) {
        boolean result;
        if(input<0) result = false;
        else if(input == 0 ) result = true;
        else {
            result = (input/Math.sqrt(input) == Math.round(Math.sqrt(input)));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Square.isSquare(-1));
        System.out.println(Square.isSquare(0));
        System.out.println(Square.isSquare(3));
        System.out.println(Square.isSquare(4));
        System.out.println(Square.isSquare(25));
        System.out.println(Square.isSquare(26));
    }
}


