/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerifikasiPenerimaBeasiswa;

/**
 *
 * @author ACER
 */
 public class VerifikasiBerkas extends Data{
    public String nama, jk;
    public int PendapatanBeasiswa;
    public int nomorIndukSiswaNasional;
    public int reratanilairapor;
    public int prestasi;
    //overriding
    public void IdentitasSiswa(){
        System.out.println("Nama Siswa: "+nama);
        System.out.println("Jenis Kelamin: "+jk);
        System.out.println("Nomor Induk Siswa Nasional: "+nomorIndukSiswaNasional);
        System.out.println("Rerata nilai rapor kelas 10: "+reratanilairapor);
        System.out.println("Prestasi yang pernah diraih: "+prestasi);
        
    }
    public void StatusSekarang(){
        System.out.println("Status Pelajar: "+super.siswa);
    }
    //overloading
    public int Prestasi(int pendapatanBeasiswa){
        this.PendapatanBeasiswa=pendapatanBeasiswa;
        return PendapatanBeasiswa;
    }
    public void Prestasi(double bonusBeasiswa){
        System.out.println("Bonus Beasiswa: "+bonusBeasiswa);
    }}   
    
    
    
    
    
    
    
    
    
    


