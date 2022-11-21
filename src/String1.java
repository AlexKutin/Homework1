public class String1 {

    public static void main(String[] args) {

        // Task 6.1.1
        // Представим, что мы работаем в небольшой компании.
        // Данные сотрудников хранятся в неструктурированном формате, и бухгалтерия попросила написать программу,
        // в которой можно работать с Ф.И.О. сотрудников.
        // Напишите четыре строки:
        //  первая с именем firstName — для хранения имени;
        //  вторая с именем middleName — для хранения отчества;
        //  третья с именем lastName — для хранения фамилии;
        //  четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
        // Выведите в консоль фразу: “ФИО сотрудника — ….”
        // В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        System.out.println("Task 6.1.1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        System.out.println();

        // Task 6.1.2
        // Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны Ф.И.О. сотрудников,
        // полностью написанные заглавными буквами (верхним регистром).
        // Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        // В качестве строки с исходными данными используйте строку fullName.
        // Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        System.out.println("Task 6.1.2");
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s\n", fullName.toUpperCase());
        System.out.println();

        // Task 6.1.3
        // Система, в которой мы работаем, не принимает символ “ё”.
        // Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        // В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        // Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        System.out.println("Task 6.1.3");
        fullName = "Иванов Семён Семёнович";
        System.out.printf("Данные ФИО сотрудника — %s\n", fullName.replace('ё', 'е'));
        System.out.println();

        // Task 6.1.5
        // К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм,
        // разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
        // В качестве исходных данных используйте: Ф.И.О. сотрудника: “Ivanov Ivan Ivanovich”;
        //  строка fullName — для хранения Ф.И.О. сотрудника в формате фамилия - имя - отчество;
        //  переменная firstName — для хранения имени;
        //  переменная middleName — для хранения отчества;
        //  переменная lastName — для хранения фамилии.
        // Решите задание с помощью метода substring().
        // Результат программы выведите в формате:
        // “Имя сотрудника — …”“Фамилия сотрудника — …”“Отчество сотрудника — ...”
        System.out.println("Task 6.1.5");
        fullName = "Ivanov Ivan Ivanovich";

        lastName = getLstName(fullName);
        firstName = getFirstName(fullName);
        middleName = getMiddleName(fullName);
        System.out.printf("Имя сотрудника — %s\n", firstName);
        System.out.printf("Фамилия сотрудника — %s\n", lastName);
        System.out.printf("Отчество сотрудника — %s\n", middleName);
        System.out.println();

        // Task 6.1.6
        // Периодически данные в наших регистрах заполняются неверно, и Ф.И.О. сотрудников записывают со строчных букв.
        // Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф.И.О.
        // в правильный формат.
        // В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
        // которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
        // Выведите результат программы в консоль в формате: “Верное написание Ф.И.О. сотрудника с заглавных букв — …”
        System.out.println("Task 6.1.6");
        fullName = "ivanov ivan ivanovich";
        System.out.printf("Ошибочное написание Ф.И.О. сотрудника - %s\n", fullName);

        lastName = convertInitCharToUpperCase(getLstName(fullName));
        firstName = convertInitCharToUpperCase(getFirstName(fullName));
        middleName = convertInitCharToUpperCase(getMiddleName(fullName));
        System.out.printf("Верное написание Ф.И.О. сотрудника с заглавных букв — %s %s %s\n", lastName, firstName, middleName);
        System.out.println();

        // Task 6.1.7
        // Имеется две строки. Первая: "135" Вторая: "246"
        // Соберите из двух строк одну, содержащую данные "123456". Использовать сортировку нельзя.
        // Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        // Выведите результат в консоль в формате: “Данные строки — ….”
        System.out.println("Task 6.1.7");
        String s1 = "135";
        String s2 = "2469";
        System.out.printf("Дано: String1 - %s, String2 - %s\n", s1, s2);
        System.out.printf("Данные строки — %s\n", mergeTwoString(s1, s2));
        System.out.println();

        // Task 6.1.8
        // Дана строка из букв английского алфавита "aabccddefgghiijjkk".
        // Нужно найти и напечатать буквы, которые дублируются в строке.
        // Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
        // В итоге в консоль должен быть выведен результат программы: "acdgijk".
        System.out.println("Task 6.1.8");
        String initialString = "aabccddefgghiijjkk";
        System.out.printf("Исходная строка: %s\n", initialString);
        System.out.printf("Найдены дубли: %s\n", findDuplicatesChars(initialString));
        System.out.println();
    }

    private static String mergeTwoString(String s1, String s2) {
        int i = 0;
        int len1 = s1.length();
        int len2 = s2.length();
        StringBuilder sb = new StringBuilder();
        boolean isExistChar;
        do {
            isExistChar = false;
            if (i < len1) {
                sb.append(s1.charAt(i));
                isExistChar = true;
            }
            if (i < len2) {
                sb.append(s2.charAt(i));
                isExistChar = true;
            }
            i++;
        } while (isExistChar);
        return sb.toString();
    }

    private static String getLstName(String fullName) {
        int firstSpace = fullName.indexOf(' ');
        return fullName.substring(0, firstSpace);
    }

    private static String getFirstName(String fullName) {
        int firstSpace = fullName.indexOf(' ');
        int lastSpace = fullName.lastIndexOf(' ');
        return fullName.substring(firstSpace + 1, lastSpace);
    }

    private static String getMiddleName(String fullName) {
        int lastSpace = fullName.lastIndexOf(' ');
        return fullName.substring(lastSpace + 1);
    }

    private static String convertInitCharToUpperCase(String lastName) {
        StringBuilder sb = new StringBuilder(lastName);
        sb.setCharAt(0, Character.toUpperCase(lastName.charAt(0)));
        return sb.toString();
    }

    private static String findDuplicatesChars(String s) {
        char[] chars = s.toCharArray();
        StringBuilder duplicates = new StringBuilder();
        for (int j = 0; j < chars.length - 1; j++) {
            char currentChar = s.charAt(j);
            char nextChar = s.charAt(j + 1);
            if (currentChar == nextChar) {
                if (duplicates.toString().indexOf(currentChar) == -1) {
                    duplicates.append(currentChar);
                }
            }
        }
        return duplicates.toString();
    }
}
