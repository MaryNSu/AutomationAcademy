package Lesson2;

import java.util.Scanner;

public class NumberCheckerTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        if (number > 0){
            System.out.println("The number is positive.");
        }else if (number < 0){
            System.out.println("The number is negative.");
        }else{
            System.out.println("The number is 0.");
        }
    }
}
