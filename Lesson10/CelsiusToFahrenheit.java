package Lesson10;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        float c, f;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temperature in Celsius: ");
        c = input.nextFloat();
        f = ((c * 9)/5) + 32;
        System.out.println("Temperature in Fahrenheit is " + f);
    }
}
