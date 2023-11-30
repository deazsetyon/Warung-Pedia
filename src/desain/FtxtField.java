/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desain;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author deazs
 */
public class FtxtField extends JTextField{
    private Color fillcolor;
    private Color lineColor;
    private int strokeWidth;

    public FtxtField() {
        fillcolor = new Color(255,255,255);
        lineColor = new Color(255,255,255);
        strokeWidth = 2;
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5,8,5,8));
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque()){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int s = strokeWidth;
            int w = getWidth();
            int h = getHeight();
            g2d.setColor(fillcolor);
            g2d.fillRoundRect(s, s, w-(2*s), h-(2*s), 10, 10);
            g2d.setStroke(new BasicStroke(s));
            g2d.setColor(lineColor);
            g2d.fillRoundRect(s, s, w-(2*s), h-(2*s), 10, 10);

        }
        super.paintComponent(g); 
    }
    
    
    
    
    
}
