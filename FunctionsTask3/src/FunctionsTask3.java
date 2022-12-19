public class FunctionsTask3 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static int multiArithmeticElements(int a1, int t, int n) {
        if (n <= 0)
            throw new IllegalArgumentException();

        int multiArithmeticElements = 1;
        for (int i = 0; i < n; i++)
            multiArithmeticElements *= a1 + t * i;

        return multiArithmeticElements;
    }
}
