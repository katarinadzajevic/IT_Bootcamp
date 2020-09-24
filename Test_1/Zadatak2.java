import java.util.Scanner;

public class Zadatak2 {
    /*  -   U trci učestvuje 4 trkača. Posmatrajmo trenutak u kome najsporiji zaostaje 6 krugova do kraja trke, dva srednja 5 krugova i najbrži samo 4 kruga.
        -   Svaki put kad obrnu krug, program treba da ispiše koliko je krugova ostalo kom atletičaru do cilja.
        -   Program dobija informaciju o tome koji je igrač istrčao krug tako što se unosi njegov redni broj.
        -   Program se završava kada svi trkači završe trku.
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int broj;
        int brojac1 = 6;
        int brojac2 = 5;
        int brojac3 = 5;
        int brojac4 = 4;
        boolean s = true;
        while (s) {
            System.out.println("Unesi broj trkaca: ");
            broj = sc.nextInt();
            if (broj == 1 && brojac1  <=1) {
                System.out.println("Trkac broj jedan je zavrsio trku");
                brojac1 -=1;

            } else if (broj == 1 && brojac1 > 0) {
                brojac1 = brojac1 - 1;
                System.out.println("Trkacu broj 1 je ostalo jos " + brojac1 + " kruga/ova");
            }
            if (broj == 2 && brojac2  <=1) {
                System.out.println("Trkac broj dva je zavrsio trku");
                brojac2 -=1;

            } else if (broj == 2 && brojac2 > 0) {
                brojac2 = brojac2 - 1;
                System.out.println("Trkacu broj 2 je ostalo jos " + brojac2 + " kruga/ova");
            }
            if (broj == 3 && brojac3  <=1) {
                System.out.println("Trkac broj tri je zavrsio trku");
                brojac3 -=1;

            } else if (broj == 3 && brojac3 > 0) {
                brojac3 = brojac3 - 1;
                System.out.println("Trkacu broj 3 je ostalo jos " + brojac3 + " kruga/ova");
            }
            if (broj == 4 && brojac4 <=1) {
                System.out.println("Trkac broj 4 je zavrsio trku");
                brojac4 -=1;

            } else if (broj == 4 && brojac4 > 0) {
                brojac4 = brojac4 - 1;
                System.out.println("Trkacu broj 4 je ostalo jos " + brojac4 + " kruga/ova");
            }
            if (brojac1 == 0 && brojac2 == 0 && brojac3 == 0 && brojac4 == 0) {
                System.out.println("Svi ucesnici su zavrsili trku");
                s = false;
            }

        }


    }
}

