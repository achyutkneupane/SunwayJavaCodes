import java.util.Scanner;

public class Student {
    String name;
    Student() {
        this.name = "Unknown";
    }
    Student(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Name of the student: "+this.name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of a student:");
        String name = scan.nextLine();
        Student s2 = new Student(name);
        s2.display();
        scan.close();
    }
}
