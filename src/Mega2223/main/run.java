package Mega2223.main;

public class run {
    //TODO remove this
    public static void main(String[] args) throws InterruptedException {

        eventHandlers.onStart();

        while(true){

            Thread.sleep((int)main.turnRate * 1000);
            eventHandlers.onUpdate();

        }
    }
}
