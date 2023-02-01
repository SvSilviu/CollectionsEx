package collections.animale;

import java.util.Comparator;

public class CompareAnimalByDenumire implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getDenumire().compareTo(o2.getDenumire());
    }

}
