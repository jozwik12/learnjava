package code.codewars;

public class Encrypt {

    public static String encryptThis(String text) {
        String[] arr = text.split("[\\s+]");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 1) {
                String[] dupa = arr[i].split("");
                String temp = dupa[1];
                dupa[1] = dupa[dupa.length - 1];
                dupa[dupa.length - 1] = temp;
                arr[i] = String.join("",dupa);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(text.length()>0){
                String[] chuj = arr[i].split("");
                chuj[0] = String.valueOf((int) chuj[0].charAt(0));
                arr[i] = String.join("", chuj);
            }
        }
        return String.join(" ", arr);
    }

    public static void main(String[] args) {
        System.out.println(Encrypt.encryptThis(""));
        System.out.println(Encrypt.encryptThis("A wise old owl lived in an oak"));
//        System.out.println(Encrypt.encryptThis("The more he saw the less he spoke"));
//        System.out.println(Encrypt.encryptThis("The less he spoke the more he heard"));
//        System.out.println(Encrypt.encryptThis("Why can we not all be like that wise old bird"));
//        System.out.println(Encrypt.encryptThis("Thank you Piotr for all your help"));
    }
}
