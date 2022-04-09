public class PatternFour {
    public static void main(String[] args) {
        System.out.println("Pattern 4:");
        int n = 5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<(2*n-1);j++) {
                if(j<((n-i-1))) System.out.print(" ");
                else if(j >= n-i-1 && j <= n+i-1) System.out.print("*");
                else System.out.print("");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Without using nested for loop:");
        for(int i=0;i<n;i++) {
            System.out.println(" ".repeat(n-i-1) + "*".repeat(2*i+1));
        }
    }
}
