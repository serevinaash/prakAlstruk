import java.util.Scanner;

public class HitungAkar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menghitung akar-akar persamaan kuadrat
        System.out.println("Masukkan koefisien A: ");
        double A = input.nextDouble();
        System.out.println("Masukkan koefisien B: ");
        double B = input.nextDouble();
        System.out.println("Masukkan koefisien C: ");
        double C = input.nextDouble();

        double D = B * B - 4 * A * C;

        if (D < 0) {
            System.out.println("Akar-akar persamaan adalah akar imajiner.");
        } else if (D == 0) {
            double X1 = -B / (2 * A);
            System.out.println("Akar-akar persamaan adalah X1 = X2 = " + X1);
        } else {
            double X1 = (-B + Math.sqrt(D)) / (2 * A);
            double X2 = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("Akar-akar persamaan adalah X1 = " + X1 + " dan X2 = " + X2);
        }

        // Menentukan kondisi fisik berdasarkan suhu dalam Celsius
        System.out.println("Masukkan suhu dalam Celsius: ");
        double suhuCelsius = input.nextDouble();

        if (suhuCelsius < 0) {
            System.out.println("Kondisi fisik: Padat");
        } else if (suhuCelsius >= 0 && suhuCelsius <= 100) {
            System.out.println("Kondisi fisik: Cair");
        } else {
            System.out.println("Kondisi fisik: Gas");
        }
    }
}