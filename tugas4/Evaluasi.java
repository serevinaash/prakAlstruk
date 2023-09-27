import java.util.Scanner;

public class Evaluasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahGagal = 0;

        for (int counterSiswa = 1; counterSiswa <= 8; counterSiswa++) {
            System.out.print("Masukkan Hasil Ujian (1 = lulus atau 2 = gagal): ");
            int hasil = input.nextInt();

            if (hasil == 1) {
                jumlahLulus++;
            } else if (hasil == 2) {
                jumlahGagal++;
            } else {
                System.out.println("Input tidak valid, masukkan 1 atau 2.");
                counterSiswa--; // Mengurangi counter jika input tidak valid.
            }
        }

        System.out.printf("Lulus: %d\nGagal: %d\n", jumlahLulus, jumlahGagal);

        if (jumlahLulus > 4) {
            System.out.println("Kursus telah berhasil!");
        } else {
            System.out.println("Kursus tidak berhasil");
        }

        input.close(); // Menutup scanner.
    }
}
