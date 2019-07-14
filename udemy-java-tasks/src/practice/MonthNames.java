package practice;
//Dontsuk el egy szorol a honapnevek sorozata alapjan, hogy egy honap neve-e!

import java.util.Scanner;

public class MonthNames {
    public static void main(String[] args) {
        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        Scanner scanner = new Scanner(System.in);

        boolean found = false;

        if (found != true) {
            System.out.println("What is your word? ");
            String words = scanner.nextLine();
            for (int i = 0; i < months.length; i++) {

                if (months[i].equals(words)) {
                    found = true;
                }
            }
            if (found == true) {
                System.out.println("Hey Congrats! This word is true!");
            } else {
                System.out.println("Sorry, This word is false!");
            }
        }
    }
}
