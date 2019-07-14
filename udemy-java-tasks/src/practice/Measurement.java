package practice;
/* Eldöntés
J´uniusban minden nap d´elben megm´ert¨uk, hogy a Balaton Si´ofokn´al h´any fokos. D¨onts¨uk el a m´er´esek alapj´an, hogy a v´iz h?ofoka folyamatosan emelkedett-e!

Van egy tömb ami tartalmaz mérési eredményket, és kell egy boolean változó amiben azt tárolom le hogy folyamatosan emelkedik e a homérséklet.
Van egy ciklus ami vizsgál valamit. */

public class Measurement {
    public static void main(String[] args) {
        double[] measurement = {37, 37.4, 40.4, 39.3, 25.8};

        boolean result = true;

        for (int i = 0; i < measurement.length - 1; i++) {
            if (measurement[i] >= measurement[i + 1]) {
                result = false;
                break;
            }
        }
        if (result == true) {
            System.out.println("The measurements is good, because the temperature is rises.");
        } else {
            System.out.println("The measurements isn't good, because the temperature isn't rises.");
        }
    }
}
