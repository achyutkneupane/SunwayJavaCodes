package IndividualProject.DaphneArray;

/**
 * CheckDaphneArray
 */
public class CheckDaphneArray {
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }
    public int isDaphne(int[] numArray) {
        if (numArray.length == 0) return 1;
        int isDaphne = 1;
        boolean isAllEven = isEven(numArray[0]);
        boolean isAllOdd = isOdd(numArray[0]);
        for (int i = 1; i < numArray.length; i++) {
            if (isAllEven && !isEven(numArray[i])) {
                isDaphne = 0;
                break;
            }
            if (isAllOdd && !isOdd(numArray[i])) {
                isDaphne = 0;
                break;
            }
        }
        return isDaphne;
    }
}