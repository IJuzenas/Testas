public class Dviratis extends TransportoPriemone{
    int pavaruSkaicius;

    public Dviratis() {
        super(2, "geltona");
        this.pavaruSkaicius = 21;

    }

    @Override
    public void spausdinti() {
        System.out.println(" ");
        super.spausdinti();
        System.out.println(getClass().getCanonicalName());
        System.out.println("Pavarų sk: " + pavaruSkaicius);
    }
}
