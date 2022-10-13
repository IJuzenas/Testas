public class TransportoPriemone {
    int ratuSkaicius= 0;
    String spalva = "nezinoma";

    public TransportoPriemone(int ratuSkaicius, String spalva) {
         this.ratuSkaicius = ratuSkaicius;
         this. spalva = spalva;
    }

    public TransportoPriemone() {

    }


    public void spausdinti() {
        System.out.println(getClass().getCanonicalName());
        System.out.println("Tp savybės = Ratų sk: " + ratuSkaicius + ", spalva: " + spalva);

    }

}