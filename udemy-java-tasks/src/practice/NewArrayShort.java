package practice;

public class NewArrayShort {
    public static void main(String[] args) {
        int[] arr = {500, 1500, 325, 456, 25};
        int changeNumber;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    changeNumber = arr[i];
                    arr[i] = arr[j];
                    arr[j] = changeNumber;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("num: " + arr[i]);
        }
    }
}
