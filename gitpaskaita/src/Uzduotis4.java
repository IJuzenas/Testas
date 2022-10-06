import java.util.Scanner;

public class Uzduotis4 {
    public static void main(String[] args) {
        double d1 = m1();
        double d2 = m2();
        System.out.println("Kintamųjų suma: " + (d1 + d2));
    }




    private static double m1() {
        double d1 = 61.75 * 2;
        return d1;
    }
    private static double m2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite skaiciu: ");
        double b = scanner.nextDouble();
        scanner.close();
        double d2 = b*2;
        return d2;
    }
}
