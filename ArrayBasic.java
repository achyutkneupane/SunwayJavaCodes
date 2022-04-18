import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        int inputArray[] = new int[10];
        int i=0;
        Scanner scan = new Scanner(System.in);
        while(i<10) {
            System.out.println("Enter number "+(i+1)+": ");
            int number = scan.nextInt();
            inputArray[i++] = number;
        }
        scan.close();
        System.out.println("The elements of array are: ");
        for(int elem: inputArray) {
            System.out.print(elem+" ");
            System.out.println();
        }
    }
}
