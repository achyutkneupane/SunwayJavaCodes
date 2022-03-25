import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String test = scan.next();
        System.out.println("You entered: "+test);
        scan.close();
    }
}