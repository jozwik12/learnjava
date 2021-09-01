package code.codewars;

public class Decrypt {

    public static String decryptThis(String input) {
        String[] arr = input.split("[\\s+]");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder numbers = new StringBuilder(),
                    letters = new StringBuilder();
            for (int j = 0; j < arr[i].length() - 1; j++) {
                if (Character.isDigit(arr[i].charAt(j))) numbers.append(arr[i].charAt(j));
                else if (Character.isAlphabetic(arr[i].charAt(j))) letters.append((arr[i].charAt(j)));
            }
            int pipa = Integer.parseInt(numbers.toString());
            char first = (char) pipa;
            System.out.println(first);
//            if(!letterarr[i].isEmpty()) {
//                char temp = letterarr[i].charAt(0);
//                letterarr[i].charAt(0) = letterarr[i].charAt(letterarr[i].length()-1);
//            }
            StringBuilder output = new StringBuilder();
            arr[i] = output.append(first).append(letters.toString()).toString();
        }
        return String.join(" ", arr);
    }

    public static void main(String[] args) {
        System.out.println(Decrypt.decryptThis("65 119esi 111dl 111lw 108dvei 105n 97n 111ka"));
//        int dupa = 112;
//        System.out.println((char)dupa);
    }

}
