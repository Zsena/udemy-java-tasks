package practice;
//bekérem az N számot, majd i-vel lépkedek 2-től egyesével N/2-ig és ezekre a számokra megnézem, hogy N%i nulla-e, ha igen, akkor megtaláltam az osztót.
// Tudom mondtad hogy nem kell tömb de anélkül nehezen tudtam elképzelni a feladatot, majd leirhatnád a megoldást, köszi ^^

import java.io.*;

public class Research2 {
    public static void main(String[] args) {
        double number = 72;
        double n = Math.sqrt(number); // adott szám gyökével tér vissza


        boolean found = false;
        double i = 2;
        for (; i < n; i++) {
            if ((number % i == 0)) {
                found = true;
                break;
            }
        }
        if (!(found = false)) {
            System.out.println("The smallest divisor = " + i);
        } else {
            System.out.println("This is a prime number");
        }
    }
}