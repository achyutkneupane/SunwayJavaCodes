import java.util.Scanner;

public class GreatestAmongUserInput {
    public static int getGreatest(int num1,int num2) {
        return num1>num2 ? num1 : num2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Greatest among two is: "+getGreatest(num1, num2));
        scan.close();
    }
    
}
