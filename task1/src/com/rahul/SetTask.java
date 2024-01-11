package com.rahul;
import java.util.HashSet;
import java.util.Set;

class Employee {
    public String name;
    public int salary;
    public int sickDays;

    public Employee(String name, int sickDays){
        this.name = name;
        this.sickDays = sickDays;
    }

//    public int getSickdays() {
//        return sickdays;
//    }
//
//    public String getName() {
//        return name;
//    }
}

public class SetTask {

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        employees.add(new Employee("maneesha",0));
        employees.add(new Employee("rahul",15));
        employees.add(new Employee("aiswarya",2));

        printEmployeesWithBonus(employees);
    }
    public static void printEmployeesWithBonus(Set<Employee> employees) {
        for (Employee employee : employees) {
            if (employee.sickDays == 0) {
                System.out.println(employee.name+ " have bonus");
            }
        }
    }
}

