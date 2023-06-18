package practicum.insertionsort;

import java.util.Arrays;

public class Practicum {

    public static void main(String[] args) {
        int[] array = {7, 4, 2, 0, 1, 3, 4, 9};
        System.out.println(Arrays.toString(array));

        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array [j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
