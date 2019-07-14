package practice;

//Dontsuk el egy tanulo ev vegi osztalyzata alapjan, hogy kituno tanulo-e!
public class StudentsSkills {
    public static void main(String[] args) {
        double[] grades = {5, 5, 5, 1, 5, 5};
        double excellentGrade = 5;

        boolean found = true;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] != excellentGrade) {
                found = false;
                break;
            }
        }
        if (found == true) {
            System.out.println("Hey Congrats! The student has excellent skills.");
        } else {
            System.out.println("Sorry, The student is very lazy!");
        }

   /*int excellentGrade = 5;

        int sum = 0;

        boolean found = false;

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
            int newValue = sum;
            int result = (newValue/ grades.length);
            if (result == excellentGrade) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("Hey Congrats! The student has excellent skills.");
        } else {
            System.out.println("Sorry, The student is very lazy!");
        }*/
    }
}
