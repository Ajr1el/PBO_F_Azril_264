package Codelab.Modul_2.TUGAS;

import java.util.Scanner;
class Admin {
    String username;
    String password;

    public boolean login(String inputUsername, String inputPassword){
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

class Mahasiswa {
    String nama;
    String nim;

    public boolean login(String inputNama, String inputNim){
        return nama.equals(inputNama) && nim.equals(inputNim);
    }

    public void displayInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        admin.username = "Admin264";
        admin.password = "Password264";
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Ajril";
        mahasiswa.nim = "202410370110264";

        System.out.println("Pilih Menu Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan != 1 && pilihan != 2) {
            System.out.println("Inputan tidak valid. mohon masukkan angka 1 atau 2");
        }

        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String inputuUername = input.nextLine();
            System.out.print("Masukkan Password: ");
            String inputPassword = input.nextLine();

            if (admin.login(inputuUername, inputPassword)) {
                System.out.println("Login Berhasil Sebagai Admin");
            } else {
                System.out.println("Login gagal username atau password salah");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String inputuNama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String inputNim = input.nextLine();

            if (mahasiswa.login(inputuNama, inputNim)){
                System.out.println("Login Berhasil Sebagai Mahasiswa");
                mahasiswa.displayInfo();
            }else {
                System.out.println("Login gagal nama atau nim salah");
            }
        }
    }
}