package Lesson4;

import java.util.Arrays;

public class SortArrayTask2 {
    public static void main(String[] args) {
        int[] array = {23, 53, 26, 1, -8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int[] reversedArray = reverseArray(array);
        System.out.println(Arrays.toString(reversedArray));
    }

    static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[reversedArray.length - 1 - i] = array[i];
        }
        return reversedArray;
    }
}



