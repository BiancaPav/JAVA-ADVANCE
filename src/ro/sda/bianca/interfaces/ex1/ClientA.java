package ro.sda.bianca.interfaces.ex1;

import java.time.Instant;

public class ClientA implements NotifyInterface{

    @Override
    public void notifyClient(Instant currentDateAndTime) {

        System.out.println(currentDateAndTime);
    }
}
