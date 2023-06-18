package practicum.binarysearch;

public class Practicum {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 12, 13, 20, 22, 24, 30, 32};

        System.out.println("Индекс искомого элемента: " + findBinary(array, 30));
    }

    public static int findBinary(int[] array, int elem) {
        int index = -1;
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int mid = low + ((high - low) / 2);

            if (array[mid] < elem) {
                low = mid + 1;
            } else if (array[mid] > elem) {
                high = mid - 1;
            } else  if (array[mid] == elem) {
                index = mid;
                break;
            }
        }
        return index;
    }
}