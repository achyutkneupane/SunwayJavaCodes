package BalancedArray;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BalancedTest {
    @Test
    public void testIfBalanced() {
        CheckBalanced checkBalanced = new CheckBalanced();

        int[] array1 = new int[]{2,3,6,7};
        assertEquals(1, checkBalanced.isBalanced(array1));

        int[] array2 = new int[]{6,7,2,3,12};
        assertEquals(1, checkBalanced.isBalanced(array2));

        int[] array3 = new int[]{7,15,2,3};
        assertEquals(0, checkBalanced.isBalanced(array3));

        int[] array4 = new int[]{16,6,2,3};
        assertEquals(0, checkBalanced.isBalanced(array4));

        int[] array5 = new int[]{};
        assertEquals(1, checkBalanced.isBalanced(array5));
    }
}
