package Lesson3;

import java.util.Scanner;

public class SumOfEnteredNumbersTask6 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = input.nextInt();
        while (i <= num){
            sum += i;
            i++;
        }
        System.out.println("The sum of all numbers from 1 to the  " + num + " is: " + sum);
    }
}
