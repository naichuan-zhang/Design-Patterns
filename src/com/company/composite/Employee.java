package com.company.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept =dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return "Employee: [name: " + name
                + ", dept: " + dept + ", salary: "
                + salary + "] ";
    }
}
