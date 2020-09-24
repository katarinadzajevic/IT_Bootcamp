import java.util.Arrays;

public class Zadatak7 {
    public static void main(String[] args) {
        // Napisati program koji vraća niz karaktera u obrnutom redosledu. Ulaz je niz char-ova.
        //Zadatak odraditi tako da se ne alocira dodatni prostor, već modifikuje ulazni niz.

        char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        //drugi nacin sa alociranjem dodatnog prostora

//        char prvi;
//        char poslednji;
//
//        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
//
//            prvi = array[i];
//            poslednji = array[j];
//            array[j] = prvi;
//            array[i] = poslednji;
//        }
//        System.out.println(Arrays.toString(array));
    }
}
