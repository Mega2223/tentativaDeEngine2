package Mega2223.engine2.exemploDeUso;

import Mega2223.engine2.util.Ent;
import Mega2223.engine2.util.misc;

import java.awt.*;

public class eventHandlers {
    private static Ent ent = new Ent(new double[]{0,0});
    public static void onStart(){
        misc.debug("evento onStart inicializado" , misc.DEBUGMODE_ONLY_PRIORITY);
        main.Board.boardWindow.setVisible(true);
        System.out.println("window true");
        main.Board.sizeX = 100;
        main.Board.sizeY = 100;

        //TODO remove isso e faz um frontend decente
        ent.setSize(10);
        ent.setColor(Color.BLUE);
        ent.setType(simBoard.RANDOM);
        ent.setCoords(new double[]{50,50});
        main.Board.addToEntList(ent);


    }

    public static void onUpdate(){

        main.Turn ++;
        misc.debug("Turno " + main.Turn + " completo, com um número de " + main.Board.getEntList().size() +" entidades no board", misc.DEBUGMODE_ONLY_PRIORITY);
        main.Board.doUpdate();
        main.Board.boardWindow.updateRender(main.Board);

        //TODO remove this and make a proper frontend

    }
}
