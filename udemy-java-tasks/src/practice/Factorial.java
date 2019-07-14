package practice;

public class Factorial {

    public static void main(String[] args) {
        long fact = 5;

        long factorialNumber = calculate(fact);

        long factorialNumber2 = calculateRecursive(fact);

        System.out.println(factorialNumber);
        System.out.println(factorialNumber2);
    }


    private static long calculate(long n) {
        long factorial = n;
        long number = n;
        while (number > 1) {
            number = number - 1;
            factorial = number * factorial;
//            factorial = number * (factorial - 1);
        }
        return factorial;
    }

    private static long calculateRecursive(long n) { // recursive
        if (n > 1) {
            return n * calculateRecursive(n - 1);
        }
        return 1;
    }
}

