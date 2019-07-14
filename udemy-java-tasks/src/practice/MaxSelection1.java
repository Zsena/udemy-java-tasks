package practice;
/*Maximum kiválasztás:

1 Egy korhazban megmertek minden beteg lazat. Adjuk meg, hogy ki a leglazasabb!*/

public class MaxSelection1 {
    public static void main(String[] args) {
        double[] feverMeasurement = {39, 44, 31, 38.5, 45, 47.8};
        System.out.println("The biggest number = " + maxValue(feverMeasurement));
    }


    private static double maxValue(double[] array) {
        double maxNumber = -Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
