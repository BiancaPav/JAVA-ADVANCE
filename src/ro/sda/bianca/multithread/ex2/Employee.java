package ro.sda.bianca.multithread.ex2;

import java.time.Instant;

public class Employee extends Thread {
    public static long WORKING_INTERVAL = 10000;
    private String name;
    private Instant time;
    private boolean isStillWorking = true;

    public Employee(String name) {
        this.name = name;
        this.time = Instant.now();
    }


    @Override
    public void run() {

        try {
            System.out.println(name + ": I came to work at " + time);
            while (isStillWorking) {
                Thread.sleep(WORKING_INTERVAL);
                System.out.println(name + ": I m still working!");
            }
            System.out.println(name + ":Is time to go home.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        public void setTime (Instant time){
            this.time = time;
        }

    public void setStillWorking(boolean isStillWorking) {
        this.isStillWorking = isStillWorking;
    }
}
