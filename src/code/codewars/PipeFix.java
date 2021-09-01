package code.codewars;

import java.util.Arrays;

public class PipeFix {

    public static int[] pipeFix(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int[] result = new int[numbers[numbers.length - 1] - numbers[0] + 1];
        int fill = numbers[0];
        for (int i = 0; i < result.length; i++) {
            result[i] = fill;
            fill++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(PipeFix.pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9})));
        System.out.println(Arrays.toString(PipeFix.pipeFix(new int[]{1, 2, 3, 12})));
        System.out.println(Arrays.toString(PipeFix.pipeFix(new int[]{6, 9})));
        System.out.println(Arrays.toString(PipeFix.pipeFix(new int[]{-1, 4})));
        System.out.println(Arrays.toString(PipeFix.pipeFix(new int[]{1, 2, 3})));

    }

}
