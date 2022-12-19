
public class FunctionsTask4 {
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
            double mult = t;
            for (int j = 1; j < i; j++)
                mult *= t;

            double nextElement = a1 * mult;
            if (nextElement > alim && nextElement > 0.05)
                sumGeometricElements += nextElement;
            else
                break;
            i++;
        }

        if (sumGeometricElements == (int) sumGeometricElements)
            return sumGeometricElements;
        else
            sumGeometricElements = (int)(sumGeometricElements + 1);

        return sumGeometricElements;
    }
}
