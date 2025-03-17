package CODELAB_MODUL_2.CODELAB_2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1 dan rekening2
        RekeningBank rekening1 = new RekeningBank("202410370110264", "Azril", 7000000); // objek rekening1
        RekeningBank rekening2 = new RekeningBank("202410370110225", "Farhan", 1000000); // objek rekening2

        // Menampilkan informasi rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi
        rekening1.setorUang(2000000); // Menyetor ke rekening1
        rekening1.tarikUang(800000); // Menarik dari rekening1

        rekening2.setorUang(5000000); // Menyetor ke rekening2
        rekening2.tarikUang(300000); // Menarik dari rekening2
    }
}
