import java.util.Scanner;

public class UpahKaryawan {
    private String nama;
    private char golongan;
    private int upahPerJam;

    public UpahKaryawan(String nama, char golongan) {
        this.nama = nama;
        this.golongan = golongan;
    }

    public void hitungUpahPerJam() {
        if (golongan == 'A') {
            upahPerJam = 10000;
        } else if (golongan == 'B') {
            upahPerJam = 15000;
        } else if (golongan == 'C') {
            upahPerJam = 20000;
        } else if (golongan == 'D') {
            upahPerJam = 25000;
        } else {
            System.out.println("Golongan karyawan tidak valid");
        }
    }

    public void output() {
        System.out.println("Nama karyawan: " + nama);
        System.out.println("Upah per jam: " + upahPerJam);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan golongan karyawan (A, B, C, atau D): ");
        char golongan = scanner.next().charAt(0);

        UpahKaryawan karyawan = new UpahKaryawan(nama, golongan);
        karyawan.hitungUpahPerJam();
        karyawan.output();
    }
}
