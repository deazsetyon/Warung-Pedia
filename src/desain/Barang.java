/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desain;

/**
 *
 * @author deazs
 */
public class Barang {
    private String nama,kategori,dekripsi,foto,toko;
    private int harga,stok;

    public Barang(String nama, String kategori, String dekripsi, String foto, String toko, int harga, int stok) {
        this.nama = nama;
        this.kategori = kategori;
        this.dekripsi = dekripsi;
        this.foto = foto;
        this.toko = toko;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDekripsi() {
        return dekripsi;
    }

    public void setDekripsi(String dekripsi) {
        this.dekripsi = dekripsi;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getToko() {
        return toko;
    }

    public void setToko(String toko) {
        this.toko = toko;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
