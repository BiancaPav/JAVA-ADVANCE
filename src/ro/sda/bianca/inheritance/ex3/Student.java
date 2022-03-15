package ro.sda.bianca.inheritance.ex3;

import java.util.Date;

public class Student extends Person{

    private String school;
    private double gradeAverage;

    public Student(String name, Date dateOfBirth, String gender, String school, double gradeAverage){
        super(name, dateOfBirth, gender);
        this.school = school;
        this.gradeAverage = gradeAverage;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", gradeAverage=" + gradeAverage +
                '}';
    }
}
