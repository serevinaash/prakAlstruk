import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tahun : ");

        try {
            int tahun = input.nextInt();

            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                System.out.println(tahun + " adalah tahun kabisat");
            } else {
                System.out.println(tahun + " bukan tahun kabisat");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Masukan tidak valid. Harap masukkan tahun dalam bentuk angka.");
        }
    }
}