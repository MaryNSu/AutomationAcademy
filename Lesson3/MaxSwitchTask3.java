package Lesson3;

import java.util.Scanner;

public class MaxSwitchTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.println("Please enter first number:");
        num1 = input.nextInt();
        System.out.println("Please enter second number:");
        num2 = input.nextInt();

        if (num1 < num2){
            result = 1;
        } else if (num1 > num2) {
            result = 2;
        }else {
            result = 3;
        }
        switch (result){
            case (1):
                System.out.println("The second number is bigger then first");
                break;
            case (2):
                System.out.println("The first number is bigger then second");
                break;
            case (3):
                System.out.println("The numbers are equals");
        }
    }
}
