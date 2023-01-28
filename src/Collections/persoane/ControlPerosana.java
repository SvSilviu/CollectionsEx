package Collections.persoane;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ControlPerosana {

    private Scanner scanner;
    private ArrayList<Persoana> listaDePersoane;

    public ControlPerosana() {

        listaDePersoane = new ArrayList<>();
    }

    public void load() {

        listaDePersoane.clear();

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\Collections\\persoane\\data\\persoane.txt");
            this.scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String linie = scanner.nextLine();
                listaDePersoane.add(new Persoana(linie));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (Persoana p : listaDePersoane) {
            System.out.println(p);
        }
    }

    public Persoana persoanaCeaMaiInVarsta() {

        return Collections.max(listaDePersoane, Persoana::compareTo);
    }

    public Persoana findByNume(String nume) {

        int pozitie = Collections.binarySearch(listaDePersoane, new Persoana(nume, "", "", 0), new ComparePersoanaByNume());
        if (pozitie != -1) {
            return this.listaDePersoane.get(pozitie);
        }
        return null;
    }

    public Persoana findByAdresa(String adresa) {

        int pozitie = Collections.binarySearch(listaDePersoane, new Persoana("", "", adresa, 0), new ComparePersoanaByAdresa());
        if (pozitie != -1) {
            this.listaDePersoane.get(pozitie);
        }
        return null;

    }

    public void shuffle(int a, int b) {

        Collections.shuffle(listaDePersoane);
        listaDePersoane.forEach(System.out::println);
    }

    public void swap(int a, int b) {
        Collections.swap(listaDePersoane, a, b);
    }
}
