package NiteshSirProjects;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * MainMenu
 */

public class MainMenu {

    public void showMenu() {
        Scanner scan = new Scanner(System.in);
        int menuNumEntered = 0;

        try {
            do {
                System.out.println("Select a menu option (Enter from 1 to 7): ");
                System.out.println("1. Add New Student");
                System.out.println("2. Display Student Data");
                System.out.println("3. Remove Student Data");
                System.out.println("4. Add Student Mark");
                System.out.println("5. Display Student Mark");
                System.out.println("6. Display Student Result");
                System.out.println("7. Save and Exit");
                System.out.println("Please enter number from 1 to 7");
                menuNumEntered = scan.nextInt();
                while (menuNumEntered < 1 || menuNumEntered > 7) {
                    System.err.println("Please enter number from 1 to 7");
                    menuNumEntered = scan.nextInt();
                }
                System.out.println("You entered: "+ menuNumEntered);
                switch (menuNumEntered) {
                    case 1:
                        addNewStudent();
                        break;
                    case 2:
                        displayStudentData();
                        break;
                    case 3:
                        removeStudentData();
                        break;
                    case 4:
                        addStudentMark();
                        break;
                    case 5:
                        displayStudentMark();
                        break;
                    case 6:
                        displayStudentResult();
                        break;
                    case 7:
                        saveAndExit();
                        break;
                    default:
                        break;
                }
            } while (menuNumEntered != 7);
        } catch (InputMismatchException e) {
            System.err.println("Please enter number from 1 to 7");
            showMenu();
        }

        scan.close();
    }

    public static void main(String[] args) {
        MainMenu mm = new MainMenu();
        mm.showMenu();
    }

    public void addNewStudent() {
        
    }
    public void displayStudentData() {
        
    }
    public void removeStudentData() {
        
    }
    public void addStudentMark() {
        
    }
    public void displayStudentMark() {
        
    }
    public void displayStudentResult() {
        
    }
    public void saveAndExit() {
        
    }
}
