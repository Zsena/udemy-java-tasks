package practice;

//Valogassuk ki egy tomb paros ertekeit egy masik tombbe.

public class NumbersAssort {
    public static void main(String[] args) {
        int[] xArray = {4, 1, 3, 8, 2, 7}; // bemenet
        int[] yArray = new int[xArray.length]; // új tömb, ahol tárolom majd a páros elemeket

        printData(assortingOfArray(xArray)); // meghívom a bemenetre a függvényem
    }
    private static void printData(int[] yArray) {
        for (int i = 0; i < yArray.length; i++) { // kiértékelem az eredményt
            System.out.println(yArray[i]); // kiiratom a páros értlkeket, ha szerepelnek a tömbben
        }
    }

    private static int[] assortingOfArray(int[] arr) { // metódus paramterezése az vizsgált objektumokkal
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) { // ciklus a tömb végéig
            if (arr[i] % 2 == 0) { // ha kettővel osztható maradék nélkül, akkor az biztosan páros
                result[i] = arr[i]; // akkor értékül adom az új tömb i-edik elemének a megtalált páros elemet
            }
        }
        return result; //visszakérem a tömböt
    }
}

