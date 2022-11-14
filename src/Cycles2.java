import java.time.Year;

public class Cycles2 {

    public static void main(String[] args) {
        // Task 4.1.1
        // Продолжим работать с накоплениями. Продолжите работать с кодом, который вы написали в предыдущем уроке.
        // С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        // что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        // Результат программы должен быть выведен в консоль в формате
        // “Месяц … , сумма накоплений равна … рублей” с тем количеством месяцев, необходимым для накопления данной суммы.
        System.out.println("Task 4.1.1");
        final int REQUIRED_CAPITAL = 2_459_000;
        final int MONTH_DEPOSIT = 15_000;
        final int DEPOSIT_RATE = 12;    // 12% годовых
        int totalCapital = 0;
        int monthCount = 0;

        while (totalCapital < REQUIRED_CAPITAL) {
            totalCapital = calculateMonthIncome(totalCapital, DEPOSIT_RATE) + totalCapital + MONTH_DEPOSIT;
            monthCount++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", monthCount, totalCapital);
        }
        System.out.println();

        // Task 4.1.2
        // Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        // На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        // Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        // Не забудьте выполнить переход на новую строку между двумя циклами.
        // В результате программы вывод должен получиться следующий:
        // 1 2 3 4 5 6 7 8 9 10
        // 10 9 8 7 6 5 4 3 2 1
        System.out.println("Task 4.1.2");
        int i = 1;
        while (i<= 10) {
            if (i > 1) {
                System.out.print(" ");
            }
            System.out.print(i);
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j);
            if (j > 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Task 4.1.3
        // В стране Y население равно 12 миллионам человек.
        // За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет,
        // принимая во внимание, что показатели рождаемости и смертности постоянны.
        // В консоль выведите результат операции на каждый год в формате “Год …, численность населения составляет … ”
        System.out.println();
        System.out.println("Task 4.1.3");
        final int INITIAL_POPULATION = 12_000_000;
        final int birthRate = 17;
        final int mortality = 8;
        int totalPopulation = INITIAL_POPULATION;
        for (int j = 1; j <= 10; j++) {
            totalPopulation += (birthRate - mortality) * (totalPopulation / 1000);
            System.out.printf("Год %2d, численность населения составляет %d\n", j, totalPopulation);
        }
        System.out.println();

        // Task 4.2.1
        // Первоначальная сумма вклада Василия составляет 15 тысяч рублей.
        // Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму
        // в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        // Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        System.out.println("Task 4.2.1");
        final int requiredCapitalVasil = 12_000_000;
        final int annualBanPercent = 7;
        final int initialDeposit = 15_000;
        int capitalVasil = initialDeposit;
        monthCount = 0;
        while (capitalVasil < requiredCapitalVasil) {
            int monthIncome = calculateMonthIncome(capitalVasil, annualBanPercent);
            capitalVasil += monthIncome;
            monthCount++;
            printIncomeInfo(monthCount, capitalVasil, monthIncome);
        }
        System.out.println();

        // Task 4.2.2
        // Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        // Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
        System.out.println("Task 4.2.2");
        capitalVasil = initialDeposit;
        monthCount = 0;
        int monthIncome = 0;
        while (capitalVasil < requiredCapitalVasil) {
            monthIncome = calculateMonthIncome(capitalVasil, annualBanPercent);
            capitalVasil += monthIncome;
            monthCount++;
            if (monthCount % 6 == 0) {
                printIncomeInfo(monthCount, capitalVasil, monthIncome);
            }
        }
        if (monthCount % 6 != 0) {
            System.out.print("Итого: ");
            printIncomeInfo(monthCount, capitalVasil, monthIncome);
        }
        System.out.println();

        // Task 4.2.3
        // Василий решил, что год копить деньги ближайшие 9 лет.
        // И он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        // Исходная сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
        // Напишите программу, которая будет выводить Василию сумму его накоплений за следующие каждые полгода в течение 9 лет.

        System.out.println("Task 4.2.3");
        final int monthTotalCount = 12 * 9;  // срок накоплений 9 лет
        capitalVasil = initialDeposit;
        monthCount = 0;
        for (int j = 0; j < monthTotalCount; j++) {
            monthIncome = calculateMonthIncome(capitalVasil, annualBanPercent);
            capitalVasil += monthIncome;
            monthCount++;
            if (monthCount % 6 == 0) {
                printIncomeInfo(monthCount, capitalVasil, monthIncome);
            }
        }
        System.out.println();

        // Task 4.2.4
        // В вашей компании пятница является днем отчетным.
        // Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница,
        // и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        // Условия задачи:
        // Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        // Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        // "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        // В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        System.out.println("Task 4.2.4");
        int firstFridayDate = 2;
        final int monthDayCount = 31;
        for (int j = firstFridayDate; j <= monthDayCount; j++) {
            if ((j - firstFridayDate) % 7 == 0) {
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", j);
            }
        }
        System.out.println();

        // Task 4.3.1
        // Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
        // Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
        // Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет, и когда мы увидим ее в следующий раз.
        // Условия задачи:
        // В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        // Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
        // (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        // В результате решения задачи в консоль должен вывестись следующий результат:
        //  1896
        //  1975
        //  2054
        System.out.println("Task 4.3.1");
        final int cometFlightPeriod = 79;
        final int lastPeriod = 200;
        final int futurePeriod = 100;
        int currentYear = Year.now().getValue();
        int startCheckDate = currentYear - lastPeriod;
        for (int year = 0; year < currentYear + futurePeriod; year++) {
            if (year % cometFlightPeriod == 0 && (year >= startCheckDate)) {
                System.out.println(year);
            }
        }
        System.out.println();

        // Task 4.3.2
        // Напишите программу, которая выводит в консоль таблицу умножения на 2:
        // 2*1=2
        // 2*2=4
        // 2*3=6
        // 2*4=8
        // 2*5=10
        // 2*6=12
        // 2*7=14
        // 2*8=16
        // 2*9=18
        // 2*10=20
        System.out.println("Task 4.3.2");
        for (int j = 1; j <= 10; j++) {
            System.out.printf("2*%d=%d\n", j, 2 * j);
        }
    }

    private static void printIncomeInfo(int monthCount, int capitalVasil, int monthIncome) {
        System.out.printf("Месяц %d, сумма накоплений равна %d рублей, доход в месяц составил %d руб\n", monthCount, capitalVasil, monthIncome);
    }

    private static int calculateMonthIncome(long sum, int annualInterestRate) {
        return (int) (sum * ((annualInterestRate / 12.0) / 100.0));
    }
}
