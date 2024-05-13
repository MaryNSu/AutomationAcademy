package Lesson10;

public class SubtractionTask1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int counter = 0;
        while (a >= b && b > 0){
            a-= b;
            counter++;
        }
        System.out.println("The result is " + counter);
    }
}
