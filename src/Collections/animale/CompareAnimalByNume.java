package Collections.animale;

import java.util.Comparator;

public class CompareAnimalByNume implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getNume().length() > o2.getNume().length()) {
            return 1;
        } else if (o1.getNume().length() < o2.getNume().length()) {
            return -1;
        } else
            return 0;
    }
}
