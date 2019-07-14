package practice;

import java.util.ArrayList;

//Csaladok letszama, illetve jovedelme alapjan allapıtsuk meg, hogy hany csalad el a letminimum alatt!

public class Family {
    public static void main(String[] args) {
        int subsistenceLevel = 50000; // egy fő megélhetési összege
        int onePerson = 0;
        ArrayList goodSubLevel = new ArrayList();
        ArrayList badSubLevel = new ArrayList();

        int[][] info = new int[][]{
                {5, 4, 3, 2, 6, 4, 1}, // család / létszám
                {150000, 250000, 100000, 85000, 42500, 500000, 20000} //  jövedelem
        };

        for (int i = 0; i < info[1].length; i++) {
            onePerson = info[1][i] / info[0][i]; //
            if (onePerson > subsistenceLevel) {
                goodSubLevel.add(info[0][i]); // beteszem őket ebbe a listába
            } else {
                badSubLevel.add(info[0][i]); // beteszem őket ebbe a listába
            }
        }

        System.out.println("" + badSubLevel.size()); // lista méretének kiiratása
    }
}
