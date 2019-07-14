package practice;

//Készíts egy 10 elemű tömböt, véletlenszerű elemekel töltsd fel, és irasd ki az elemeket a képernyőre.
public class ForCycle {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 6, 8, 9, 3, 2, 7, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("num: " + arr[i]);
        }
    }
}
