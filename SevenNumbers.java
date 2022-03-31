import java.util.Scanner;

public class SevenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sum=0;
        float average;
        System.out.println("Enter the count of numbers: ");
        num = scan.nextInt();
        for(int i=0;i<num;i++) {
            System.out.println("Enter Number "+(i+1)+":");
            sum+=scan.nextInt();
        }
        average=sum/(float)num;
        System.out.println("The sum of 7 numbers is: "+sum);
        System.out.println("The average of 7 numbers is: "+average);
        scan.close();
    }
}
