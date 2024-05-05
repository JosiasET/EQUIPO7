/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinallira;

/**
 *
 * @author emira
 */

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Jpanelimge extends JPanel {
    private Image imahImage;

    public Jpanelimge(String rutaacceso){
        ImageIcon imagen1= new ImageIcon(rutaacceso);
        imahImage= imagen1.getImage();
        setLayout(new BorderLayout());
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imahImage,0, 0, getWidth(),getHeight(), this);
    }
}