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
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author deazs
 */
public class Test5 {
    private int roundTopLeft = 0;
    private int roundTopRight = 0;
    private int roundBottomLeft = 0;
    private int roundBottomRight = 0;

    public int getRoundTopLeft() {
        return roundTopLeft;
    }

    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
        repaint();
    }

    public int getRoundTopRight() {
        return roundTopRight;
    }

    public void setRoundTopRight(int roundTopRight) {
        this.roundTopRight = roundTopRight;
        repaint();
    }

    public int getRoundBottomLeft() {
        return roundBottomLeft;
    }

    public void setRoundBottomLeft(int roundBottomLeft) {
        this.roundBottomLeft = roundBottomLeft;
        repaint();
    }

    public int getRoundBottomRight() {
        return roundBottomRight;
    }

    public void setRoundBottomRight(int roundBottomRight) {
        this.roundBottomRight = roundBottomRight;
        repaint();
    }

    public Test5() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        Area area = new Area(createRoundTopLeft());
        if (roundTopRight > 0) {
            area.intersect(new Area(createRoundTopRight()));
        }
        if (roundBottomLeft > 0) {
            area.intersect(new Area(createRoundBottomLeft()));
        }
        if (roundBottomRight > 0) {
            area.intersect(new Area(createRoundBottomRight()));
        }
        g2.fill(area);
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setStroke(new BasicStroke(2));
        g2.setColor(new Color(251,206,49));

        int stroke = 2; // ketebalan garis
        int x = stroke / 2; // posisi X untuk menggambar garis kuning
        int y = stroke / 2; // posisi Y untuk menggambar garis kuning
        int width = getWidth() - stroke; // lebar garis kuning
        int height = getHeight() - stroke; // tinggi garis kuning
        int arc = 10; // radius sudut bulat

        // Gambar border dengan sudut bulat dan warna kuning
        g2.draw(new RoundRectangle2D.Double(x, y, width, height, arc, arc));
        g2.dispose();
    }

    private Shape createRoundTopRight(){
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area (new Rectangle2D.Double(0, 0, width-roundX/2, width)));
        area.add(new Area (new Rectangle2D.Double(0, roundY/2, width, height-roundY/2)));
        return area;
    }
    private Shape createRoundTopLeft(){
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area (new Rectangle2D.Double(roundX/2, 0, width-roundX/2, width)));
        area.add(new Area (new Rectangle2D.Double(0, roundY/2, width, height-roundY/2)));
        return area;
    }
    private Shape createRoundBottomLeft(){
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundBottomLeft);
        int roundY = Math.min(height, roundBottomLeft);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area (new Rectangle2D.Double(roundX/2, 0, width-roundX/2, height)));
        area.add(new Area (new Rectangle2D.Double(0, 0, width, height-roundY/2)));
        return area;
    }
    private Shape createRoundBottomRight(){
        int width = getWidth();
        int height = getHeight();
        int roundX = Math.min(width, roundBottomRight);
        int roundY = Math.min(height, roundBottomRight);
        Area area = new Area(new RoundRectangle2D.Double(0, 0, width, height, roundX, roundY));
        area.add(new Area (new Rectangle2D.Double(0, 0, width-roundX/2, height)));
        area.add(new Area (new Rectangle2D.Double(0, 0, width, height-roundY/2)));
        return area;
    }
}
