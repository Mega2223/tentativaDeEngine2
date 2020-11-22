package Mega2223.engine2.util;



import java.awt.*;
import java.awt.image.*;
import java.util.List;

public class misc {


    //TODO divide this class into a package with categorized classes if it becomes too confusing to read

    public static int debugModePriority = 3;
    public static final int DEBUGMODE_EVERYTHING = 0;
    public static final int DEBUGMODE_EVERYTHING_BUT_ENTITIES = 1;
    public static final int DEBUGMODE_ONLY_RELEVANT = 2;
    public static final int DEBUGMODE_ONLY_PRIORITY = 3;

    public static BufferedImage renderBoard(board boardToRender) {
        //TODO background image
        BufferedImage buff = new BufferedImage(boardToRender.sizeX, boardToRender.sizeY, BufferedImage.TYPE_INT_RGB);
        //Graphics buffGr = buff.getGraphics();
        for (int E = 0; E < boardToRender.getEntList().size(); E++) {


            Ent ent = boardToRender.getEntList().get(E);
            int Xp = (int) ent.getXPos();
            int Yp = (int) ent.getYPos();
            //debug("setando RGB pra " + Xp + " " + Yp + " com o código RBG de " + ent.getColor().getRGB(), main.DEBUGMODE_EVERYTHING);

            //ok for not it looks ok
            //TO/DO fill the circles(done)
            //TODO optmize loops
            Graphics h = buff.getGraphics();
            h.setColor(ent.getColor());
            h.drawOval(Xp - ((int)ent.getSize()/2), Yp -((int)ent.getSize()/2), (int)ent.getSize(), (int)ent.getSize());
            h.fillOval(Xp - ((int)ent.getSize()/2), Yp -((int)ent.getSize()/2), (int)ent.getSize(), (int)ent.getSize());

            //h.setColor(Color.red);

            h.drawOval(Xp - ((int)ent.getSize()/2) - boardToRender.sizeX, Yp -((int)ent.getSize()/2), (int)ent.getSize(), (int)ent.getSize());
            h.drawOval(Xp - ((int)ent.getSize()/2) + boardToRender.sizeX, Yp -((int)ent.getSize()/2), (int)ent.getSize(), (int)ent.getSize());
            h.drawOval(Xp - ((int)ent.getSize()/2), Yp -((int)ent.getSize()/2)  + boardToRender.sizeY, (int)ent.getSize(), (int)ent.getSize());
            h.drawOval(Xp - ((int)ent.getSize()/2), Yp -((int)ent.getSize()/2)  - boardToRender.sizeY, (int)ent.getSize(), (int)ent.getSize());

            h.fillOval(Xp - ((int)ent.getSize()/2) - boardToRender.sizeX, Yp -((int)ent.getSize()/2), (int)ent.getSize(), (int)ent.getSize());
            h.fillOval(Xp - ((int)ent.getSize()/2) + boardToRender.sizeX, Yp -((int)ent.getSize()/2), (int)ent.getSize(), (int)ent.getSize());
            h.fillOval(Xp - ((int)ent.getSize()/2), Yp -((int)ent.getSize()/2)  + boardToRender.sizeY, (int)ent.getSize(), (int)ent.getSize());
            h.fillOval(Xp - ((int)ent.getSize()/2), Yp -((int)ent.getSize()/2)  - boardToRender.sizeY, (int)ent.getSize(), (int)ent.getSize());

            //TO/DO render in space loops properly(feito)
            //TO/DO fazer funcionar a função size (feito)
            //TO/DO btw usar circulos, não pixels (feito)

            buff.setRGB(Xp, Yp, Color.white.getRGB());
            //btw dont place any code after the bufferedimage conversion
            buff = toBufferedImage(buff.getScaledInstance(boardToRender.boardWindow.getWidth(), boardToRender.boardWindow.getHeight(),BufferedImage.SCALE_DEFAULT));
            h.dispose(); //I am the law
        }

        return buff;
    }
    public static final int Norte = 0;  //todo english
    public static final int Sul = 1;    //i forgot wich direction is west in english help
    public static final int Leste = 2;
    public static final int Oeste = 3;

    public static int getClosestBorder(board Board, Ent entity){
        //maybe i've just made these for nothing
        //just maybe

        int Vert = Norte; int Horiznt = Oeste;
        double VertDis = entity.getYPos();
        double HorDis = entity.getXPos();
        if (entity.getXPos() > Board.sizeX) //if its on the right
        {Horiznt = Leste;HorDis = Board.sizeX - entity.getYPos();}
        if (entity.getYPos() > Board.sizeY)
        {Vert = Sul;VertDis = Board.sizeY - entity.getYPos();}
        if (VertDis > HorDis){return Vert;} return Horiznt;
     }

    //proudly copypasted from StackOverFlow
    public static BufferedImage toBufferedImage(Image img)
    {
        if (img instanceof BufferedImage)
        {
            return (BufferedImage) img;
        }

        // Create a buffered image with transparency
        BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

        // Draw the image on to the buffered image
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();

        // Return the buffered image
        return bimage;
    }

    public static void debug(String debugWhat, int levelOfPriority) {
        if (misc.debugModePriority <= levelOfPriority) {
            System.out.println(debugWhat);
        }

    }

    public static List<Ent> newBoardEntList;

    //TO/DO remove this from the API because it prevents new behaviors from being added by the user side(done, its now in the Ent class as a @Deprecated void)
    //or don't?
    //maybe i could just make these ones default behaviors with an doAction() void, and the users can make their own behaviors
    //tbh they are supposed to implement the Ents in their own classes anyway



}