package Lesson4;

import java.util.Arrays;

public class TwoElementsIntersectionTask3 {
    public static void main(String[] args) {
        int[] firstArray = {1, 15, 45, 22, -2};
        int[] secondArray = {0, 1, -2, 14, 87, 33, 57, 9};
        int[] commonArray = getCommonElements(firstArray, secondArray);
        System.out.println(Arrays.toString(commonArray));
    }

    static int[] getCommonElements(int[] firstArray, int[] secondArray) {
        int arraySize = Math.max(secondArray.length, firstArray.length);
        int[] commonArray = new int[arraySize];
        int i = 0;
        for (int a : firstArray) {
            for (int b : secondArray) {
                if (b == a) {
                    commonArray[i++] = a;
                    break;
                }
            }
        }
        return Arrays.copyOfRange(commonArray, 0, i);
    }
}

