package practice;

public class JumpGame {
    /*Ugrálós játék
  Adott egy nemnegatív egész számokból álló tömb, melynek az első elemén állunk. A tömb minden eleme az adott pozícióból történő legnagyobb ugorható távolságot jelöli.
  Döntsük el a tömbről, hogy el tudunk-e jutni benne az utolsó elemig a fenti szabályt követve. Példák: A = [2,3,1,1,4], eredménye igaz. B = [3,2,1,0,4], eredménye hamis.*/
    public static void main(String[] args) {
        int[] jumpArrayA = {3, 2, 1, 0, 4};

        boolean result = false;

        for (int i = 0; i < jumpArrayA.length && jumpArrayA[i] != 0; i = i + jumpArrayA[i]) {
            if (i == jumpArrayA.length - 1) {
                result = true;
            }
        }
        System.out.println(result);
    }
}