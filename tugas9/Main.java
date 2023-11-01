import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline

        // Input nama-nama mahasiswa
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();
        }

        // Mengurutkan nama-nama mahasiswa
        Arrays.sort(namaMahasiswa);

        // Menampilkan nama-nama mahasiswa yang telah diurutkan
        System.out.println("Nama-nama mahasiswa setelah diurutkan:");
        for (String nama : namaMahasiswa) {
            System.out.println(nama);
        }

        // Input nama yang akan dicari
        System.out.print("Masukkan nama yang ingin dicari: ");
        String namaCari = scanner.nextLine();

        // Mencari nama mahasiswa
        boolean ditemukan = false;
        for (String nama : namaMahasiswa) {
            if (nama.equalsIgnoreCase(namaCari)) {
                System.out.println("Nama " + namaCari + " ditemukan dalam daftar mahasiswa.");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nama " + namaCari + " tidak ditemukan dalam daftar mahasiswa.");
        }

        scanner.close();
    }
}
