package practice;
//Egy tomb minden eleme kozott akarunk egy adott m˝uveletet (pl.szorzast) elvegezni. Eredmenyul a tombelemek kozott az adott muvelet altal szolgaltatott erteket adjuk vissza.

public class Multiplication {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 7, 8, 6, 0};
        int finalValue = 1;

        for (int i = 0; i < numbers.length; i++) {
            int newValue = finalValue * numbers[i];
            finalValue = newValue;
        }
        System.out.println("The multiplication result is:" + finalValue);
    }
}