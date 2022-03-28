import java.util.Scanner;

public class EmployeeBonus {
    double salary;
    int year;
    EmployeeBonus() {
        this.salary = 0;
        this.year = 0;
    }
    public EmployeeBonus(double salary, int year) {
        this.salary = salary;
        this.year = year;
    }

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
