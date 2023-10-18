import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Mahasiswa {
    String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

public class ProgramBimbinganTA {
    public static void main(String[] args) {
        Queue<Mahasiswa> antrianBimbingan = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Mulai Bimbingan");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Untuk mengonsumsi newline setelah mengambil angka

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = scanner.nextLine();
                    Mahasiswa mahasiswa = new Mahasiswa(nama);
                    antrianBimbingan.add(mahasiswa);
                    System.out.println(nama + " telah ditambahkan ke antrian bimbingan.");
                    break;
                case 2:
                    Mahasiswa mahasiswaBerikutnya = antrianBimbingan.poll();
                    if (mahasiswaBerikutnya != null) {
                        System.out.println("Sedang melakukan bimbingan untuk mahasiswa: " + mahasiswaBerikutnya.getNama());
                    } else {
                        System.out.println("Antrian bimbingan kosong.");
                    }
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    break;
            }
        }
    }
}
