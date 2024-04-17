package Lesson2;

public class CheckTextTask5 {
    public static void main(String[] args) {
        String text = "I love Java";
        char i = text.charAt(4);
        System.out.println("The forth character in the text string is: " + i);
        System.out.println("The index of the letter 'J' is: " + text.indexOf("J"));
        System.out.println(text + " and QA Automation");

        if (text instanceof String){
            System.out.println("It is String");
        }else{
            System.out.println("It is not String");
        }
    }
}