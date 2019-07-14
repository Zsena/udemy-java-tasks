package practice;

//típuskonverzió / castolás
// Fontosabb metódusok
public class TypeConversion {
    public static void main(String[] args) {
        short a = 4;
        short b = 5;
        short c = (short) (a + b);
        System.out.println(c);

        CalcToString example = new CalcToString();
        System.out.println(example.toString());


    }


    //toString()
    static class CalcToString {
        private String name = "Zsena";
        private double proc = 4.5;

        private void calc(String name) {
            this.name = name;
        }

        public String toString() {
            return "Name: " + name + ", hour: " + proc + " GHz,";

        }
    }
}
