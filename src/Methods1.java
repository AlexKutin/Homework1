import java.time.LocalDate;

public class Methods1 {

    public static void main(String[] args) {

        // Task 7.1.1
        // Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным, и выводит результат в консоль.
        // *Эту проверку вы уже реализовывали в задании по условным операторам.*
        // Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
        // Результат программы выведите в консоль.
        // Если год високосный, то должно быть выведено “номер года — високосный год”.
        // Если год не високосный, то, соответственно: “номер года — не високосный год”.
        System.out.println("Task 7.1.1");
        printIsLeapYear(1900);
        printIsLeapYear(1904);
        printIsLeapYear(2000);
        printIsLeapYear(2100);
        System.out.println();

        // Task 7.1.2
        // Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю облегченную версию приложения.
        // Напишите метод, куда подаются два параметра:
        // тип операционной системы (ОС) (0 — iOS или 1 — Android) и год выпуска устройства.
        // Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
        // Текущий год можно получить таким способом:
        // int currentYear = LocalDate.now().getYear();
        // Или самим задать значение вручную, введя в переменную числовое значение.
        // В результате программа должна выводить в консоль в зависимости от исходных данных,
        // какую версию приложения (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.
        System.out.println("Task 7.1.2");
        int currentYear = LocalDate.now().getYear();
        int clientOs = 0;
        checkClientOsAndDeviceYear(clientOs, currentYear);
        clientOs = 1;
        checkClientOsAndDeviceYear(clientOs, currentYear);

        currentYear = 2013;
        clientOs = 0;
        checkClientOsAndDeviceYear(clientOs, currentYear);
        clientOs = 1;
        checkClientOsAndDeviceYear(clientOs, currentYear);
        System.out.println();

        // Task 7.1.3
        // Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
        //  - Текст прошлого задания:
        //    Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку
        //    банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том, когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
        //    Правила доставки такие:
        //    Доставка в пределах 20 км занимает сутки.
        //    Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //    Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //    То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //    Напишите программу, которая выдает сообщение в консоль:
        //    "Потребуется дней: " + срок доставки
        //    Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        //  Наша задача — доработать код, а именно написать метод,
        //  который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        int deliveryDistance = 5;
        printDeliveryTime(deliveryDistance);
        deliveryDistance = 25;
        printDeliveryTime(deliveryDistance);
        deliveryDistance = 60;
        printDeliveryTime(deliveryDistance);
        deliveryDistance = 99;
        printDeliveryTime(deliveryDistance);
        deliveryDistance = 100;
        printDeliveryTime(deliveryDistance);
        deliveryDistance = 130;
        printDeliveryTime(deliveryDistance);
        System.out.println();
    }

    private static void printIsLeapYear(int year) {
        //
        if (ConditionalOperator2.isLeapYear(year)) {
            System.out.printf("%d — високосный год\n", year);
        } else {
            System.out.printf("%d — не високосный год\n", year);
        }
    }

    private static void checkClientOsAndDeviceYear(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    private static void printDeliveryTime(int deliveryDistance) {
        System.out.printf("Дистанция до клиента: %d - Потребуется дней: %d\n", deliveryDistance, calculateCardDeliveryDays(deliveryDistance));
    }

    private static int calculateCardDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        }
        return 2 + (deliveryDistance - 20) / 40;
    }
}
