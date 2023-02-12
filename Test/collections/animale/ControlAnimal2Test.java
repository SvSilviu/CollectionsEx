package collections.animale;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControlAnimal2Test {

    @Test
    public void afisareTest(){

        ControlAnimal2 controlAnimal2 = new ControlAnimal2();
        controlAnimal2.afisare();

    }
    @Test
    void findByDenumireTest(){

        Animal animal = new Animal("Magar", Sex.MASCUL, 4, "Donkey");
        Animal animal1 = new Animal("Dragon", Sex.FEMELA, 12, "Fifi");

        List<Animal> animals = new ArrayList<>();

        animals.add(animal);
        animals.add(animal1);

        animals.sort(new CompareAnimalByDenumire());

        assertEquals(animal,animals.get(1));
        assertEquals(animal1,animals.get(0));
    }

}