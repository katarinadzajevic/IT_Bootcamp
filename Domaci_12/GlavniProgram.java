import java.util.Scanner;

public class GlavniProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zgrada z1 = new Zgrada();
        z1.setAdresa("Maticanska 38");
        System.out.println("Adresa: "+ z1.getAdresa());
        z1.setSpratnost(5);
        System.out.println("Spratnost: " + z1.getSpratnost());
        z1.setBrojStanova(5);
        System.out.println("Broj stanova: " + z1.getBrojStanova());
        String[] niz = new String[z1.getBrojStanova()];
        for (int i = 0; i < niz.length; i++) {
            System.out.println("Unesite prezimena stanara: ");
           niz[i] = sc.nextLine();
        }
        z1.setPrezimeStanara(niz);
        System.out.println("Prezimena stanara: " + z1.getPrezimeStanara());

        Zgrada z2 = new Zgrada();
        z2.setAdresa("Ustanicka 40");
        System.out.println("Adresa: "+ z2.getAdresa());
        z2.setSpratnost(3);
        System.out.println("Spratnost: " + z2.getSpratnost());
        z2.setBrojStanova(2);
        System.out.println("Broj stanova: " + z2.getBrojStanova());
        String[] niz2 = new String[z2.getBrojStanova()];
        for (int i = 0; i < niz2.length; i++) {
            System.out.println("Unesite prezimena stanara: ");
            niz2[i] = sc.nextLine();
        }
        z2.setPrezimeStanara(niz2);
        System.out.println("Prezimena stanara: " + z2.getPrezimeStanara());
    }
}
