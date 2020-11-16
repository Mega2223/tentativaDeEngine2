package Mega2223.engine2.util;

import Mega2223.engine2.exampleUsage.main;

import java.awt.*;
import java.awt.image.*;
import java.util.List;

public class misc {
    //TODO divide this class into a package with categorized classes if it becomes too confusing to read
    public static BufferedImage renderBoard(board boardToRender) {
        BufferedImage buff = new BufferedImage(boardToRender.sizeX, boardToRender.sizeY, BufferedImage.TYPE_INT_RGB);
        //Graphics buffGr = buff.getGraphics();
        for (int E = 0; E < boardToRender.getEntList().size(); E++) {


            Ent ent = boardToRender.getEntList().get(E);
            int Xp = (int) ent.getXPos();
            int Yp = (int) ent.getYPos();
            //debug("setando RGB pra " + Xp + " " + Yp + " com o código RBG de " + ent.getColor().getRGB(), main.DEBUGMODE_EVERYTHING);

            //ok for not it looks ok
            //TO/DO fill the circles(done)
            buff.getGraphics().drawOval(Xp - ((int)ent.getSize()/2), Yp -((int)ent.getSize()/2), (int)ent.getSize(), (int)ent.getSize());
            buff.getGraphics().fillOval(Xp - ((int)ent.getSize()/2), Yp -((int)ent.getSize()/2), (int)ent.getSize(), (int)ent.getSize());

            //TODO render in space loops properly
            //TO/DO fazer funcionar a função size (feito)
            //TO/DO btw usar circulos, não pixels (feito)
            buff.setRGB(Xp, Yp, ent.getColor().getRGB());
            //btw dont place any code after the bufferedimage conversion
            buff = toBufferedImage(buff.getScaledInstance(boardToRender.boardWindow.getWidth(), boardToRender.boardWindow.getHeight(),BufferedImage.SCALE_DEFAULT));
            //why is it  a sun.awt.image.ToolkitImage and not a java.awt.bufferedImage?

        }

        return buff;
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
        if (main.debugModePriority <= levelOfPriority) {
            System.out.println(debugWhat);
        }

    }

    public static List<Ent> newBoardEntList;

    //TO/DO remove this from the API because it prevents new behaviors from being added by the user side(done, its now in the Ent class as a @Deprecated void)
    //or don't?
    //maybe i could just make these ones default behaviors with an doAction() void, and the users can make their own behaviors
    //tbh they are supposed to implement the Ents in their own classes anyway


    public static Ent updateEntity(Ent entity) {
        /**updates an individual entity depending on its behavior, size and speed modifiers*/
        //TODO speed and sizeSpeedModifiers
        int limitX = main.Board.sizeX;
        int limitY = main.Board.sizeY;
        misc.debug(("atualizando entidade de nome \"" + entity.getName() + "\""), main.DEBUGMODE_EVERYTHING);

        //the thing that moves the entity is going to be client side for a while considering that I want this thing to be as maleable as possible

        if (entity.getXPos() >= limitX) {

            entity.setCoords(new double[]{entity.getXPos() - limitX, entity.getYPos()});}

        if (entity.getYPos() >= limitY) {

                entity.setCoords(new double[]{entity.getXPos(), entity.getYPos() - limitY});
        }



        return entity;
    }
}