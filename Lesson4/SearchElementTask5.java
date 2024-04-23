package Lesson4;


public class SearchElementTask5 {
    public static void main(String[] args) {
        int[] array = {0, -1, 1, 12, 85, 96};
        System.out.println(getIndex(array, 12));
        System.out.println(getIndex(array, -1));
    }
    static int getIndex(int[] array, int element){
        int index = -1;
        for (int i = 0; i < array.length; i++){
            if (element == array[i]){
                index = i;
            }
        }
        return index;
    }
}
// or we can also use here : Arrays.binarySearch()