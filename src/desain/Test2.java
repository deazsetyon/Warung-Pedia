/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desain;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.JFrame;

/**
 *
 * @author deazs
 */
public class Test2 extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.koneksiDatabase.BukaKoneksi();
    
    private String namaProduct,fileName,pertama,kedua,ketiga,hasilFile;
    private int harga,stok;
    
    public Test2() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        aksi();

    }
    
    public void aksi(){
        try {
            st = cn.createStatement();
            String sql = "SELECT * FROM product";
            rs = st.executeQuery(sql);

            if(rs.next()){
                namaProduct = rs.getString("nama");
                harga= rs.getInt("harga");
                stok = rs.getInt("stok");
                fileName = rs.getString("foto");
                pertama = fileName.substring(0,3);
                kedua = fileName.substring(3,9);
                ketiga = fileName.substring(9);
                hasilFile = pertama+"\\"+kedua+"\\"+ketiga;
                labelNamaProduct.setText(namaProduct);
                labelStok.setText(String.valueOf(stok));
                labelHarga.setText(String.valueOf(harga));
                System.out.println(hasilFile);
                
                File f = new File(this.hasilFile);
                ImageIcon icon = new ImageIcon(f.toString());
                Image img = icon.getImage().getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(img);
                labelFoto.setIcon(ic);
                


            }else{
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }

        } catch (Exception e) {
        }
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        fPanelProduct2 = new desain.FPanelProduct();
        labelFoto = new javax.swing.JLabel();
        labelNamaProduct = new javax.swing.JLabel();
        labelToko = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        labelStok = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        fPanelProduct2.setBackground(new java.awt.Color(255, 255, 255));
        fPanelProduct2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fPanelProduct2MouseClicked(evt);
            }
        });

        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/produk1.jpg"))); // NOI18N

        labelNamaProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNamaProduct.setText("Barang 1");

        labelToko.setText("Warung Abah");

        jLabel9.setText("Stok : ");

        labelHarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelHarga.setText("Rp. 50.000,00");

        labelStok.setText("1203");

        javax.swing.GroupLayout fPanelProduct2Layout = new javax.swing.GroupLayout(fPanelProduct2);
        fPanelProduct2.setLayout(fPanelProduct2Layout);
        fPanelProduct2Layout.setHorizontalGroup(
            fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPanelProduct2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addGroup(fPanelProduct2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNamaProduct)
                            .addGroup(fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fPanelProduct2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(labelStok))
                                .addComponent(labelToko)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fPanelProduct2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHarga)
                .addGap(15, 15, 15))
        );
        fPanelProduct2Layout.setVerticalGroup(
            fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPanelProduct2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNamaProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelToko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelStok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHarga)
                .addGap(0, 86, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(fPanelProduct2);

        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(400, 120, 590, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fPanelProduct2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fPanelProduct2MouseClicked

        Product p = new Product();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fPanelProduct2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test2().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private desain.FPanelProduct fPanelProduct2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelNamaProduct;
    private javax.swing.JLabel labelStok;
    private javax.swing.JLabel labelToko;
    // End of variables declaration//GEN-END:variables
}
