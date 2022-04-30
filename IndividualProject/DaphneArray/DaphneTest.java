package DaphneArray;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DaphneTest {

    @Test
    public void testIsDaphne() {
        CheckDaphneArray checkVanilla = new CheckDaphneArray();

        int[] array1 = new int[]{1,3,7,9};
        assertEquals(1, checkVanilla.isDaphne(array1));

        int[] array2 = new int[]{2,4,6,8,10};
        assertEquals(1, checkVanilla.isDaphne(array2));

        int[] array3 = new int[]{1,2,3,4,5};
        assertEquals(0, checkVanilla.isDaphne(array3));

        int[] array4 = new int[]{};
        assertEquals(1, checkVanilla.isDaphne(array4));
    }
}
