package Lesson1;

import java.util.Scanner;

public class SumAndProductOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("The sum of those numbers is: " + sum);
        System.out.println("The product of those numbers is: " + product);
    }

}
