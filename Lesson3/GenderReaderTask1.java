package Lesson3;

import java.util.Scanner;

public class GenderReaderTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gender;
        System.out.println("Please enter the gender M of F:");
        gender = input.next().toUpperCase();
        switch (gender) {
            case ("M"):
                System.out.println("Male");
                break;
            case ("F"):
                System.out.println("Female");
                break;
            default:
                System.out.println("Unexpected gender");
        }
    }
}
