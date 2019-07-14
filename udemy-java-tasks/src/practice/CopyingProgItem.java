package practice;
//Egy tomb minden elemenek abszolut erteket masoljuk at egy masik tombbe!

public class CopyingProgItem {

    public static void main(String[] args) {

        int[] negativeArray = {-2, 3, -1, -5};
        int[] otherArray = new int[negativeArray.length];

        Copying.copyOfArray(negativeArray, otherArray);

    }
}