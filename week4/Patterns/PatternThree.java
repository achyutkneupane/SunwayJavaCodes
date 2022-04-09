/**
 * PatternThree
 */
public class PatternThree {
    public static void main(String[] args) {
        System.out.println("Pattern 3:");
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if(j<(4-i)) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Without using nested for loop:");
        for(int i=0;i<5;i++) {
            System.out.println(" ".repeat(4-i) + "*".repeat(i+1));
        }
    }
}