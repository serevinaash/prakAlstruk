import java.util.Hashtable;
import java.util.Scanner;

public class KamusInformatika {
    public static void main(String[] args) {
        // Membuat Hashtable untuk menyimpan istilah dan artinya
        Hashtable<String, String> kamus = new Hashtable<>();
        
        // Memasukkan istilah dan artinya ke dalam kamus
        kamus.put("Algoritma", "Sebuah kumpulan aturan yang harus diikuti dalam perhitungan atau operasi pemecahan masalah, terutama oleh komputer.");
        kamus.put("Basis Data", "Sebuah kumpulan data terstruktur yang disimpan di dalam komputer, terutama yang dapat diakses dalam berbagai cara.");
        kamus.put("Pemrograman", "Proses menulis program komputer menggunakan bahasa pemrograman tertentu.");
        kamus.put("Java", "Bahasa pemrograman populer, khususnya untuk membuat aplikasi web dan platform.");
        kamus.put("Jaringan", "Sebuah grup komputer yang saling terhubung dan berkomunikasi satu sama lain.");
        kamus.put("Enkripsi", "Proses mengubah informasi menjadi kode untuk mencegah akses tanpa izin.");
        kamus.put("Kecerdasan Buatan", "Simulasi dari proses kecerdasan manusia oleh mesin, khususnya sistem komputer.");
        kamus.put("HTML", "HyperText Markup Language yang digunakan untuk membuat dan struktur halaman web.");
        kamus.put("Sistem Operasi", "Perangkat lunak yang mengelola perangkat keras komputer dan menyediakan layanan umum untuk program komputer.");
        kamus.put("Debugging", "Proses mencari dan memperbaiki cacat atau masalah dalam sebuah program komputer.");

        // Menampilkan daftar istilah informatika yang tersedia
        System.out.println("Daftar Istilah Informatika:");
        for (String istilah : kamus.keySet()) {
            System.out.println("- " + istilah);
        }
        
        // Meminta pengguna untuk memasukkan istilah yang ingin dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan istilah yang ingin Anda cari: ");
        String istilahDicari = scanner.nextLine();

        // Mencari dan menampilkan arti dari istilah yang dimasukkan pengguna
        if (kamus.containsKey(istilahDicari)) {
            System.out.println("\nArti dari \"" + istilahDicari + "\":");
            System.out.println(kamus.get(istilahDicari));
        } else {
            System.out.println("\nMaaf, istilah \"" + istilahDicari + "\" tidak ditemukan dalam kamus.");
        }
        
        scanner.close();
    }
}
