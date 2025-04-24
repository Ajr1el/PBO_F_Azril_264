package Codelab.Modul_4.com.praktikum.app;

import Codelab.Modul_4.com.praktikum.users.Admin;
import Codelab.Modul_4.com.praktikum.users.Mahasiswa;
import Codelab.Modul_4.com.praktikum.users.User;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih Login sebagai:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt(); sc.nextLine();

        User user = null;

        if (pilihan == 1) {
            user = new Admin("admin", "admin264");
        } else if (pilihan == 2) {
            user = new Mahasiswa("mhs", "mhs264");
        } else {
            System.out.println("Pilihan tidak valid.");
            System.exit(0);
        }

        user.displayAppMenu();
        System.out.println("\nTerima kasih, Anda telah logout.");
    }
}
