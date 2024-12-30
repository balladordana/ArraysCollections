import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // 1. byte[] tests
        byte[] byteArray = {1, 3, 5, 7, 9};
        System.out.println(Arrays.binarySearch(byteArray, (byte) 5)); // Expected: 2
        System.out.println(Arrays.binarySearch(byteArray, 1, 4, (byte) 7)); // Expected: 3

        // 2. char[] tests
        char[] charArray = {'a', 'c', 'e', 'g', 'i'};
        System.out.println(Arrays.binarySearch(charArray, 'e')); // Expected: 2
        System.out.println(Arrays.binarySearch(charArray, 1, 4, 'g')); // Expected: 3

        // 3. double[] tests
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(Arrays.binarySearch(doubleArray, 3.3)); // Expected: 2
        System.out.println(Arrays.binarySearch(doubleArray, 1, 4, 4.4)); // Expected: 3

        // 4. float[] tests
        float[] floatArray = {0.5f, 1.5f, 2.5f, 3.5f};
        System.out.println(Arrays.binarySearch(floatArray, 2.5f)); // Expected: 2
        System.out.println(Arrays.binarySearch(floatArray, 1, 3, 1.5f)); // Expected: 0

        // 5. int[] tests
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(intArray, 30)); // Expected: 2
        System.out.println(Arrays.binarySearch(intArray, 2, 5, 50)); // Expected: 2

        // 6. long[] tests
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        System.out.println(Arrays.binarySearch(longArray, 300L)); // Expected: 2
        System.out.println(Arrays.binarySearch(longArray, 1, 4, 400L)); // Expected: 2

        // 7. short[] tests
        short[] shortArray = {10, 20, 30, 40, 50};
        System.out.println(Arrays.binarySearch(shortArray, (short) 20)); // Expected: 1
        System.out.println(Arrays.binarySearch(shortArray, 1, 4, (short) 40)); // Expected: 2

        // 8. Generic T[] with Comparator
        String[] stringArray = {"apple", "banana", "cherry", "date"};
        Comparator<String> comparator = Comparator.naturalOrder();
        System.out.println(Arrays.binarySearch(stringArray, "cherry", comparator)); // Expected: 2
        System.out.println(Arrays.binarySearch(stringArray, 1, 3, "banana", comparator)); // Expected: 0

        // Edge cases
        System.out.println(Arrays.binarySearch(intArray, 100)); // Expected: -1 (not found)
        System.out.println(Arrays.binarySearch(floatArray, 0, 2, 5.5f)); // Expected: -3 (not found in range)
    }
}