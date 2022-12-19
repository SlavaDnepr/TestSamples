
public class FunctionsTask4v2 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static double sumGeometricElements(int a1, double t, int alim) {
        if (t <= 0 || t >= 1)
            throw new IllegalArgumentException();

        if (a1 <= alim || alim < 0)
            throw new IllegalArgumentException();

        double sumGeometricElements = a1;
        int i = 1;
        while (true) {
            double nextElement = a1 * Math.pow(t, i);
            if (nextElement > alim)
                sumGeometricElements += nextElement;
            else
                break;
            i++;
        }

        return Math.round(sumGeometricElements);
    }
}
