public class ConditionalOperator2 {

    public static void main(String[] args) {

        // Task 3.4.1
        // Представим, что мы работаем в банке. У нашего банка есть сайт, на который можно зайти с компьютера или телефона,
        // а также мобильное приложение. И нам, и клиенту удобнее с телефона пользоваться мобильным приложением.
        // Поэтому каждый раз, когда пользователь заходит на сайт с телефона, мы должны выдавать ему ссылку на скачивание приложения.
        // Но мы не знаем, iOS или Android он использует.
        // Напишите программу, которая определяет, чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение для обоих вариантов.
        // Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)
        // При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
        // Например, для iOS оно будет звучать так: «Установите версию приложения для iOS по ссылке».
        // А для Android так: «Установите версию приложения для Android по ссылке».

        int clientOs = 0;
        checkClientOs(clientOs);

        clientOs = 1;
        checkClientOs(clientOs);
        System.out.println();

        // Task 3.4.2
        // К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона, но и год его создания:
        // от этого зависит, подойдет ли приложение для телефона или оно просто не установится.
        // Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
        // Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.
        // Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий —
        // операционной системы телефона (iOS или Android) и года производства.
        // Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
        // Например, для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
        // А для Android так: «Установите облегченную версию приложения для Android по ссылке».
        // При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение об установке приложения.
        // Для обозначения года создания используйте переменную clientDeviceYear, где необходимо указать 2015 год.
        int clientDeviceYear = 2015;
        clientOs = 0;
        checkClientOsAndDeviceYear(clientOs, clientDeviceYear);
        clientOs = 1;
        checkClientOsAndDeviceYear(clientOs, clientDeviceYear);

        clientDeviceYear = 2013;
        clientOs = 0;
        checkClientOsAndDeviceYear(clientOs, clientDeviceYear);
        clientOs = 1;
        checkClientOsAndDeviceYear(clientOs, clientDeviceYear);
        System.out.println();

        // Task 3.4.3
        // Напишите программу, которая определяет, является ли год високосным или нет.
        // Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
        // Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        // « …. год является високосным».
        // или «... год не является високосным».
        // Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый.
        // Также високосным является каждый четырехсотый год.
        checkIsLeapYear(1900);
        checkIsLeapYear(2000);
        checkIsLeapYear(2004);
        checkIsLeapYear(2100);
        System.out.println();

        // Task 3.4.4
        // Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку банковских карт на дом
        // с четкой датой доставки. Чтобы известить клиента о том, когда будет доставлена его карта,
        // нам нужно знать расстояние от нашего офиса до адреса доставки.
        // Правила доставки такие:
        //  Доставка в пределах 20 км занимает сутки.
        //  Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //  Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        // То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        // Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки
        // Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        System.out.println(calculateCardDeliveryTime(15));
        System.out.println(calculateCardDeliveryTime(20));
        System.out.println(calculateCardDeliveryTime(65));
        System.out.println(calculateCardDeliveryTime(95));
        System.out.println(calculateCardDeliveryTime(105));
        System.out.println();

        // Task 3.4.5
        // Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        // Например, 1 месяц (он же январь) принадлежит к сезону зима.
        // Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
        // Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
        printSeasonByMonth(1);
        printSeasonByMonth(5);
        printSeasonByMonth(7);
        printSeasonByMonth(10);
        printSeasonByMonth(12);
        printSeasonByMonth(13);
    }

    private static void printSeasonByMonth(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.printf("Месяц %d - зима\n", month);
                break;
            case 3:
            case 4:
            case 5:
                System.out.printf("Месяц %d - весна\n", month);
                break;
            case 6:
            case 7:
            case 8:
                System.out.printf("Месяц %d - лето\n", month);
                break;
            case 9:
            case 10:
            case 11:
                System.out.printf("Месяц %d - осень\n", month);
                break;
            default:
                System.out.printf("Месяц %d - не существует\n", month);
        }
    }

    private static void checkClientOs(int clientOS) {
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    private static void checkClientOsAndDeviceYear(int clientOs, int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            checkClientOs(clientOs);
        } else {
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    private static void checkIsLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d год является високосным\n", year);
        } else {
            System.out.printf("%d год не является високосным\n", year);
        }
    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    private static String calculateCardDeliveryTime(int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else if (deliveryDistance < 60) {
            deliveryTime = 2;
        } else if (deliveryDistance < 100) {
            deliveryTime = 3;
        } else {
            return String.format("Дистанция до клиента: %d - На такую дальность срок доставки по договоренности", deliveryDistance);
        }
        return String.format("Дистанция до клиента: %d - Потребуется дней: %d", deliveryDistance, deliveryTime);
    }
}
