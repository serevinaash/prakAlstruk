import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        String kata = input.nextLine();
        input.close();

        if (kataPalindrome(kata)) {
            System.out.println("Kata adalah palindrome.");
        } else {
            System.out.println("Kata bukan palindrome.");
        }
    }

    static boolean kataPalindrome(String kata) {
        int left = 0;
        int right = kata.length() - 1;

        while (left < right) {
            if (kata.charAt(left) != kata.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
