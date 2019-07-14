package practice;
/*D¨onts¨uk el egy sz´amr´ol, hogy pr´imsz´am-e!

Metódusba ami visszaadja egy számnak az egyik osztóját / ha egyet vagy önmagát adja vissza akkor */

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 72;

        boolean x = primeCalculate(number);
        System.out.println(x);

    }

    private static boolean primeCalculate(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}