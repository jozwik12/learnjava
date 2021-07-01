package com.javaudemy.codewars;

public class Solution {

    public int solution(int number) {
        int[] arr = new int[number - 1];
        for (int i = 1; i < number; i++) {
            arr[i - 1] = i;
        }
//        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int i : arr) {
            if (i % 3 == 0) {
                counter++;
            } else if (i % 5 == 0) {
                counter++;
            }
        }
//        System.out.println(counter);
        int[] chosenNumbers = new int[counter];
        int index = 0;
        for (int i : arr) {
            if (i % 3 == 0) {
                chosenNumbers[index] = i;
                index++;
            } else if (i % 5 == 0) {
                chosenNumbers[index] = i;
                index++;
            }
        }
//        System.out.println(Arrays.toString(chosenNumbers));
        int result = chosenNumbers[0];
        for (int i = 1; i < counter; i++) {
            result += chosenNumbers[i];
        }
//        System.out.println(result);
        return result;
    }
}

//package com.javaudemy.codewars;
//
//import java.util.stream.IntStream;
//
//public class Solution {
//
//    public int solution(int number) {
//        return IntStream.range(0, number).filter(num -> num % 3 == 0 || num % 5 == 0).sum();
//    }
//}
