package practice;
//Egy osztaly tanuloinak nevei alapjan adjuk meg a nevsorban legelso tanulot!


import java.text.Collator;
import java.util.Locale;

public class MaxSelection2 {
    public static void main(String[] args) {
        String[] students = {"Katalin", "Nóra", "Zoé", "Adám", "Adnold", "Béla", "Teodor", "Géza", "Jakab", "Dániel"};

        System.out.println("The fist student name is: " + readStringAndToCompare(students));
    }


    private static String readStringAndToCompare(String[] array) {
        Collator usCollator = Collator.getInstance(Locale.getDefault());
        String firstStudent = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareToIgnoreCase(firstStudent) < 0) {
                firstStudent = array[i];
            }

            /*char firstLetter = array[i].charAt(0);
            char secondLetter = array[i+1].charAt((1));
            char firstStudentLetter = firstStudent.charAt(0);
            if (firstLetter < firstStudentLetter) {
                firstStudent = array[i];
                if (firstStudentLetter <= secondLetter){
                    firstStudent = array[i];
                }
            }*/
        }

        return firstStudent;
    }
}