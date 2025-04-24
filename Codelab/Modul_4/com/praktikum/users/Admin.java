package Codelab.Modul_4.com.praktikum.users;

import Codelab.Modul_4.com.praktikum.actions.AdminActions;
import java.util.Scanner;

public class Admin extends User implements AdminActions {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void manageItems() {
        System.out.println("=> Fitur Kelola Laporan Barang Belum Tersedia <=");
    }

    @Override
    public void manageUsers() {
        System.out.println("=> Fitur Kelola Mahasiswa Belum Tersedia <=");
    }

    @Override
    public void displayAppMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1: manageItems(); break;
                case 2: manageUsers(); break;
            }
        } while (choice != 0);
    }
}