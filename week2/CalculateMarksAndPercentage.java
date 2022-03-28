import java.util.Scanner;

public class CalculateMarksAndPercentage {
    String name;
    double marks1,marks2,marks3;

    public CalculateMarksAndPercentage(double marks1, double marks2, double marks3) {
        this.name = "Robert";
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double returnTotalMarks() {
        return this.marks1 + this.marks2 + this.marks3;
    }

    public double returnPercentage() {
        return (this.returnTotalMarks()/300)*100;
    }

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