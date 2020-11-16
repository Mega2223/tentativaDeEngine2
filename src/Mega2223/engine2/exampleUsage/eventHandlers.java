package Mega2223.engine2.exampleUsage;

import Mega2223.engine2.util.Ent;

import Mega2223.engine2.util.*;

public class eventHandlers {
    private static Ent ent = new Ent(new double[]{0,0});
    public static void onStart(){
        misc.debug("evento onStart inicializado" , main.DEBUGMODE_ONLY_PRIORITY);
        main.Board.boardWindow.setVisible(true);
        System.out.println("window true");
        main.Board.sizeX = 1000;
        main.Board.sizeY = 1000;

        //TODO remove isso e faz um frontend decente
        ent.setSize(1);
        main.Board.addToEntList(ent);

    }

    public static void onUpdate(){

        main.Turn ++;
        misc.debug("Turno " + main.Turn + " completo, com um número de " + main.Board.getEntList().size() +" entidades no board", main.DEBUGMODE_ONLY_PRIORITY);
        //main.Board.update();
        main.Board.boardWindow.updateRender();

        //TODO remove this and make a proper frontend
        ent.setSize(ent.getSize() + 0.5);
    }
}