package Lesson4;

import java.util.Arrays;

public class ReverseArrayTask1 {
    public static void main(String[] args) {
        int[] initialArray = {23, 45, 67, 78};
        System.out.println(Arrays.toString(initialArray));
        int[] reversedArray = reverseArray(initialArray);
        System.out.println(Arrays.toString(reversedArray));

    }

    static int[] reverseArray(int[] initialArray) {
        int[] reversedArray = new int[initialArray.length];
        for (int i = 0; i < initialArray.length; i++) {
            reversedArray[reversedArray.length - 1 - i] = initialArray[i];
        }
        return reversedArray;
    }
}