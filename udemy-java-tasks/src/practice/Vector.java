package practice;

public class Vector {
    public static void main(String[] args) {

        String[] strVector;
        strVector = new String[4];
        strVector[0] = "Hello";
        strVector[1] = "WELCOME";
        strVector[2] = "here!";

        char[] welcome = new char[]{'N', 'i', 'c', 'e', ' ', 't', 'o', ' ', 'm', 'e', 'e', 't', ' ', 'y', 'o', 'u'};

        welcome = uppercase(welcome);

        System.out.println("0: " + strVector[0]); // “Hello"
        System.out.println("l: " + strVector[1]); // “WELCOME"
        System.out.println("2: " + strVector[2]); // “here!"
        System.out.println("W: " + String.valueOf(welcome)); // NICE TO MEET YOU
        System.out.println("3: " + strVector[3]); // null
        System.out.println("length: " + strVector.length); // 4

    }

    public static char[] uppercase(char[] array) {
        char[] result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = Character.toUpperCase(array[i]);
        }
        return result;
    }
}
