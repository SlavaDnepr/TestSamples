public class Main {
    public static void main(String[] args) {
        int intArray[] = new int[]{ 1,2,3,4,5 };
        boolean isSorted = Main.isSorted(intArray, SortOrder.ASC);
        System.out.println("isSorted: " + isSorted);
    }

    public static boolean isSorted(int[] array, SortOrder sortOrder)
    {
        if (array.length <= 1)
            return true;

        for (int i = 1; i < array.length; i++) {
            if (sortOrder == SortOrder.ASC)
                if (array[i] < array[i - 1])
                    return false;

            if (sortOrder == SortOrder.DESC)
                if (array[i] > array[i - 1])
                    return false;
        }

        return true;
    }
}
