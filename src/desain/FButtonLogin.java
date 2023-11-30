/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author deazs
 */
public class FButtonLogin extends JButton{
    private boolean over;
    private Color fill;
    
    private Color filloriginal;
    private Color fillover;
    private Color fillclik;
    private int strokeWidth;

    public FButtonLogin() {
        filloriginal = new Color(52, 152, 219);
        fillover = new Color (41,128,185);
        fillclik = new Color(211,84,0);
        strokeWidth = 2;
        fill = filloriginal;
        
        setOpaque(false);
        setBorder(null);
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBackground(filloriginal);
        setForeground(Color.WHITE);
        //tambahkan mose event
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseExited(MouseEvent e) {
                fill = filloriginal;
                over=false;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                fill = fillover;
                over=true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (over){
                    fill = fillover;
                }else{
                    fill = filloriginal;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                fill = fillclik;
                
            }
            
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (!isOpaque()){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int s = strokeWidth;
            int w = getWidth() - (2*s);
            int h = getHeight() - (2*s);
            
            //gambar background
            g2d.setColor(fill);
            g2d.fillRoundRect(s, s, w, h, h, h);
            
        }
        super.paintComponent(g); 
    }
    
    
    
    
    
}
