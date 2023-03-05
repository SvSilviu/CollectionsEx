package collection;

import collections.animale.Animal;
import collections.animale.CompareAnimalByDenumire;
import collections.animale.Sex;

import java.util.Set;
import java.util.TreeSet;

public class Multime {

    public void exempluAddO() {

        Animal caine = new Animal("Caine", Sex.MASCUL, 3, "Patrocle");
        Animal pisica = new Animal("Pisica", Sex.MASCUL, 5, "Tom");
        Animal cal = new Animal("Cal", Sex.FEMELA, 7, "Tania");


        Set<Animal> multimeAnimale = new TreeSet<>(new CompareAnimalByDenumire());

        multimeAnimale.add(caine);
        multimeAnimale.add(pisica);
        multimeAnimale.add(cal);

        for (Animal a : multimeAnimale) {
            System.out.println(a);
        }
    }


}
