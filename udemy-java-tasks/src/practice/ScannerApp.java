package practice;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Entered your number: ");
        int value = scanner.nextInt();

        while ( value != 5 ) {
            System.out.println("Entered your number: ");
            value = scanner.nextInt();
        }*/

        int value = 0;
        do {
            System.out.println("Entered your number: ");
            value = scanner.nextInt();
        }
        while (value != 5);
        System.out.println("Got 5!");
    }
}
