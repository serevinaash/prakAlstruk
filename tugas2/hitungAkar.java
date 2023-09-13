import java.util.Scanner;

public class hitungAkar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai A:");
        double A = input.nextDouble();

        System.out.println("Masukkan nilai B:");
        double B = input.nextDouble();

        System.out.println("Masukkan nilai C:");
        double C = input.nextDouble();

        double D = B * B - 4 * A * C;

        if (D < 0) {
            System.out.println("Akar imajiner.");
        } else if (D == 0) {
            double X1 = -B / (2 * A);
            System.out.println("Akar tunggal: X1 = " + X1);
        } else {
            double X1 = (-B + Math.sqrt(D)) / (2 * A);
            double X2 = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("Akar-akar: X1 = " + X1 + ", X2 = " + X2);
        }
    }
}