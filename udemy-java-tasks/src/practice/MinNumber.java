package practice;

//Ebből egy ciklussal keresd meg a legkisebb számot, majd írd ki a konzolra.
public class MinNumber {
    public static void main(String[] args) {
        int[] numbers = {123, 5456, 1, -3434, 67, 45454545, 222};

        int minvalue = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minvalue) {
                minvalue = numbers[i];
            }
        }
        System.out.println(minvalue);
    }
}