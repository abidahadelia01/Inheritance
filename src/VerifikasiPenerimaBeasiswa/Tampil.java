/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerifikasiPenerimaBeasiswa;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Tampil {
    public static void main(String[] args) {
        VerifikasiBerkas i=new VerifikasiBerkas();
        Scanner scan=new Scanner(System.in);
        System.out.println("----Penerima Beasiswa Djarum Kategori SMK----");
        System.out.println("Nama Siswa: ");
        String nama=scan.nextLine();
        System.out.println("Jenis Kelamin: ");
        String jk=scan.nextLine();
        System.out.println("Nomor Induk Siswa Nasional: ");
        String nomorIndukSiswaNasional=scan.nextLine();
        System.out.println("Prestasi yang pernah diraih: ");
        String prestasi=scan.nextLine();
        System.out.println("Rerata nilai rapor kelas 10: ");
        int reratanilairapor=scan.nextInt();
        i.StatusSekarang();
        System.out.println("Proses seleksi akademik (rapor dan prestasi non akademik) lulus ");
        System.out.println("Selamat anda mendapatkan beasiswa djarum berupa uang tunai sebesar Rp "+i.Prestasi(5000000));
        System.out.println("dan mendapatkan bonus beasiswa berupa voucher gramedia sebesar: "+i.Prestasi(50)+"%");
         
    }
}
