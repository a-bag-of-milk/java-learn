package learn.danya.chapter1;

import java.time.LocalDate;

class Employee {
    private final String name;
    private double salary;
    private final LocalDate hireDate;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDate = LocalDate.of(year, month, day);
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;

        salary += raise;
    }
}
