package collection;

import collections.animale.Animal;
import collections.animale.ControlAnimal2;
import collections.animale.Sex;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListaTest {


    @Test
    void ex1Test() {

        Lista.ex1();

    }

    @Test
    void ex2Test() {

        Lista.animalInVarsta();
    }

    @Test
    void ex3Test() {

        Lista.animalMic();
    }

    @Test
    void ex4Test() {

        Lista.compareAnimalsbyDenumire();
    }

    @Test
    void ex5Test() {

        Lista.AnimalByNume();
    }

    @Test
    void ex6Test() {

        Lista.penultimulCaVarsta();
    }

    @Test
    void findByDenumireTest() {

        List<Animal> listaAnimale = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal3 = new Animal("Cal", Sex.MASCUL, 4, "Lucky");
        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        listaAnimale.add(animal1);
        listaAnimale.add(animal2);
        listaAnimale.add(animal3);
        listaAnimale.add(animal4);
        ControlAnimal2 controlAnimal2 = new ControlAnimal2(listaAnimale);
        assertEquals("Caine", controlAnimal2.findByDenumire("Caine").getDenumire());

    }

    @Test
    void celMaiInVarstaTest() {

        List<Animal> listaAnimale = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal3 = new Animal("Cal", Sex.MASCUL, 4, "Lucky");
        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        listaAnimale.add(animal1);
        listaAnimale.add(animal2);
        listaAnimale.add(animal3);
        listaAnimale.add(animal4);
        ControlAnimal2 controlAnimal2 = new ControlAnimal2(listaAnimale);

        System.out.println(controlAnimal2.celMaiInVarsta());
    }

    @Test
    void penultimulTest() {

        List<Animal> listaAnimale = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal3 = new Animal("Cal", Sex.MASCUL, 6, "Lucky");
        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        listaAnimale.add(animal1);
        listaAnimale.add(animal2);
        listaAnimale.add(animal3);
        listaAnimale.add(animal4);
        ControlAnimal2 controlAnimal2 = new ControlAnimal2(listaAnimale);

        assertEquals(animal3, controlAnimal2.penultimulCaVarsta());

    }

    @Test
    void findByNumeTest() {

        List<Animal> listaAnimale = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal3 = new Animal("Cal", Sex.MASCUL, 6, "Lucky");
        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        listaAnimale.add(animal1);
        listaAnimale.add(animal2);
        listaAnimale.add(animal3);
        listaAnimale.add(animal4);
        ControlAnimal2 controlAnimal2 = new ControlAnimal2(listaAnimale);

        assertEquals("Oscar", controlAnimal2.findByNume("Oscar").getNume());

    }
//    @Test
//    void stergereDupaNumeTest(){
//
//        List<Animal> listaAnimale = new ArrayList<>();
//
//        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
//        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
//        Animal animal3 = new Animal("Cal", Sex.MASCUL, 6, "Lucky");
//        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");
//
//        listaAnimale.add(animal1);
//        listaAnimale.add(animal2);
//        listaAnimale.add(animal3);
//        listaAnimale.add(animal4);
//
//        ControlAnimal2 controlAnimal2 = new ControlAnimal2(listaAnimale);
//        controlAnimal2.s("Oscar");
//
//        List<Animal> expected = new ArrayList<>();
//
//        expected.add(animal1);
//        expected.add(animal3);
//        expected.add(animal4);
//
//        System.out.println("Lista asteptata este "+expected);
//
//        assertEquals(expected, controlAnimal2.getAnimalList());
//    }

    @Test
    void createTest() {

        List<Animal> listaAnimale = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal3 = new Animal("Cal", Sex.MASCUL, 6, "Lucky");
        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        listaAnimale.add(animal1);
        listaAnimale.add(animal2);
        listaAnimale.add(animal3);
        listaAnimale.add(animal4);

        ControlAnimal2 controlAnimal2 = new ControlAnimal2(listaAnimale);

        controlAnimal2.createAnimal(animal1);

        Iterator<Animal> iterator = controlAnimal2.getAnimalList().iterator();
        int contor = 0;
        while (iterator.hasNext()) {
            contor++;
            iterator.next();
        }
        assertEquals(5, contor);

    }

    @Test
    void readTest() {

        List<Animal> listaAsteptata = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal3 = new Animal("Cal", Sex.MASCUL, 6, "Lucky");
        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        listaAsteptata.add(animal1);
        listaAsteptata.add(animal2);
        listaAsteptata.add(animal3);
        listaAsteptata.add(animal4);

        ControlAnimal2 controlAnimal2 = new ControlAnimal2(listaAsteptata);
        List<Animal> actualAnimals = controlAnimal2.readAnimal();

        assertEquals(actualAnimals, listaAsteptata);
    }

    @Test
    void updateTest(){

        List<Animal> listaAsteptata = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal3 = new Animal("Cal", Sex.MASCUL, 6, "Lucky");
        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        listaAsteptata.add(animal1);
        listaAsteptata.add(animal2);
        listaAsteptata.add(animal3);
        listaAsteptata.add(animal4);

        ControlAnimal2 controlAnimal2 = new ControlAnimal2(listaAsteptata);
        controlAnimal2.updateAnimal(animal1,"Tigru");

        String asteptat = "Tigru";
        String actual = animal1.getDenumire();

        assertEquals(asteptat,actual);


    }
    @Test
    void deleteTest(){

        List<Animal> animalList = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal3 = new Animal("Cal", Sex.MASCUL, 6, "Lucky");
        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);

        ControlAnimal2 controlAnimal2 = new ControlAnimal2(animalList);
        controlAnimal2.deleteAnimal(animal1);

        assertEquals(3,animalList.size());
    }
}
