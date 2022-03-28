import java.util.Scanner;

public class StudentAttendance {
    long classesHeld,classesAttended;
    StudentAttendance() {
        this.classesHeld = 0;
        this.classesAttended = 0;
    }
    StudentAttendance(long classesHeld,long classesAttended) {
        this.classesHeld = classesHeld;
        this.classesAttended = classesAttended;
    }
    public double returnPercentage() {
        return (double)this.classesAttended/this.classesHeld;
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
        StudentAttendance student1 = new StudentAttendance(classesHeld,classesAttended);
        System.out.println("The percentage of classes attended is: "+student1.returnPercentage()*100+"%");
        System.out.println("So, the student is"+(student1.allowedOrNot() ? " " : " not ")+"allowed to attend the class.");
        scan.close();
    }

}