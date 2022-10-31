public class Cycles1 {

    public static void main(String[] args) {

        // Task 1.1
        // С помощью цикла for выведите в консоль все числа от 1 до 10
        System.out.println("Task1.1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();

        // Task 1.2
        // С помощью цикла for выведите в консоль все числа от 10 до 1
        System.out.println("Task 1.2");
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
        System.out.println();

        // Task 1.3
        // Выведите в консоль все четные числа от 0 до 17
        System.out.println("Task 1.3");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
            }
        }
        System.out.println();

        // Task 1.4
        // Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему
        System.out.println("Task 1.4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("i = " + i);
        }

        // Task 2.1
        // Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате "… год является високосным".

        System.out.println("Task 2.1");
        for (int i = 1904; i <= 2096; i++) {
            if (ConditionalOperator2.isLeapYear(i)) {
                System.out.printf("%d год является високосным\n", i);
            }
        }
        System.out.println();

        // Task 2.2
        // Напишите программу, которая выводит в консоль последовательность цифр:
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("Task 2.2");
        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Task 2.3
        // Напишите программу, которая выводит в консоль последовательность цифр
        // 1 2 4 8 16 32 64 128 256 512
        System.out.println();
        System.out.println("Task 2.3");
        int n = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(n + " ");
            n <<= 1;
        }
        System.out.println();

        // Task 3.1
        // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
        // Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей"
        System.out.println("Task 3.1");
        int total_capital = 0;
        final int CAPITAL_MONTH = 29_000;
        for (int i = 1; i <= 12; i++) {
            total_capital += CAPITAL_MONTH;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total_capital);
        }
        System.out.println();

        // Task 3.2
        // Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку",
        // а в банк под проценты – 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей
        total_capital = 0;
        System.out.println("Task 3.2");
        for (int i = 1; i <= 12; i++) {
            total_capital *= 1.01;
            total_capital += CAPITAL_MONTH;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total_capital);
        }
    }
}
