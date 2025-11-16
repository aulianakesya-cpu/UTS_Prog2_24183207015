/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.mahasiswaa;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lenovo
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswaa> daftarMahasiswa = new ArrayList<>();

        int pilihan = 0;
        
        do {
            System.out.println("\n===== MENU DATA MAHASISWA =====");
            System.out.println("1. Menambah data");
            System.out.println("2. Menampilkan semua data");
            System.out.println("3. Keluar dari program");
            System.out.print("Masukkan pilihan Anda (1-3): ");
            

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data Mahasiswa ---");
                    
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();

                    
                    Mahasiswaa mhsBaru = new Mahasiswaa(nim, nama); 
                    
                   
                    daftarMahasiswa.add(mhsBaru); 
                    
                    System.out.println("Data Mahasiswa BERHASIL ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n--- Daftar Semua Data Mahasiswa ---");
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Belum ada data yang diinput.");
                    } else {
                        for (Mahasiswaa mhs : daftarMahasiswa) {
                            mhs.tampilkanData();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nTerima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak valid! Silakan coba lagi.");
                    break;
            }

        } while (pilihan != 3);
        
        input.close();
    }
}