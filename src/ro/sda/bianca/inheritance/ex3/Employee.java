package ro.sda.bianca.inheritance.ex3;

import java.util.Date;

public class Employee extends Person{

    private double salary;
    private String company;
    private String department;

    public Employee(String name, Date dateOfBirth, String gender, double salary, String company, String department){
        super(name, dateOfBirth, gender);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", company='" + company + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
