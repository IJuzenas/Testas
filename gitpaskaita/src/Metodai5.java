public class Metodai5 {
    public static void main(String[] args) {
        int pirmas = -19;
        int antras = 40;
        darbas(pirmas, antras);
    }

    private static void darbas(int pirmas, int antras) {
        int rezultatas1 = pirmas + antras;
        System.out.println("Sudetis : " + rezultatas1);
        int rezultatas2 = pirmas - antras;
        System.out.println("Atimtis: " + rezultatas2);
        int rezultatas3 = pirmas * antras;
        System.out.println("Daugyba: " + rezultatas3);
        int rezultatas4 = pirmas / antras;
        System.out.println("Dalyba be liekanos: " + rezultatas4);
        int rezultatas5 = pirmas % antras;
        System.out.println("Dalyba su liekana: " + rezultatas5);
        System.out.println("-----------------------------------");
        System.out.println("-19 + 40 = " + (-19 + 40));
        System.out.println("-19 - 40 = " + (-19 - 40));
        System.out.println("-19 * 40 = " + (-19*40));
        System.out.println("-19 / 40 = " + (-19/40));
        System.out.println("-19 % 40 = " + (-19%40));
    }
}
