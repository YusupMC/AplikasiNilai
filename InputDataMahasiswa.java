/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listMahasiswa;
    
    public InputDataMahasiswa() {
        listMahasiswa = new ArrayList();
    }
    
    public void insertData(String nim, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, mataKuliah, nilaiAkhir);
        listMahasiswa.add(mahasiswa);
    }
    
    public ArrayList<Mahasiswa> getALL() {
        return listMahasiswa;
    }
    
    public void deleteData(int index) {
        listMahasiswa.remove(index);
    }   
    
}
