package week6.Question1;

/**
 * Employee
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 */
public class Employee {
    private String name;
    private int salary;
    private String dateOfJoining;

    /**
     * Company
     * 
     * @param name
     * @param salary
     * @param dateOfJoining
     */
    public Employee(String name, int salary, String dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    /**
     * getName
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getSalary
     * 
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * setSalary
     * 
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * getDateOfJoining
     * 
     * @return dateOfJoining
     */
    public String getDateOfJoining() {
        return dateOfJoining;
    }

    /**
     * setDateOfJoining
     * 
     * @param dateOfJoining
     */
    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    /**
     * print Employee details
     * 
     * @param CompanyEmployee
     */
    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Date of joining: " + employee.getDateOfJoining());
    }
}