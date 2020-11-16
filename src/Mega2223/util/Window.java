package Mega2223.util;

import Mega2223.main.main;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class Window extends JFrame {

    public static BufferedImage render;
    public static JLabel label;
    public static int teste;

    public Window() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100, 100);
        render = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        ImageIcon ImgI = new ImageIcon(render);
        label = new JLabel(ImgI);
        add(label);
        misc.debug("uma instância ou algum método da classe Window foi inicializado", main.DEBUGMODE_ONLY_RELEVANT);
        //TODO ver pq toda hora essa classe é inicializada com o void updateRender
    }



    public static void updateRender() {
        render = misc.renderBoard(main.Board);
        misc.debug("atualizando render", main.DEBUGMODE_ONLY_RELEVANT);
        label.setIcon(new ImageIcon(render));
    }
}
