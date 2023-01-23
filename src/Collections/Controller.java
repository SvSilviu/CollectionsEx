package Collections;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {

    private ArrayList<Produs> listaProduse;
    private Scanner scanner;


    public Controller() {


        listaProduse = new ArrayList<>();

        this.load();
    }

    public void load() {

        listaProduse = new ArrayList<>();
        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\data\\produse.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linie = scanner.nextLine();
                listaProduse.add(new Produs(linie));
            }
        } catch (Exception e) {

        }


    }

    public void afisare() {

        for (Produs p : listaProduse) {
            System.out.println(p);
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

}
