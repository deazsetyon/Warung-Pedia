/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desain;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.sql.Connection;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
 

/**
 *
 * @author deazs
 */
public class TambahProduct extends javax.swing.JFrame {
    String namaToko = LogInSeller.toko;

    private PreparableStatement stat;
    private String filename;
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.koneksiDatabase.BukaKoneksi();
    public TambahProduct() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
    
    class product extends TambahProduct{
        String nama="",kategori="",deskripsi="",foto="",toko="";
        String harga,stok;
        public product(){
            nama = txtNamaProduct.getText();
            kategori = txtKategori.getText();
            deskripsi = txtDeskripsi.getText();
            harga = txtHarga.getText();
            stok = txtStok.getText();
            toko = namaToko;
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fPanel5 = new desain.FPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNamaProduct = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKategori = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fPanelProduct3 = new desain.FPanelProduct();
        txtDeskripsi = new desain.FtxtField();
        labelFoto = new javax.swing.JLabel();
        fPanel1 = new desain.FPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1110, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1110, 900));

        jPanel3.setBackground(new java.awt.Color(251, 206, 49));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("WarungPedia");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        fPanel5.setBackground(new java.awt.Color(251, 206, 49));
        fPanel5.setRoundBottomLeft(10);
        fPanel5.setRoundBottomRight(10);
        fPanel5.setRoundTopLeft(10);
        fPanel5.setRoundTopRight(10);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tambah Produk");

        javax.swing.GroupLayout fPanel5Layout = new javax.swing.GroupLayout(fPanel5);
        fPanel5.setLayout(fPanel5Layout);
        fPanel5Layout.setHorizontalGroup(
            fPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );
        fPanel5Layout.setVerticalGroup(
            fPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        txtNamaProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNamaProduct.setForeground(new java.awt.Color(204, 204, 204));
        txtNamaProduct.setText("Nama Produk");
        txtNamaProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaProductActionPerformed(evt);
            }
        });

        txtHarga.setForeground(new java.awt.Color(153, 153, 153));
        txtHarga.setText("Harga Produk");
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        txtStok.setForeground(new java.awt.Color(153, 153, 153));
        txtStok.setText("Stok");
        txtStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Rp.");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Stok");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Kategori");

        txtKategori.setForeground(new java.awt.Color(153, 153, 153));
        txtKategori.setText("Masukkan Kategori Barang");
        txtKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKategoriActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Deskripsi");

        fPanelProduct3.setBackground(new java.awt.Color(255, 255, 255));

        txtDeskripsi.setForeground(new java.awt.Color(153, 153, 153));
        txtDeskripsi.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDeskripsi.setText("Masukkan deskripsi produk");

        javax.swing.GroupLayout fPanelProduct3Layout = new javax.swing.GroupLayout(fPanelProduct3);
        fPanelProduct3.setLayout(fPanelProduct3Layout);
        fPanelProduct3Layout.setHorizontalGroup(
            fPanelProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDeskripsi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        fPanelProduct3Layout.setVerticalGroup(
            fPanelProduct3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDeskripsi, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
        );

        labelFoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setText("Klik Untuk Menambahkan Foto");
        labelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelFotoMouseClicked(evt);
            }
        });

        fPanel1.setBackground(new java.awt.Color(251, 206, 49));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Konfirmasi");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fPanel1Layout = new javax.swing.GroupLayout(fPanel1);
        fPanel1.setLayout(fPanel1Layout);
        fPanel1Layout.setHorizontalGroup(
            fPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );
        fPanel1Layout.setVerticalGroup(
            fPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addComponent(jLabel7)))
                            .addGap(229, 229, 229)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNamaProduct)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6)
                                .addComponent(txtKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(fPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(80, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fPanelProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(869, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(txtNamaProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(fPanelProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaProductActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void txtStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokActionPerformed

    private void txtKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKategoriActionPerformed

    private void labelFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelFotoMouseClicked
        product p = new product();
        if (p.nama.equals("") ||  p.kategori.equals("") || p.deskripsi.equals("") || p.harga.equals("") || p.stok.equals("") || p.toko .equals("")){
            JOptionPane.showMessageDialog(null, "Harap isi semua sebelum menambahkan foto");
        }else{
            
            try {
                JFileChooser chooser = new JFileChooser();
                chooser.setFileFilter(new FileFilter() { // untuk memfiler type png dan jpg
                    @Override
                    public boolean accept(File file) {
                        String n = file.getName().toLowerCase();
                        if(file.isDirectory() || n.endsWith(".jpg") || n.endsWith(".png")){
                            return true;
                        }else{
                            return false;
                        }
                    }

                    @Override
                    public String getDescription() {
                        return ".jpg | .png";
                    }
                });
                int click = chooser.showOpenDialog(this);
                if (click == JFileChooser.APPROVE_OPTION){
                    
                    filename = chooser.getSelectedFile().getAbsolutePath();
                    labelFoto.setText("");
                    labelFoto.setIcon(resizeImage(new ImageIcon(filename)));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_labelFotoMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            String newpath = "src////produk";
            File directory = new File(newpath);
            if (!directory.exists()){
                directory.mkdir();
            }
            File fileAwal = null;
            File fileAkhir = null;
            String ext = this.filename.substring(filename.lastIndexOf('.')+1);
            fileAwal = new File(filename);
            fileAkhir = new File(newpath+"////"+txtNamaProduct.getText()+"."+ext);
            System.out.println(fileAkhir);
            
            product p = new product();
            int harga = Integer.parseInt(p.harga);
            int stok = Integer.parseInt(p.stok);
            st = cn.createStatement();
            String sql = "INSERT INTO product (nama,harga,stok,kategori,deskripsi,foto,toko) VALUES ('"+p.nama+
                            "','"+harga+
                            "','"+stok+
                            "','"+p.kategori+
                            "','"+p.deskripsi+
                            "','"+fileAkhir+
                            "','"+p.toko+"')";
                        st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Produk berhasil ditambahkan");
            Files.copy(fileAwal.toPath(), fileAkhir.toPath());
            
            this.dispose();
            HomePageSeller hp = new HomePageSeller();
            hp.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jLabel8MouseClicked
    
    private ImageIcon resizeImage(ImageIcon img){
        return new ImageIcon(img.getImage().getScaledInstance(labelFoto.getWidth()-2, labelFoto.getHeight()-2,Image.SCALE_SMOOTH));
    }
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
            java.util.logging.Logger.getLogger(TambahProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private desain.FPanel fPanel1;
    private desain.FPanel fPanel5;
    private desain.FPanelProduct fPanelProduct3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFoto;
    private desain.FtxtField txtDeskripsi;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKategori;
    private javax.swing.JTextField txtNamaProduct;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
