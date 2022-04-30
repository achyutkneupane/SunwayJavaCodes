package week6.Question5;

/**
 * MergeAndSort
 * 
 * @author
 * Achyut Neupane
 * <to@achyut.com.np>
 * 
 */
public class MergeAndSort {
    /**
     * mergeArrays
     * 
     * @param a
     * @param b
     * @return c
     */
    public int[] mergeArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }

    /**
     * sortInAscending
     * 
     * @param myArray
     * @return myArray
     */
    public int[] sortInAscending(int[] myArray) {
        if (myArray.length == 1) {
            return myArray;
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    /**
     * mergeAndSort
     * 
     * @param a
     * @param b
     * @return c
     */
    public int[] mergeAndSort(int[] a, int[] b) {
        int[] c = mergeArrays(a, b);
        c = sortInAscending(c);
        return c;
    }

    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        MergeAndSort mergeAndSort = new MergeAndSort();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {10, 9, 8, 7, 6};
        int[] c = mergeAndSort.mergeAndSort(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] +" ");
        }
        System.out.println();
    }
}