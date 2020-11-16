package Mega2223.util;

import java.util.ArrayList;
import java.util.List;

public class board {


    public int sizeX = 10;
    public int sizeY = 10;
    private static List<Ent> entities = new ArrayList<Ent>();

    public board(){}
    public board(int SizeX, int SizeY){sizeX = SizeX; sizeY = SizeY;}
    public Window boardWindow = new Window();
    public List<Ent> getEntList(){return entities;}

    public void setEntList(final List<Ent> entList){entities = entList;}
    public void addToEntList (final Ent ent){entities.add(ent);}
}
