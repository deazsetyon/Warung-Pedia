/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desain;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author deazs
 */
public class HomePageSeller extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.koneksiDatabase.BukaKoneksi();
    //mengambil data dari login
    String email = LogInSeller.email;
    String fileNameUser = LogInSeller.filename;
    String namaToko = LogInSeller.toko;
    
    
    String awal,tengah,akhir,hasilFileProfile;
    int saldo;
    
    public static String namaProduct,fileName,pertama,kedua,ketiga,hasilFile,toko,deskripsi,kategori;
    public static int harga,stok;

    /**
     * Creates new form HomePageSeller
     */
    public HomePageSeller() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //add placeholder style
        addPlaceholderStyle(txtNominal);
        aksi();
        aksiShowSaldo();
    }
    // create seperate method to add placeholder
    public void addPlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }
    public void removePlaceholderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }
    public void aksi(){
        try {

            awal = fileNameUser.substring(0,3);
            tengah = fileNameUser.substring(3,9);
            akhir = fileNameUser.substring(9);
            hasilFileProfile = awal+"\\"+tengah+"\\"+akhir; 
            

            File f = new File(this.hasilFileProfile);
            ImageIcon icon = new ImageIcon(f.toString());
            Image img = icon.getImage().getScaledInstance(labelUserProfile.getWidth(), labelUserProfile.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(img);
            labelUserProfile.setIcon(ic);
        } catch (Exception e) {
        }
        
        try {
            st = cn.createStatement();
            String sql = "SELECT * FROM product WHERE toko = '"+namaToko+"'";
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
                deskripsi = rs.getString("deskripsi");
                kategori = rs.getString("kategori");
                
                
                labelNamaProduct.setText(namaProduct);
                labelStok.setText(String.valueOf(stok));
                // Membuat formatter untuk mata uang Indonesia (IDR)
                NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

                // Mengonversi nilai integer menjadi format mata uang
                String formattedCurrency = currencyFormatter.format(harga);
                
                labelHarga.setText(formattedCurrency);
                labelTulisanProduk.setText("Stok : ");
                labelToko.setText(namaToko);
                System.out.println(hasilFile);
                
                File f = new File(this.hasilFile);
                ImageIcon icon = new ImageIcon(f.toString());
                Image img = icon.getImage().getScaledInstance(labelFoto.getWidth()-2, labelFoto.getHeight()-2, Image.SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(img);
                labelFoto.setIcon(ic);
            }else{
                System.out.println("BELUM ADA PRODUK");
            }

        } catch (Exception e) {
        }
    }
    public void aksiShowSaldo(){
        try {
            st = cn.createStatement();

            String sql = "SELECT * FROM seller WHERE email= '"+email+"'";
            rs = st.executeQuery(sql);
            if (rs.next()){
                saldo = rs.getInt("saldo");
                // Membuat formatter untuk mata uang Indonesia (IDR)
                NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

                // Mengonversi nilai integer menjadi format mata uang
                String formattedCurrency = currencyFormatter.format(saldo);
                labelSaldo.setText(formattedCurrency);
            }
        } catch (Exception e) {
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
        labelUserProfile = new desain.ImageAvatar();
        fPanel2 = new desain.FPanel();
        jLabel1 = new javax.swing.JLabel();
        fPanel1 = new desain.FPanel();
        labelSaldo = new javax.swing.JLabel();
        fPanel3 = new desain.FPanel();
        txtNominal = new desain.FtxtField();
        jLabel2 = new javax.swing.JLabel();
        fPanel4 = new desain.FPanel();
        btnTarikSaldo = new javax.swing.JLabel();
        fPanelProduct2 = new desain.FPanelProduct();
        labelFoto = new javax.swing.JLabel();
        labelNamaProduct = new javax.swing.JLabel();
        labelToko = new javax.swing.JLabel();
        labelTulisanProduk = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        labelStok = new javax.swing.JLabel();
        fPanel5 = new desain.FPanel();
        jLabel3 = new javax.swing.JLabel();
        fPanelProduct1 = new desain.FPanelProduct();
        labelTambahProduk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1110, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1110, 900));

        jPanel3.setBackground(new java.awt.Color(251, 206, 49));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("WarungPedia");

        labelUserProfile.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/user2.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(399, 399, 399))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(labelUserProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fPanel2.setBackground(new java.awt.Color(251, 206, 49));
        fPanel2.setRoundBottomLeft(25);
        fPanel2.setRoundBottomRight(25);
        fPanel2.setRoundTopLeft(25);
        fPanel2.setRoundTopRight(25);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Total Saldo");

        fPanel1.setBackground(new java.awt.Color(255, 255, 255));
        fPanel1.setRoundBottomLeft(10);
        fPanel1.setRoundBottomRight(10);
        fPanel1.setRoundTopLeft(10);
        fPanel1.setRoundTopRight(10);

        labelSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldo.setText("Rp. 1.000.000,00");

        javax.swing.GroupLayout fPanel1Layout = new javax.swing.GroupLayout(fPanel1);
        fPanel1.setLayout(fPanel1Layout);
        fPanel1Layout.setHorizontalGroup(
            fPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        fPanel1Layout.setVerticalGroup(
            fPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        fPanel3.setBackground(new java.awt.Color(255, 255, 255));
        fPanel3.setRoundBottomLeft(10);
        fPanel3.setRoundBottomRight(10);
        fPanel3.setRoundTopLeft(10);
        fPanel3.setRoundTopRight(10);

        txtNominal.setForeground(new java.awt.Color(204, 204, 204));
        txtNominal.setText("Masukan nominal tarik saldo");
        txtNominal.setPreferredSize(new java.awt.Dimension(297, 34));
        txtNominal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNominalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNominalFocusLost(evt);
            }
        });

        javax.swing.GroupLayout fPanel3Layout = new javax.swing.GroupLayout(fPanel3);
        fPanel3.setLayout(fPanel3Layout);
        fPanel3Layout.setHorizontalGroup(
            fPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNominal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fPanel3Layout.setVerticalGroup(
            fPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNominal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nominal Tarik Saldo");

        fPanel4.setBackground(new java.awt.Color(255, 255, 255));
        fPanel4.setRoundBottomLeft(10);
        fPanel4.setRoundBottomRight(10);
        fPanel4.setRoundTopLeft(10);
        fPanel4.setRoundTopRight(10);

        btnTarikSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTarikSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTarikSaldo.setText("Tarik Saldo");
        btnTarikSaldo.setPreferredSize(new java.awt.Dimension(80, 38));
        btnTarikSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarikSaldoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fPanel4Layout = new javax.swing.GroupLayout(fPanel4);
        fPanel4.setLayout(fPanel4Layout);
        fPanel4Layout.setHorizontalGroup(
            fPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTarikSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
        );
        fPanel4Layout.setVerticalGroup(
            fPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnTarikSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout fPanel2Layout = new javax.swing.GroupLayout(fPanel2);
        fPanel2.setLayout(fPanel2Layout);
        fPanel2Layout.setHorizontalGroup(
            fPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(fPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(fPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addGroup(fPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fPanel2Layout.createSequentialGroup()
                        .addComponent(fPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(410, 410, 410))))
        );
        fPanel2Layout.setVerticalGroup(
            fPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        fPanelProduct2.setBackground(new java.awt.Color(255, 255, 255));
        fPanelProduct2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fPanelProduct2MouseClicked(evt);
            }
        });

        labelNamaProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        labelHarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout fPanelProduct2Layout = new javax.swing.GroupLayout(fPanelProduct2);
        fPanelProduct2.setLayout(fPanelProduct2Layout);
        fPanelProduct2Layout.setHorizontalGroup(
            fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPanelProduct2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addGroup(fPanelProduct2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelToko)
                            .addComponent(labelNamaProduct)
                            .addGroup(fPanelProduct2Layout.createSequentialGroup()
                                .addComponent(labelTulisanProduk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelStok)))
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
                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNamaProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelToko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fPanelProduct2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTulisanProduk)
                    .addComponent(labelStok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHarga)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        fPanel5.setBackground(new java.awt.Color(251, 206, 49));
        fPanel5.setRoundBottomLeft(10);
        fPanel5.setRoundBottomRight(10);
        fPanel5.setRoundTopLeft(10);
        fPanel5.setRoundTopRight(10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Daftar Produk");
        jLabel3.setPreferredSize(new java.awt.Dimension(237, 34));

        javax.swing.GroupLayout fPanel5Layout = new javax.swing.GroupLayout(fPanel5);
        fPanel5.setLayout(fPanel5Layout);
        fPanel5Layout.setHorizontalGroup(
            fPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        fPanel5Layout.setVerticalGroup(
            fPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fPanelProduct1.setBackground(new java.awt.Color(255, 255, 255));
        fPanelProduct1.setPreferredSize(new java.awt.Dimension(167, 34));

        labelTambahProduk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTambahProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTambahProduk.setText("Tambah Produk");
        labelTambahProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTambahProdukMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fPanelProduct1Layout = new javax.swing.GroupLayout(fPanelProduct1);
        fPanelProduct1.setLayout(fPanelProduct1Layout);
        fPanelProduct1Layout.setHorizontalGroup(
            fPanelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTambahProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        fPanelProduct1Layout.setVerticalGroup(
            fPanelProduct1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTambahProduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fPanelProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fPanelProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fPanelProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(fPanelProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(654, Short.MAX_VALUE))
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

    private void txtNominalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNominalFocusGained
        // TODO add your handling code here:
        if(txtNominal.getText().equals("Masukan nominal tarik saldo")){
            txtNominal.setText(null);
            txtNominal.requestFocus();
            //remove placeholder
            removePlaceholderStyle(txtNominal);
        }
    }//GEN-LAST:event_txtNominalFocusGained

    private void txtNominalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNominalFocusLost
        // TODO add your handling code here:
        if(txtNominal.getText().length()==0){
            //add placeholder
            addPlaceholderStyle(txtNominal);
            txtNominal.setText("Masukan nominal tarik saldo");
        }
    }//GEN-LAST:event_txtNominalFocusLost

    private void btnTarikSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarikSaldoMouseClicked
        String amountStr = labelSaldo.getText();
        String tarikSaldo = txtNominal.getText();
        if (tarikSaldo.equals("Masukan nominal tarik saldo")){
            JOptionPane.showMessageDialog(null, "Harap masukkan inputan yang benar");
        }else{
            // Menghilangkan karakter non-angka dari string
            String cleanedStr = amountStr.replaceAll("[^\\d]", "");

            // Mengonversi string menjadi integer
            int amountInt = 0;
            try {
                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(cleanedStr);
                amountInt = number.intValue() / 100;
                if (amountInt - Integer.parseInt(tarikSaldo) >=0 ){
                    int saldoAkhir = amountInt - Integer.parseInt(tarikSaldo);
                    // Membuat formatter untuk mata uang Indonesia (IDR)
                    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

                    // Mengonversi nilai integer menjadi format mata uang
                    String formattedCurrency = currencyFormatter.format(saldoAkhir);
                    labelSaldo.setText(formattedCurrency);
                    txtNominal.setText("Masukan nominal tarik saldo");
                    addPlaceholderStyle(txtNominal);
                    this.requestFocusInWindow();
                    try {
                        st = cn.createStatement();

                        String sql = "UPDATE seller SET saldo = " + saldoAkhir+ " WHERE email = '" + email + "'";
                        int rs = st.executeUpdate(sql);
                    } catch (Exception e) {
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Saldo tidak cukup");
                    txtNominal.setText("Masukan nominal tarik saldo");
                    addPlaceholderStyle(txtNominal);
                    this.requestFocusInWindow();
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
            
 
        }

    }//GEN-LAST:event_btnTarikSaldoMouseClicked

    private void fPanelProduct2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fPanelProduct2MouseClicked

    }//GEN-LAST:event_fPanelProduct2MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
    this.requestFocusInWindow();

    }//GEN-LAST:event_formWindowGainedFocus

    private void labelTambahProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTambahProdukMouseClicked
        TambahProduct tp = new TambahProduct();   
        tp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_labelTambahProdukMouseClicked

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
            java.util.logging.Logger.getLogger(HomePageSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageSeller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnTarikSaldo;
    private desain.FPanel fPanel1;
    private desain.FPanel fPanel2;
    private desain.FPanel fPanel3;
    private desain.FPanel fPanel4;
    private desain.FPanel fPanel5;
    private desain.FPanelProduct fPanelProduct1;
    private desain.FPanelProduct fPanelProduct2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelNamaProduct;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelStok;
    private javax.swing.JLabel labelTambahProduk;
    private javax.swing.JLabel labelToko;
    private javax.swing.JLabel labelTulisanProduk;
    private desain.ImageAvatar labelUserProfile;
    private desain.FtxtField txtNominal;
    // End of variables declaration//GEN-END:variables
}
