import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //Napraviti program koji upisuje broj godina nekih osoba a posle 10 unosa,
        // program treba da izbaci koliko osoba ima od 18 do 50 godina a koliko ima mladjih od 18.

        Scanner sc = new Scanner(System.in);

        int counter1 = 0, counter2 = 0;
        int unos;

        int[] godine = new int[10];

        for (int i = 0; i < godine.length; i++) {
            System.out.println("Unesite broj godina: ");
            unos = sc.nextInt();
            if(unos>0){
                godine[i] = unos;
            }
            else{
                System.out.println("Pogresan unos!");
            }
        }
        for (int n : godine) {

            if (n >= 18 && n <= 50) {
                counter1++;
            } else if (n < 18) {
                counter2++;
            }

        }
        System.out.println("Broj osoba koje imaju izmedju 18 i 50 godina je: " + counter1);
        System.out.println("Broj osoba koje imaju manje od 18 godina je: " + counter2);


    }
}
