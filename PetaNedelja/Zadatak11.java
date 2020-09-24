import java.util.Arrays;

public class Zadatak11 {
    public static void main(String[] args) {

        //Za zadat niz koji sadrži n različitih brojeva uzetih iz skupa 0, 1, 2, ..., n pronaći jedan koji u tom nizu nedostaje.
        //Primeri: Ulaz: [3,1,0], Izlaz: 2
        //Ulaz: [4,2,3,5,7,0,1], Izlaz: 6

        int[] array = {10, 1, 6, 5, 2, 3, 0, 4, 8, 9};

        Arrays.sort(array);

        for (int i = 0; i <array.length-1 ; i++) {

            if(array[i]+1 != array[i+1]){
                System.out.println(array[i]+1);
            }

        }
    }
}
