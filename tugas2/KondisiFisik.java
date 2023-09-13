import java.util.Scanner;

public class KondisiFisik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celsius: ");
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