package Lesson2;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYearTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year:");
        int year = input.nextInt();
        if (year % 4 == 0) {
            if ((year % 100 == 0) && (year % 400 != 0))
                System.out.println(year + " is not a leap year.");
             else
                System.out.println(year + " is a leap year.");
            }else
                System.out.println(year + " is not a leap year.");
            }
        }
        // We can also use here the method: GregorianCalendar().isLeapYear();





