package ro.sda.bianca.interfaces.ex1;

import java.time.Instant;

/**
 * Suppose you have written a time server that periodically notifies its clients of the current date and time.
 * Write an interface the server could use to enforce a particular protocol on its clients.
 */

public class Server {

    private NotifyInterface[] clients;

    public Server(NotifyInterface[] clients){
        this.clients = clients;
    }

    public void notifyAllClients(){

        for(NotifyInterface client:clients){
            client.notifyClient(Instant.now());
        }
    }
}
