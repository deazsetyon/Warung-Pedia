/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desain;

import static desain.HomePage.fileName;
import static desain.HomePage.harga;
import static desain.HomePage.hasilFile;
import static desain.HomePage.kedua;
import static desain.HomePage.ketiga;
import static desain.HomePage.namaProduct;
import static desain.HomePage.pertama;
import static desain.HomePage.stok;
import static desain.HomePage.toko;
import java.awt.Color;
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

/**
 *
 * @author deazs
 */
public class Product extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.koneksiDatabase.BukaKoneksi();
    
    //BARANG
    String namaProduct= HomePage.namaProduct;
    String toko = HomePage.toko;
    int harga = HomePage.harga;
    int stok = HomePage.stok;
    String kategori = HomePage.kategori;
    String deskripsi = HomePage.deskripsi;
    String fileName = HomePage.fileName;
    
    //USER
    int saldo = HomePage.saldo;
    String email = LogIn.email;
    
    String pertama,kedua,ketiga,hasilFile;
    String fotoSeller,awal,tengah,akhir,hasilFotoSeller;
    
    public static String jumlah,totalHarga;

    private int status;
    public Product() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        aksi();
    } 

    public void aksi(){
        pertama = fileName.substring(0,3);
        kedua = fileName.substring(3,9);
        ketiga = fileName.substring(9);
        hasilFile = pertama+"\\"+kedua+"\\"+ketiga; 
                
          
        labelNamaProduct.setText(namaProduct);
        labelStok.setText(String.valueOf(stok));
        labelStok2.setText(String.valueOf(stok));
        labelHarga.setText("Rp. "+String.valueOf(harga)+",00");
        labelHarga2.setText("Rp. "+String.valueOf(harga)+",00");
        labelToko.setText(toko);
        labelKategori.setText(kategori);
        labelDeskripsi.setText(deskripsi);
        
        try {
            st = cn.createStatement();
            String sql = "SELECT * FROM seller WHERE toko = '"+toko+"'";
            rs = st.executeQuery(sql);
            if (rs.next()){
                fotoSeller = rs.getString("foto");
                
                awal = fotoSeller.substring(0,3);
                tengah = fotoSeller.substring(3,9);
                akhir = fotoSeller.substring(9);
                hasilFotoSeller = awal+"\\"+tengah+"\\"+akhir; 
                
                File f = new File(this.hasilFotoSeller);
                ImageIcon icon = new ImageIcon(f.toString());
                Image img = icon.getImage().getScaledInstance(labelFotoSeller.getWidth(), labelFotoSeller.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ic = new ImageIcon(img);
                labelFotoSeller.setIcon(ic);
                
            }
        } catch (Exception e) {
        }
                
        File f = new File(this.hasilFile);
        ImageIcon icon = new ImageIcon(f.toString());
        Image img = icon.getImage().getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(img);
        labelFoto.setIcon(ic);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fPanel5 = new desain.FPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNamaProduct = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fPanel1 = new desain.FPanel();
        labelToko = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fPanel2 = new desain.FPanel();
        labelHarga2 = new javax.swing.JLabel();
        labelStok2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelKategori = new javax.swing.JLabel();
        labelDeskripsi = new javax.swing.JLabel();
        labelFotoSeller = new desain.ImageAvatar();
        labelFoto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fPanelGarisKuning4 = new desain.FPanelGarisKuning();
        labelHarga = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelStok = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fPanel6 = new desain.FPanel();
        fPanel8 = new desain.FPanel();
        labelTambah = new javax.swing.JLabel();
        fPanel9 = new desain.FPanel();
        labelKurang = new javax.swing.JLabel();
        labelJumlah = new javax.swing.JLabel();
        panelPlastik = new desain.FPanelGarisKuning();
        labelPlastik = new javax.swing.JLabel();
        panelKardus = new desain.FPanelGarisKuning();
        labelKardus = new javax.swing.JLabel();
        panelKayu = new desain.FPanelGarisKuning();
        labelKayu = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();
        fPanel10 = new desain.FPanel();
        labelBeli = new javax.swing.JLabel();

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
        jLabel1.setText("Seputar Produk");

        javax.swing.GroupLayout fPanel5Layout = new javax.swing.GroupLayout(fPanel5);
        fPanel5.setLayout(fPanel5Layout);
        fPanel5Layout.setHorizontalGroup(
            fPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        fPanel5Layout.setVerticalGroup(
            fPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        labelNamaProduct.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        labelNamaProduct.setText("SkyCorp's CharmBar");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Deskripsi");

        fPanel1.setBackground(new java.awt.Color(251, 206, 49));
        fPanel1.setPreferredSize(new java.awt.Dimension(3, 240));

        javax.swing.GroupLayout fPanel1Layout = new javax.swing.GroupLayout(fPanel1);
        fPanel1.setLayout(fPanel1Layout);
        fPanel1Layout.setHorizontalGroup(
            fPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        fPanel1Layout.setVerticalGroup(
            fPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        labelToko.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelToko.setText("Warung Abah");

        jLabel6.setText("Bandung");

        fPanel2.setBackground(new java.awt.Color(251, 206, 49));
        fPanel2.setPreferredSize(new java.awt.Dimension(350, 3));

        javax.swing.GroupLayout fPanel2Layout = new javax.swing.GroupLayout(fPanel2);
        fPanel2.setLayout(fPanel2Layout);
        fPanel2Layout.setHorizontalGroup(
            fPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        fPanel2Layout.setVerticalGroup(
            fPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        labelHarga2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelHarga2.setText("Rp. 50.000,00");

        labelStok2.setText("1203");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Kategori :");

        labelKategori.setText("Makanan dan Minuman");

        labelDeskripsi.setText("");

        labelFotoSeller.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/user2.jpeg"))); // NOI18N

        labelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/produk1.jpg"))); // NOI18N

        jLabel12.setText("Stok :");

        fPanelGarisKuning4.setBackground(new java.awt.Color(255, 255, 255));

        labelHarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelHarga.setText("Rp. 50.000,00");

        jLabel13.setText("Stok : ");

        labelStok.setText("1203");

        jLabel14.setText("Pilih Kemasan");

        jLabel17.setText("Jumlah Beli");

        fPanel6.setBackground(new java.awt.Color(255, 234, 160));
        fPanel6.setRoundBottomLeft(10);
        fPanel6.setRoundBottomRight(10);
        fPanel6.setRoundTopLeft(10);
        fPanel6.setRoundTopRight(10);

        fPanel8.setBackground(new java.awt.Color(251, 206, 49));
        fPanel8.setPreferredSize(new java.awt.Dimension(42, 21));
        fPanel8.setRoundBottomLeft(10);
        fPanel8.setRoundBottomRight(10);
        fPanel8.setRoundTopLeft(10);
        fPanel8.setRoundTopRight(10);

        labelTambah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTambah.setText("+");
        labelTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTambahMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fPanel8Layout = new javax.swing.GroupLayout(fPanel8);
        fPanel8.setLayout(fPanel8Layout);
        fPanel8Layout.setHorizontalGroup(
            fPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        fPanel8Layout.setVerticalGroup(
            fPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPanel8Layout.createSequentialGroup()
                .addComponent(labelTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        fPanel9.setBackground(new java.awt.Color(251, 206, 49));
        fPanel9.setPreferredSize(new java.awt.Dimension(42, 21));
        fPanel9.setRoundBottomLeft(10);
        fPanel9.setRoundBottomRight(10);
        fPanel9.setRoundTopLeft(10);
        fPanel9.setRoundTopRight(10);

        labelKurang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelKurang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKurang.setText("-");
        labelKurang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKurangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fPanel9Layout = new javax.swing.GroupLayout(fPanel9);
        fPanel9.setLayout(fPanel9Layout);
        fPanel9Layout.setHorizontalGroup(
            fPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelKurang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        fPanel9Layout.setVerticalGroup(
            fPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPanel9Layout.createSequentialGroup()
                .addComponent(labelKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelJumlah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelJumlah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJumlah.setText("0");

        javax.swing.GroupLayout fPanel6Layout = new javax.swing.GroupLayout(fPanel6);
        fPanel6.setLayout(fPanel6Layout);
        fPanel6Layout.setHorizontalGroup(
            fPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fPanel6Layout.createSequentialGroup()
                .addComponent(fPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        fPanel6Layout.setVerticalGroup(
            fPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(fPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(fPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)))
        );

        panelPlastik.setBackground(new java.awt.Color(255, 255, 255));
        panelPlastik.setPreferredSize(new java.awt.Dimension(72, 22));
        panelPlastik.setRoundBottomLeft(10);
        panelPlastik.setRoundBottomRight(10);
        panelPlastik.setRoundTopLeft(10);
        panelPlastik.setRoundTopRight(10);

        labelPlastik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlastik.setText("Plastik");
        labelPlastik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPlastikMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPlastikLayout = new javax.swing.GroupLayout(panelPlastik);
        panelPlastik.setLayout(panelPlastikLayout);
        panelPlastikLayout.setHorizontalGroup(
            panelPlastikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPlastik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        panelPlastikLayout.setVerticalGroup(
            panelPlastikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPlastik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelKardus.setBackground(new java.awt.Color(255, 255, 255));
        panelKardus.setPreferredSize(new java.awt.Dimension(72, 22));
        panelKardus.setRoundBottomLeft(10);
        panelKardus.setRoundBottomRight(10);
        panelKardus.setRoundTopLeft(10);
        panelKardus.setRoundTopRight(10);

        labelKardus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKardus.setText("Kardus");
        labelKardus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKardusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelKardusLayout = new javax.swing.GroupLayout(panelKardus);
        panelKardus.setLayout(panelKardusLayout);
        panelKardusLayout.setHorizontalGroup(
            panelKardusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelKardus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );
        panelKardusLayout.setVerticalGroup(
            panelKardusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelKardus, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        panelKayu.setBackground(new java.awt.Color(255, 255, 255));
        panelKayu.setPreferredSize(new java.awt.Dimension(72, 22));
        panelKayu.setRoundBottomLeft(10);
        panelKayu.setRoundBottomRight(10);
        panelKayu.setRoundTopLeft(10);
        panelKayu.setRoundTopRight(10);

        labelKayu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKayu.setText("Kayu");
        labelKayu.setPreferredSize(new java.awt.Dimension(72, 22));
        labelKayu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelKayuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelKayuLayout = new javax.swing.GroupLayout(panelKayu);
        panelKayu.setLayout(panelKayuLayout);
        panelKayuLayout.setHorizontalGroup(
            panelKayuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelKayu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelKayuLayout.setVerticalGroup(
            panelKayuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKayuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelKayu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel15.setText("Total Harga");

        labelTotalHarga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTotalHarga.setText("Rp. 0");

        fPanel10.setBackground(new java.awt.Color(251, 206, 49));
        fPanel10.setRoundBottomLeft(10);
        fPanel10.setRoundBottomRight(10);
        fPanel10.setRoundTopLeft(10);
        fPanel10.setRoundTopRight(10);

        labelBeli.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelBeli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBeli.setText("Buy");
        labelBeli.setPreferredSize(new java.awt.Dimension(0, 29));
        labelBeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBeliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fPanel10Layout = new javax.swing.GroupLayout(fPanel10);
        fPanel10.setLayout(fPanel10Layout);
        fPanel10Layout.setHorizontalGroup(
            fPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPanel10Layout.createSequentialGroup()
                .addComponent(labelBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        fPanel10Layout.setVerticalGroup(
            fPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout fPanelGarisKuning4Layout = new javax.swing.GroupLayout(fPanelGarisKuning4);
        fPanelGarisKuning4.setLayout(fPanelGarisKuning4Layout);
        fPanelGarisKuning4Layout.setHorizontalGroup(
            fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPanelGarisKuning4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fPanelGarisKuning4Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fPanelGarisKuning4Layout.createSequentialGroup()
                        .addComponent(labelHarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(61, 61, 61))
                    .addGroup(fPanelGarisKuning4Layout.createSequentialGroup()
                        .addComponent(panelPlastik, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelKardus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelKayu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fPanelGarisKuning4Layout.createSequentialGroup()
                        .addGroup(fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fPanelGarisKuning4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelStok)
                                .addGap(498, 498, 498)
                                .addComponent(fPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fPanelGarisKuning4Layout.createSequentialGroup()
                                .addGroup(fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(labelTotalHarga))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );
        fPanelGarisKuning4Layout.setVerticalGroup(
            fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fPanelGarisKuning4Layout.createSequentialGroup()
                .addGroup(fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fPanelGarisKuning4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelHarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(labelStok)))
                    .addGroup(fPanelGarisKuning4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fPanelGarisKuning4Layout.createSequentialGroup()
                        .addGroup(fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fPanelGarisKuning4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelKardus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelPlastik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panelKayu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTotalHarga))
                    .addComponent(fPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelFotoSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelToko)
                                            .addComponent(jLabel6))
                                        .addGap(267, 267, 267))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelNamaProduct)
                                            .addComponent(labelHarga2)
                                            .addComponent(fPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelStok2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(14, 14, 14)
                                                .addComponent(labelKategori)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(fPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(labelDeskripsi)))
                            .addComponent(fPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(fPanelGarisKuning4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(fPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(labelDeskripsi))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(labelHarga2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNamaProduct)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(labelToko)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelFotoSeller, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addComponent(fPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(labelStok2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(labelKategori)))
                    .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(fPanelGarisKuning4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(546, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelPlastikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPlastikMouseClicked
        this.status = 1;
        panelPlastik.setBackground(Color.orange);
        panelKardus.setBackground(Color.WHITE);
        panelKayu.setBackground(Color.WHITE);
    }//GEN-LAST:event_labelPlastikMouseClicked

    private void labelKardusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKardusMouseClicked
        this.status = 1;
        panelKardus.setBackground(Color.ORANGE);
        panelPlastik.setBackground(Color.WHITE);
        panelKayu.setBackground(Color.WHITE);
    }//GEN-LAST:event_labelKardusMouseClicked

    private void labelKayuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKayuMouseClicked
        this.status = 1;
        panelKayu.setBackground(Color.ORANGE);
        panelPlastik.setBackground(Color.WHITE);
        panelKardus.setBackground(Color.WHITE);

    }//GEN-LAST:event_labelKayuMouseClicked

    private void labelTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTambahMouseClicked
        
        String jumlah = labelJumlah.getText();
        String harga  = labelHarga.getText();
        String total = labelTotalHarga.getText();
        if (Integer.parseInt(jumlah) == stok){
            labelTotalHarga.setText(total);
            labelJumlah.setText(jumlah);

        }else{
            int hasil = Integer.parseInt(jumlah) + 1;
            jumlah = String.valueOf(hasil);
            labelJumlah.setText(jumlah);
        
        
            
        
        
        // TOTAL HARGA
            String cleanedStrHarga = total.replaceAll("[^\\d]", "");

            int amountIntHarga = 0;
            try {
                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(cleanedStrHarga);
                amountIntHarga = number.intValue() / 100;
            } catch (ParseException e) {
                e.printStackTrace();
            }
          
         // HARGA
            String cleanedStr = harga.replaceAll("[^\\d]", "");

            int amountInt = 0;
            try {
                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(cleanedStr);
                amountInt = number.intValue() / 100;
                amountInt += amountIntHarga;
                System.out.println(amountInt);

            } catch (ParseException e) {
                e.printStackTrace();
            }
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

            String formattedCurrency = currencyFormatter.format(amountInt);
            labelTotalHarga.setText(formattedCurrency);
        }
        
    }//GEN-LAST:event_labelTambahMouseClicked

    private void labelKurangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelKurangMouseClicked
        String jumlah = labelJumlah.getText();
        if (jumlah.equals("0")){
            labelJumlah.setText("0");
            labelTotalHarga.setText("Rp. 0");
        }else{
            int hasil = Integer.parseInt(jumlah) - 1;
            jumlah = String.valueOf(hasil);
            labelJumlah.setText(jumlah);
            
            
            String harga = labelHarga.getText();
            String total = labelTotalHarga.getText();
            // HARGA
            String cleanedStr = harga.replaceAll("[^\\d]", "");

            int amountInt = 0;
            try {
                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(cleanedStr);
                amountInt = number.intValue()/100;

            } catch (ParseException e) {
                e.printStackTrace();
            }
            
            // TOTAL HARGA
            String cleanedStrHarga = total.replaceAll("[^\\d]", "");

            int amountIntHarga = 0;
            try {
                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(cleanedStrHarga);
                amountIntHarga = number.intValue()/100;
                amountIntHarga -= amountInt;
            } catch (ParseException e) {
                e.printStackTrace();
            }
          
            
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

            String formattedCurrency = currencyFormatter.format(amountIntHarga);
            labelTotalHarga.setText(formattedCurrency);
        }
    }//GEN-LAST:event_labelKurangMouseClicked

    private void labelBeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBeliMouseClicked
        jumlah = labelJumlah.getText();
        String stok = labelStok.getText();
        totalHarga = labelTotalHarga.getText();
        int jumlahBeli,jumlahStok;
        
        if (jumlah.equals("0")){
            JOptionPane.showMessageDialog(null, "Harap membeli setidaknya 1 barang");
        }else if(status != 1){
            JOptionPane.showMessageDialog(null, "Harap pilih kemasan");
        }else{
            //rubah total harga menjadi integer
            String cleanedStrHarga = totalHarga.replaceAll("[^\\d]", "");

            int amountIntHarga = 0;
            try {
                NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
                Number number = format.parse(cleanedStrHarga);
                amountIntHarga = number.intValue()/100;
            }catch (ParseException e) {
                e.printStackTrace();
            }
            if (saldo - amountIntHarga >= 0 ){
                int saldoSekarang = saldo - amountIntHarga;
//                JOptionPane.showMessageDialog(null, "Pembelian berhasil");
                labelJumlah.setText("0");
                jumlahBeli = Integer.parseInt(jumlah);
            

                jumlahStok = Integer.parseInt(stok) - jumlahBeli;
//                labelStok.setText(String.valueOf(jumlahStok));
//                labelStok2.setText(String.valueOf(jumlahStok));

                labelTotalHarga.setText("Rp. 0");
            
                //AGAR KETIKA BELI SEMUA KEMASAN NON CHOISE
                panelPlastik.setBackground(Color.WHITE);
                panelKardus.setBackground(Color.WHITE);
                panelKayu.setBackground(Color.WHITE);
            
                //UPDATE STOK
                try {
                    st = cn.createStatement();

                    String sql = "UPDATE product SET stok = " + jumlahStok + " WHERE nama = '" + namaProduct + "' AND toko = '" + toko + "'";
                    int rs = st.executeUpdate(sql);

                    if (rs > 0 ){
                        System.out.println("Data berhasil diperbarui!");
                    }else{
                        System.out.println("Tidak ada perubahan dalam database.");

                    }
                } catch (Exception e) {
                }
                
                //UPDATE SALDO
                try {
                    st = cn.createStatement();

                    String sql = "UPDATE biodata SET saldo = " + saldoSekarang + " WHERE email = '" + email + "'";
                    int rs = st.executeUpdate(sql);
                } catch (Exception e) {
                }
                
                //UPDATE SALDO SELLER
                try {
                    int saldoSeller = 0;
                    st = cn.createStatement();
                    String sql = "SELECT * FROM  seller WHERE toko = '"+toko+"'";
                    rs = st.executeQuery(sql);
                    if (rs.next()){
                        saldoSeller = rs.getInt("saldo");
                    }
                    saldoSeller+=amountIntHarga;
                    try {
                        st = cn.createStatement();

                        String sql2 = "UPDATE seller SET saldo = " + saldoSeller + " WHERE toko = '" + toko + "'";
                        int rs = st.executeUpdate(sql2);
                    } catch (Exception e) {
                    }
                    
                } catch (Exception e) {
                }
                
                DetailPembelian dp = new DetailPembelian();
                dp.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Saldo Tidak cukup"); 
                this.dispose();
                HomePage hp = new HomePage();   
                hp.setVisible(true);
            }
            
            
            


        }
    }//GEN-LAST:event_labelBeliMouseClicked

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private desain.FPanel fPanel1;
    private desain.FPanel fPanel10;
    private desain.FPanel fPanel2;
    private desain.FPanel fPanel5;
    private desain.FPanel fPanel6;
    private desain.FPanel fPanel8;
    private desain.FPanel fPanel9;
    private desain.FPanelGarisKuning fPanelGarisKuning4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelBeli;
    private javax.swing.JLabel labelDeskripsi;
    private javax.swing.JLabel labelFoto;
    private desain.ImageAvatar labelFotoSeller;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelHarga2;
    private javax.swing.JLabel labelJumlah;
    private javax.swing.JLabel labelKardus;
    private javax.swing.JLabel labelKategori;
    private javax.swing.JLabel labelKayu;
    private javax.swing.JLabel labelKurang;
    private javax.swing.JLabel labelNamaProduct;
    private javax.swing.JLabel labelPlastik;
    private javax.swing.JLabel labelStok;
    private javax.swing.JLabel labelStok2;
    private javax.swing.JLabel labelTambah;
    private javax.swing.JLabel labelToko;
    private javax.swing.JLabel labelTotalHarga;
    private desain.FPanelGarisKuning panelKardus;
    private desain.FPanelGarisKuning panelKayu;
    private desain.FPanelGarisKuning panelPlastik;
    // End of variables declaration//GEN-END:variables

    private Color Color(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
