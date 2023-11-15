import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> mahasiswaSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama mahasiswa (atau ketik 'selesai' untuk keluar): ");
            String namaMahasiswa = scanner.nextLine();

            if (namaMahasiswa.equalsIgnoreCase("selesai")) {
                break;
            }

            mahasiswaSet.add(namaMahasiswa);
        }

        System.out.println("Daftar Mahasiswa yang telah di urutkan:");
        for (String nama : mahasiswaSet) {
            System.out.println(nama);
        }

        scanner.close();
    }
}
