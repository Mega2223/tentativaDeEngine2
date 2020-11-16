package Mega2223.main;

public class run {
    public static void main(String[] args) throws InterruptedException {

        eventHandlers.onStart();

        while(true){

            Thread.sleep(100);
            eventHandlers.onUpdate();

        }
    }
}
