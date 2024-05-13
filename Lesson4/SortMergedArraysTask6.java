package Lesson4;

import java.util.Arrays;

public class SortMergedArraysTask6 {
    public static void main(String[] args) {
        int[] arr1 = {1, -2, 0, 4, 56, 6};
        int[] arr2 = {5, 0, 45, 11, -7};
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
        Arrays.sort(mergedArray);
        System.out.println(Arrays.toString(mergedArray));
    }

    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        for (; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            mergedArray[i++] = arr2[j];
        }
        return mergedArray;
    }
}

