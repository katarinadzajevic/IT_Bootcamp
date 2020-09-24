public class Zadatak10 {
    public static void main(String[] args) {
        //Za zadati niz String-ova ispisati da li niz sadrži iste Stringove dva ili više puta.

        String[] array = {"mesto", "ime", "prezime", "ime", "generacija", "godina", "datum rodjenja", "ime", "generacija", "datum rodjenja"};
        int[] counter = new int[array.length];

        loop:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i].equals(array[j])) {
                    continue loop;
                }
            }
            for (int h = 0; h < array.length; h++) {
                if (array[i].equals(array[h])) {
                    counter[i]++;
                }

            }
            if (counter[i] > 1) {
                System.out.println("The word " + array[i] + " is repeated " + counter[i] + " times in the array");
            }
        }

    }
}
