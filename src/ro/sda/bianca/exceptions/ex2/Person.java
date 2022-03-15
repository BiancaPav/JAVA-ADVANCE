package ro.sda.bianca.exceptions.ex2;

import java.time.Instant;
import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private Instant dateOfBirth;

    public Person(String firstName, String lastName, Instant dateOfBirth) throws Exception {
        this.firstName = firstName;
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("The first name is null or empty.");
        }
        this.lastName = lastName;

        if (dateOfBirth == null || dateOfBirth.isAfter(Instant.now())) {
            throw new Exception("The date is null or in the future.");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("The first name is null or empty.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Instant dateOfBirth) throws Exception {
        if (dateOfBirth == null || dateOfBirth.isAfter(Instant.now())) {
            throw new Exception("The date is null or in the future.");
        }
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
