package week6.Question3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Student
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 */
public class Student {

    static Scanner scan = new Scanner(System.in);

    static int num = 1;
    int id;
    String name;
    String email;
    String address;

    /**
     * Student
     * 
     * @param id
     * @param name
     * @param email
     * @param address
     */
    Student(String name, String email, String address) {
        this.id = num++;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    /**
     * printDetails
     * 
     */
    public void printDetails(int i) {
        System.out.println("Student " + (i + 1) + ": ");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Address: " + this.address);
        System.out.println();
    }

    /**
     * getUserInput
     * 
     */
    public static Student getUserInput(int i) {
        System.out.println("Enter the name "+(i+1));
        String name = scan.next();
        System.out.println("Enter the email "+(i+1));
        String email = scan.next();
        System.out.println("Enter the address "+(i+1));
        String address = scan.next();
        System.out.println();
        return new Student(name, email, address);
    }

    /**
     * main
     * @param args
     */
    public static void main(String[] args) {
        int num = 5;
        ArrayList<Student> studentList = new ArrayList<Student>();
        for(int i=0; i<num; i++) {
            studentList.add(getUserInput(i));
        }
        int i = 0;
        while(i<num) {
            studentList.get(i).printDetails(i);
            i++;
        }
        scan.close();
    }
}