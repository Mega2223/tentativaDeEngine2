package Mega2223.engine2.exampleUsage;

public class run {

    public static void main(String[] args) throws InterruptedException {

        eventHandlers.onStart();

        while(true){

            Thread.sleep((int)main.turnRate * 1000);
            eventHandlers.onUpdate();

        }
    }
}
