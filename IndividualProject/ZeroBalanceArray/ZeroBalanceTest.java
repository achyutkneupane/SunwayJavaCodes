package ZeroBalanceArray;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ZeroBalanceTest {

    public static int random(int min,int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    @Test
    public void testIsZeroBalance() {
        CheckZeroBalance checkZeroBalance = new CheckZeroBalance();

        int[] array1 = new int[]{1,2,-2,-1};
        assertEquals(1, checkZeroBalance.isZeroBalanced(array1));

        int[] array2 = new int[]{-3,1,2,-2,-1,3};
        assertEquals(1, checkZeroBalance.isZeroBalanced(array2));

        int[] array3 = new int[]{3,4,-2,-3,-2};
        assertEquals(0, checkZeroBalance.isZeroBalanced(array3));

        int[] array4 = new int[]{0,0,0,0,0,0};
        assertEquals(1, checkZeroBalance.isZeroBalanced(array4));

        int[] array5 = new int[]{3,-3,-3};
        assertEquals(0, checkZeroBalance.isZeroBalanced(array5));

        int[] array6 = new int[]{3};
        assertEquals(0, checkZeroBalance.isZeroBalanced(array6));

        int[] array7 = new int[]{};
        assertEquals(0, checkZeroBalance.isZeroBalanced(array7));
    }
}
