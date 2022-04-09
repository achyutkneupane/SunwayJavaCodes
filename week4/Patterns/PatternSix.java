public class PatternSix {
    public static void main(String[] args) {
        System.out.println("Pattern 4:");
        int n = 5;
        for(int i=0;i<n;i++) {
            for(int j=0;j<(2*n-1);j++) {
                if(j<((n-i-1))) System.out.print(" ");
                else if(j >= n-i-1 && j <= n-1) System.out.print(n-j);
                else if(j <= n+i-1 && j > n-1) System.out.print(j-n+2);
                else if(j >= n+i-1) System.out.print("");
            }
            System.out.println();
        }
        System.out.println();
    }
}
