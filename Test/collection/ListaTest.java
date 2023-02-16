package collection;

import collections.animale.Animal;
import collections.animale.AnimalDTO;
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

        List<Animal> lisaAnimale = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");
        Animal animal3 = new Animal("Cal", Sex.MASCUL, 6, "Lucky");
        Animal animal4 = new Animal("Hamster", Sex.FEMELA, 1, "Mia");

        lisaAnimale.add(animal1);
        lisaAnimale.add(animal2);
        lisaAnimale.add(animal3);
        lisaAnimale.add(animal4);

        ControlAnimal2 controlAnimal2 = new ControlAnimal2(lisaAnimale);
        controlAnimal2.readAnimal();


    }

    @Test
    void updateTest(){

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
        AnimalDTO animalDTO= new AnimalDTO("Caine");

        controlAnimal2.afisare();

        System.out.println("=============================================================");
        animalDTO.setAni(13);
        animalDTO.setSex(Sex.MASCUL);
        animalDTO.setNume("Maxx");


        controlAnimal2.updateAnimal(animalDTO);

        controlAnimal2.afisare();

    }
    @Test
    void deleteTest(){

        List<Animal> animalList = new ArrayList<>();

        Animal animal1 = new Animal("Caine", Sex.FEMELA, 12, "Doris");
        Animal animal2 = new Animal("Pisica", Sex.MASCUL, 2, "Oscar");

        animalList.add(animal1);
        animalList.add(animal2);

        ControlAnimal2 controlAnimal2 = new ControlAnimal2(animalList);
        controlAnimal2.afisare();

        System.out.println("======================================");

        controlAnimal2.deleteAnimal(animal1);


        assertEquals(1,animalList.size());
        controlAnimal2.afisare();
    }
}
