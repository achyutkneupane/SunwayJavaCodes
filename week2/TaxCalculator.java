public class TaxCalculator {

    /**
     * TaxCalculator
     * 
     * @author Achyut Neupane <to@achyut.com.np>
     * 
     * Q. Write a program to compute the tax according to
     * the given conditions and display the output.
     * 
     * This code has the class `TaxCalculator` which has a constructor
     * where the income is initialized. It has a method `returnTax`
     * which returns the tax according to the given conditions.
     * It also has a method `printDetails` which prints the tax amount.
     * 
     */
    double income;

    public TaxCalculator(double income) {
        this.income = income;
    }

    // returns the tax according to the given conditions
    public double returnTax() {
        // if income is greater than to 250000
        if(this.income > 250000) {
            // returns sum of 25000 and 30% of the exceeding amount than 250000
            return 25000+(this.income-250000)*0.3;
        // if income is greater than 150000
        } else if(this.income > 150000) {
            // returns sum of 5000 and 20% of the exceeding amount than 150000
            return 5000+(this.income-150000)*0.2;
        // if income is greater than 100000
        } else if(this.income > 100000) {
            // returns the 10% of the exceeding amount than 100000
            return (this.income-100000)*0.1;
        } else {
            // else return no tax
            return 0;
        }
    }

    // prints the tax amount
    public void printDetails() {
        System.out.println("The tax for Rs. "+this.income+" is: "+this.returnTax());
    }

    public static void main(String[] args) {
        // for Rs. 99000
        TaxCalculator annualIncome1 = new TaxCalculator(99000);
        annualIncome1.printDetails();

        // for Rs. 300000
        TaxCalculator annualIncome2 = new TaxCalculator(300000);
        annualIncome2.printDetails();

        // for Rs. 800000
        TaxCalculator annualIncome3 = new TaxCalculator(800000);
        annualIncome3.printDetails();

        // for Rs. 2000000
        TaxCalculator annualIncome4 = new TaxCalculator(2000000);
        annualIncome4.printDetails();
    }
}
