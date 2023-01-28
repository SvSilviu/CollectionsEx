package Collections.animale;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ControlAnimalTest {

@Test
    public void byDenumireTest(){

    Animal animal = new Animal("Magar",Sex.MASCUL,4,"Donkey");
    Animal animal1 = new Animal("Dragon",Sex.FEMELA,12,"Fifi");


    ArrayList<Animal> listaAnimalelor = new ArrayList<>();
    listaAnimalelor.add(animal);
    listaAnimalelor.add(animal1);


    listaAnimalelor.sort(new CompareAnimalByDenumire());

    assertEquals(animal,listaAnimalelor.get(1));
    assertEquals(animal1,listaAnimalelor.get(0));

}
@Test
    public void byNumeTest(){

    Animal animal = new Animal("Magar",Sex.MASCUL,4,"Donkey");
    Animal animal1 = new Animal("Dragon",Sex.FEMELA,12,"Fifi");


    ArrayList<Animal> listaAnimalelor = new ArrayList<>();
    listaAnimalelor.add(animal);
    listaAnimalelor.add(animal1);

    listaAnimalelor.sort(new CompareAnimalByNume());

    assertEquals(animal,listaAnimalelor.get(1));
    assertEquals(animal1,listaAnimalelor.get(0));
}
@Test
    public void byAniTest(){

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
    public void bySexTest(){

    Animal animal = new Animal("Magar",Sex.MASCUL,4,"Donkey");
    Animal animal1 = new Animal("Dragon",Sex.FEMELA,12,"Fifi");

    CompareAnimalBySex compareAnimalBySex = new CompareAnimalBySex();

    assertEquals(-1,compareAnimalBySex.compare(animal1,animal));
    assertEquals(1,compareAnimalBySex.compare(animal,animal1));

}
@Test
    public void controlAnimalTest(){
//
//    ControlAnimal controlAnimal = new ControlAnimal();
//    Animal animal = new Animal("Magar",Sex.MASCUL,4,"Donkey");
//    Animal animal1 = new Animal("Dragon",Sex.FEMELA,12,"Fifi");
//
//    ArrayList<Animal> listaAnimalelor = new ArrayList<>();
//    listaAnimalelor.add(animal);
//    listaAnimalelor.add(animal1);
//
//
//
//    assertEquals("Caine",listaAnimalelor.get(0).getNume());

}

}