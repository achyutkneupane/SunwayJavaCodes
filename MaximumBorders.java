import java.util.*;
class MaximumBorders {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for(int i=0;i<count;i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            for(int j=0;j<n;j++) {
                for(int k=0;k<m;k++) {
                    String input1 = scan.nextLine();
                    System.out.println(input1);
                }
                System.out.println();
            }
            scan.close();
        }
    }
}
