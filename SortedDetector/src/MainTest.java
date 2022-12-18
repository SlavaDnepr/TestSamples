import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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


    @Test
    public void testArrayIsSortedByAsc() {
        assertTrue(Main.isSorted(new int[] {1, 2, 3, 4, 5}, SortOrder.ASC));
        assertTrue(Main.isSorted(new int[] {1, 10, 12, 18, 1000}, SortOrder.ASC));
        assertTrue(Main.isSorted(new int[] {1001, 1002, 1003, 1004, 1005}, SortOrder.ASC));
        assertTrue(Main.isSorted(new int[] {1, 1, 1, 1, 1}, SortOrder.ASC));
        assertTrue(Main.isSorted(new int[] {-5, -4, -3, -2, -1}, SortOrder.ASC));
        assertTrue(Main.isSorted(new int[] {-1003, -1002, -1001, -1000, -999}, SortOrder.ASC));
        assertTrue(Main.isSorted(new int[] {-3, -2, -1, 0, 1}, SortOrder.ASC));
    }

    @Test
    public void testArrayIsSortedByDesc() {
        assertTrue(Main.isSorted(new int[]{5, 4, 3, 2, 1}, SortOrder.DESC));
        assertTrue(Main.isSorted(new int[] {20, 18, 0, -20, -1000}, SortOrder.DESC));
        assertTrue(Main.isSorted(new int[] {1005, 1004, 1003, 1002, 1001}, SortOrder.DESC));
        assertTrue(Main.isSorted(new int[] {1, 1, 1, 1, 1}, SortOrder.DESC));
        assertTrue(Main.isSorted(new int[] {-1, -2, -3, -4, -5}, SortOrder.DESC));
        assertTrue(Main.isSorted(new int[] {-999, -1000, -1001, -1002, -1003}, SortOrder.DESC));
        assertTrue(Main.isSorted(new int[] {1, 0, -1, -2, -3}, SortOrder.DESC));
    }
    @Test
    public void testNegativeArrayIsSortedByAsc() {
        assertFalse(Main.isSorted(new int[] {5, 4, 3, 2, 1}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {5, 3, 4, 2, 1}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {20, 18, 0, -20, -1000}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {1005, 1004, 1003, 1002, 1001}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {1005, 1004, 1003, 1001, 1002}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {-1, -2, -3, -4, -5}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {-1, -3, -4, -6, -5}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {-999, -1000, -1001, -1002, -1003}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {-999, -1001, -1000, -1002, -1003}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {1, 0, -1, -2, -3}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {5, 17, 24, 88, 33, 2}, SortOrder.ASC));
        assertFalse(Main.isSorted(new int[] {15, 10, 3}, SortOrder.ASC));
    }

    @Test
    public void testNegativeArrayIsSortedByDesc() {
        assertFalse(Main.isSorted(new int[] {1, 2, 3, 4, 5}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {1, 2, 4, 3, 5}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {1, 10, 12, 18, 1000}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {1001, 1002, 1003, 1004, 1005}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {1001, 1005, 1003, 1005, 1005}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {-5, -4, -3, -2, -1}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {-5, -4, -2, -3, -1}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {-1003, -1002, -1001, -1000, -999}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {-1003, -1002, -1000, -1001, -999}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {-3, -2, -1, 0, 1}, SortOrder.DESC));
        assertFalse(Main.isSorted(new int[] {5, 17, 24, 88, 33, 2}, SortOrder.DESC));
    }
    @Test()
    public void arrayIsSortedWithIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Main.isSorted(new int[] {}, SortOrder.ASC);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Main.isSorted(new int[] {}, SortOrder.DESC);
        });
    }
    @Test()
    public void testArrayIsSortedWithNullArgs() {
        assertThrows(IllegalArgumentException.class, () -> {
            Main.isSorted(null, null);
        });
    }
}