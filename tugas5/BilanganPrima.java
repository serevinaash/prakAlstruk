import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        boolean isPrima = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt();

        if (bil == 2) {
            isPrima = true;
        } else {
            for (int i = 2; i < bil; i++) {
                if (bil % i == 0) {
                    isPrima = false;
                    break;
                } else {
                    isPrima = true;
                }
            }
        }

        if (isPrima) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }

        input.close();
    }
}
