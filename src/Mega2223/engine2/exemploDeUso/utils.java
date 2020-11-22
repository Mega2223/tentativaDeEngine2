package Mega2223.engine2.exemploDeUso;

import Mega2223.engine2.util.Ent;

public class utils {
    public static Ent updateEntity(Ent entity) {
        /**updates an individual entity depending on its behavior, size and speed modifiers*/
        //TODO speed and sizeSpeedModifiers
        int limitX = main.Board.sizeX;
        int limitY = main.Board.sizeY;

        //the thing that moves the entity is going to be client side for a while considering that I want this thing to be as maleable as possible

        if (entity.getXPos() >= limitX) {

            entity.setCoords(new double[]{entity.getXPos() - limitX, entity.getYPos()});}

        if (entity.getYPos() >= limitY) {

            entity.setCoords(new double[]{entity.getXPos(), entity.getYPos() - limitY});
        }



        return entity;
    }


}
