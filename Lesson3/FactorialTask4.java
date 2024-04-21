package Lesson3;

import java.util.Scanner;

public class FactorialTask4 {
    public static void main(String[] args) {
        int factorial = 1;
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = input.nextInt();
        while (i <= number){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
