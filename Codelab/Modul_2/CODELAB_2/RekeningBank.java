package CODELAB_MODUL_2.CODELAB_2;

public class RekeningBank {
    private String nomorRekening; // Atribut untuk menyimpan nomor rekening
    private String namaPemilik; // Atribut untuk menyimpan nama pemilik rekening
    private double saldo; // Atribut untuk menyimpan saldo

    // Konstruktor untuk inisialisasi atribut
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening; // Mengisi nomor rekening
        this.namaPemilik = namaPemilik; // Mengisi nama pemilik
        this.saldo = saldo; // Mengisi saldo
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening); // Menampilkan nomor rekening
        System.out.println("Nama Pemilik: " + namaPemilik); // Menampilkan nama pemilik
        System.out.println("Saldo: Rp" + saldo); // Menampilkan saldo
    }

    // Metode untuk menyetor uang
    public void setorUang(double jumlah) {
        saldo += jumlah; // Menambahkan jumlah ke saldo
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo); // Menampilkan informasi setoran
    }

    // Metode untuk menarik uang
    public void tarikUang(double jumlah) {
        if (jumlah <= saldo) { // Mengecek apakah saldo mencukupi
            saldo -= jumlah; // Mengurangi jumlah dari saldo
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". Saldo sekarang: Rp" + saldo); // Menampilkan informasi tarik
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo); // Informasi gagal
        }
    }
}

