import java.util.Scanner;

public class PowerCalc {
    public static void main(String[] args) {
        int base,power;
        long result=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base number: ");
        base = scan.nextInt();
        System.out.println("Enter power: ");
        power = scan.nextInt();
        for(int i=0;i<power;i++) {
            result*=base;
        }
        System.out.println(base+"^"+power+" is: "+result);
        scan.close();
    }
}
