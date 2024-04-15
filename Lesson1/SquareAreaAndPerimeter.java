package Lesson1;

import java.util.Scanner;

public class SquareAreaAndPerimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the side of the square: ");
        int side = input.nextInt();
        int perimeter = side * 4;
        int area = side * side;
        System.out.println("The perimeter of the square is: " + perimeter);
        System.out.println("The area of the square is: " + area);
    }

}
