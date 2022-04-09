public class PatternTwo {
    public static void main(String[] args) {
        System.out.println("Pattern 2:");
        for(int i=0;i<5;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Without using nested for loop:");
        for(int i=0;i<5;i++) {
            System.out.println("*".repeat(i+1));
        }
    }
}
