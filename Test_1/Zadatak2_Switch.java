import java.util.Scanner;

public class Zadatak2Switch {
    /*  -   U trci učestvuje 4 trkača. Posmatrajmo trenutak u kome najsporiji zaostaje 6 krugova do kraja trke, dva srednja 5 krugova i najbrži samo 4 kruga.
        -   Svaki put kad obrnu krug, program treba da ispiše koliko je krugova ostalo kom atletičaru do cilja.
        -   Program dobija informaciju o tome koji je igrač istrčao krug tako što se unosi njegov redni broj.
        -   Program se završava kada svi trkači završe trku.
    */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int counter1 = 6;
        int counter2 = 5;
        int counter3 = 5;
        int counter4 = 4;
        int cilj1 = 0;
        int cilj2 = 0;
        int cilj3 = 0;
        int cilj4 = 0;
        int u = 0;
        while (true) {
            System.out.println("Unesi broj trkaca: ");
            int broj = sc.nextInt();

            switch (broj) {
                case 1:
                    if (counter1 <= 1) {
                        System.out.println("Trkac broj jedan je zavsio trku.");
                        counter1 -=1;
                        u++;
                        cilj1 = u;
                        break;

                    } else if (counter1 != 0) {
                        counter1 = counter1 - 1;
                        System.out.println("Trkacu broj jedan je ostalo jos " + counter1 + "krugova");

                    }
                    break;
                case 2:
                    if (counter2 <= 1) {
                        System.out.println("Trkac broj dva je zavsio trku.");
                        counter2 -=1;
                        u++;
                        cilj2 = u;
                        break;
                    } else if (counter2 != 0) {
                        counter2 = counter2 - 1;
                        System.out.println("Trkacu broj dva je ostalo jos " + counter2 + "krugova");

                    }
                    break;
                case 3:
                    if (counter3 <= 1) {
                        System.out.println("Trkac broj tri je zavsio trku.");
                        counter3 -=1;
                        u++;
                        cilj3 = u;
                        break;
                    } else if (counter3 != 0) {
                        counter3 = counter3 - 1;
                        System.out.println("Trkacu broj tri je ostalo jos " + counter3 + "krugova");

                    }
                    break;
                case 4:
                    if (counter4 <= 1) {
                        System.out.println("Trkac broj cetiri je zavsio trku.");
                        counter4 -=1;
                        u++;
                        cilj4 = u;
                        break;
                    } else if (counter4 != 0) {
                        counter4 = counter4 - 1;
                        System.out.println("Trkacu broj cetiri je ostalo jos " + counter4 + "krugova");

                    }
                    break;
            }
            if (counter1==0 && counter2==0 && counter3==0 && counter4==0) {
                System.out.println("Svi trkaci su stigli do cilja!");
                break;
            }
        }
        System.out.println("Prvi trkac je na poziciji: " + cilj1);
        System.out.println("Drugi trkac je na poziciji: " + cilj2);
        System.out.println("Treci trkac je na poziciji: " + cilj3);
        System.out.println("Cetvrti trkac je na poziciji: " + cilj4);
    }
}