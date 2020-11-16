package Mega2223.util;



import java.awt.*;
@SuppressWarnings("unused")
public class Ent {

    public static final int RANDOM = 0;
    public static final int CHASER = 1;

    private double[] coords = {1,1};
    private Color color = Color.red;
    private double size = 1;
    private int typ = 0;
    private String name;

    public Ent(){}
    public Ent(double[] newCoords){coords = new double[] {newCoords[0], newCoords[1]};}
    public Ent(double[] newCoords, Color cor){color = cor; coords = new double[] {newCoords[0], newCoords[1]};}
    public Ent(double[] newCoords, Color cor, int type){typ = type; color = cor; coords = new double[] {newCoords[0], newCoords[1]};}

    public void setCoords(double[] newCoords){coords = newCoords;}
    public void walk(double[] howManyCoords){coords = howManyCoords;} //FIXME como caralhos eu pensei nisso
    public void walkX(double howManyXCoords){coords = new double[]{coords[0] + howManyXCoords, coords[1]};}
    public void walkY(double howManyYCoords){coords = new double[] {coords[0],  howManyYCoords + coords[1]};}
    public void setColor(Color newColor){color = newColor;}
    public void setSize(double newSize){size = newSize;}
    public void setType(int newType){typ = newType;}
    public void setName(String newName){name = newName;}

    public String getName (){return name;}
    public Color getColor(){return color;}
    public double getSize(){return size;}
    public double[] getCoords(){return coords;}
    public double getXPos(){return coords[0];}
    public double getYPos(){return coords[1];}
    public int getType(){return typ;}

}
