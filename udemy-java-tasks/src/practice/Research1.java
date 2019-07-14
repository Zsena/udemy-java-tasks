package practice;
//tömb elemei közül keresek egy számot

public class Research1 {
    public static void main(String[] args) {
        int[] array = {5, 10, 1, 2};
        int n = array.length;
        int search = 2; //Amit keresünk

        int i = 0;
        while (i < n && array[i] != search)
            i++;

        if (i < n) {
            //Ha a kérdés az, hogy hányadik akkor i + 1 a vége
            //ha a kérdés az, hogy mi az indexe, akkor csak i
            System.out.printf("Van ilyen a következő helyen: %d\n", i + 1);

        } else {
            System.out.println("Nincs ilyen elem");
        }
    }

}
