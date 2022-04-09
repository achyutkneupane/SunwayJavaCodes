public class PatternOne {
    public static void main(String[] args) {
        System.out.println("Pattern 1:");
        for(int i=0;i<4;i++) {
            for(int j=0;j<10;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Without using nested for loop:");
        for(int i=0;i<4;i++) {
            System.out.println("*".repeat(10));
        }
    }
}
