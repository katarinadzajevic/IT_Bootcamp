package homework_4;

import java.util.Scanner;

public class Zadatak2 {
    //Napisati program koji na osnovu unetog broja ispisuje sa koliko slova se pise taj broj -
    // za resavanje ovog zadatka koristiti switch.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite brojeve: 1, 5, 11, 15 ili 20: ");
        int broj = sc.nextInt();

        switch (broj){

            case 1:
                String broj1 = "jedan";
                int no = broj1.length();
                System.out.println("Uneli ste broj " + broj1 + " i taj broj se pise sa " + no + " slova.");
                break;
            case 5:
                String broj2 = "pet";
                int no2 = broj2.length();
                System.out.println(String.format("Uneli ste broj %s, i taj broj se pise sa %d slova.", broj2, no2));
                break;
            case 11:
                String broj3 = "jedanaest";
                int no3 = broj3.length();
                System.out.println(String.format("Uneli ste broj %s, i taj broj se pise sa %d slova.", broj3, no3));
                break;
            case 15:
                String broj4 = "petnaest";
                int no4 = broj4.length();
                System.out.println(String.format("Uneli ste broj %s, i taj broj se pise sa %d slova.", broj4, no4));
                break;
            case 20:
                String broj5 = "dvadeset";
                int no5 = broj5.length();
                System.out.println(String.format("Uneli ste broj %s, i taj broj se pise sa %d slova.", broj5, no5));
                break;



        }
    }
}
