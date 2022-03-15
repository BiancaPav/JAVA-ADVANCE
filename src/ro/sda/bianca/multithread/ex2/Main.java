package ro.sda.bianca.multithread.ex2;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * *You are the manager. You have 5 employees.
 * Simulate the situation in which each of them comes at a different time to work.
 * - Every employee, after getting to work, displays the information "<name: I came to work at <time HH:MM>."
 * - Every 10 seconds, the employee displays „name: I'm still working!"
 *   c) Every 30 seconds, we release one of the employees to home (remember about stopping the thread!)
 *   and remove the employee from the „active employees list"
 * - When you release your employee to home, print „, it's time to go home!"
 * - *When you release a given employee, all of the others speed up. From that moment, display the information about work 2 seconds faster. f) **
 * The manager decides in which order release employees (e.g. through an earlier defined list)
 */

public class Main {

    public static final Random RANDOM = new Random();
    public static void main(String[] args) throws InterruptedException{

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            employees.add(new Employee("Name " + i));
        }
        for (Employee employee : employees) {
            employee.setTime(Instant.now());
            employee.start();
            Thread.sleep(RANDOM.nextInt(5000));

        }
        for(Employee employee : employees){
            Thread.sleep(5000);
            employee.setStillWorking(false);
            Employee.WORKING_INTERVAL-=2000;
        }
    }
}
