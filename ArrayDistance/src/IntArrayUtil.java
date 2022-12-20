public class IntArrayUtil {
    public static int maximumDistance(int[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException();

        Integer maxElement = array[0];
        Integer first = 0;
        Integer last = 0;

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