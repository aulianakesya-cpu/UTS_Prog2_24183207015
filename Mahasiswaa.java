/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswaa;

/**
 *
 * @author Lenovo
 */
public class Mahasiswaa {
    private String nim;
    private String nama;

    public Mahasiswaa() {
        this.nim = "24183207015";
        this.nama = "Aulia Nakesya"; 
    }

 
    public Mahasiswaa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    public String getNama() {
        return this.nama;
    }

    public void tampilkanData() {
        System.out.println("NIM  : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("-------------------------");
    }
}
