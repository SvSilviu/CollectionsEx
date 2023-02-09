package collections.masini;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ControlMasini {

    private Scanner scanner;
    private ArrayList<Masina> masini;


    public ControlMasini() {

        this.masini = new ArrayList<>();
        this.load();
    }

    public void load() {

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\Collections\\masini\\data\\masini.txt");
            this.scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String linie = scanner.nextLine();
                masini.add(new Masina(linie));
            }
        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public void afisare() {
        for (Masina m : masini) {
            System.out.println(m);
        }
    }

    public Masina masinaCeaMaiScumpa() {
        return Collections.max(masini, new CompareMasiniByPret());
    }

    public Masina findByMarca(String marca) {
        Collections.sort(masini,new CompareMasiniByMarca());
        int pozitie = Collections.binarySearch(masini, new Masina(marca, "", 0, 0), new CompareMasiniByMarca());
        if (pozitie != -1) {
            return this.masini.get(pozitie);
        }
        return null;
    }

    public Masina masinaCeaMaiVeche() {

        return Collections.min(masini, Masina::compareTo);
    }

    public void shuffle(int a, int b) {
        Collections.shuffle(masini);
        for (Masina m : masini) {
            System.out.println(m);
        }
    }

    public void schimbareLoc(int a, int b) {

        Collections.swap(masini, a, b);
        for (Masina m : masini) {
            System.out.println(m);
        }
    }

}

