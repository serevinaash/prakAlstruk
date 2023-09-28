class Overload {
    void demo(int a) {
        System.out.println("a: " + a);
    }

    void demo(int a, int b) {
        System.out.println("a and b: " + a + ", " + b);
    }

    double demo(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.demo(10);
        overload.demo(10, 20);
        double result = overload.demo(5.5);
        System.out.println("Result: " + result);
    }
}
