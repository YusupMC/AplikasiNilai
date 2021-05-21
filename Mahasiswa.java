/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
     private final String nim, nama, alamat, mataKuliah;
    private final double nilaiAkhir;
    
    public Mahasiswa (String nim, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public String getNim() {
        return nim;
    }    
    public String getNama() {
        return nama;
    }    
    public String getAlamat() {
        return alamat;
    }    
    public String getMataKuliah() {
        return mataKuliah;
    }    
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
}
