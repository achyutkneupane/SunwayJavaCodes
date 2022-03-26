import java.util.Scanner;

public class GradingSystemWithSwitch {
    public static String getRemark(String grade) {
        switch(grade) {
            case "A":
                return "Outstanding";
            case "B":
                return "Excellent";
            case "C":
                return "Good";
            case "D":
                return "Average";
            case "E":
                return "Poor";
            case "F":
                return "Fail";
            default:
                return "Invalid Grade";
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = scan.nextInt();
        String grade = GradingSystem.getGrade(marks);
        String remark = getRemark(grade);
        System.out.println("Your Grade is: "+grade);
        System.out.println("Your Result is: "+remark);
        scan.close();
    }
}
