import java.util.Scanner;

public class Zadatak8 {
    //  A)  Napisati program koji za uneti broj telefona (u vidu String-a) ispisuje informaciju o tome da li je broj
    //  napisan u odgovarajućem formatu. Pretpostaviti da se validan telefonski broj može pojaviti u jednom od
    //  sledećih formata:
    //  (xxx) xxx-xxxx ili (xxx) xxx-xxx-xxxx gde 'x' predstavlja jednu cifru.
    //  B)  Modifikovati program tako da on učitava brojeve telefona sve dok korisnik ne unese reč 'stop'.

    private static boolean isValid_1(String s) {

        String number1 = "\\d{3}-\\d{3}-\\d{4}";
        return s.matches(number1);
    }

    private static boolean isValid_2(String s) {
        String number2 = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        return s.matches(number2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phone;
        System.out.println("Enter phone number in format: (xxx) xxx-xxxx or xxx-xxx-xxxx: ");

        while (!(phone = sc.nextLine().toLowerCase()).equals("stop")) {

            if (isValid_1(phone) || isValid_2(phone)) {
                System.out.println("valid input");
            } else {
                System.out.println("invalid input");
            }
            System.out.println("Enter phone number in format: (xxx) xxx-xxxx or xxx-xxx-xxxx: \nOr enter word 'stop' to break.");
        }
    }
}