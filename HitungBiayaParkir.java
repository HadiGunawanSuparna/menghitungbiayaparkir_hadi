import java.util.Scanner;

public class HitungBiayaParkir {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Pesan selamat datang
        System.out.println("Selamat datang di Parkiran Kami!");
        System.out.println("============================================");

        // Input jam masuk, jam keluar, dan biaya per jam
        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = input.nextInt();
        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = input.nextInt();
        System.out.print("Masukkan biaya per jam: ");
        int biayaPerjam = input.nextInt();

        // Menghitung lama parkir dalam jam
        int lamaParkir = jamKeluar - jamMasuk;

        // Menghitung biaya parkir
        int biayaParkir = lamaParkir * biayaPerjam;

        // Menampilkan hasil
        System.out.println("============================================");
        System.out.println("Lama Parkir: " + lamaParkir + " jam");
        System.out.println("Biaya Parkir: Rp " + biayaParkir);
        System.out.println("============================================");

        // Pesan terima kasih
        System.out.println("Terima kasih telah Berkunjung Ke Program Parkir @hadygunawan16 !");

        // Menutup objek Scanner
        input.close();
    }
}
