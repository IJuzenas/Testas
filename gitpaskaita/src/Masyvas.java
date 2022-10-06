import java.util.Scanner;

public class Masyvas {
    public static void main(String[] args) {
        String [] dienos = {"Pirmadienis", "Antradienis", "Treciadienis", "Ketvirtadienis", "Penktadienis", "Sestadienis", "Sekmadienis"};
        int dydis = dienos.length;
        System.out.println("Masyvo dienos dydis : " + dydis);
        String paskutinis = dienos[dienos.length-1];
        System.out.println("Paskutinis masyvo elementas: " + paskutinis);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite skaiciu nuo 1 iki 7");
        int i = scanner.nextInt();
        String pasirinktasElementas = dienos[i];
        System.out.println("Pasirinkta diena: " + pasirinktasElementas);
    }
}
