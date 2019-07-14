package practice;

//Fordítsa meg a sztring karaktereit:
public class Invert {
    public static void main(String[] args) {
        String palindrome = "Euston saw I was not Sue"; //palindrom: olyan szó vagy szókapcsolat, amely visszafelé olvasva is ugyanaz, vagy tágabb értelemben értelmes.
        int length = palindrome.length();

        StringBuilder newSentence = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            newSentence.append(palindrome.charAt(i));
        }

        //for (int i = 0; i < palindrome.length() ; i++) { newSentence.append(palindrome.charAt(palindrome.length()-1-i)); }
        System.out.println(newSentence);
    }
}
