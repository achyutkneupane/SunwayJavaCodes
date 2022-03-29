import java.util.Scanner;

public class EmployeeBonus {
    /**
     * EmployeeBonus
     * 
     * @author Achyut Neupane <to@achyut.com.np>
     * 
     * Q. A company decided to give a bonus of 5% to
     * employees if his/her year of service is more
     * than 5 years.Ask users for their salary and
     * year of service and print the net bonus amount.
     * 
     * This code has the class `EmployeeBonus` which has a constructor
     * where the salary and year of service are initialized. It has a
     * method `returnBonus` which returns the bonus amount.
     * 
     */
    double salary;
    int year;
    EmployeeBonus(double salary, int year) {
        this.salary = salary;
        this.year = year;
    }

    // returns the bonus amount if the year of service is more than 5 years
    public double returnBonus() {
        if(this.year > 5) {
            return this.salary * 0.05;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        double salary = scan.nextDouble();
        System.out.println("Enter the year of service: ");
        int year = scan.nextInt();
        EmployeeBonus employee = new EmployeeBonus(salary,year);
        System.out.println("The salary is: "+employee.salary);
        System.out.println("The bonus is: "+employee.returnBonus());
        System.out.println("The net salary is: "+(employee.salary+employee.returnBonus()));
        scan.close();
    }
}
