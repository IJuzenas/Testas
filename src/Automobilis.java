public class Automobilis extends TransportoPriemone {
    KuroTipas kuras = KuroTipas.BENZINAS;
    double variklioTuris = 1300;
    int cilindruSkaicius = 12;

    public Automobilis() {
        super(4, "juoda");
    }

    public Automobilis(int ratuSkaicius, String spalva, KuroTipas kuras, double variklioTuris, int cilindruSkaicius) {
        super(ratuSkaicius, spalva);
        this.kuras = kuras;
        this.variklioTuris = variklioTuris;
        this.cilindruSkaicius = cilindruSkaicius;

    }

    @Override
    public void spausdinti() {
        System.out.println(" ");
        super.spausdinti();
        System.out.println(getClass().getCanonicalName());
        System.out.println("Kuras: " + kuras);
        System.out.println("Variklio tūris " + variklioTuris);
        System.out.println("Cilindrų sk: " + cilindruSkaicius);
    }
}