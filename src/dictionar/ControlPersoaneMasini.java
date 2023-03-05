package dictionar;

import java.io.File;
import java.util.*;

public class ControlPersoaneMasini {

    private Scanner scanner;
    private List<Persoana> listaPersoane;
    private List<Masina> listaMasini;
    private Map<Persoana, List<Masina>> data;


    public ControlPersoaneMasini() {
        this.listaPersoane = new ArrayList<>();
        this.listaMasini = new ArrayList<>();
        this.data = new HashMap<>();
        loadMasini();
        loadPersoane();
        loadMap();
    }

    public void loadPersoane() {

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\dictionar\\data\\persoane");
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String linie = scanner.nextLine();
                listaPersoane.add(new Persoana(linie));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadMasini() {

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\dictionar\\data\\masini");
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String linie = scanner.nextLine();
                listaMasini.add(new Masina(linie));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void afisareMasini() {

        Iterator<Masina> iterator = listaMasini.iterator();
        while (iterator.hasNext()) {
            Masina m = iterator.next();
            System.out.println(m);
        }
    }

    public void afisarePersoane() {

        Iterator<Persoana> iterator = listaPersoane.iterator();
        while (iterator.hasNext()) {
            Persoana p = iterator.next();
            System.out.println(p);
        }
    }


    public void loadMap() {


        for (int i = 0; i < listaPersoane.size(); i++) {

            Persoana persoana = listaPersoane.get(i);
            this.data.put(persoana, new ArrayList<>());

            for (int j = 0; j < listaMasini.size(); j++) {

                Masina masina = listaMasini.get(j);
                if (masina.getIdPersoana() == persoana.getId()) {
                    this.data.get(persoana).add(masina);
                }
            }
        }
    }

    //todo: metoda ce primeste ca parametru numele persoanei si returneaza lista lui de masini folosind Map;

    public void masiniByPersoana(String nume) {

        for (Map.Entry<Persoana, List<Masina>> entry : data.entrySet()) {
            Persoana persoana = entry.getKey();
            if (persoana.getNume().equals(nume)) {
                System.out.println(nume + " are : " + "\n");
                List<Masina> list = entry.getValue();

                for (Masina masina : list) {
                    System.out.println(masina);
                }
            }
        }
    }

    //todo: functie ce sterge o masina de la o persoana

    public void stergereMasina(String nume, String marca) {

        for (Map.Entry<Persoana, List<Masina>> entry : data.entrySet()) {
            Persoana persoana = entry.getKey();
            if (persoana.getNume().equals(nume)) {
                stergere(entry.getValue(), marca);

            }
        }
    }

    //todo: functie ce primeste ca parametru o lista de masini si sterge o masina

    public void stergere(List<Masina> listaMasini, String marca) {

        for (int i = 0; i < listaMasini.size(); i++) {

            if (listaMasini.get(i).getMarca().equals(marca)) {

                listaMasini.remove(i);
            }
        }
    }
    //todo: functie ce ia ca parametru numele persoanei si returneaza masinile lui

    public void addCarToPerson(Persoana persoana, Masina masina) {

        if (data.containsKey(persoana)) {
            List<Masina> cars = data.get(persoana);
            cars.add(masina);
        } else {
            List<Masina> cars = new ArrayList<>();
            cars.add(masina);
            data.put(persoana, cars);
        }
    }

    public Masina masinaCeaMaiScumpa() {


        Masina ceaMaiScumpa = null;
        double maxPrice = 0;

        for (Map.Entry<Persoana, List<Masina>> entry : data.entrySet()) {
            List<Masina> cars = entry.getValue();
            for (Masina masina : cars) {
                if (masina.getPret() > maxPrice) {
                    maxPrice = masina.getPret();
                    ceaMaiScumpa = masina;
                }
            }
        }
        return ceaMaiScumpa;

    }

    public Masina masinaCeaMaiIeftina() {

        Masina ceaMaiIeftina = null;
        double minPrice = Double.MAX_VALUE;

        for (Map.Entry<Persoana, List<Masina>> entry : data.entrySet()) {
            List<Masina> cars = entry.getValue();
            for (Masina masina : cars) {
                if (masina.getPret() < minPrice) {
                    minPrice = masina.getPret();
                    ceaMaiIeftina = masina;
                }
            }
        }
        return ceaMaiIeftina;
    }

    public Masina ceaMaiNouaMasina() {

        Masina masinaNoua = null;

        for (Map.Entry<Persoana, List<Masina>> entry : data.entrySet()) {
            List<Masina> cars = entry.getValue();
            for (Masina masina : cars) {
                if (masinaNoua == null || masinaNoua.getAn() < masina.getAn()) {
                    masinaNoua = masina;
                }
            }
        }
        return masinaNoua;

    }


    public Masina ceaMaiVecheMasina() {

        Masina masinaVeche = null;

        for (Map.Entry<Persoana, List<Masina>> entry : data.entrySet()) {
            List<Masina> cars = entry.getValue();
            for (Masina masina : cars) {
                if (masinaVeche == null || masinaVeche.getAn() > masina.getAn()) {
                    masinaVeche = masina;
                }
            }
        }
        return masinaVeche;
    }

    public Set<Masina> getCarsByPersoana(Persoana persoana) {

        Set<Masina> cars = new HashSet<>();
        if (data.containsKey(persoana)) {
            List<Masina> carList = data.get(persoana);
            cars.addAll(carList);
        }
        return cars;
    }

    public Set<Persoana> getPersoanaByMarcaMasinii(String marca) {

        Set<Persoana> persoane = new HashSet<>();
        for (Map.Entry<Persoana, List<Masina>> entry : data.entrySet()) {
            List<Masina> cars = entry.getValue();
            for (Masina masina : cars) {
                if (masina.getMarca().equals(marca)) {
                    persoane.add(entry.getKey());
                }
            }
        }
        return persoane;

    }

    public int getNumarulTotalDeMasini() {

        int nrMasini = 0;
        for (Map.Entry<Persoana, List<Masina>> entry : data.entrySet()) {
            nrMasini += entry.getValue().size();
        }
        return nrMasini;
    }

}

