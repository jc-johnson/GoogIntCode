package SelectionSort;

/**
 * Created by jordan on 4/16/16.
 */
public class SelectionSort {

    /* for sorting what if there are multiple instances of min?  */

    // find min between 2 places in array
    private static int findMinIndex(int[] array, int index, int index2) {
        int min = 0;
        int minIndex = 0;

        // start at 2nd index since min is already at the 1st
        for (int i = index; i < index2; i++) {
            if (array[i] < min)
                min = array[i];
                minIndex = i;
        }
        System.out.format("Min: %d%n", min);
        return minIndex;
    }

    private static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(" | " + array[i] + " | ");
        }
    }

    // swaps items at two different indexes
    private static int[] swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    private static int sortInt(int[] array) {

        int minIndex = findMinIndex(array, 0, );

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                minIndex = findMinIndex(array, i, j);
                swap(array, i, j);
            }
        }

        /*for (int i = 0; i < array.length; i++) {
            minIndex = findMinIndex(array, i, array.length);
            swap(array,)
        }*/
        return 0;
    }

    public static void main(String[] args) {

        int[] a = {78, -10, 2, -33, 11, 5, 1};

        //swap and print test
        /*System.out.println("Original Array");
        printArray(a);
        System.out.println("\n");
        swap(a, 0, 1);
        System.out.println("Array after swap");
        printArray(a);*/

        // sort test
        printArray(a);
        System.out.println("\n");
        sortInt(a);
        printArray(a);

        // find min test
        // findMinIndex(a);

    }
}
