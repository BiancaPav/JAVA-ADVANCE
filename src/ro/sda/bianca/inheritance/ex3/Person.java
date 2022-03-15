package ro.sda.bianca.inheritance.ex3;

import java.util.Date;

public class Person {

    private String name;
    private Date dateOfBirth;
    private String gender;

    public Person(String name, Date dateOfBirth, String gender){
        this.name  = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateofBirth() {
        return dateOfBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
