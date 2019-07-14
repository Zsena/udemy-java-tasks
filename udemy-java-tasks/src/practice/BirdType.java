package practice;

/*A Balaton menten K darab madarasz vegzett megfigyeleseket.
Mindegyik megadta, hogy milyen madarakat latott. Keszıtsunk
algoritmust, amely a megfigyelesek alapjan megadja a Balatonon
elofordulo madarfajokat!*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirdType {
    public static void main(String[] args) {

//        ArrayList<String> elsoMadarasz = new ArrayList <>();
//        elsoMadarasz.add("Bütykös Hattyú");
//        elsoMadarasz.add("Ökörszem");
//        elsoMadarasz.add("Fekete Harkály");
//
//        ArrayList<String> masodikMadarasz = new ArrayList <>();
//        masodikMadarasz.add("Vörösbegy");
//        masodikMadarasz.add("Héja");
//        masodikMadarasz.add("Fekete Harkály");
//        masodikMadarasz.add("Fekete gólya");
//
//        ArrayList<ArrayList<String>> madarak = new ArrayList <>();
//        madarak.add(elsoMadarasz);
//        madarak.add(masodikMadarasz);

        String[][] fowlerObservation = new String[][]{
                {"Bütykös Hattyú", "Ökörszem", "Fekete Harkály"},
                {"Vörösbegy", "Héja", "Fekete Harkály", "Fekete gólya"}
        };
        List <String> list = new ArrayList <>();

        for (int i = 0; i < fowlerObservation.length; i++) {
            String[] sor = fowlerObservation[i];
            for (int j = 0; j < sor.length; j++) {
                //System.out.print(fowlerObservation[i][j] + "\t");
                if (!list.contains(sor[j])) {
                    list.add(sor[j]);
                }
                /*if(fowlerObservation[0][j]!= fowlerObservation[1][j]) {
                    ArrayList[] newArr = new ArrayList[0];
                    newArr = fowlerObservation[i][j];
                    System.out.println(newArr);
                }*/
            }

            System.out.println();

        }
        System.out.println(list);
    }
}
