import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama mahasiswa (atau ketik 'selesai' untuk keluar): ");
            String namaMahasiswa = scanner.nextLine();

            if (namaMahasiswa.equalsIgnoreCase("selesai")) {
                break;
            }

            mahasiswaList.add(namaMahasiswa);
        }

        System.out.println("Daftar Mahasiswa:");
        for (String nama : mahasiswaList) {
            System.out.println(nama);
        }

        scanner.close();
    }
}
