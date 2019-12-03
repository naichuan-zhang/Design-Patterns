package com.company.composite;

/**
 * @author: Naichuan Zhang
 * @create: 03-Dec-2019
 **/
public class CompositeTest {
    public static void main(String[] args) {
        Employee ceo = new Employee("John", "CEO", 400000);
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 30000);

        Employee clerk1= new Employee("Laura", "Marketing", 1000);
        Employee clerk2 = new Employee("Bob", "Marketing", 1000);

        Employee salesExecutive = new Employee("Richard", "Sales", 100);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive);

        headMarketing.add(clerk1);
        headMarketing.add(clerk1);

        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
