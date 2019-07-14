package practice;

import java.util.ArrayList;

// Családok bevételei és kiadásai alapján, mondjuk meg melyik család tudott legtöbbet megtakarítani és mennyit.

public class MaxSelection3 {
    public static void main(String[] args) {


        FamilyImpl family1 = new FamilyImpl("Brightmore", 150000, 50000);
        FamilyImpl family2 = new FamilyImpl("Erwin", 170000, 45550);
        FamilyImpl family3 = new FamilyImpl("Badrick", 250000, 80000);
        FamilyImpl family4 = new FamilyImpl("Balman", 230000, 65000);
        FamilyImpl family5 = new FamilyImpl("Cutteridge", 210000, 70000);
        FamilyImpl family6 = new FamilyImpl("Eddols", 195000, 30000);

        ArrayList <FamilyImpl> allFamily = new ArrayList <>();
        allFamily.add(family1);
        allFamily.add(family2);
        allFamily.add(family3);
        allFamily.add(family4);
        allFamily.add(family5);
        allFamily.add(family6);

        int listIndex = 0;
        for (int i = 0; i < allFamily.size(); i++) {
            int savings = allFamily.get(i).costDivider();
            int maxSavings = allFamily.get(listIndex).costDivider();
            if (savings >= maxSavings) {
                listIndex = i;
            }
        }
        allFamily.get(listIndex).printData();

        System.out.println("allFamily instanceof Object: " + (allFamily instanceof Object)); // vizsgálat hogy referencia kompatibilis e az osztállyal /ArrayList<FamilyImpl> allFamily = new ArrayList<FamilyImpl>()

        /*FamilyImpl family2 = new FamilyImpl();
        family2.name = " Badrick ";
        //String second = family1.costDivider(familyCost, String.valueOf(family2));

        FamilyImpl family3 = new FamilyImpl();
        family3.name = " Balman ";
        //String third = family1.costDivider(familyCost, String.valueOf(family3));


        FamilyImpl family4 = new FamilyImpl();
        family4.name = " Cutteridge ";
        //String fourth = family1.costDivider(familyCost, String.valueOf(family4));


        FamilyImpl family5 = new FamilyImpl();
        family5.name = " Eddols ";
        //String fifth = family1.costDivider(familyCost, String.valueOf(family5));


        FamilyImpl family6 = new FamilyImpl();
        family6.name = " Erwin ";
        //String sixth = family1.costDivider(familyCost, String.valueOf(family6));*/


    }
}
