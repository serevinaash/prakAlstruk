import java.util.Scanner;

public class JavaApplication {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan Bilangan Faktorial: ");
    int bilangan = input.nextInt();

        int hasil = rekursif(bilangan);
        System.out.print("Hasil faktorial dari " + bilangan + " adalah: " + hasil);

        input.close();
    }

  public static int rekursif(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n* rekursif(n-1);  
        }
    }
}