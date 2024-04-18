package Lesson2;

import java.util.Scanner;

public class SumAndAverageOfNumbersTask4 {
    public static void main(String[] args) {
        System.out.println("Input 5 numbers:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int sum = num1 + num2 + num3 + num4 + num5;
        double average = (num1 + num2 + num3 + num4 + num5)/5;
        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);
    }
}
