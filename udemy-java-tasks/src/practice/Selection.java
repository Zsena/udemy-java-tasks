package practice;
// Ismerjuk egy honap nevet. A honapnevek sorozata alapjan mondjuk meg a honap sorszamat!

public class Selection {
    public static void main(String[] args) {
        String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int n = months.length; // A tömb elemeinek száma
        String month1 = "may"; //Amiről szeretnénk tudni, hogy hányadik helyen van

        int i = 0;
        while (months[i] != month1)
            i++;

        System.out.printf("The selection months place is a: %d.\n", i + 1);
        System.out.printf("Index number: %d.\n", i);
    }
}