public class ConstructorOverloading {

    /** 
     * Author: Achyut Neupane <to@achyut.com.np>
     * 
     * This is the ConstructorOverloading class
     * which was written to show how constructor
     * overloading works.
    */
    int variable;

    // Constructor with no parameters
    ConstructorOverloading() {
        System.out.println("Constructor without parameter so zero is assigned to the variable");
        this.variable = 0;
    }

    // Constructor with parameter
    ConstructorOverloading(int variable) {
        System.out.println("Constructor with parameter so the passed value is assigned to the variable");
        this.variable = variable;
    }

    public void announceVariable() {
        System.out.println("The variable is assigned: " + this.variable);
    }

    public static void main(String[] args) {
        // Creating an instance with no parameter
        ConstructorOverloading co1 = new ConstructorOverloading();
        co1.announceVariable();

        // Creating an instance with parameter passed
        ConstructorOverloading co2 = new ConstructorOverloading(45);
        co2.announceVariable();
    }
}
