/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package desain;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author deazs
 */
public class DesainProduct extends javax.swing.JPanel implements MouseListener{
    private JLabel labelFotoProduct,labelNamaProduct,labelTulisanStok,labelStok,labelNamaToko,labelHarga;
    private int roundTopLeft = 0;
    private int roundTopRight = 0;
    private int roundBottomLeft = 0;
    private int roundBottomRight = 0;

    public int getRoundTopLeft() {
        return roundTopLeft;
    }

    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
//        repaint();
    }

    public int getRoundTopRight() {
        return roundTopRight;
    }

    public void setRoundTopRight(int roundTopRight) {
        this.roundTopRight = roundTopRight;
//        repaint();
    }

    public int getRoundBottomLeft() {
        return roundBottomLeft;
    }

    public void setRoundBottomLeft(int roundBottomLeft) {
        this.roundBottomLeft = roundBottomLeft;
//        repaint();
    }

    public int getRoundBottomRight() {
        return roundBottomRight;
    }

    public void setRoundBottomRight(int roundBottomRight) {
        this.roundBottomRight = roundBottomRight;
//        repaint();
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
    /**
     * Creates new form DesainProduct
     */
    public DesainProduct() {
        initComponents();
        setOpaque(false);
      
        // Mengatur ukuran panel menjadi 198x232
        setPreferredSize(new Dimension(198,232));
        
//        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        // Tambahkan label ke JPanel
        labelFotoProduct = new JLabel("Contoh Label"); // Isi teks label sesuai kebutuhan Anda
        labelFotoProduct.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(labelFotoProduct); // Tambahkan label ke JPanel

        // Set posisi label menggunakan layout atau setBounds
        labelFotoProduct.setBounds(10, 10, 178, 120); // Contoh: posisi X, posisi Y, lebar, tinggi
        labelFotoProduct.setForeground(Color.BLACK); // Ubah warna teks label sesuai kebutuhan Anda
        
        

        // Menggunakan BorderLayout untuk mengatur komponen lainnya
//        setLayout(new BorderLayout());
        
        labelNamaProduct = new JLabel("");
        labelNamaProduct.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(labelNamaProduct);
        labelNamaProduct.setBounds(10, 135, 150, 20); // Contoh: posisi X, posisi Y, lebar, tinggi
        labelNamaProduct.setForeground(Color.BLACK);
        labelNamaProduct.setFont(new Font(labelNamaProduct.getFont().getName(), Font.BOLD, 12));
        
        labelNamaToko = new JLabel("Nama Toko");
        labelNamaToko.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(labelNamaToko);
        labelNamaToko.setBounds(10, 150, 150, 20); // Contoh: posisi X, posisi Y, lebar, tinggi
        labelNamaToko.setForeground(Color.BLACK);

        labelTulisanStok = new JLabel("Stok : ");
        labelTulisanStok.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(labelTulisanStok);
        labelTulisanStok.setBounds(10, 170, 40, 20); // Contoh: posisi X, posisi Y, lebar, tinggi
        labelTulisanStok.setForeground(Color.BLACK);
        
        labelStok = new JLabel("1000");
        labelStok.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(labelStok);
        labelStok.setBounds(50, 170, 40, 20); // Contoh: posisi X, posisi Y, lebar, tinggi
        labelStok.setForeground(Color.BLACK);
        
        labelHarga = new JLabel("Rp. 1.000.000,00");
        labelHarga.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(labelHarga);
        labelHarga.setBounds(90, 200, 100, 20); // Contoh: posisi X, posisi Y, lebar, tinggi
        labelHarga.setForeground(Color.BLACK);
        labelHarga.setFont(new Font(labelNamaProduct.getFont().getName(), Font.BOLD, 12));
    }
    public JLabel getLabelNamaProduct() {
        return labelNamaProduct;
    }
    public String getTextLabelProduk() {
        return labelNamaProduct.getText();
    }
    public void setLabelNamaProduct(String nama){
        labelNamaProduct.setText(nama);
    }
    public void mouseClicked(MouseEvent e) {
        // Aksi yang dijalankan saat JPanel diklik
        // Contoh: System.out.println("JPanel diklik!");
        JOptionPane.showMessageDialog(null, "Panel Di Klik");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
