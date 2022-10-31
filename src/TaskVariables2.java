public class TaskVariables2 {

    public static void main(String[] args) {

//        Task1
//        Объявите переменные типа int, byte, short, long, float, double. Название переменных может быть любым, но если состоит из двух слов и более, должно придерживаться правила camelCase.
//        Выведите в консоль значение каждой переменной в формате “Значение переменной … с типом … равно …”
        int count = 291;
        byte regTwo = 7;
        short square = 701;
        long sum = 79_574;

        float volume = 24.55F;
        double weight = 67.612;

        System.out.printf("Значение переменной count с типом int равно %d\n", count);
        System.out.printf("Значение переменной regTwo с типом byte равно %d\n", regTwo);
        System.out.printf("Значение переменной square с типом short равно %d\n", square);
        System.out.printf("Значение переменной sum с типом long равно %d\n", sum);
        System.out.printf("Значение переменной volume с типом float равно %.2f\n", volume);
        System.out.printf("Значение переменной weight с типом double равно %.3f\n", weight);
        System.out.println();

//        Task2
//        Ниже дан список различных значений. Инициализируйте переменные, используя изученные ранее типы переменных.
//        Значения:
//        27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.

        float length = 27.12f;
        long countryArea = 987_678_965_549L;
        double cargoWeight = 2.786;
        boolean isOdd = false;
        short cost = 569;
        int difference = -159;
        int basketCost = 27897;
        int floor = 67;

//        Task3
//        Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
//        У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
//        Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
//        Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги".

        int countStudentsTeacherLP = 23;
        int countStudentsTeacherAS = 27;
        int countStudentsTeacherEA = 30;
        int totalPaper = 480;

        int paperForStudent = totalPaper / (countStudentsTeacherLP + countStudentsTeacherAS + countStudentsTeacherEA);
        System.out.printf("На каждого ученика рассчитано %d листов бумаги\n", paperForStudent);
        System.out.println();

//        Task4
//        Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты.
//        Какая производительность машины будет:
//          - за 20 минут
//          - в сутки
//          - за 3 дня
//          - за 1 месяц
//        Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
//        Результаты подсчетов выведите в консоль в формате “За … машины произвела бутылок … штук “

        int countTime = 20; // 20 минут
        System.out.printf("За 20 минут машина произвела бутылок %d штук\n", BottleMachine.efficiencyBottleByMinutes(countTime));

        countTime = 24 * 60;    // минут в сутки
        System.out.printf("За сутки машина произвела бутылок %d штук\n", BottleMachine.efficiencyBottleByMinutes(countTime));

        countTime = 3 * 24 * 60;    // минут за 3 дня
        System.out.printf("За 3 дня машина произвела бутылок %d штук\n", BottleMachine.efficiencyBottleByMinutes(countTime));

        countTime = 30 * 24 * 60;   // минут за месяц
        System.out.printf("За 1 месяц машина произвела бутылок %d штук\n", BottleMachine.efficiencyBottleByMinutes(countTime));
        System.out.println();

//        Task5
//        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
//        На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
//        Выведите результат задачи в консоль в формате “В школе, где … классов, нужно … банок белой краски и … банок коричневой краски”.
        int totalPaintCans = 120;
        int countWhitePaintByClass = 2;
        int countBrownPaintByClass = 4;

        int countNumberClasses = totalPaintCans / (countWhitePaintByClass + countBrownPaintByClass);
        int countWhitePaintCans = countNumberClasses * countWhitePaintByClass;
        int countBrownPaintCans = countNumberClasses * countBrownPaintByClass;

        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n",
                countNumberClasses, countWhitePaintCans, countBrownPaintCans);
        System.out.println();

//        Task6
//        Повар, когда готовит еду, взвешивает все продукты, чтобы добиться нужной консистенции.
//        То же делают и спортсмены, которые сидят на правильном питании и тщательно относятся к тому, что и сколько они едят.
//        Вот один из рецептов, который использует наш спортсмен перед тренировкой:
//          Бананы – 5 штук (1 банан - 80 грамм);
//          Молоко – 200 мл (100 мл = 105 грамм);
//          Мороженое пломбир – 2 брикета по 100 грамм;
//          Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
//        Смешать всё в блендере и готово.
//        Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
//        Результат напечатайте в консоль.

        int bananaWeight = 80;
        int milkWeight = 105;
        int plombirWeight = 100;
        int eggWeight = 70;

        int sportsBreakfastWeight = 5 * bananaWeight + 2 * milkWeight + 2 * plombirWeight + 4 * eggWeight;
        double sportsBreakfastWeightKg = sportsBreakfastWeight / 1000.0;

        System.out.printf("Вес спорт-завтрака = %d г, %.3f кг\n", sportsBreakfastWeight, sportsBreakfastWeightKg);
        System.out.println();

//        Task7
//        Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
//        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
//        Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько,
//        если каждый день будет худеть на 500 грамм.
//        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
//        Результаты всех подсчетов выведите в консоль.

        int totalWeightLoss = 7 * 1000;
        int weightLossToDay1 = 250;
        int weightLossToDay2 = 500;
        System.out.printf("Если спортсмен будет терять каждый день по %d гр, на похудание уйдет %d дней\n",
                weightLossToDay1, totalWeightLoss / weightLossToDay1);
        System.out.printf("Если спортсмен будет терять каждый день по %d гр, на похудание уйдет %d дней\n",
                weightLossToDay2, totalWeightLoss / weightLossToDay2);
        System.out.println();

//        Task8
//        Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
//        В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
//        Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
//        Каждый год повышение составляет 10% от текущей зарплаты.
//        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
//        Маша получает 67 760 рублей в месяц
//        Денис получает 83 690 рублей в месяц
//        Кристина получает 76 230 рублей в месяц
//        Каждому нужно увеличить зарплату на 10% от текущей месячной.
//        Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
//        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
//        Выведите в консоль информацию по каждому сотруднику.
//        Например, "Маша теперь получает **** рублей. Годовой доход вырос на **** рублей".

        final int indexingRate = 10;
        int incomeMasha = 67_760;
        int incomeDenis = 83_690;
        int incomeKristina = 76_230;
        printIncomeGrow("Маша", incomeMasha, indexingRate);
        printIncomeGrow("Денис", incomeDenis, indexingRate);
        printIncomeGrow("Кристина", incomeKristina, indexingRate);
    }

    private static void printIncomeGrow(String name, int income, int indexingRate) {
        double indexingIncome = income * (100.0 + indexingRate) / 100;
        double incomeGrowYear = income * (indexingRate / 100.0) * 12;
        System.out.printf("%s теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей\n", name, indexingIncome, incomeGrowYear);
    }

    static class BottleMachine {
        private static int efficiencyBottleByMinutes(int time) {
//          Производительность машины для изготовления бутылок - 8 бутылок в минуту.
            return time * 8;
        }
    }
}
