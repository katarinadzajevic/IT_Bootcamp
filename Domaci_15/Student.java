package ocena;

import java.util.ArrayList;
import java.util.List;

public class Student {

    List<Ocena> ocene;

    public Student() {
        ocene = new ArrayList<>();
    }


    public void dodajOcenu(Ocena ocena) {
        ocene.add(ocena);
    }

    public double prosekOcena() {
        double prosek = 0;
        int sum = ocene.size();
        for (int i = 0; i < ocene.size(); i++) {
            if (ocene.get(i).getOcena() == 0) {
                sum = sum - 1;
                continue;
            }
            prosek = prosek + ocene.get(i).getOcena();
        }

        return prosek / sum;
    }
}
