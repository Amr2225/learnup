package com.learnup.utils;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Button extends JButton {
    // makes the setter and getter for every private attribute to be able to use it in the desgin
    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getBorderSize() {
        return borderSize;
    }

    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }

    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }

    private final RippleEffect rippleEffect = new RippleEffect(this);
    public Button(){
        // init the button with init values can be changed later
        setBorder(new EmptyBorder(12, 12, 15, 12));
        setContentAreaFilled(false);
        
        setBackground(new Color(255, 255, 255));
        setForeground(new Color (80, 80, 80));
        rippleEffect.setRippleColor(new Color(220, 220, 220));   
    }
    // overrides the predefined paincomponent method to make our own button
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        //Making a round rectangle -> like a place holder for the rectangle
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), getRadius(), getRadius());
        g2.setColor(getBackground()); // sets the button color as the specifed background color
        if(this.isSelected()){ // if the button is select return a darker version of the background color
            g2.setColor(getBackground().darker());
        }
        // makes the actual area that would be painted 
        Area area = new Area(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), getRadius(), getRadius()));
        g2.fill(area); // paints the roundrectanle area
        rippleEffect.reder(g, area); //makes the ripple effect when clicked on the button
      
        if (getBorderSize() > 0){
            // making a button if there is a border
            g2.setColor(getBorderColor());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), getRadius(), getRadius());
            g2.setColor(getBackground());
            if(this.isSelected()){
                g2.setColor(getBackground().darker());
            }
            area = new Area(new RoundRectangle2D.Double(getBorderSize(), getBorderSize(), getWidth()-getBorderSize()*2, getHeight()-getBorderSize()*2, getRadius() , getRadius()));
            // paints the border as a rectangle and then paints the actual button inside of it we *2 to make the button perfectly inside the border
            g2.fillRoundRect(getBorderSize(), getBorderSize(), getWidth()-getBorderSize()*2, getHeight()-getBorderSize()*2, getRadius() , getRadius());
            rippleEffect.reder(g, area); // makes a ripple effect if the button has a border
        }
        super.paintComponent(g); // finaly paints the button
    }
    
    private Color borderColor;
    private int borderSize;
    private int radius = 0;
}
