import java.util.Scanner;

public class JavaApplication2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Masukan Bilangan : ");
     int bilangan = input.nextInt();

        for (int i = 0; i < 10; i++) {
        int hasil = fiboRekursif(i);
           System.out.println("Hasil Bilangan Deret dari " +bilangan + " adalah : "+ hasil);
        }
        input.close();
    }
 
    public static Integer fiboRekursif(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fiboRekursif(n - 1) + fiboRekursif(n - 2);
    }
}