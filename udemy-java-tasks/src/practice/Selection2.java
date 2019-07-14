package practice;
/*A naptarban talalhato nevnapok alapjan adjuk meg a legjobb baratunk nevnapjat!
        -7 nap
        - Stringként a dátum
        - mátrix és hashmap
        - bekérek egy nevet irja ki a program a névnap dátumát ha benne van a tömben a név
        - ha nincs benne irja ki hogy nincs*/

import java.util.Scanner;


public class Selection2 {

    public static void main(String[] args) {
        String[][] namedays = {
                {"Zsanett", "Ádám", "Tamás", "Ákos", "Zoé", "Nimród", "Áron"},
                {"09.05", "04.16", "05.02", "06.04", "07.05", "12.01", "02.01"}
        };

        String name = readName();
        String result = eventSelection(namedays, name);
        printName(result);
    }

    private static void printName(String result) {
        if (result != null) {
            System.out.println("My friend nameday is: " + result);
        } else {
            System.out.println("Sorry, but we don't have this name in a calendar.");
        }
    }

    private static String readName() {
        Scanner s = new Scanner(System.in);
        System.out.println("What is your word? ");
        return s.nextLine();
    }

    public static String eventSelection(String[][] n, String name) {
        String result = null;
        for (int i = 0; i < n[0].length; i++) {
            if (name.equals(n[0][i])) {
                result = n[1][i];
                return result;
            }
        }
        return result;
    }

}