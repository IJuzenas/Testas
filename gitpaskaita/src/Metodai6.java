public class Metodai6 {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;
        trikampis(a,b);
    }

    private static void trikampis(int a, double b) {
        double s = (a*b) / 2;
        double c = Math.sqrt(a*a + b*b);
        double p = a + b + c;
        System.out.println("Plotas = " + s);
        System.out.println("Perimetras = " + p);
    }
}
