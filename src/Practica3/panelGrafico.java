/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author Italo Garleni
 */
public class panelGrafico extends JPanel{
    public Double anguloVela=0.0, anguloTimon=0.0;
    public boolean focusVela=false, focusTimon=false;
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Rectangle rect = this.getBounds();
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setStroke(new BasicStroke(3.0f));
        g2.drawOval(100, 100, 100, 200);
        
        int x1 = 150;
        int y1 = 150;
        int x2 = x1 + (int) (100.0*Math.sin(anguloVela));
        int y2 = y1 + (int) (100.0*Math.cos(anguloVela));
        if (focusVela){
            g2.setColor(Color.red);
            g2.drawLine(x1, y1, x2, y2);
            g2.setColor(Color.black);
        }
        else{
            g2.drawLine(x1, y1, x2, y2);
        }
        x1 = 150;
        y1 = 300;
        x2 = x1 + (int) (50.0*Math.sin(anguloTimon));
        y2 = y1 + (int) (50.0*Math.cos(anguloTimon));
        if(focusTimon){
            g2.setColor(Color.red);
            g2.drawLine(x1, y1, x2, y2);
            g2.setColor(Color.black);
        }
        else {
            g2.drawLine(x1, y1, x2, y2);
        }
    }
}
