import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class IntArrayUtilTests {

    @Test
    public void illegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntArrayUtil.maximumDistance(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            IntArrayUtil.maximumDistance(new int[0]);
        });
    }

    @Test
    public void testMultiplicationOfTheArithmeticProgressionNumbers() {
        assertEquals(0, IntArrayUtil.maximumDistance(new int[] { 4, 100, 3, 4 }));
        assertEquals(0, IntArrayUtil.maximumDistance(new int[] { 100, 4, 3, 4 }));
        assertEquals(1, IntArrayUtil.maximumDistance(new int[] { 5, 50, 50, 4, 5 }));
        assertEquals(3, IntArrayUtil.maximumDistance(new int[] { 5, 350, 350, 4, 350 }));
        assertEquals(4, IntArrayUtil.maximumDistance(new int[] { 10, 10, 10, 10, 10 }));
        assertEquals(3, IntArrayUtil.maximumDistance(new int[] { 5, 10, 10, 10, 10 }));
        assertEquals(2, IntArrayUtil.maximumDistance(new int[] { 1, 2, 3, 0, 3 }));
    }
}
