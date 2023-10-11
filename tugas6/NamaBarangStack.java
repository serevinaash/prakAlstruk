import java.util.Scanner;
import java.util.Stack;

public class NamaBarangStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Nama Barang");
            System.out.println("2. Ambil Nama Barang Teratas");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.nextLine();
                    stack.push(namaBarang);
                    System.out.println("Nama barang '" + namaBarang + "' ditambahkan ke dalam stack.");
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        String topNamaBarang = stack.pop();
                        System.out.println("Nama barang teratas yang diambil: " + topNamaBarang);
                    } else {
                        System.out.println("Stack kosong. Tidak ada nama barang untuk diambil.");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi yang benar.");
            }
        }
    }
}
