package Collections.animale;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ControlAnimal {

    private Scanner scanner;
    private ArrayList<Animal> animals = new ArrayList<>();

    public ControlAnimal() {

       this.load();

    }

    public void load() {

        this.animals.clear();

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\Collections\\animale\\data\\animale.txt");
            this.scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linie = scanner.nextLine();
                animals.add(new Animal(linie));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    public Animal findByDenumire(String denumire, Sex sex) {
        int pozitie = Collections.binarySearch(animals, new Animal(denumire, sex, 0, ""), new CompareAnimalByDenumire());
        if (pozitie != -1) {
            return this.animals.get(pozitie);
        }
        return null;
    }

    public Animal findByNume(String nume) {

        int pozitie = Collections.binarySearch(animals, new Animal(nume), new CompareAnimalByNume());
        if (pozitie != -1) {
            this.animals.get(pozitie);
        }
        return null;
    }

    public Animal findBySex(Sex sex) {
        int pozitie = Collections.binarySearch(animals, new Animal("", sex, 0, ""));
        if (pozitie != -1) {
            this.animals.get(pozitie);
        }
        return null;
    }

    public void findByAge() {
        Collections.max(animals, Animal::compareTo);
    }

    public void shuffle(int a, int b) {

        Collections.shuffle(animals);
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void schimbareLocInLista(int a, int b) {
        Collections.swap(animals, a, b);
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
