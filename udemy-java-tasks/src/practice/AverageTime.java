package practice;

/*Keszıtsunk algoritmust, amely egy autoversenyzo koronkenti ideje
 alapjan meghatarozza a versenyzo egy kor megtetelehez szukseges atlagidejet!*/
public class AverageTime {
    public static void main(String[] args) {
        String minute = " minute.";
        String before = "The average duration of a racing circuit: ";
        double[] circularTime = {5, 3.2, 5.6, 4, 10};
        double averageTime = 0;

        for (int i = 0; i < circularTime.length; i++) {
            averageTime = averageTime + circularTime[i];
        }

        System.out.println(before + averageTime / circularTime.length + minute);
    }
}
