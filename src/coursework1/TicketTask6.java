package coursework1;

import java.util.Arrays;

public class TicketTask6 {

    public static void main(String[] args) {
        int[] array = {1, 4, 17, 26, 99, 3, 12, 88, 44, 87, 50};
        System.out.println(Arrays.toString(computeNumbers(array, 3, 7)));
    }

    public static int[] computeNumbers(int[] arr, int beginIndex, int endIndex) {
        if (beginIndex < 0 || endIndex < 0 || beginIndex > arr.length - 1 || endIndex >= arr.length || beginIndex > endIndex) {
            throw new IndexOutOfBoundsException(
                    String.format("Индексы для выделения части массива заданы неверно: begin = %d, end = %d\n", beginIndex, endIndex));
        }
        int[] dest = new int[endIndex - beginIndex + 1];
        int j = 0;
        for (int i = beginIndex; i <= endIndex; i++) {
            dest[j] = arr[i];
            if (arr[i] % 2 == 0) {
                dest[j]++;
            }
            j++;
        }
        return dest;
    }
}
