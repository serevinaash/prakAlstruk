import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan warna lampu lalu lintas (MERAH/KUNING/HIJAU):");
        String warna = input.nextLine();

        if (warna.equalsIgnoreCase("MERAH")) {
            System.out.println("Berhenti!");
        } else if (warna.equalsIgnoreCase("KUNING")) {
            System.out.println("Hati-Hati!");
        } else if (warna.equalsIgnoreCase("HIJAU")) {
            System.out.println("Jalan!");
        } else {
            System.out.println("Warna salah");
        }
    }
}