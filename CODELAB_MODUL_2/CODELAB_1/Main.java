package CODELAB_MODUL_2.CODELAB_1;

class Hewan {
    private String nama; // Atribut untuk menyimpan nama hewan
    private String jenis; // Atribut untuk menyimpan jenis hewan
    private String suara; // Atribut untuk menyimpan suara hewan

    // Konstruktor untuk menginisialisasi atribut
    public Hewan(String nama, String jenis, String suara) {
        this.nama = nama; // Mengisi nama hewan
        this.jenis = jenis; // Mengisi jenis hewan
        this.suara = suara; // Mengisi suara hewan
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama); // Menampilkan nama hewan
        System.out.println("Jenis: " + jenis); // Menampilkan jenis hewan
        System.out.println("Suara: " + suara); // Menampilkan suara hewan
    }
}

// Kelas utama dengan metode main
public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan1 dan hewan2
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~"); // objek hewan1
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!"); // objek hewan2

        // Memanggil metode tampilkanInfo untuk setiap objek
        hewan1.tampilkanInfo(); // Menampilkan informasi hewan1
        System.out.println(); // Baris kosong untuk pemisah
        hewan2.tampilkanInfo(); // Menampilkan informasi hewan2
    }
}