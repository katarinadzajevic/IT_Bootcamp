import java.util.Arrays;
import java.util.Scanner;

//Napraviti program u kom su upisani ime i godine nekoliko osoba (minimum 3).
// Kada korisnik programa unosi imena osoba pri svakom unosu treba da izbaci njihove godine
// i poredja od najmladje do najstarije osobe.

public class Zadatak_1 {
    public static void main(String[] args) {
        String[] array = {"Nikola-22", "Petar-33", "Milan-24", "Marko-19", "Slavko-25"};
        String[] sortedArray = new String[5];
        int[] years = new int[5];


        Scanner sc = new Scanner(System.in);
        String ime;

        System.out.println("Unesite ime osobe, za prekid unosa ukucajte 'stop':");
        while(!(ime = sc.nextLine()).equals("stop")) {
            for (int i = 0; i < array.length; i++) {
                if (ime.equals(array[i].split("-")[0])) {
                    System.out.println(ime + " ima: " + array[i].split("-")[1]);
                }
                years[i] = Integer.valueOf(array[i].split("-")[1]);
            }
        }

        Arrays.sort(years);

        for (int i = 0; i < years.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (Integer.valueOf(array[j].split("-")[1]) == years[i]) {
                    sortedArray[i] = array[j].split("-")[0];
                }
            }
        }
        System.out.println("Osobe poredjane od najmladjeg do najstarijeg: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
    }

}