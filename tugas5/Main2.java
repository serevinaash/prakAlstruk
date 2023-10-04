import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Row: ");
        int row = input.nextInt();

        System.out.print("Masukkan Col: ");
        int col = input.nextInt();

        System.out.print("Masukkan Batas: ");
        int batas = input.nextInt();

        input.close();
        
        cetakSegitigaSiku(1, 1, row); 
    }

    static void cetakSegitigaSiku(int row, int col, int batas) {
        if (row <= batas) {
            if (col <= row) {
                System.out.print("* ");
                cetakSegitigaSiku(row, col + 1, batas);
            } else {
                System.out.println();
                cetakSegitigaSiku(row + 1, 1, batas);
            }
        }
    }
}
