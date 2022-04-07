package basics;
public class OddOrEven {
    public static boolean isOdd(int num) {
        return num%2 == 1;
    }

    public static void main(String[] args) {
        int num = 6;
        boolean isOdd = OddOrEven.isOdd(num);
        System.out.println("The given number " + num + " is " + (isOdd ? "Odd" : "Even"));
    }
}
