import java.util.Scanner;

public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Masukkan Nilai Anda :");
            Float nilai = input.nextFloat();
            input.close();

            if (nilai>=85 && nilai<=100) {
                System.out.print("Nilai Anda Adalah A");
            } else if (nilai>=75 && nilai<=84) {
                System.out.print("Nilai Anda Adalah AB");
            } else if (nilai>=65 && nilai<=74) {
                System.out.println("Nilai Anda Adalah B");
            } else if (nilai>=50 && nilai<=64) {
                System.out.println("Nilai Anda Adalah BC");
            } else if (nilai>=39 && nilai<=49) {
                System.out.println("Nilai Anda Adalah C");
            } else if (nilai>=20 && nilai<=34) {
                System.out.println("Nilai Anda Adalah D");
            } else if (nilai>=0 && nilai<=19) {
                System.out.println("Nilai Anda Adalah E");
      }
    }
}
