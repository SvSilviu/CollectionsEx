package collections.animale;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ControlAnimal2 {

    private Scanner scanner;
    private List<Animal> animalList;

    public ControlAnimal2(List<Animal> animals) {
        this.animalList = animals;
    }

    public ControlAnimal2() {

        animalList = new ArrayList<>();

    }

    public void load() {

        this.animalList.clear();

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
            System.out.println(a.getDenumire());
        }


    }

}


