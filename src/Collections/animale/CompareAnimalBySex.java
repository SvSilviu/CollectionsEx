package Collections.animale;

import java.util.Comparator;

public class CompareAnimalBySex implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        Animal animal1 = (Animal) o1;
        Animal animal2 = (Animal) o2;
        return animal1.getSex().compareTo(animal2.getSex());
    }
}
