package practice;

import java.util.Scanner;

public class Words {
    //1) a program kérjen be egyetlen szót az inputról a java.util.Scanner osztály használatával (a standard inputról beolvasás a következő Scanner pédánnyal történhet: new Scanner(System.in))
    //2) Egy ciklus segítségével vizsgáljuk meg, hogy a bekért szó megtalálható-e a következő, String-eket tartalmazó tömbben:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] moviePlot = {"A", "fast-talking", "mercenary", "with", "a", "morbid",
                "sense", "of", "humor", "is", "subjected", "to", "a", "rogue", "experiment",
                "that", "leaves", "him", "with", "accelerated", "healing", "powers", "and",
                "a", "quest", "for", "revenge"};


        boolean found = false;
        while (found != true) {
            System.out.println("Enter your word: ");
            String word = scanner.nextLine();
            for (int i = 0; i < moviePlot.length; i++) {
                if (moviePlot[i].equals(word)) {
                    found = true;
                    break;
                }
            }
            if (found == true) {
                System.out.println("Hey Congrats! Successful word!");
            } else {
                System.out.println("Error! Try again!");
            }
        }
    }
}
    /*public static void main(String[] args) {
        String[][] namesAndDates  = {
                {"Zsanett", "Ádám", "Tamás", "Ákos", "Zoé", "Nimród", "Áron"},
                {"09.05", "04.16", "05.02", "06.04", "07.05", "12.01", "02.01"}
        };

        String result = readNameAndSelectEvent(namesAndDates);
        System.out.println(result);


    }
    public static String readNameAndSelectEvent(String[][] n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your word? ");
        String read = scanner.nextLine();
        String result = "";
        for (int i = 0; i < n[0].length; i++) {
            if (read.equals(n[0][i])) {
                result = "My Fiends nameday is: " + n[1][i];
                break;
            } else {
                result = "Sorry, but we don't have this name in a calendar.";
            }
        }
        return result;
    }
}*/

