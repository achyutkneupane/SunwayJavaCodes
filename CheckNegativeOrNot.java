import java.util.Scanner;

public class CheckNegativeOrNot {
    public static void withWhileLoop(Scanner scan) {
        System.out.println("With While Loop");
        int num;
        System.out.println("Enter a Non-negative Number");
        num = scan.nextInt();
        while(num<0) {
            System.out.println("You must enter a Non-negative Number");
            num = scan.nextInt();
        }
        System.out.println("You entered: "+num);
    }

    public static void withDoWhileLoop(Scanner scan) {
        System.out.println("With Do While Loop");
        int num=0;
        do {
            System.out.println(num<0 ? "You must enter a Non-negative Number" : "Enter a Non-negative Number");
            num = scan.nextInt();
        } while(num<0);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CheckNegativeOrNot.withWhileLoop(scan);
        CheckNegativeOrNot.withDoWhileLoop(scan);
        scan.close();
    }
}
