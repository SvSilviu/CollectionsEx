package collection;

import collections.animale.Animal;
import collections.animale.CompareAnimalByDenumire;
import collections.animale.CompareAnimalByNume;
import collections.animale.Sex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {

    public static void ex1() {

        List<Animal> animals = new ArrayList<>();

        Animal animal = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal1 = new Animal("Pisica", Sex.MASCUL, 6, "Oscar");
        Animal animal2 = new Animal("Cal", Sex.MASCUL, 3, "Lucky");
        Animal animal3 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        animals.add(animal);
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);


        Iterator<Animal> it = animals.iterator();


        while (it.hasNext()) {

            Animal anim = it.next();
            System.out.println(anim);
        }

    }

    //todo: functie ce returneaza cel mai in varsta animal

    public static void animalInVarsta() {

        List<Animal> animals = new ArrayList<>();

        Animal a1 = new Animal(" Caine", Sex.FEMELA, 12, "Doris");
        Animal a2 = new Animal(" Pisica", Sex.MASCUL, 6, "Oscar");
        Animal a3 = new Animal(" Cal", Sex.MASCUL, 3, "Lucky");
        Animal a4 = new Animal(" Hamster", Sex.FEMELA, 1, "Mia");

        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);

        Iterator<Animal> iterator = animals.iterator();

        Animal maxim = a1;
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            if (animal.compareTo(maxim) > 0) {
                maxim = animal;
            }
        }
        System.out.println(maxim);


    }


    public static void animalMic() {

        List<Animal> listaAnimale = new ArrayList<>();

        Animal animal = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal1 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal2 = new Animal("Cal", Sex.MASCUL, 4, "Lucky");
        Animal animal3 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        listaAnimale.add(animal);
        listaAnimale.add(animal1);
        listaAnimale.add(animal2);
        listaAnimale.add(animal3);

        Iterator<Animal> iterator = listaAnimale.iterator();

        Animal minim = animal;

        while (iterator.hasNext()) {
            Animal a = iterator.next();

            if (a.compareTo(minim) <= 0) {
                minim = a;
            }
        }
        System.out.println(minim);

    }

    public static void compareAnimalsbyDenumire() {

        List<Animal> listaAnimale = new ArrayList<>();

        Animal animal = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal1 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");

        listaAnimale.add(animal);
        listaAnimale.add(animal1);

        CompareAnimalByDenumire compareByDenumire = new CompareAnimalByDenumire();
        listaAnimale.sort(compareByDenumire);

        System.out.println(animal.compareTo(animal1));

    }

    public static void AnimalByNume() {

        List<Animal> animale = new ArrayList<>();

        Animal animal = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal1 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");

        animale.add(animal);
        animale.add(animal1);

        CompareAnimalByNume compareAnimalByNume = new CompareAnimalByNume();
        animale.sort(compareAnimalByNume);
        System.out.println(animal.compareTo(animal1));

    }

    public static void penultimulCaVarsta() {

        List<Animal> listaAnimalelor = new ArrayList<>();

        Animal animal = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal1 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal2 = new Animal("Cal", Sex.MASCUL, 4, "Lucky");
        Animal animal3 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        listaAnimalelor.add(animal);
        listaAnimalelor.add(animal1);
        listaAnimalelor.add(animal2);
        listaAnimalelor.add(animal3);

        Animal maxim = null;
        Animal penultimul = null;

        Iterator<Animal> iterator = listaAnimalelor.iterator();

        while (iterator.hasNext()) {
            Animal a = iterator.next();
            if (maxim == null || a.compareTo(maxim) > 0) {
                maxim = a;
            } else if (penultimul == null || a.compareTo(penultimul) > 0) {
                penultimul = a;
            }
        }

        System.out.println(penultimul);
    }


}
