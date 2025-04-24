package Codelab.Modul_4.com.praktikum.users;

import Codelab.Modul_4.com.praktikum.actions.AdminActions;
import Codelab.Modul_4.com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions, AdminActions {
    public Mahasiswa(String username, String password) {
        super(username, password);
    }

    @Override
    public void reportItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String nama = sc.nextLine();
        System.out.print("Deskripsi: ");
        String deskripsi = sc.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = sc.nextLine();

        System.out.println("\nLaporan berhasil dibuat:");
        System.out.println("Baju: " + nama);
        System.out.println("Kain: " + deskripsi);
        System.out.println("Lemari: " + lokasi);
    }

    @Override
    public void viewReportedItems() {
        System.out.println("=> Fitur Lihat Laporan Belum Tersedia <=");
    }

    @Override
    public void displayAppMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Laporan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: reportItem(); break;
                case 2: viewReportedItems(); break;
            }
        } while (choice != 0);
    }

    @Override
    public void manageItems() {
        System.out.println("=> Fitur Kelola Mahasiswa Tersedia Hanya Untuk Admin<=");
    }

    @Override
    public void manageUsers() {
        System.out.println("=> Fitur Kelola Mahasiswa Tersedia Hanya Untuk Admin<=");
    }
}
