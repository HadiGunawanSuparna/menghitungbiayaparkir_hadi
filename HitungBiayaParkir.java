import java.util.Scanner;

public class HitungBiayaParkir {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

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

        // Menampilkan biaya parkir
        System.out.println("Biaya Parkir = " + biayaParkir);

        // Menutup objek Scanner
        input.close();
    }
}
