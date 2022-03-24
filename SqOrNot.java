public class SqOrNot {
    public static boolean isSquare(int length,int breadth) {
        return length==breadth;
    }
    public static void main(String[] args) {
        int length = 5;
        int breadth = 5;
        if(isSquare(length,breadth)) {
            System.out.println("It is a square.");
        }
        else {
            System.out.println("It is not a square.");
        }
    }
}
