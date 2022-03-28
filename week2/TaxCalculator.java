public class TaxCalculator {
    double income;

    public TaxCalculator(double income) {
        this.income = income;
    }

    public double returnTax() {
        if(this.income > 250000) {
            return 25000+(this.income-250000)*0.3;
        } else if(this.income > 150000) {
            return 5000+(this.income-150000)*0.2;
        } else if(this.income > 100000) {
            return (this.income-100000)*0.1;
        } else {
            return 0;
        }
    }

    public void printDetails() {
        System.out.println("The tax for Rs. "+this.income+" is: "+this.returnTax());
    }

    public static void main(String[] args) {
        TaxCalculator annualIncome1 = new TaxCalculator(99000);
        annualIncome1.printDetails();

        TaxCalculator annualIncome2 = new TaxCalculator(300000);
        annualIncome2.printDetails();

        TaxCalculator annualIncome3 = new TaxCalculator(800000);
        annualIncome3.printDetails();

        TaxCalculator annualIncome4 = new TaxCalculator(2000000);
        annualIncome4.printDetails();
    }
}
