public class Employee {
    // Attributes
    double salary;
    String category,name;

    // Constructor Overloading

    // Without any parameters (default)
    Employee() {
        this.salary = 20000;
        this.category = "general";
        this.name = "No Name";
    }

    // With name as the parameter
    Employee(String name) {
        this.salary = 20000;
        this.name = name;
        this.category = "general";
    }

    // With all parameters
    Employee(double salary,String category,String name) {
        this.salary = salary;
        this.category = category;
        this.name = name;
    }

    // this method increases the salary of the object by 20% when called
    public double increaseInSalary() {
        System.out.println("Method1");
        // this.salary is the salary of object that calls the method
        return 0.2*this.salary;
    }
    public double increaseInSalary(double salary) {
        System.out.println("Method2");
        // this.salary is the salary of object that calls the method
        return 0.2*salary;
    }

    // Main method
    public static void main(String[] args) {
        // Initialize three objects with all types of constructor
        Employee roshan = new Employee(50000,"founder","Roshan");
        Employee sakar = new Employee("Sakar");
        Employee noName = new Employee();

        // Print salary of all three employee(objects)
        System.out.println("Salary of " + roshan.name + "("+ roshan.category +") is: " + roshan.salary);
        System.out.println("Salary of " + sakar.name + "("+ sakar.category +") is: " + sakar.salary);
        System.out.println("Salary of " + noName.name + "("+ noName.category +") is: " + noName.salary);

        // Line break
        System.out.println("\n");

        // Print salary of all three employees after increment
        System.out.println("Salary of " + roshan.name + " after increment is " + (roshan.salary+roshan.increaseInSalary()));
        System.out.println("Salary of " + sakar.name + " after increment is " + (sakar.salary+sakar.increaseInSalary()));
        System.out.println("Salary of " + noName.name + " after increment is " + (noName.salary+noName.increaseInSalary()));

        System.out.println(sakar.salary+sakar.increaseInSalary(sakar.salary));
    }
}
