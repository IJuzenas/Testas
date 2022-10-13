public class Sunkvezimis extends Automobilis{
    double krovinioTalpa = 5000;
    double krovinioSvoris = 2500;



    public Sunkvezimis() {
        super(4, "melyna", KuroTipas.BENZAS_DUJOS, 2500, 24);
        double krovinioTalpa;
        double krovinioSvoris;
    }


    @Override
    public void spausdinti() {
        System.out.println(" ");
        super.spausdinti();
        System.out.println(getClass().getCanonicalName());
        System.out.println("Krovinio talpa: " + krovinioTalpa + " Krovinio svoris: " + krovinioSvoris);
    }
}
