import java.util.Scanner;

public class PolymorphismExample {
    // Metode overload dengan satu parameter
    public void printMessage(String message) {
        System.out.println("Pesan: " + message);
    }

    // Metode overload dengan dua parameter
    public void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Pesan " + (i + 1) + ": " + message);
        }
    }

    public static void main(String[] args) {
        PolymorphismExample example = new PolymorphismExample();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan pesan: ");
        String message = scanner.nextLine();
        example.printMessage(message);

        System.out.print("Masukkan pesan yang akan diulang: ");
        message = scanner.nextLine();
        System.out.print("Masukkan jumlah pengulangan: ");
        int times = scanner.nextInt();
        example.printMessage(message, times);

        scanner.close();
    }
}
