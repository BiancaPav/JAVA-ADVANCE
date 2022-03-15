package ro.sda.bianca.multithread.ex1;

public class FirstThread extends Thread {

    private String startUpMessage;

    public FirstThread(String startUpMessage){
        this.startUpMessage = startUpMessage;

    }

    @Override
    public void run() {


        try {
            System.out.println("Hello from first thread." + startUpMessage);
            Thread.sleep(10);
            System.out.println("Hello from second thread." + startUpMessage);
            Thread.sleep(10);
            System.out.println("Hello from third thread." + startUpMessage);
            Thread.sleep(10);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}