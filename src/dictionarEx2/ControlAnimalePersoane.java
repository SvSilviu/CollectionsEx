package dictionarEx2;

import java.io.File;
import java.util.*;

public class ControlAnimalePersoane {

    private Scanner scanner;
    private List<Animal> animalList;
    private List<Persoana> persoanaList;
    private Map<Persoana, List<Animal>> data;

    public ControlAnimalePersoane() {

        this.animalList = new ArrayList<>();
        this.persoanaList = new ArrayList<>();
        this.data = new HashMap<>();
        loadAnimale();
        loadPersoane();
        loadMap();


    }

    public List<Persoana> getPersoanaList() {

        return this.persoanaList;
    }

    public List<Animal> getAnimalList() {

        return this.animalList;
    }

    public void loadAnimale() {

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\dictionarEx2\\data\\animale");
            scanner = new Scanner(file);
            String linie = scanner.nextLine();
            animalList.add(new Animal(linie));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadPersoane() {

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\dictionarEx2\\data\\persoane");
            scanner = new Scanner(file);
            String linie = scanner.nextLine();
            persoanaList.add(new Persoana(linie));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisareAnimale() {
        Iterator<Animal> iterator = animalList.iterator();
        while (iterator.hasNext()) {
            Animal a = iterator.next();
            System.out.println(a);
        }

    }

    public void afisarePersoana() {

        Iterator<Persoana> iterator = persoanaList.iterator();
        while (iterator.hasNext()) {
            Persoana p = iterator.next();
            System.out.println(p);
        }

    }

    public void loadMap() {

        for (Persoana persoana : persoanaList) {
            this.data.put(persoana, new ArrayList<>());
            for (Animal animal : animalList) {
                this.data.get(persoana).add(animal);
            }
        }

    }


}
