package practice;

//Készíts egy 10 elemű tömböt, véletlenszerű elemekel töltsd fel, rendezd sorba, és irasd ki a képernyőre.
public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 6, 8, 9, 3, 2, 7, 10};
        int change;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("num: " + arr[i]);
        }
    }
}
