package Mega2223.main;

import Mega2223.util.Ent;
import Mega2223.util.Window;

import java.awt.*;
import java.awt.image.BufferedImage;
import Mega2223.main.*;
import Mega2223.util.*;

public class eventHandlers {

    public static void onStart(){
        misc.debug("evento onStart inicializado" , main.DEBUGMODE_ONLY_PRIORITY);
        main.Board.boardWindow.setVisible(true);
        System.out.println("window true");
        main.Board.sizeX = 10;
        main.Board.sizeY = 10;

        //TODO remove isso e faz um frontend decente
        Ent ent = new Ent(new double[]{0,0});
        ent.setName("fodase");
        main.Board.addToEntList(ent);

    }

    public static void onUpdate(){
        main.Turn ++;
        misc.debug("Turno " + main.Turn + " completo, com um número de " + main.Board.getEntList().size() +" entidades no board", main.DEBUGMODE_ONLY_PRIORITY);

        misc.updateBoard();
        main.Board.boardWindow.updateRender();


    }
}
