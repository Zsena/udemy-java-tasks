package practice;

import java.util.Calendar;

public class Enum {
    enum PartOfTheDay {
        MORNING, MIDDAY, AFTERNOON, EVENING;
    }

    public static void main(String[] args) {
// jelenlegi dátum és idő lekérése
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);// óra
        PartOfTheDay n;
// napszak meghatározása
        if (hour < 12){
            n = PartOfTheDay.MORNING;
        }
        else if (hour < 13){
            n = PartOfTheDay.MIDDAY;
        }
        else if (hour < 19) {
            n = PartOfTheDay.AFTERNOON;
        }
        else {
            n = PartOfTheDay.EVENING;
        }
        System.out.println("Part of the day: " + n);
    }
}
