import java.util.Scanner;

public class StudentAttendance {
    /**
     * StudentAttendance
     *
     * @author Achyut Neupane <to@achyut.com.np>
     *
     * Q. A student will not be allowed to sit an exam if his/her attendance is less than 75%.
     * a. Take following input from user
     *      i. Number of classes held
     *      ii. Number of classes attended.
     * b. Print the percentage of the class attended.
     * c. Is a student allowed to sit an exam or not?
     * 
     * This code has the class `StudentAttendance` which has attributes
     * `classesHeld` and `classesAttended` which are initialized in the
     * constructor. It has a method `returnPercentage` which returns the
     * percentage of the classes attended. It has a method `allowedOrNot`
     * which returns whether a student is allowed to sit an exam or not.
     * 
     */

    long classesHeld, classesAttended;

    StudentAttendance(long classesHeld, long classesAttended) {
        this.classesHeld = classesHeld;
        this.classesAttended = classesAttended;
    }

    public double returnPercentage() {
        return (double) this.classesAttended / this.classesHeld;
    }

    public boolean allowedOrNot() {
        return this.returnPercentage() >= 0.75;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of classes held: ");
        long classesHeld = scan.nextLong();
        System.out.println("Enter the number of classes attended: ");
        long classesAttended = scan.nextLong();
        StudentAttendance student1 = new StudentAttendance(
                classesHeld,
                classesAttended);
        System.out.println(
                "The percentage of classes attended is: " +
                        student1.returnPercentage() *
                                100
                        +
                        "%");
        System.out.println(
                "So, the student is" +
                        (student1.allowedOrNot() ? " " : " not ") +
                        "allowed to attend the class.");
        scan.close();
    }
}
