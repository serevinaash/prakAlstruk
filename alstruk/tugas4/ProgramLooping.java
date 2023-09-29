public class ProgramLooping {
    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                double result = (Math.pow(a, 2) + Math.pow(b, 2) + 1) / (a * b);

                if (result > 1.0 && result < 2.0) {
                    System.out.println("Hasil yang memenuhi kondisi ditemukan:");
                    System.out.println("a = " + a + ", b = " + b);
                    System.out.println("(a^2 + b^2 + 1) / (a * b) = " + result);
                    System.out.println("------------------------------");
                }
            }
        }
    }
}
