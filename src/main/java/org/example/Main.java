package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runTasks();
    }

    public static void runTasks() {
        Healthplan healthplan1 = new Healthplan(1, "A Sigorta", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "B Sigorta", Plan.PREMIUM);

        String[] employeeHealthPlans = new String[2];
        Employee employee = new Employee(1, "John Doe", "jd@test.com", "1234", employeeHealthPlans);

        String[] companyEmployees = new String[2];
        Company company = new Company(1, "Workintech", 1000, companyEmployees);

        System.out.println(healthplan1);
        System.out.println(healthplan2);

        employee.addHealthPlan(0, healthplan1.getName());
        employee.addHealthPlan(1, healthplan2.getName());
        System.out.println(employee);

        company.addEmployee(0, employee.getFullName());
        System.out.println(company);
    }
}
