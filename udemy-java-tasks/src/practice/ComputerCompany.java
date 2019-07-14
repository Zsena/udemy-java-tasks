package practice;

import java.util.*;

class ComputerCompany {

    String customerName;
    String addressName;
    int addNumber;
    int profit;

    public ComputerCompany(String customerName, String addressName, int addNumber, int profit) {

        this.addressName = addressName;
        this.profit = profit;
        this.addNumber = addNumber;
        this.customerName = customerName;

    }

    public String toString() {
        return "Name of the customer.: " + this.customerName + ",, "
                + "Address of the customer.:" + this.addressName + "út " + this.addNumber + " They have this profit: " + this.profit;
    }
}

class Costumers {

    public static void main(String[] args) {

        List<ComputerCompany> costumerList = new LinkedList<ComputerCompany>();

        ComputerCompany company1 = new ComputerCompany("Ponte Ltd.", "Budapest, Váci: ", 19, 10000000);
        ComputerCompany company2 = new ComputerCompany("Evosoft", "Budapest, Váci: ", 14, 15000000);
        ComputerCompany company3 = new ComputerCompany("IBM", "Budapest, Váci: ", 25, 16000000);
        ComputerCompany company4 = new ComputerCompany("EPAM", "Budapest, Váci: ", 12, 1000700);
        ComputerCompany company5 = new ComputerCompany("Humansoft Ltd.", "Budapest, Váci: ", 17, 1800000);

        System.out.println("company5=" + company5);

        costumerList.add(company1);
        costumerList.add(company2);
        costumerList.add(company3);
        costumerList.add(company4);
        costumerList.add(company5);
        Iterator<ComputerCompany> i = costumerList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}