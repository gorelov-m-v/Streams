package employee1;

import java.util.*;

class EmployeesCounter {

    /**
     * Calculates the number of employees with salary >= threshold (only for 111- departments)
     *
     * @param departments are list of departments
     * @param threshold is lower edge of salary
     *
     * @return the number of employees
     */
    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(d -> d.getCode().contains("111-"))
                .flatMap(d -> d.getEmployees().stream())
                .filter(e -> e.getSalary() >= threshold)
                .count(); // write your code here
    }
}

class Employee {
    private final String name;
    private final Long salary;

    public Employee(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Department {
    private final String name;
    private final String code;
    private final List<Employee> employees;

    public Department(String name, String code, List<Employee> employees) {
        this.name = name;
        this.code = code;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", employees=" + employees +
                '}';
    }
}