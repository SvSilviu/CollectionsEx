package collections.animale;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ControlAnimal2 {

    private Scanner scanner;
    private List<Animal> animalList;

    public ControlAnimal2() {
        this.animalList = new ArrayList<>();
        this.load();
    }


    public ControlAnimal2(List<Animal> animals) {

        animalList = animals;

    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void load() {

        try {
            File file = new File("C:\\mycode\\collections\\Initiere\\src\\collections\\animale\\data\\animale.txt");
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String linie = scanner.nextLine();
                animalList.add(new Animal(linie));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afisare() {

        Iterator<Animal> iterator = animalList.iterator();
        while (iterator.hasNext()) {
            Animal a = iterator.next();
            System.out.println(a);
        }

    }


    public Animal findByDenumire(String denumire) {

        Iterator<Animal> iterator = animalList.iterator();

        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getDenumire().equals(denumire)) {

            }

        }
        return new Animal(denumire, Sex.FEMELA, 0, "");
    }


    public Animal celMaiInVarsta() {

        Iterator<Animal> iterator = animalList.iterator();
        Animal maxim = animalList.get(0);
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.compareTo(maxim) > 0) {
                maxim = animal;
            }
        }
        return maxim;
    }

    public Animal penultimulCaVarsta() {

        Iterator<Animal> iterator = animalList.iterator();
        Animal penultimul = new Animal("", Sex.FEMELA, 0, "");
        Animal maxim = celMaiInVarsta();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (penultimul.compareTo(animal) < 0 && animal.compareTo(maxim) < 0)
                penultimul = animal;
        }
        return penultimul;
    }

    public Animal findByNume(String nume) {

        Iterator<Animal> iterator = animalList.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.getNume().equals(nume)) {

            }

        }
        return new Animal("", Sex.FEMELA, 0, nume);
    }

    public void createAnimal(Animal animal) {

        animalList.add(animal);
    }

    public void readAnimal() {

        Iterator<Animal> iterator = animalList.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal.toString());
        }

    }

//    public void updateAnimal(Animal animal, String denumire) {
//
//        Iterator<Animal> iterator = animalList.iterator();
//        while (iterator.hasNext()) {
//            Animal animalActual = iterator.next();
//            if (animalActual.equals(animal)) {
//                animalActual.setDenumire(denumire);
//            }
//        }
//    }

    public void updateAnimal(Animal animal) {

        Iterator<Animal> iterator = animalList.iterator();
        while (iterator.hasNext()) {
            Animal a = iterator.next();
            if (a.equals(animal)) {

                if (!animal.getNume().equals("")) {

                    a.setNume(animal.getNume());
                }

                if (animal.getAni() != 0) {

                    a.setAni(animal.getAni());

                }
                if (animal.getSex() != Sex.INIT) {

                    a.setSex(animal.getSex());
                }
            }
        }
    }

    public void deleteAnimal(Animal animal) {

        Iterator<Animal> iterator = animalList.iterator();
        while (iterator.hasNext()) {
            Animal animalActual = iterator.next();
            if (animalActual.equals(animal)) {
                iterator.remove();
            }
        }
    }

}
