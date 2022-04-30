package week6.Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Company
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 */
public class Company {

    /**
     * main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Employee> companyEmployeeList = new ArrayList<Employee>();
        Scanner scan = new Scanner(System.in);

        // Get employee details
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of employee " + (i + 1));
            String name = scan.next();
            System.out.println("Enter the salary of employee " + (i + 1));
            int salary = scan.nextInt();
            System.out.println("Enter the date of joining of employee " + (i + 1));
            String dateOfJoining = scan.next();
            Employee companyEmployee = new Employee(name, salary, dateOfJoining);
            companyEmployeeList.add(companyEmployee);
            System.out.println();
        }
        // Print details
        System.out.println("Employee details:");
        for (Employee employee : companyEmployeeList) {
            employee.printEmployeeDetails(employee);
            System.out.println();
        }
        scan.close();
    }
}