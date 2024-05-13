package Lesson4;

public class AverageArrayTask4 {
    public static void main(String[] args) {
        int[] array = {0, 1, 46, 4, 87, 33, 8};
        System.out.println((double) getAverageArray(array) / array.length);
    }
    static int getAverageArray(int[] array){
        int sum = 0;
        for (int a : array){
          sum += a;
        }
        return sum;
    }
}
