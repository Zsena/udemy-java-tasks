package practice;

public class SwitchCase {
    public static void main(String[] args) {
        byte studentGirlsTable = 3;
        System.out.println("The next girl is sitting at third table: ");
        switch (studentGirlsTable) {
            case 4 :
                System.out.println("Ági");
                break;
            case 3 :
                System.out.println("Zsanett");
                break;
            case 2:
                System.out.println("Dóra");
                break;
            case 1:
                System.out.println("Lili");
                break;
            default:
                    System.out.println("something");
        }
    }
}
