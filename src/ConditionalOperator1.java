public class ConditionalOperator1 {
    public static void main(String[] args) {

        // Task 3.1.1 & 3.2.1
        // С помощью условного оператора напишите программу, которая выводит в консоль:
        //- поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
        //- информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
        checkAge(19);
        checkAge(17);
        System.out.println();

        // Task 3.1.2 & 3.2.2
        // Напишите программу, которая выводит в консоль сообщение о том, что:
        //- ребенок ходит в школу, если его возраст равен или больше 7 годам
        //- человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        //- человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
        checkWhereHumanLearn(3);
        checkWhereHumanLearn(7);
        checkWhereHumanLearn(17);
        checkWhereHumanLearn(18);
        checkWhereHumanLearn(23);
        checkWhereHumanLearn(24);
        System.out.println();

        // Task 3.1.3 & 3.2.3
        // Вместимость одного вагона поезда составляет 102 человека. Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.
        // Напишите программу, которая выводит в консоль сообщение о том, есть ли место в вагоне:
        // сидячее или стоячее или вагон уже полностью забит.
        checkWagonEmptySpace(50);
        checkWagonEmptySpace(60);
        checkWagonEmptySpace(61);
        checkWagonEmptySpace(102);
        checkWagonEmptySpace(103);
        System.out.println();

        // Task 3.3.1
        // Напишите программу, которая помогает определить в какое учреждение нужно отправить человека в зависимости от его возраста:
        //- Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад;
        //- Если человек от 7 до 18 лет, то ему нужно ходить в школу;
        //- Если человеку больше 18 лет, но меньше 24, то его место в университете;
        //- А если человеку больше 24, то ему пора ходить на работу
        //  При выполнении каждого условия программа должна выводить в консоль сообщение в формате :
        // “Если возраст человека равен … , то ему нужно ходить … *(в зависимости от возраста дописать нужное)*”
        defineWherePersonShouldGo(1);
        defineWherePersonShouldGo(2);
        defineWherePersonShouldGo(6);
        defineWherePersonShouldGo(7);
        defineWherePersonShouldGo(18);
        defineWherePersonShouldGo(19);
        defineWherePersonShouldGo(24);
        System.out.println();

        // Task 3.3.2
        // Как правило, на аттракционах действуют ограничения и для детей по возрасту:
        //  - Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        //  - Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого.
        //      Если взрослого нет, то кататься нельзя.
        //  - Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        //  Напишите программу, которая выводит в консоль сообщение о том, можно ли ребенку кататься одному или
        // в сопровождении взрослого в зависимости от того, сколько ему лет.
        possibleRideAttraction(3);
        possibleRideAttraction(5);
        possibleRideAttraction(10);
        possibleRideAttraction(14);
        System.out.println();

        // Task 3.3.3
        // Даны три числа:
        //  int one; int two; int three;
        // С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
        // какое из трех чисел бОльшее и выводит результат в консоль.
        printMaxNumberFromThree(3, 10, 17);
        printMaxNumberFromThree(31, 10, 17);
        printMaxNumberFromThree(31, 100, 56);
    }



    private static void checkAge(int age) {
        System.out.printf("Ваш возраст: %d. ", age);
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }
    }

    private static void checkWhereHumanLearn(int age) {
        if (age >= 7 && age < 18) {
            System.out.printf("Возраст: %d. Ребенок ходит в школу\n", age);
        } else if (age >= 18 && age < 24) {
            System.out.printf("Возраст: %d. Человек уже закончил школу и может отправляться в университет\n", age);
        } else if (age >= 24) {
            System.out.printf("Возраст: %d. Человек окончил университет и ему пора искать первую работу\n", age);
        }
    }

    private static void checkWagonEmptySpace(int number) {
        final int TOTAL_SPACE = 102;
        final int SEAT_SPACE = 60;

        System.out.printf("Запрошено место: %d: ", number);
        if (number <= SEAT_SPACE) {
            System.out.println("В вагоне есть сидячие места");
        } else if (number <= TOTAL_SPACE) {
            System.out.println("В вагоне остались стоячие места");
        } else {
            System.out.println("В вагоне мест нет");
        }
    }

    private static void defineWherePersonShouldGo(int age) {
        if (age >= 2 && age <= 6) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад\n", age);
        } else if (age >= 7 && age <= 18) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу\n", age);
        } else if (age > 18 && age < 24) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет\n", age);
        } else if (age >= 24) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работу\n", age);
        }
    }

    private static void possibleRideAttraction(int age) {
        System.out.printf("Возраст ребенка: %d. ", age);
        if (age < 5) {
            System.out.println("Он не может кататься на аттракционе");
        } else if (age < 14) {
            System.out.println("Он может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Он может кататься без сопровождения взрослого");
        }
    }

    private static void printMaxNumberFromThree(int one, int two, int three) {
        System.out.printf("Даны три числа: %d, %d, %d\n", one, two, three);
        int max = (max = one >= two ? one : two) >= three ? max : three;
        System.out.printf("Максимальное число = %d\n", max);
    }
}
