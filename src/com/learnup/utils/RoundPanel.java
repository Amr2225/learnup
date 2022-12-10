package com.learnup.utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;


public class RoundPanel extends JPanel{
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    private int radius = 5;
    public RoundPanel(){
        setOpaque(false);
        setBackground(Color.BLACK);
    }

    // simply paints a roundrectangle
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), getRadius(), getRadius());
        g2.setColor(getBackground());
        Area area = new Area(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),getRadius(), getRadius()));
        g2.fill(area);
        
        g2.dispose(); // to be apple to put components inside this panel
        super.paintComponent(g);
    }
    
    
}
