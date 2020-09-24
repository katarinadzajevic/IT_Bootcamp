import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);


        Student s1 = new Student("Milos Peric", "25");
        System.out.println("Ime i prezime: " + s1.getImePrezime());
        System.out.println("Broj indexa: " + s1.getIndex());
        s1.setSmer("opsta ekonomija");
        System.out.println("Smer: "+s1.getSmer());
        System.out.println("Unesi rezultat ispita");
        int rezultatIspita = s.nextInt();
        s1.setRezultatIspita(rezultatIspita);
        System.out.println("Rezultat ispita je: " + s1.getRezultatIspita() + "%");


        Student s2 = new Student("Nebojsa Petrovic", "30");
        System.out.println("Ime i prezime: " + s2.getImePrezime());
        System.out.println("Broj indexa: " + s2.getIndex());
        s2.setSmer("medicina");
        System.out.println("Smer: "+s2.getSmer());
        System.out.println("Unesi rezultat ispita");
        int rezultatIspita2 = s.nextInt();
        s2.setRezultatIspita(rezultatIspita2);
        System.out.println("Rezultat ispita je: " + s2.getRezultatIspita() + "%");

        List<Student> studenti = new ArrayList<>();
        studenti.add(s1);
        studenti.add(s2);

        System.out.println("Informacije o studentu na osnovu unosa indexa: ");
        System.out.println("Unesi broj indexa: ");
        String brIndexa = sc.nextLine();
        for (Student a: studenti) {
            if (brIndexa.equals(a.getIndex())){
                System.out.println(a.info() + "%");
            }

        }
    }
}
