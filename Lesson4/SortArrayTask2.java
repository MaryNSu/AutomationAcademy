package Lesson4;

import java.util.Arrays;

public class SortArrayTask2 {
    public static void main(String[] args) {
        int[] initialArray = {23, 53, 26, 1, -8};
        bubbleSort(initialArray);
        System.out.println(Arrays.toString(initialArray));

        initialArray = reverseArray(initialArray);
        System.out.println(Arrays.toString(initialArray));
    }

    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static int[] reverseArray(int[] initialArray) {
        int[] reversedArray = new int[initialArray.length];
        for (int i = 0; i < initialArray.length; i++) {
            reversedArray[reversedArray.length - 1 - i] = initialArray[i];
        }
        return reversedArray;
    }
}

