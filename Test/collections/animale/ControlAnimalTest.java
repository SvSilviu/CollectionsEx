package collections.animale;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControlAnimalTest {

    @Test
    public void byDenumireTest() {

        Animal animal = new Animal("Magar", Sex.MASCUL, 4, "Donkey");
        Animal animal1 = new Animal("Dragon", Sex.FEMELA, 12, "Fifi");


        ArrayList<Animal> listaAnimalelor = new ArrayList<>();
        listaAnimalelor.add(animal);
        listaAnimalelor.add(animal1);


        listaAnimalelor.sort(new CompareAnimalByDenumire());

        assertEquals(animal, listaAnimalelor.get(1));
        assertEquals(animal1, listaAnimalelor.get(0));

    }

    @Test
    public void byNumeTest() {

        Animal animal = new Animal("Magar", Sex.MASCUL, 4, "Donkey");
        Animal animal1 = new Animal("Dragon", Sex.FEMELA, 12, "Fifi");


        ArrayList<Animal> listaAnimalelor = new ArrayList<>();
        listaAnimalelor.add(animal);
        listaAnimalelor.add(animal1);

        listaAnimalelor.sort(new CompareAnimalByNume());

        assertEquals(animal, listaAnimalelor.get(1));
        assertEquals(animal1, listaAnimalelor.get(0));
    }

    @Test
    public void byAniTest() {

//    Animal animal = new Animal("Magar",Sex.MASCUL,4,"Donkey");
//    Animal animal1 = new Animal("Dragon",Sex.FEMELA,12,"Fifi");
//
//
//    ArrayList<Animal> listaAnimalelor = new ArrayList<>();
//    listaAnimalelor.add(animal);
//    listaAnimalelor.add(animal1);
//
//    listaAnimalelor.sort(new ControlAnimal().findByAge());
    }

    @Test
    public void bySexTest() {

        Animal animal = new Animal("Magar", Sex.MASCUL, 4, "Donkey");
        Animal animal1 = new Animal("Dragon", Sex.FEMELA, 12, "Fifi");

        CompareAnimalBySex compareAnimalBySex = new CompareAnimalBySex();

        assertEquals(-1, compareAnimalBySex.compare(animal1, animal));
        assertEquals(1, compareAnimalBySex.compare(animal, animal1));

    }

    @Test
    public void controlAnimalTest() {


        Animal animal = new Animal("Magar", Sex.MASCUL, 4, "Donkey");
        Animal animal1 = new Animal("Dragon", Sex.FEMELA, 12, "Fifi");

        ArrayList<Animal> listaAnimalelor = new ArrayList<>();

        listaAnimalelor.add(animal);
        listaAnimalelor.add(animal1);

        ControlAnimal controlAnimal = new ControlAnimal(listaAnimalelor);


        assertEquals(2, controlAnimal.size());

    }

    @Test
    public void findByNameTest() {

        Animal animal = new Animal("Magar", Sex.MASCUL, 4, "Donkey");
        Animal animal1 = new Animal("Dragon", Sex.FEMELA, 12, "Fifi");


        ArrayList<Animal> listaAnimalelor = new ArrayList<>();

        listaAnimalelor.add(animal);
        listaAnimalelor.add(animal1);

        ControlAnimal controlAnimal = new ControlAnimal(listaAnimalelor);

        assertEquals("Magar", controlAnimal.findByDenumire("Magar").getDenumire());

    }
@Test
    void afisareTest(){

        ControlAnimal controlAnimal = new ControlAnimal();
        controlAnimal.afisare();
    }
}