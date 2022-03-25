import java.util.Scanner;

public class GradingSystem {
    public static char getGrade(int marks) {
        if(marks<25)
            return 'F';
        else if(25<=marks && marks<45)
            return 'E';
        else if(45<=marks && marks<50)
            return 'D';
        else if(50<=marks && marks<60)
            return 'C';
        else if(60<=marks && marks<80)
            return 'B';
        else
            return 'A';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = scan.nextInt();
        System.out.println("Your Grade is: "+getGrade(marks));
        scan.close();
    }
}
