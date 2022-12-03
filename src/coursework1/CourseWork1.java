package coursework1;

public class CourseWork1 {

    public static void main(String[] args) {
        EmployeeBook employees = new EmployeeBook();
        employees.addEmployee(new Employee("Иванов", "Сергей", "Игоревич", "3", 90_700));
        employees.addEmployee(new Employee("Иванова", "Ангелина", "Андреевна", "1", 63_000));
        employees.addEmployee(new Employee("Лаптев", "Иван", "Алексеевич", "4", 90_000));
        employees.addEmployee(new Employee("Воронов", "Семен", "Яковлевич", "5", 110_000));
        employees.addEmployee(new Employee("Тимофеева", "Яна", "Олеговна", "3", 90_000));
        employees.addEmployee(new Employee("Тихонова", "Ирина", "Сергеевна", "2", 75_000));
        employees.addEmployee(new Employee("Тихонов", "Дмитрий", "Петрович", "2", 110_000));
        employees.addEmployee(new Employee("Комаров", "Ярослав", "Иванович", "3", 49_050));
        employees.addEmployee(new Employee("Лавров", "Александр", "Олегович", "5", 40_000));
        employees.addEmployee(new Employee("Клыков", "Борис", "Семенович", "1", 100_000));
        employees.addEmployee(new Employee("Голубева", "Наталья", "Петровна", "1", 49_000));
        employees.addEmployee(new Employee("Фиолетов", "Денис", "Вадимович", "1", 50_000));
        employees.addEmployee(new Employee("Зайцева", "Марина", "Ивановна", "1", 145_000));

        EmployeeService employeeService = new EmployeeService(employees);

        // I. 8a. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString))
        System.out.println(employees);

        // I. 8b. Посчитать сумму затрат на зарплаты в месяц
        System.out.println("Затраты на зарплаты в месяц = " + employeeService.countSalaryAllEmployees());

        // I. 8c. Найти сотрудника с минимальной зарплатой
        Employee minSalaryEmployee = employeeService.findMinSalaryEmployee();
        System.out.printf("Сотрудник с минимальной зарплатой: %s, зарплата = %.2f\n",
                minSalaryEmployee.getFullName(), minSalaryEmployee.getSalary());

        // I. 8d. Найти сотрудника с максимальной зарплатой
        Employee maxSalaryEmployee = employeeService.findMaxSalaryEmployee();
        System.out.printf("Сотрудник с максимальной зарплатой: %s, зарплата = %.2f\n",
                maxSalaryEmployee.getFullName(), maxSalaryEmployee.getSalary());

        // I. 8e. Подсчитать среднее значение зарплат
        System.out.printf("Среднее значение зарплат сотрудников = %.2f\n", employeeService.averageSalaryForAllEmployees());
        System.out.println();

        // I. 8f. Получить Ф.И.О. всех сотрудников (вывести в консоль).
        employeeService.printFullNamesAllEmployees();
        System.out.println();

        // II. 1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
        System.out.println("Проиндексировать зарплату у всех сотрудников на 15%");
        employeeService.indexSalaryAllEmployees(15);
        System.out.println(employees);
        System.out.println();

        // II. 2a. Найти сотрудника с минимальной зарплатой в Отделе 1
        System.out.println("Сотрудник с минимальной зарплатой в Отделе 1: ");
        System.out.println("\t" + employeeService.findMinSalaryEmployeeByDepartment("1"));

        // II. 2b. Найти сотрудника с максимальной зарплатой в Отделе 1
        System.out.println("Сотрудник с максимальной зарплатой в Отделе 1: ");
        System.out.println("\t" + employeeService.findMaxSalaryEmployeeByDepartment("1"));

        // II. 2c. Найти сумму затрат на зарплату по Отделу 3
        System.out.printf("Сумма затрат на зарплату по Отделу 3: %.2f", employeeService.countSalaryAllEmployeesByDepartment("3"));
        System.out.println();

        // II. 2d. Найти среднюю зарплату по Отделу 3
        System.out.printf("Средняя зарплата по Отделу 3: %.2f\n", employeeService.averageSalaryForAllEmployees("3"));
        System.out.println();

        // II. 2e. Проиндексировать зарплату всех сотрудников Отдела 1 на 20%
        System.out.println("Проиндексировать зарплату всех сотрудников Отдела 1 на 20%");
        employeeService.indexSalaryAllEmployeesByDepartment("1", 20);

        // II. 2f. Напечатать всех сотрудников отдела (все данные, кроме отдела)
        employeeService.printAllEmployeesOfDepartment("1");
        System.out.println();

        // II. 3a. Найти всех сотрудников с зарплатой меньше числа (вывести id, Ф.И.О. и зарплатой в консоль)
        employeeService.printAllEmployeesWithSalaryLow(103_500);
        System.out.println();

        // II. 3b. Найти всех сотрудников с зарплатой больше или равно числа (вывести id, Ф.И.О. и зарплатой в консоль)
        employeeService.printAllEmployeesWithSalaryHigh(103_500);
        System.out.println();

        // III. 4b. Удалить сотрудника по Ф.И.О. (Фиолетов Денис Вадимович)
        System.out.print("Удаляем сотрудника: Фиолетов Денис Вадимович...");
        if (employees.removeByName("Фиолетов", "Денис", "Вадимович")) {
            System.out.println("Успешно!");
        } else {
            System.out.println("Произошла ошибка!");
        }
        employeeService.printAllEmployees();
        System.out.println();

        // III. 4b. Удалить сотрудника по id (id=4, Тимофеева Яна Олеговна)
        int idForRemove = 4;
        System.out.printf("Удаляем сотрудника: id = %d: %s...", idForRemove, employees.searchById(idForRemove));
        if (employees.removeById(idForRemove)) {
            System.out.println("Успешно!");
        } else {
            System.out.println("Произошла ошибка!");
        }
        employeeService.printAllEmployees();
        System.out.println();

        // III. 5a. Изменить зарплату сотрудника (получить сотрудника по Ф.И.О., модернизировать его запись):
        System.out.println("Изменяем зарплату сотрудника: Лаптев Иван Алексеевич, новая зарплата - 128000");
        Employee changedEmployee = employees.changeEmployeeSalary("Лаптев", "Иван", "Алексеевич", 128_000);
        System.out.println(changedEmployee);
        System.out.println();

        // III. 5a. Изменить отдел сотрудника (получить сотрудника по Ф.И.О., модернизировать его запись):
        System.out.println("Изменяем отдел сотрудника: Лаптев Иван Алексеевич, новая отдел - 5");
        changedEmployee = employees.changeEmployeeDepartment("Лаптев", "Иван", "Алексеевич", "5");
        System.out.println(changedEmployee);
        System.out.println();

        // III. 6. Получить Ф.И.О. всех сотрудников по отделам (напечатать список отделов и их сотрудников)
        System.out.println("Ф.И.О. всех сотрудников по отделам (список отделов и их сотрудников):");
        employeeService.printFullNamesEmployeesByDepartment();
    }
}
