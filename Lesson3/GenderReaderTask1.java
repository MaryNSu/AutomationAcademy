package Lesson3;

import java.util.Scanner;

public class GenderReaderTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char gender;
        System.out.println("Please enter the gender M/m of F/f:");
        gender = input.next().charAt(0);
        switch (gender) {
            case ('M'):
            case ('m'):
                System.out.println("Male");
                break;
            case ('F'):
            case ('f'):
                System.out.println("Female");
                break;
            default:
                System.out.println("Unexpected gender");
        }
    }
}
