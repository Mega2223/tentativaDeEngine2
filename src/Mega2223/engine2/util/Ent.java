package Mega2223.engine2.util;



import java.awt.*;
@SuppressWarnings("unused")
public class Ent {
    //TODO remove speed, sizeSpeedModifier and size function and put them on client side
    //or don't, I'm not your dad
    private double[] coords = {1,1};
    private Color color = Color.red;
    private double size = 5;
    private int typ = 0;
    private double speed = 1;
    private double sizeSpeedModifier = 1;

    public Ent(){}
    public Ent(double[] newCoords){coords = new double[] {newCoords[0], newCoords[1]};}
    public Ent(double[] newCoords, Color cor){color = cor; coords = new double[] {newCoords[0], newCoords[1]};}
    public Ent(double[] newCoords, Color cor, int type){typ = type; color = cor; coords = new double[] {newCoords[0], newCoords[1]};}
    public Ent(double[] newCoords, Color cor, int type, double Speed){typ = type; color = cor; coords = new double[] {newCoords[0], newCoords[1]}; speed = Speed;}

    public void setCoords(double[] newCoords){/**Sets the coordinates of the entity*/coords = newCoords;}
    public void walk(double[] howManyCoords){/**Adds to the coordinates of the entity*/coords = howManyCoords;} //FIXME como caralhos eu pensei nisso
    public void walkX(double howManyXCoords){/**Adds to the X coordinates of the entity*/coords = new double[]{coords[0] + howManyXCoords, coords[1]};}
    public void walkY(double howManyYCoords){/**Adds to the Y coordinates of the entity*/coords = new double[] {coords[0],  howManyYCoords + coords[1]};}
    public void setColor(Color newColor){/**Its no use if you don't use the Color function*/color = newColor;}
    public void setSize(double newSize){/**Its no use if you don't use the size function*/size = newSize;}
    public void setType(int newType){typ = newType;/**Sets a int set for diferentiating if you want a diferentiatior, does nothing on its own*/}
    public void setSpeed(double newSpeed){speed = newSpeed;}
    public void setSizeSpeedModifier(double newSizeSpeedModifier){/**No use if you don't use the SizeSpeedModifier function*/sizeSpeedModifier = newSizeSpeedModifier;}

    public double getSpeed(){/**No use if you don't use the Speed function*/return speed;}
    public Color getColor(){/**No use if you don't use the Color function*/return color;}
    public double getSize(){/**No use if you don't use the Size function*/return size;}
    public double[] getCoords(){return coords;}
    public double getXPos(){return coords[0];}
    public double getYPos(){return coords[1];}
    public int getType(){/**No use if you don't use the Type function*/return typ;}
    public double getSizeSpeedModifier(){/**No use if you don't use the SizeSpeedModifier function*/return sizeSpeedModifier;}

}
