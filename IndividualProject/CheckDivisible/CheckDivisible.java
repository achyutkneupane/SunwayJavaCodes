package CheckDivisible;

public class CheckDivisible {
    public int isDivisible(int[] numArray,int divisor) {
        int isDivisible = 1;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % divisor != 0) {
                isDivisible = 0;
                break;
            }
        }
        return isDivisible;
    }
}