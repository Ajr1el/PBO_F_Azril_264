package Codelab.Modul_4.App;

import Codelab.Modul_4.Perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Buat objek Fiksi dan NonFiksi
        Buku f1 = new Fiksi("Sang Petualang", "Ari Pratama", "Fiksi");
        Buku nf1 = new NonFiksi("Fisika Modern", "Dr. Yulia", "Nonfiksi");

        // Buat objek Anggota
        Anggota anggota1 = new Anggota("Andika", "264-0075");

        // Pinjam buku (menggunakan method pinjamBuku)
        anggota1.pinjamBuku(f1);
        anggota1.pinjamBuku(nf1);

        // Tampilkan informasi anggota dan daftar buku yang dipinjam
        anggota1.displayInfo();
    }
}
