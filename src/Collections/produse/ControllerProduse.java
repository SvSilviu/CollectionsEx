package Collections.produse;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ControllerProduse {

    private ArrayList<Produs> listaProduse;
    private Scanner scanner;


    public ControllerProduse() {


        listaProduse = new ArrayList<>();
        this.load();
    }

    public void load() {

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\Collections\\produse\\data\\produse.txt");
            this.scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String linie = scanner.nextLine();
                listaProduse.add(new Produs(linie));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void afisare() {

        for (Produs produs : listaProduse) {
            System.out.println(produs);
        }
    }

    //todo o  functie ce returneaza produsul cel ami mare pret folosind COLLECTIONS

    public Produs produsulCelMaiScump() {

        return Collections.max(listaProduse, new CompareProductByPret());
    }

    //todo functie ce primeste ca parametru numele produsului si verifica\ daca exista produsul in lista

    public Produs findProductByName(String nume) {

        Collections.sort(listaProduse, new CompareProductByDenumire());
        int poz = Collections.binarySearch(listaProduse, new Produs(nume, "", "", 0, 0, 0), new CompareProductByDenumire());

        if (poz != -1) {

            return this.listaProduse.get(poz);
        }

        return null;

    }

    public Produs ProdusulCelMaiIeftin() {

        return Collections.min(listaProduse, new CompareProductByPret());
    }

    public void afisarePretDescarcator() {

        ArrayList<Produs> listaInversa = new ArrayList<>(listaProduse);

        Collections.sort(listaInversa, Collections.reverseOrder(new CompareProductByPret()));
        for (Produs p : listaInversa) {
            System.out.println(p.toString());
        }
    }

    public void shuffle(int a, int b) {

        Collections.shuffle(listaProduse);

        for (Produs p : listaProduse) {
            System.out.println(p);
        }
    }

    public Produs produsulCuCelMaiMareStock() {

        return Collections.max(listaProduse, new CompareProductByStock());

    }

    public void schimbareLocInLista(int produs1, int produs2) {

        Collections.swap(listaProduse, produs1, produs2);
        for (Produs p : listaProduse) {
            System.out.println(p);
        }
    }

}
