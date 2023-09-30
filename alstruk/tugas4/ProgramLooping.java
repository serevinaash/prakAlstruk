public class ProgramLooping {
    public static void main(String[] args) {
        // for (int a = 1; a < 10; a++) {
        //     for (int b = a + 1; b < 10; b++) {
        //         double result = (Math.pow(a, 2) + Math.pow(b, 2) + 1) / (a * b);

        //         System.out.println("Hasil yang memenuhi kondisi ditemukan:");
        //         if (result > 1.0 && result < 2.0) {
        //             System.out.println("a = " + a + ", b = " + b);
        //             System.out.println("(a^2 + b^2 + 1) / (a * b) = " + result);
        //             System.out.println("------------------------------");
        //         }
        //     }
        // }
        int a = 1, b = 2;
        int n = 100; // Ganti ke 1000

        while (a <= n && b <= n){
            double result = (Math.pow(a, 2) + Math.pow(b, 2) + 1) / (a * b);
            double finalResult = Math.round(result * 100.0) / 100.0;
            
            if (finalResult <= 2.0) {
                System.out.println("Hasil yang memenuhi kondisi ketika:" + " a = " + a + ", b = " + b + " dengan hasil " + finalResult + "\n");
                // System.out.println("(a^2 + b^2 + 1) / (a * b) = " + finalResult);
                // System.out.println("------------------------------");
            }
        
            a++;
            b++;
        }
       
    }
}
