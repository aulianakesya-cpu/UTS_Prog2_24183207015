# UTS_Prog2_24183207015

Repositori ini dibuat untuk memenuhi Ujian Tengah Semester (UTS) mata kuliah Pemrograman Berorientasi Objek 2.

## 👤 Identitas Mahasiswa

* *Nama:* **Aulia Nakesya**
* *NIM:* **24183207015**
* *Kelas:* **3A PTI**

---

## 📜 Penjelasan Singkat Proyek

Proyek ini adalah program Java sederhana berbasis konsol untuk mengelola data mahasiswa. Program ini dibuat sesuai dengan "Ketentuan Teknis" dan "Ketentuan Pengumpulan" yang diberikan.

### 1. Class yang Digunakan

Proyek ini terdiri dari 2 class utama:

1.  **MainClass.java**
    * Ini adalah kelas utama (main class) yang berisi public static void main(String[] args).
    * Fungsinya adalah untuk menjalankan program dan menangani interaksi dengan pengguna melalui menu konsol sederhana (menggunakan Scanner).
    * Menu ini memiliki 3 opsi: Menambah data, Menampilkan semua data, dan Keluar.
    * Kelas ini juga menggunakan ArrayList<Mahasiswa> untuk menyimpan daftar objek mahasiswa yang telah dibuat.

2.  **Mahasiswa.java**
    * Ini adalah kelas data/objek (POJO - Plain Old Java Object) yang merepresentasikan entitas mahasiswa.
    * Fungsinya adalah sebagai cetak biru (blueprint) untuk objek mahasiswa.

### 2. Atribut pada Class Mahasiswa

Class Mahasiswa memiliki 2 atribut (variabel global/instance variable) yang dienkapsulasi (menggunakan private):

* **private String nim;**
    * Digunakan untuk menyimpan data NIM (Nomor Induk Mahasiswa).
* **private String nama;**
    * Digunakan untuk menyimpan data nama lengkap mahasiswa.

Kelas ini juga dilengkapi dengan:
* Dua *Konstruktor* (default dan berparameter).
* Method *Setter dan Getter* (setNim, getNim, setNama, getNama) untuk mengakses dan mengubah nilai atribut.
* Satu *Method tambahan* (tampilkanData()) untuk mencetak detail data mahasiswa ke konsol.
