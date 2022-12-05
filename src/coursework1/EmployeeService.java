package coursework1;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    private final double THRESHOLD = 0.00000001d;
    private final EmployeeBook employeeBook;

    public EmployeeService(EmployeeBook employeeBook) {
        this.employeeBook = employeeBook;
    }

    // Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString))
    public void printAllEmployees() {
        System.out.println(employeeBook);
    }

    // Посчитать сумму затрат на зарплаты в месяц
    public double countSalaryAllEmployees() {
        double sum = 0;
        for (Employee employee : employeeBook) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    // Найти сотрудника с минимальной зарплатой
    public Employee findMinSalaryEmployee() {
        double min = Double.MAX_VALUE;
        Employee minSalaryEmployee = null;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    // Найти сотрудника с максимальной зарплатой
    public Employee findMaxSalaryEmployee() {
        // Зарплата не может быть меньше нуля
        double max = -1;
        Employee maxEmployee = null;
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    // Подсчитать среднее значение зарплат
    public double averageSalaryForAllEmployees() {
        if (employeeBook.getSize() == 0) {
            return 0;
        }
        double sumSalary = 0;
        int count = 0;
        for (Employee employee : employeeBook) {
            if (employee != null)  {
                sumSalary += employee.getSalary();
                count++;
            }
        }
        return sumSalary / count;
    }

    // Получить Ф.И.О. всех сотрудников (вывести в консоль)
    public void printFullNamesAllEmployees() {
        System.out.println("Перечень всех сотрудников:");
        for (Employee employee : employeeBook) {
            if (employee != null) {
                System.out.println("\t" + employee.getFullName());
            }
        }
    }

    // Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %)
    public void indexSalaryAllEmployees(int indexLevel) {
        double indexMultiplier = 1 + (indexLevel / 100.0);
        for (Employee employee : employeeBook) {
            if (employee != null) {
                double indexSalary = employee.getSalary() * indexMultiplier;
                employee.setSalary(indexSalary);
            }
        }
    }

    // 2. Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
    //    1. Сотрудника с минимальной зарплатой.
    //    2. Сотрудника с максимальной зарплатой.
    //    3. Сумму затрат на зарплату по отделу.
    //    4. Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    //    5. Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    //    6. Напечатать всех сотрудников отдела (все данные, кроме отдела).

    // Найти сотрудника с минимальной зарплатой в указанном отделе
    public Employee findMinSalaryEmployeeByDepartment(String department) {
        return new EmployeeService(getEmployeesByDepartment(department)).findMinSalaryEmployee();
    }

    // Найти сотрудника с максимальной зарплатой в указанном отделе
    public Employee findMaxSalaryEmployeeByDepartment(String department) {
        return new EmployeeService(getEmployeesByDepartment(department)).findMaxSalaryEmployee();
    }

    // Посчитать сумму затрат на зарплаты в месяц в указанном отделе
    public double countSalaryAllEmployeesByDepartment(String department) {
        return new EmployeeService(getEmployeesByDepartment(department)).countSalaryAllEmployees();
    }

    // Посчитать среднюю зарплату по отделу
    public double averageSalaryForAllEmployees(String department) {
        return new EmployeeService(getEmployeesByDepartment(department)).averageSalaryForAllEmployees();
    }

    // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра
    public void indexSalaryAllEmployeesByDepartment(String department, int indexLevel) {
        new EmployeeService(getEmployeesByDepartment(department)).indexSalaryAllEmployees(indexLevel);
    }

    // Напечатать всех сотрудников отдела (все данные, кроме отдела)
    public void printAllEmployeesOfDepartment(String department) {
        EmployeeBook employeesByDepartment = getEmployeesByDepartment(department);
        System.out.println("Сотрудники Отдела " + department);
        for (Employee employee : employeesByDepartment) {
            if (employee != null) {
                System.out.printf("\tid= %s, %s, Зарплата: %.2f\n", + employee.getId(), employee.getFullName(), employee.getSalary());
            }
        }
    }

    // 3. Получить в качестве параметра число и найти:
    //    a. Всех сотрудников с зарплатой меньше числа (вывести id, Ф.И.О. и зарплатой в консоль).
    public void printAllEmployeesWithSalaryLow(double salaryLevel) {
        System.out.println("Все сотрудники с зарплатой меньше, чем: " + salaryLevel);
        for (Employee employee : employeeBook) {
            if (employee != null && (salaryLevel - employee.getSalary() > THRESHOLD)) {
                System.out.println(employee);
            }
        }
    }

    // 3. Получить в качестве параметра число и найти:
    //  b. Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф.И.О. и зарплатой в консоль).
    public void printAllEmployeesWithSalaryHigh(double salaryLevel) {
        System.out.println("Все сотрудники с зарплатой больше или равно, чем: " + salaryLevel);
        for (Employee employee : employeeBook) {
            if (employee != null && (employee.getSalary() > salaryLevel || Math.abs(employee.getSalary() - salaryLevel) < THRESHOLD)) {
                System.out.println(employee);
            }
        }
    }

    // Получить Ф.И.О. всех сотрудников по отделам (напечатать список отделов и их сотрудников)
    public void printFullNamesEmployeesByDepartment() {
        HashMap<String, EmployeeBook> employeeHashMap = new HashMap<>();
        for (Employee employee : employeeBook) {
            if (employee != null) {
                String department = employee.getDepartment();
                if (employeeHashMap.containsKey(department)) {
                    employeeHashMap.get(department).addEmployee(employee);
                } else {
                    EmployeeBook emp = new EmployeeBook();
                    emp.addEmployee(employee);
                    employeeHashMap.put(department, emp);
                }
            }
        }
        for (Map.Entry<String, EmployeeBook> entry : employeeHashMap.entrySet()) {
            System.out.printf("Отдел: %s\n", entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.printf("    Сотрудник: %s, Зарплата: %.2f\n", employee.getFullName(), employee.getSalary());
            }
        }
    }

    private EmployeeBook getEmployeesByDepartment(String department) {
        EmployeeBook employeesByDepartment = new EmployeeBook();
        for (Employee employee : employeeBook) {
            if (employee != null && employee.getDepartment() != null && employee.getDepartment().equals(department)) {
                employeesByDepartment.addEmployee(employee);
            }
        }
        return employeesByDepartment;
    }
}
