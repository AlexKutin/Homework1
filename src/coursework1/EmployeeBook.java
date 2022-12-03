package coursework1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class EmployeeBook implements Iterable<Employee> {
    private static final int INIT_COUNT_EMPLOYEES = 10;
    final static private double GROW_PARAM = 1.5;
    private int sizeArr = 0;
    private Employee[] employees = new Employee[INIT_COUNT_EMPLOYEES];

    public boolean addEmployee(Employee e) {
        checkCapacity();
        employees[sizeArr] = e;
        sizeArr++;
        return true;
    }

    public int getSize() {
        return sizeArr;
    }

    public Employee changeEmployeeSalary(String lastName, String firstName, String middleName, double newSalary) {
        int indexEmployee = indexOf(lastName, firstName, middleName);
        if (indexEmployee >= 0) {
            Employee employee = employees[indexEmployee];
            employee.setSalary(newSalary);
            return employee;
        }
        return null;
    }

    /**
     *
     * @param lastName employee lastName for search
     * @param firstName employee firstName for search
     * @param middleName employee middleName for search
     * @param newDepartment new Department name
     * @return Employee with the new department name set
     */
    public Employee changeEmployeeDepartment(String lastName, String firstName, String middleName, String newDepartment) {
        int indexEmployee = indexOf(lastName, firstName, middleName);
        if (indexEmployee >= 0) {
            Employee employee = employees[indexEmployee];
            employee.setDepartment(newDepartment);
            return employee;
        }
        return null;
    }

    /**
     *
     * @param lastName employee lastName for search
     * @param firstName employee firstName for search
     * @param middleName employee middleName for search
     * @return Employee or null if not found
     */
    public Employee searchByName(String lastName, String firstName, String middleName) {
        int index = indexOf(lastName, firstName, middleName);
        if (index >= 0) {
            return employees[index];
        } else {
            // the employee with the specified name "searchName" was not found
            return null;
        }
    }

    /**
     *
     * @param employeeId employee id for search
     * @return Employee or null if not found
     */
    public Employee searchById(int employeeId) {
        int index = indexOf(employeeId);
        if (index >= 0) {
            return employees[index];
        } else {
            // the employee with the specified id "employeeId" was not found
            return null;
        }
    }

    public boolean removeByName(String lastName, String firstName, String middleName) {
        int indexForRemove = indexOf(lastName, firstName, middleName);
        if (indexForRemove >= 0) {
            remove(indexForRemove);
            return true;
        }
        return false;
    }

    public boolean removeById(int idForRemove) {
        int indexForRemove = indexOf(idForRemove);
        if (indexForRemove >= 0) {
            remove(indexForRemove);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (sizeArr == 0) {
            return "EmployeeBook{}";
        }
        sb.append("Сотрудники{\n");
        for (int i = 0; i < sizeArr; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sb.append("\t").append(employee).append("\n");
            }
        }
        return sb.append("}").toString();
    }

    private int indexOf(String lastName, String firstName, String middleName) {
        for (int i = 0; i < sizeArr; i++) {
            if (Objects.equals(employees[i].getLastName(), lastName) &&
                Objects.equals(employees[i].getFirstName(), firstName) &&
                Objects.equals(employees[i].getMiddleName(), middleName)) {
                    return i;
            }
        }
        return -1;
    }

    private int indexOf(int employeeId) {
        for (int i = 0; i < sizeArr; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getId() == employeeId) {
                return i;
            }
        }
        return -1;
    }

    private Employee remove(int index) {
        Employee prev = employees[index];

        if (index < sizeArr - 1) {
            System.arraycopy(employees, index + 1, employees, index, sizeArr - index - 1);
        }
        sizeArr--;
        return prev;
    }

    private void checkCapacity() {
        // If the limit of the array is reached, then we increase it by the value of the parameter GROW_PARAM
        if (sizeArr == employees.length) {
            employees = Arrays.copyOf(employees, (int) (employees.length * GROW_PARAM));
        }
    }

    @Override
    public Iterator<Employee> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<Employee> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < sizeArr;
        }

        @Override
        public Employee next() {
            if (cursor > sizeArr) {
                throw new NoSuchElementException("The limit of the EmployeeBook array has been reached");
            }
            if (employees.length > 0) {
                return employees[cursor++];
            }
            return null;
        }
    }
}
