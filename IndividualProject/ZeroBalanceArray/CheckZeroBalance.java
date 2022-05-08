package IndividualProject.ZeroBalanceArray;

public class CheckZeroBalance {

    public int isZeroBalanced(int[] numArray) {
        int totalElement = numArray.length;
        if (totalElement == 0) return 0;
        int isZeroBalanced = 1;
        int balance = 0;
        boolean[] checked = new boolean[totalElement];
        for (int i = 0; i < totalElement; i++) {
            if (checked[i]) continue;
            int indexOfNegative = existsInArray(numArray, numArray[i]);
            balance += numArray[i];
            checked[i] = true;
            if (indexOfNegative != -1) {
                if (!checked[indexOfNegative]) {
                    checked[indexOfNegative] = true;
                    balance += numArray[indexOfNegative];
                }
            } else {
                isZeroBalanced = 0;
                break;
            }
        }
        if (balance != 0) isZeroBalanced = 0;
        return isZeroBalanced;
    }

    public int existsInArray(int[] numArray, int element) {
        int index = -1;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == (element) * -1) {
                index = i;
                break;
            }
        }
        return index;
    }
}
