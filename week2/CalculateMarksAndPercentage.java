import java.util.Scanner;

public class CalculateMarksAndPercentage {

    /**
     * CalculateMarksAndPercentage
     * 
     * @author Achyut Neupane <to@achyut.com.np>
     * 
     * Q. If the marks of Robert in three subjects are entered
     * through a keyboard (each out of 100),write a program to
     * calculate his total marks and percentage marks.
     * 
     * This code has the class `CalculateMarksAndPercentage`
     * which has a constructor where three numbers are initialized.
     * It has two methods `returnTotalMarks()` and `returnPercentage()`
     * which returns the total marks and percentage marks respectively.
     * It also has a method `printDetails()` which prints the details
     * of the student along with the total marks and percentage marks.
     */

    String name;
    double marks1,marks2,marks3;

    // Constructor to initialize the three numbers
    CalculateMarksAndPercentage(double marks1, double marks2, double marks3) {
        this.name = "Robert";
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // returns the total marks
    public double returnTotalMarks() {
        return this.marks1 + this.marks2 + this.marks3;
    }

    // returns the percentage marks
    public double returnPercentage() {
        return (this.returnTotalMarks()/300)*100;
    }

    // prints the details of the student along with the total marks and percentage marks
    public void printDetails() {
        System.out.println("Name: "+this.name);
        System.out.println("Total Marks (out of 300): "+this.returnTotalMarks());
        System.out.println("Percentage: "+this.returnPercentage()+"%");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks for subject 1: ");
        double marks1 = scan.nextDouble();
        System.out.println("Enter marks for subject 2: ");
        double marks2 = scan.nextDouble();
        System.out.println("Enter marks for subject 3: ");
        double marks3 = scan.nextDouble();

        CalculateMarksAndPercentage robert = new CalculateMarksAndPercentage(marks1,marks2,marks3);
        robert.printDetails();
        scan.close();
    }
}