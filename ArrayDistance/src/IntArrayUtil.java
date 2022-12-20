public class IntArrayUtil {
    public static int maximumDistance(int[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException();

        int maxElement = array[0];
        int first = 0;
        int last = 0;

        for (int i = 1; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                first = i;
            }

            if (array[i] == maxElement)
                last = i;
        }

        return last - first;
    }
}