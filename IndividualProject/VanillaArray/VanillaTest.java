package IndividualProject.VanillaArray;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VanillaTest {

    @Test
    public void testIsVanilla() {
        CheckVanilla checkVanilla = new CheckVanilla();

        int[] array1 = new int[]{1};
        assertEquals(1, checkVanilla.isVanilla(array1));

        int[] array2 = new int[]{11,22,13,34,125};
        assertEquals(0, checkVanilla.isVanilla(array2));

        int[] array3 = new int[]{9,99,99999,-9999};
        assertEquals(1, checkVanilla.isVanilla(array3));

        int[] array4 = new int[]{};
        assertEquals(1, checkVanilla.isVanilla(array4));
    }
}
