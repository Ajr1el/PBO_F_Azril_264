package Codelab.Modul_4.Perpustakaan;

import java.util.ArrayList;

public class Anggota implements Peminjaman {
    private String nama;
    private String id;
    private ArrayList<Buku> daftarPinjaman = new ArrayList<>();

    public Anggota(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public void pinjamBuku(Buku b) {
        daftarPinjaman.add(b);
        System.out.println(nama + " meminjam buku: " + b.judul);
    }

    // Overloading — pinjam lebih dari 1 buku sekaligus
    public void pinjamBuku(Buku b1, Buku b2) {
        pinjamBuku(b1);
        pinjamBuku(b2);
    }

    public void kembalikanBuku(Buku b) {
        daftarPinjaman.remove(b);
        System.out.println(nama + " mengembalikan buku: " + b.judul);
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama + " (ID: " + id + ")");
        System.out.println("Buku yang dipinjam:");
        for (Buku b : daftarPinjaman) {
            b.displayInfo();
        }
    }
}