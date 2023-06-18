package practicum.radixsort;

import java.util.Arrays;

public class Practicum {
    public static void main(String[] args) {
        int[] array = {7, 4, 2, 0, 1, 3, 4, 9, 3, 2, 3, 8, 1, 0, 2, 3, 5, 2, 6, 4};
        System.out.println(Arrays.toString(array));

        radixSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void radixSort(int[] array) {
        int n = array.length;
        int[] counter = new int[10];

        for (int i = 0; i < array.length; i++) {
            counter[array[i]] += 1;
        }

        //i показывает позицию, на которую нужно поставить очередной элемент
        int i = 0;

        for (int j = 0; j < counter.length; j++) {

            // если элемент j встречается более 0 раз — добавить его в финальный массив count[j] раз,
            // иначе — пропустить элемент.
            if (counter[j] > 0) {
                for (int k = 1; k <= counter[j]; k++) {
                    array[i] = j;
                    i++;
                }
            }
        }
    }
}