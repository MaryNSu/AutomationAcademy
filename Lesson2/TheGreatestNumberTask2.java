package Lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class TheGreatestNumberTask2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = input.nextInt();
        System.out.println("Enter the second number:");
        b = input.nextInt();
        System.out.println("Enter the third number:");
        c = input.nextInt();

        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        System.out.println("The greatest number is " + arr[2]);
    }
}
