package practice;
//Egy M elemu betusorozat betuit fuzzuk ossze egyetlen szoveg tıpusu valtozoba!

public class StringConcat {

    public static void main(String[] args) {
        String[] m = {"S", "t", "r", "i", "n", "g", "C", "o", "n", "c", "a", "t"};
        //StringBuilder newChars = new StringBuilder("");
        //for (int i = 0; i < m.length; ++i) {
        //newChars.append(m[i]);
        //}

        char[] newChars = new char[m.length];

        for (int i = 0; i < m.length; ++i) {
            newChars[i] = m[i].charAt(0);
        }
        System.out.println(newChars);
        //delete();
        //System.out.println(newChars);
    /*private static void delete() {
        StringBuilder delete = new StringBuilder();
        delete.delete(1,4);*/
    }

}
