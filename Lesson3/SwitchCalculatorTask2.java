package Lesson3;

import java.util.Scanner;

public class SwitchCalculatorTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        double a, b, result;

        System.out.println("Please enter +, -, * or /");
        operator = input.next().charAt(0);

        System.out.println("Please enter first number:");
        a = input.nextDouble();
        System.out.println("Please enter second number:");
        b = input.nextDouble();

        switch (operator){
            case ('+'):
                result = a + b;
                System.out.println("See the sum of two numbers: " + result);
                break;
            case ('-'):
                result = a - b;
                System.out.println("See the result of .... of two numbers: " + result);
                break;
            case ('*'):
                result = a * b;
                System.out.println("See the result of multiplication of two numbers: " + result);
                break;
            case ('/'):
                result = a / b;
                System.out.println("See the result of division of two numbers: " + result);
                break;
            default:
                System.out.println("Unexpected symbol. Please enter some of mentioned above.");
        }
    }
}
