package Mega2223.util;

import Mega2223.main.main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class misc {

    public static BufferedImage renderBoard(board boardToRender) {
        BufferedImage buff = new BufferedImage(boardToRender.sizeX, boardToRender.sizeY, BufferedImage.TYPE_INT_RGB);
        Graphics buffGr = buff.getGraphics();
        for (int E = 0; E < boardToRender.getEntList().size(); E++) {


            Ent ent = boardToRender.getEntList().get(E);
            int Xp = (int) ent.getXPos();
            int Yp = (int) ent.getYPos();
            debug("setando RGB pra " + Xp + " " + Yp + " com o código RBG de " + ent.getColor().getRGB(), main.DEBUGMODE_EVERYTHING);
            buff.setRGB(Xp, Yp, ent.getColor().getRGB());
            //TODO fazer funcionar a função size
            //TODO btw usar circulos, não pixels

        }

        return buff;
    }

    public static void debug(String debugWhat, int levelOfPriority) {
        if (main.debugModePriority <= levelOfPriority) {
            System.out.println(debugWhat);
        }

    }

    public static List<Ent> newBoardEntList;

    public static void updateBoard() {
        newBoardEntList = main.Board.getEntList();
        misc.debug("atualizando board", main.DEBUGMODE_ONLY_RELEVANT);
        for (int f = 0; f < newBoardEntList.size(); f++) {
            newBoardEntList.set(f, updateEntity(newBoardEntList.get(f)));
        }
        main.Board.setEntList(newBoardEntList);
    }

    public static Ent updateEntity(Ent entity) {
        int limitX = main.Board.sizeX;
        int limitY = main.Board.sizeY;
        misc.debug(("atualizando entidade de nome \"" + entity.getName() + "\""), main.DEBUGMODE_EVERYTHING);

        switch (entity.getType()) {
            case Ent.RANDOM:
                misc.debug("Entidade tipo random, vou colocar 1 de coordenada pq vc tava com preguiça de fazer  a porra de um random direito", main.DEBUGMODE_EVERYTHING);
                misc.debug("As coordenadas X são " + entity.getXPos() + ". E as Y são " + entity.getYPos(), main.DEBUGMODE_EVERYTHING);
                //TODO proper behavior
                entity.walkY(1);
                entity.walkX(1);
                misc.debug("Agora coordenadas X são " + entity.getXPos() + ". E as Y agora são " + entity.getYPos(), main.DEBUGMODE_EVERYTHING);
                break;

        }



        if (entity.getXPos() >= limitX) {

            entity.setCoords(new double[]{entity.getXPos() - limitX, entity.getYPos()});}

        if (entity.getYPos() >= limitY) {

                entity.setCoords(new double[]{entity.getXPos(), entity.getYPos() - limitY});
        }



        return entity;
    }
}