import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;


/**
 * Kelas Main adalah program sederhana untuk melakukan operasi matematika dasar.
 * Program ini meminta pengguna memasukkan dua angka dan memilih operasi yang ingin dilakukan.
 * Kemudian, program akan menghitung hasilnya dan menampilkannya.
 **/
public class Main {
    /**
     * Metode utama yang akan dijalankan saat program dimulai.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil masukan dari pengguna
        Scanner scanner = new Scanner(in);

        // Meminta pengguna memasukkan angka pertama
        out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();

        // Meminta pengguna memasukkan angka kedua
        out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();

        // Menampilkan pilihan operasi yang tersedia
        out.println("Operasi yang tersedia:");
        out.println("1. Penjumlahan (+)");
        out.println("2. Pengurangan (-)");
        out.println("3. Perkalian (*)");
        out.print("Pilih operasi (1/2/3): ");
        int pilihan = scanner.nextInt();

        double hasil;

        // Melakukan operasi sesuai dengan pilihan pengguna
        if (pilihan == 1) {
            hasil = angkaPertama + angkaKedua;
            out.println("Hasil penjumlahan: " + hasil);
        } else if (pilihan == 2) {
            hasil = angkaPertama - angkaKedua;
            out.println("Hasil pengurangan: " + hasil);
        } else if (pilihan == 3) {
            hasil = angkaPertama * angkaKedua;
            out.println("Hasil perkalian: " + hasil);
        } else {
            out.println("Operasi tidak valid. Pilih 1, 2, atau 3.");
        }

        // Menutup objek Scanner untuk menghindari kebocoran sumber daya
        scanner.close();
    }
}
