/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program Menentukan Nilai Terbesar dan
 * Terkecil
 */
public class PBO210117070Latihan39NilaiTerbesarDanTerkecil {

    public static void main(String[] args) {
        String namaPetugas;
        int jmlhMahasiswa;

        Nilai result = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa :  ");
        jmlhMahasiswa = scn.nextInt();
        System.out.println();

        result.inputNilai(jmlhMahasiswa);
        System.out.println();
        result.tampilNilaiTerbesarTerkecil(jmlhMahasiswa);

        System.out.println("Nilai Terbesar : " + result.max);
        System.out.println("Nilai Terkecil : " + result.min);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }

}
