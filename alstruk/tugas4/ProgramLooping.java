public class ProgramLooping {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int n = 1000; 

        while (a <= n && b <= n){
            double result = (Math.pow(a, 2) + Math.pow(b, 2) + 1) / (a * b);
            double finalResult = Math.round(result * 1000.0) / 1000.0;
            
            if (finalResult <= 2.0) {
                System.out.println("Hasil yang memenuhi kondisi ketika:" + " a = " + a + ", b = " + b + " dengan hasil " + finalResult + "\n");
            }
        
            a++;
            b++;
        }
       
    }
}
