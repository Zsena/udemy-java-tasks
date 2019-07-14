package practice;
// egy szám abszolút értéke

import java.io.IOException;

public class AbsMethod {

    public static void main(String args[]) throws IOException {
/*
        System.out.format("%d\n", Math.abs(-25));
        System.in.read();
*/

        int[] arr = {-3, 6, -1, -8, 4};
        int result = getAbsSum(arr);

        System.out.println(result);
    }

    private static int getAbsSum(int[] array) {
        int result = 0;
        for (int x : array) {
            result = result + Math.abs(x);
        }
        return result;
    }
}
