import java.util.Arrays;
import java.util.Random;

public class Arrays2 {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Task 5.2.1
        // Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        // в формате: «Сумма трат за месяц составила … рублей».
        System.out.println(Arrays.toString(arr));
        System.out.println("Task 5.2.1");
        int sum = 0;
        for (int v: arr) {
            sum += v;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", sum);
        System.out.println();

        // Task 5.2.2
        // Следующая задача — найти минимальную и максимальную трату за день.
        // Нужно написать программу, которая решит эту задачу, и вывести в консоль результат в формате:
        // «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        System.out.println("Task 5.2.2");
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей.\n", min);
        System.out.printf("Максимальная сумма трат за день составила %d рублей.\n", max);
        System.out.println();

        // Task 5.2.3
        // А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        // Нужно написать программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней),
        // и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        System.out.println("Task 5.2.3");
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", (sum * 1.0) / arr.length);
        System.out.println();

        // Task 5.2.4
        // В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в обратную сторону.
        // Т.е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        // Данные с именами сотрудников хранятся в виде массива символов (char[]).
        // Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        // В качестве данных для массива используйте:
        // char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // В результате в консоль должно быть выведено "Ivanov Ivan".
        // Важно: не используйте дополнительные массивы для решения этой задачи.
        // Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
        System.out.println("Task 5.2.4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        // Only print the elements in the correct order
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        // Changing the array elements in reverse order and print it without spaces
        reverseCharArray(reverseFullName);
        for (char ch : reverseFullName) {
            System.out.print(ch);
        }
        System.out.println();

        // Task 5.2.5*
        // Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
        // Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
        System.out.println("Task 5.2.5*");
        int[] arr12 = generateIntArray(-15, 15, 12);
        System.out.println(Arrays.toString(arr12));
        int maxItem = arr12[0];
        int indexMaxItem = 0;
        for (int i = 1; i < arr12.length; i++) {
            if (arr12[i] >= maxItem) {
                maxItem = arr12[i];
                indexMaxItem = i;
            }
        }
        System.out.printf("Максимальный элемент в массиве = %d, индекс его последнего вхождения в массиве = %d\n", maxItem, indexMaxItem);
        System.out.println();

        // Task 5.2.6*
        // Создайте массив из 11 случайных чисел из промежутка [0;1].
        // Выведите данный массив в консоль.
        // Напишите программу, которая определяет, какой элемент встречается в массиве чаще всего.
        // Выведите данную информацию в консоль. Если два разных элемента встречаются одинаковое количество раз, то выведите -1.
        System.out.println("Task 5.2.6*");
        final int sizeArray0_1 = 11;
        int[] arr0_1 = generateIntArray(0, 1, sizeArray0_1);
        System.out.println(Arrays.toString(arr0_1));
        int count_0 = 0;
        int count_1 = 0;
        for (int i = 0; i < arr0_1.length; i++) {
            if (arr0_1[i] == 0) {
                count_0++;
            } else if (arr0_1[i] == 1) {
                count_1++;
            }
        }
        if (count_0 > count_1) {
            System.out.println("Чаще встречается элемент: 0");
        } else if (count_1 > count_0) {
            System.out.println("Чаще встречается элемент: 1");
        } else {
            System.out.println("-1");  // Может произойти только, когда количество элементов массива является четным!
        }
        System.out.println();

        // Task 5.2.7*
        // Напишите программу, которая генерирует двумерный массив из 8 строк по 5 столбцов в каждой
        // из случайных целых чисел из отрезка [10;99].
        // Результат программы выведите в консоль.
        System.out.println("Task 5.2.7*");
        int countRows = 8;
        int countColumns = 5;
        int[][] arr_8_5 = new int[countRows][];
        for (int i = 0; i < arr_8_5.length; i++) {
            arr_8_5[i] = generateIntArray(10, 99, countColumns);
        }
        printTwoDimArray(arr_8_5);
        System.out.println();

        // Task 5.2.8*
        // Напишите программу, которая генерирует двумерный массив из 5 строк по 8 столбцов в каждой
        // из случайных целых чисел из отрезка [-99;99].
        // Результат программы выведите в консоль.
        // Отдельно выведите значение максимального элемента этого массива.
        System.out.println("Task 5.2.8*");
        countRows = 5;
        countColumns = 8;
        int[][] arr_5_8 = new int[countRows][];
        for (int i = 0; i < arr_5_8.length; i++) {
            arr_5_8[i] = generateIntArray(-99, 99, countColumns);
        }
        printTwoDimArray(arr_5_8);

        maxItem = arr_5_8[0][0];
        for (int[] ints : arr_5_8) {
            for (int v : ints) {
                if (v > maxItem) {
                    maxItem = v;
                }
            }
        }
        System.out.printf("Максимальный элемент массива = %d\n", maxItem);
        System.out.println();

        // Task 5.2.9*
        // Напишите программу, которая генерирует массив из 7 строк по 4 столбца
        // в каждой из случайных целых чисел из отрезка [-5;5].
        // Результат программы выведите в консоль.
        // Отдельно выведите индекс строки с наибольшим произведением элементов.
        System.out.println("Task 5.2.9*");
        countRows = 7;
        countColumns = 4;
        int[][] arr_7_4 = new int[countRows][];
        for (int i = 0; i < arr_7_4.length; i++) {
            arr_7_4[i] = generateIntArray(-5, 5, countColumns);
        }
        printTwoDimArray(arr_7_4);

        int maxMultRow = 1;
        int indexMaxMultRow = 0;
        for (int i = 0; i < arr_7_4.length; i++) {
            int[] row = arr_7_4[i];
            int multRow = 1;
            for (int v : row) {
                multRow *= v;
            }
            if (multRow > maxMultRow) {
                maxMultRow = multRow;
                indexMaxMultRow = i;
            }
        }
        System.out.printf("Набольшее произведение элементов: %d, найдено в строке: %d\n", maxMultRow, indexMaxMultRow);
        System.out.println();

        // Task 5.2.10*
        // Напишите программу, которая генерирует двумерный массив из 6 строк по 7 столбцов в каждой.
        // Массив должен состоять из случайных целых чисел из промежутка [0;9].
        // Результат программы выведите в консоль.
        // Преобразуйте массив таким образом, чтобы на первом месте (индекс 0) в каждой строке стоял самое большое число в строке.
        // Состав массива изменять нельзя, но можно переставлять элементы в рамках одной строки.
        // Порядок остальных элементов строки не важен.
        // Результат преобразований выведите в консоль.
        System.out.println("Task 5.2.10*");
        countRows = 6;
        countColumns = 7;
        int[][] arr_6_7 = new int[countRows][];
        for (int i = 0; i < arr_6_7.length; i++) {
            arr_6_7[i] = generateIntArray(0, 9, countColumns);
        }
        printTwoDimArray(arr_6_7);
        System.out.println();

        for (int[] row : arr_6_7) {
            indexMaxItem = 0;
            maxItem = row[0];
            for (int i = 1; i < row.length; i++) {
                if (row[i] > maxItem) {
                    maxItem = row[i];
                    indexMaxItem = i;
                }
            }
            if (indexMaxItem > 0) {
                swapItemsInArray(row, 0, indexMaxItem);
            }
        }
        printTwoDimArray(arr_6_7);
        System.out.println();
    }

    private static void printTwoDimArray(int[][] arr) {
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static void reverseCharArray(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    private static void swapItemsInArray(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static int[] generateIntArray(int minElem, int maxElem, int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int maxRandomItem = maxElem - minElem + 1;
            arr[i] = random.nextInt(maxRandomItem) + minElem;
        }
        return arr;
    }
}
