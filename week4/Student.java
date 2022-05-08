package week4;

import java.util.Scanner;

/**
 * Student
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 * @question
 * Write a program to print the names of students by creating
 * a Student class. If no name is passed while creating an
 * object of Student class, then the name should be "Unknown",
 * otherwise the name should be equal to the String value
 * passed while creating object of Student class.
 * 
 * @description
 * This class 'Student' is used to print the names of students.
 * It has a main method which is used to print the names of students.
 * It has two constructors. One is used to create an object of
 * Student class with name passed as argument and the other is
 * used to create an object of Student class with no name passed.
 * When no name is passed, the name is "Unknown".
 * There is a 'display()' method which is used to print the name
 * of student.
 * 
 */

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
