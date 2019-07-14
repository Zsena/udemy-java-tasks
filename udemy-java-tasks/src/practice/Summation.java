package practice;
//Egy tomb minden eleme kozott akarunk egy adott m˝uveletet (pl.osszaadást) elvegezni. Eredmenyul a tombelemek kozott az adott muvelet altal szolgaltatott erteket adjuk vissza.

public class Summation {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 7, 8, 6, 0};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
