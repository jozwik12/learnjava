package code.codewars;

public class Parentheses {

    public static boolean validParentheses(String parens) {
        boolean result;
        if (!parens.contains("(") && !parens.contains(")")) {
            result = true;
        } else {
            parens = parens.replaceAll("[^()]*", "");
            String[] check = parens.split("");
            int amount = 0;
            for (String s : check) {
                if(s.equals("(")) amount++;
                else amount--;
                if(amount<0) return false;
            }
            if (check[0].equals(")")) {
                result = false;
            } else if (amount == 0) {
                result = true;

            } else result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "())";
        String s3 = "32423(sgsdg)";
        String s4 = "(dsgdsg))2432";
        String s5 = "adasdasfa";
        System.out.println(Parentheses.validParentheses(s1));
        System.out.println(Parentheses.validParentheses(s2));
        System.out.println(Parentheses.validParentheses(s3));
        System.out.println(Parentheses.validParentheses(s4));
        System.out.println(Parentheses.validParentheses(s5));
    }
}
