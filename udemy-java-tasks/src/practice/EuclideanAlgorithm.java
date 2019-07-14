package practice;

public class EuclideanAlgorithm {
    public static void main(String[] args) {

        int m = 205; // osztandó
        int n = 25; // osztó
        int r = m % n; //maradék /132:10 ( eredmény 13, maradék 2)
        //int lastR = n; // értékül adjuk az osztót/ 10

        if (r == 0) { //ez le se fut ha nem egyenlő az r nullával
            System.out.println("This algorithm is finished! The greatest common divider is a: " + n);
        } else { // ez fut le
            while (r != 0) { //mivel 2 az r értéke
//                int newR = r; //eltároljuk új változóban az osztás maradékát tehát a 2-őt
//                r = lastR % r;  //az r-nek értékül adjuk , hogy az előző osztandót (32) elosszuk az előző maradékkal (2)
//                lastR = newR; // értékül adjuk az uj maradékot / 2  -- > mivel osztható volt a 32 kettővel maradék nélkül, tehát nulla lett az r, így visszaugrunk az első elágazáshoz, és kiiratjuk a legnagyobb közös osztót

                m = n;
                n = r;
                r = m % n;
            }
            System.out.println(n);
        }
    }
}
