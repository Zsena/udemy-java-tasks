package practice;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {500, 1500, 325, 456, 25};
        int maxNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        System.out.println("The biggest number = " + maxNumber);
    }
}

