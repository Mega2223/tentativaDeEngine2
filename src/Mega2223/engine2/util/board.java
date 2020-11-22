package Mega2223.engine2.util;

import java.util.ArrayList;
import java.util.List;

public class board {


    public int sizeX = 10;
    public int sizeY = 10;
    private static List<Ent> entities = new ArrayList<Ent>();


    public void tet(){}
    public board(){}
    public board(int SizeX, int SizeY){sizeX = SizeX; sizeY = SizeY;}
    public Window boardWindow = new Window();
    public List<Ent> getEntList(){return entities;}

    public void setEntList(final List<Ent> entList){entities = entList;}
    public void addToEntList (final Ent ent){entities.add(ent);}

    //@Deprecated
    //public static void update() {
        /**this SHOULD update the board according to each entity's behavior, but since I cant implement behaviors in them,*/
        /*board newBoardEntList = main.Board.getEntList();
        misc.debug("atualizando board", main.DEBUGMODE_ONLY_RELEVANT);
        for (int f = 0; f < newBoardEntList.size(); f++) {
            newBoardEntList.set(f, updateEntity(newBoardEntList.get(f)));
        }
        main.Board.setEntList(newBoardEntList);
    *///}//FIXME how tf do I implement this please help

}
