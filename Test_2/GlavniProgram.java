package planinarskoDrustvo;

public class GlavniProgram {
    public static void main(String[] args) {

        Osoba o1 = new Osoba("Danijel", "Petrovic", 1987, "1234656791453");
        Osoba o2 = new Osoba("Milos", "Milojevic", 1954, "1234568");
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        PlaninarskoDrustvo drustvo1 = new PlaninarskoDrustvo("Pecina");
        Planinar p1 = drustvo1.registruj(o1, "1235567");
        System.out.println(p1.getBrDozvole());
        drustvo1.ukoloniPlaninara(p1);
        Planinar p2 = drustvo1.registruj(o1, "124578");
        System.out.println(p2.getBrDozvole());
        drustvo1.dodajPlaninara(p2);
        System.out.println(drustvo1.toString());

    }
}
