package collections.masini;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ControlMasini2 {

    private Scanner scanner;
    private List<Masina> masini;

    public ControlMasini2() {

        this.masini = new ArrayList<>();
        load();
    }

    public ControlMasini2(List<Masina> masiniList) {
        this.masini = masiniList;
    }

    public void load() {

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\collections\\masini\\data\\masini.txt");
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String linie = scanner.nextLine();
                masini.add(new Masina(linie));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {

        Iterator<Masina> iterator = masini.iterator();
        while (iterator.hasNext()) {
            Masina m = iterator.next();
            System.out.println(m.toString());
        }
    }

    public void createMasina(Masina masina) {

        masini.add(masina);

    }

    public void readMasina(Masina masina) {

        Iterator<Masina> iterator = masini.iterator();

        while (iterator.hasNext()) {
            Masina m = iterator.next();
            System.out.println(m.toString());
        }

    }

    public void updateMasina(Masina masina) {

        Iterator<Masina> iterator = masini.iterator();
        while (iterator.hasNext()) {
            Masina m = iterator.next();
            if (m.equals(masina)) {

                if (masina.getPret() != 0) {
                    m.setPret(masina.getPret());
                }
                if (masina.getAn() != 0) {
                    m.setAn(masina.getAn());
                }
                if (!masina.getModel().equals("")) {
                    m.setModel(masina.getModel());
                }
            }
        }
    }

    public void deleteMasina(Masina masina) {

        Iterator<Masina> iterator = masini.iterator();
        while (iterator.hasNext()) {
            Masina m = iterator.next();
            if (m.equals(masina)) {
                iterator.remove();
            }
        }
    }


}
