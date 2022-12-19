public class FunctionsTask2 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order)
    {
        if (array == null || order == null || array.length == 0)
            throw new IllegalArgumentException();

        if (array.length == 1)
            return true;

        for (int i = 1; i < array.length; i++) {
            if (order == SortOrder.ASC)
                if (array[i] < array[i - 1])
                    return false;

            if (order == SortOrder.DESC)
                if (array[i] > array[i - 1])
                    return false;
        }

        return true;
    }
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int[] transform(int[] array, SortOrder order) {
        if (array == null || order == null || array.length == 0)
            throw new IllegalArgumentException();

        if (!isSorted(array, order))
            return array;

        for (int i = 0; i< array.length; i++)
            array[i] = array[i] + i;

        return array;
    }
}
