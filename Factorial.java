import java.util.Scanner;

public class Factorial {

    public static int withRecursion(int num) {
        if(num == 1) {
            return 1;
        } else {
            return num * withRecursion(num-1);
        }
    }
    public static int inNormalWay(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("The factorial of "+num+" is: "+Factorial.inNormalWay(num)+" (in normal way)");
        System.out.println("The factorial of "+num+" is: "+Factorial.withRecursion(num)+" (with recursion)");
        scan.close();
    }   
}
