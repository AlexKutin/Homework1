package coursework1;

import java.util.Objects;

public class Employee {
    private static int countId = 0;

    private final int id;
    private String firstName;

    private String middleName;

    private String lastName;
    private String department;
    private double salary;

    public Employee(String lastName, String firstName, String middleName, String department, int salary) {
        this.id = countId++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + middleName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Сотрудник {id=%d, %s, Отдел=%s, зарплата=%.2f", id, getFullName(), department, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        // Считаем Ф.И.О. сотрудников уникальными, поэтому сравниваем только по этим полям
        // В реальности необходимо добавить еще поля: дату и место рождения, номер паспорта
        return  Objects.equals(firstName, employee.firstName) && Objects.equals(middleName, employee.middleName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName);
    }
}
