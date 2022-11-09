import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {

        // Task 5.1.1
        // Объявите три массива:
        // 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        // 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        // 3. Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        int[] intNumbers = new int[] {1, 2, 3};
        double[] doubleNumbers = {1.57, 7.654, 9.986};
        String[] names = new String[] {"John", "Mary", "Alex", "Ivan"};

        // Task 5.1.2
        // Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
        // через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        System.out.println("Task 5.1.2");
        printIntArray(intNumbers);
//        printArray(new int[][]{intNumbers});
        int indexLast;

        indexLast = doubleNumbers.length - 1;
        for (int i = 0; i <= indexLast; i++) {
            if (i < indexLast) {
                System.out.printf("%.3f, ", doubleNumbers[i]);
            } else {
                System.out.printf("%.3f\n", doubleNumbers[i]);
            }
        }

        indexLast = names.length - 1;
        for (int i = 0; i <= indexLast; i++) {
            if (i < indexLast) {
                System.out.printf("%s, ", names[i]);
            } else {
                System.out.printf("%s\n", names[i]);
            }
        }
        System.out.println();

        // Task 5.1.3
        // Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива,
        // а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются
        // на одной строчке, а элементы другого массива – на другой.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        // Если во втором задании в консоль у вас вывелся результат
        // 1, 2, 3
        // 1.57, 7.654, 9.986
        // *произвольные элементы третьего массива*,
        // То в третьем задании результат должен быть
        // 3, 2, 1
        // 9.986, 7.654, 1.57
        // *произвольные элементы третьего массива в обратном порядке*
        System.out.println("Task 5.1.3");
        indexLast = intNumbers.length - 1;
        for (int i = indexLast; i >= 0; i--) {
            if (i > 0) {
                System.out.printf("%d, ", intNumbers[i]);
            } else {
                System.out.printf("%d\n", intNumbers[i]);
            }
        }

        indexLast = doubleNumbers.length - 1;
        for (int i = indexLast; i >= 0; i--) {
            if (i > 0) {
                System.out.printf("%.3f, ", doubleNumbers[i]);
            } else {
                System.out.printf("%.3f\n", doubleNumbers[i]);
            }
        }

        indexLast = names.length - 1;
        for (int i = indexLast; i >= 0; i--) {
            if (i > 0) {
                System.out.printf("%s, ", names[i]);
            } else {
                System.out.printf("%s\n", names[i]);
            }
        }
        System.out.println();

        // Task 5.1.4
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        // Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        System.out.println("Task 5.1.4");
        for (int i = 0; i < intNumbers.length; i++) {
            if (intNumbers[i] % 2 != 0) {
                intNumbers[i]++;
            }
        }
        printIntArray(intNumbers);

        // Task 5.1.5*
        // Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
        // Постарайтесь заполнить обе диагонали в одном цикле.
        // Для печати следует использовать следующий код:
        // for (int[] row : matrix) {
        //  for (int column : row) {
        //      System.out.print(column + " ");
        //  }
        //  System.out.println();
        // }
        System.out.println("Task 5.1.5");
        int[][] matrix = new int[3][3];
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[size - i - 1][i] = 1;
        }

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Task 5.1.6*
        // У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        // Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        // Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        // Нам дан массив чисел: {5, 4, 3, 2, 1}
        // Необходимо привести его к виду: {1, 2, 3, 4, 5}
        // Решите задачу с использованием дополнительного массива.
        // Напечатайте массив до преобразования и после с помощью
        // System.out.println(Arrays.toString(arr));

        System.out.println("Task 5.1.6*");
        int[] initialArray = {5, 4, 3, 2, 1};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initialArray));
        int sizeArray = initialArray.length;
        int[] reverseArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            reverseArray[i] = initialArray[sizeArray - i - 1];
        }
        System.out.println("Reverse array:");
        System.out.println(Arrays.toString(reverseArray));
        System.out.println();

        // Task 5.1.7*
        // Решите предыдущее задание, но без использования дополнительного массива.
        // Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        // Выведите результат программы в консоль тем же способом.
        System.out.println("Task 5.1.7*");
        initialArray = new int[]{5, 8, 2, 3, 9, 77, -1};
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initialArray));
        System.out.println("Reverse array:");
        System.out.println(Arrays.toString(reverseArray(initialArray)));
        System.out.println();

        // Task 5.1.8* Очень сложно
        // Задача, которая используется/бывает/встречается на собеседованиях.
        // Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        // Необходимо найти два числа, сумма которых равна −2.
        // Task 5.1.9*
        // Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.
        System.out.println("Task 5.1.9*");
        final int delta = -2;
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1, -10, -3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == delta) {
                    System.out.printf("found a pair: %d and %d\n", arr[i], arr[j]);
                    break;
                }
            }
        }
    }

    private static int[] reverseArray(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = tmp;
        }
        return arr;
    }


    private static void printIntArray(int[] intNumbers) {
        int indexLast = intNumbers.length - 1;
        for (int i = 0; i <= indexLast; i++) {
            if (i < indexLast) {
                System.out.printf("%d, ", intNumbers[i]);
            } else {
                System.out.printf("%d\n", intNumbers[i]);
            }
        }
    }
}
