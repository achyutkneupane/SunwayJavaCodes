package IndividualProject.CheckDivisible;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DivisibilityTest {

    public static int random(int min,int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    @Test
    public void testIsDivisible() {
        CheckDivisible checkDivisible = new CheckDivisible();

        int[] array1 = new int[]{3,3,6,36};
        assertEquals(1, checkDivisible.isDivisible(array1, 3));

        int[] array2 = new int[]{4};
        assertEquals(1, checkDivisible.isDivisible(array2, 2));
        
        int[] array3 = new int[]{3,4,3,6,36};
        assertEquals(0, checkDivisible.isDivisible(array3, 3));

        int[] array4 = new int[]{6,12,24,36};
        assertEquals(0, checkDivisible.isDivisible(array4, 12));

        int[] array5 = new int[]{};
        int divisor = random(1, 100000);
        assertEquals(1, checkDivisible.isDivisible(array5, divisor));
    }
}
