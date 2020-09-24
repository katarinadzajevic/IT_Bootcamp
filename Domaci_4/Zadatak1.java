package homework_4;

public class Zadatak1 {

    //Otvorio se novi luna park gde se moze kupiti 3 tipa zetona za voznju.
    //Prvi zeton vam omogucava sve voznje, drugi za svaku drugu (bilo koju), a treci za svaku cetvrtu
    //(bilo koju) voznju.
    //Napisati program koji ce izracunati koliko kojih zetona je potrebno da bi se islo na sve voznje po tri puta.

    public static void main(String[] args) {

        int prviZeton = 1;
        int drugiZeton = 2;
        int treciZeton = 4;

        int brojVoznji = 3;



            prviZeton *=brojVoznji;
            drugiZeton *=brojVoznji;
            treciZeton *=brojVoznji;


        System.out.println(String.format("Potreban broj prvih zetona za 3 voznje je: %d, drgih zetona: %d, i trecih zetona: %d",prviZeton, drugiZeton, treciZeton));

    }
}
