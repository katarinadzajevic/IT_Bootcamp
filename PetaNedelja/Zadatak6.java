public class Zadatak6 {
    public static void main(String[] args) {
        //Zadati su jedan niz celih brojeva, i jedan broj koji prestavlja ‘metu’. Napisati program koji vraća indekse dva
        //broja koja kada se saberu daju rezultat jednak unetoj ‘meti’.
        //Pretpostaviti da će svaki ulazni podaci imati tačno jedno rešenje. Ne koristiti jedan element više puta.

        int[] array = {15, 17, 38, 66, 100};
        int target = 117;

        loop:
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if ((array[i] + array[j]) == target) {
                    System.out.println("The indexes of the given numbers are " + i + " , " + j +".");
                    break loop;
                }

            }

        }

    }
}
