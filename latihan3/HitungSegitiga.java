import java.util.Scanner;

public class HitungSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai alas: ");
        double var_alas = scanner.nextDouble();

        System.out.print("Masukkan nilai tinggi: ");
        double var_tinggi = scanner.nextDouble();

        double rumus_luas = (var_alas * var_tinggi) / 2.0;
        System.out.println("Luas Segitiga: " + rumus_luas);

        scanner.close();
    }
}
