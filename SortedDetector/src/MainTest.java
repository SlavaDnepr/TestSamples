import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class MainTest {
    @Test
    void isSortedPositive1() {
        int intArray[] = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        boolean actualResult = Main.isSorted(intArray, SortOrder.ASC);
        assertEquals(actualResult, true);
    }

    @Test
    void isSortedPositive2() {
        int intArray[] = new int[]{ 10,9,8,7,6,5,4,3,2,1 };
        boolean actualResult = Main.isSorted(intArray, SortOrder.DESC);
        assertEquals(actualResult, true);
    }

    @Test
    void isSortedPositive3() {
        int intArray[] = new int[]{ 1,1,1,1,1 };
        boolean actualResult = Main.isSorted(intArray, SortOrder.ASC);
        assertEquals(actualResult, true);
    }

    @Test
    void isSortedPositive4() {
        int intArray[] = new int[]{ 1,1,1,1,1 };
        boolean actualResult = Main.isSorted(intArray, SortOrder.DESC);
        assertEquals(actualResult, true);
    }

    @Test
    void isSortedPositive5() {
        int intArray[] = new int[]{ };
        boolean actualResult = Main.isSorted(intArray, SortOrder.DESC);
        assertEquals(actualResult, true);
    }

    @Test
    void isSortedPositive6() {
        int intArray[] = new int[]{ -5, 0, 0, 5};
        boolean actualResult = Main.isSorted(intArray, SortOrder.ASC);
        assertEquals(actualResult, true);
    }

    @Test
    void isSortedPositive7() {
        int intArray[] = new int[]{ 5, 0, 0, -5};
        boolean actualResult = Main.isSorted(intArray, SortOrder.DESC);
        assertEquals(actualResult, true);
    }

    @Test
    void isSortedNegative1() {
        int intArray[] = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        boolean actualResult = Main.isSorted(intArray, SortOrder.DESC);
        assertEquals(actualResult, false);
    }

    @Test
    void isSortedNegative2() {
        int intArray[] = new int[]{ 10,9,8,7,6,5,4,3,2,1 };
        boolean actualResult = Main.isSorted(intArray, SortOrder.ASC);
        assertEquals(actualResult, false);
    }

    @Test
    void isSortedNegative3() {
        int intArray[] = new int[]{ 1,7,8,0 };
        boolean actualResult = Main.isSorted(intArray, SortOrder.DESC);
        assertEquals(actualResult, false);
    }

    @Test
    void isSortedNegative4() {
        int intArray[] = new int[]{ 1,7,8,0 };
        boolean actualResult = Main.isSorted(intArray, SortOrder.ASC);
        assertEquals(actualResult, false);
    }

    @Test
    void isSortedNegative5() {
        assertThrowsExactly(IllegalArgumentException.class,
                ()->{Main.isSorted(null, SortOrder.ASC);} );
    }

    @Test
    void isSortedNegative6() {
        int intArray[] = new int[]{ 1,7,8,0 };

        assertThrowsExactly(IllegalArgumentException.class,
                    ()->{Main.isSorted(intArray, null);} );
    }
}