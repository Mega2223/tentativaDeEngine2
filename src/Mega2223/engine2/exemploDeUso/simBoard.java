package Mega2223.engine2.exemploDeUso;

import Mega2223.engine2.util.Ent;
import Mega2223.engine2.util.board;

import java.util.Random;

public class simBoard extends board{
    public simBoard() {

    }
    public static final int RANDOM = 0;
    public static final int CHASER = 1;
    public static final int CONTROLABLE = 2;

    public void doUpdate(){ //todo remove update method
        //btw cant implement this on the API bc users wont be able to put new behaviors without some wacky and uncharacteristic code
        for (int F = 0; F < this.getEntList().size(); F++){

            Ent atual = this.getEntList().get(F);
            switch (atual.getType()){
                case RANDOM:
                    int Ran = new Random().nextInt(4);
                    System.out.println("Ra " + Ran);
                    System.out.println("X:" + atual.getXPos() + " Y:" + atual.getYPos());
                    atual.walkX(1);
                    switch (Ran){
                        case 0:
                            atual.walkX(1);
                            break;
                        case 1:
                            atual.walkY(1);
                            break;
                        case 2:
                            atual.walkX(-1);
                            break;
                        case 3:
                            atual.walkY(-1);
                            break;
                    }
                    break;

                case CHASER:

                    break;

                case CONTROLABLE:
                    //todo: coisa de controlar
                    break;
            }
            if(atual.getCoords()[0] <= 0.0){atual.addX((double)main.Board.sizeX - 1); System.out.println("fff"+atual.getXPos());}
            if(atual.getCoords()[1] <= 0.0){atual.addY((double)main.Board.sizeY - 1);System.out.println("fanter²");}
            if(atual.getCoords()[0] >= main.Board.sizeX){atual.addX(-(double)main.Board.sizeX + 1);System.out.println("fanter2");}
            if(atual.getCoords()[1] >= main.Board.sizeY){atual.addY(-(double)main.Board.sizeY + 1);System.out.println("fanter²3");}
            System.out.println("AGORA: X:" + atual.getXPos() + " Y:" + atual.getYPos());
            this.getEntList().set(F, atual);
        }
    }
}
