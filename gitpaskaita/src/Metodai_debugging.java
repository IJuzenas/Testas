public class Metodai_debugging {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        System.out.println("Pirmas metodas");
        m2();
    }

    private static void m2() {
        System.out.println("Antras metodas");
        m3();
    }

    private static void m3() {
        System.out.println("Trecias metodas");
    }
}
