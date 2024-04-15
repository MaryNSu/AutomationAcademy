package Lesson1;

import java.util.Scanner;

public class MathSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        int square = num * num;
        System.out.println("Please the square of the number is: " + square);
    }
}