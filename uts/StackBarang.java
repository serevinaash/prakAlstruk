import java.util.Stack;
import java.util.Scanner;

class Barang {
    String nama;

    public Barang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "Barang{" +
               "nama='" + nama + '\'' +
               '}';
    }
}

public class StackBarang {
    public static void main(String[] args) {
        Stack<Barang> stackBarang = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("Pilihan:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang Teratas");
            System.out.println("3. Lihat Barang Teratas");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Membaca newline setelah angka

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.nextLine();
                    stackBarang.push(new Barang(namaBarang));
                    System.out.println("Barang ditambahkan ke tumpukan.");
                    break;
                case 2:
                    if (!stackBarang.isEmpty()) {
                        Barang barangDihapus = stackBarang.pop();
                        System.out.println("Barang teratas (" + barangDihapus.getNama() + ") dihapus dari tumpukan.");
                    } else {
                        System.out.println("Tumpukan kosong.");
                    }
                    break;
                case 3:
                    if (!stackBarang.isEmpty()) {
                        Barang barangTeratas = stackBarang.peek();
                        System.out.println("Barang teratas: " + barangTeratas);
                    } else {
                        System.out.println("Tumpukan kosong.");
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
