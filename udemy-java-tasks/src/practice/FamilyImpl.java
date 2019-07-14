package practice;

class FamilyImpl {
    String name;
    int revenue;
    int expenditure;

    public FamilyImpl(String _name, int _revenue, int _expenditure) {
        this.name = _name;
        this.revenue = _revenue;
        this.expenditure = _expenditure;
    }

    public int costDivider() {
        int savings = this.revenue - this.expenditure;

        return savings;
    }

    void printData() {
        System.out.println("This " + name + " family was the more costing what is: " + costDivider() + " €");
    }
}
