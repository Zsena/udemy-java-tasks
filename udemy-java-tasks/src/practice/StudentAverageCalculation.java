package practice;

//Egy osztaly N darab tanulojanak osztalyzata alapjan adjuk meg az osztaly atlagat!
public class StudentAverageCalculation {
    public static void main(String[] args) {
        int[] studentRating = {5, 2, 3, 5, 4, 2, 2, 1, 5, 4};

        int a = studentRating.length;
        int b = 0;

        for (int i = 0; i < a; i++) {
            b = b + studentRating[i];
        }
        System.out.println("The student average = " + b / (a + 0.0));
    }
}
