package dictionar;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class controlPersoaneMasiniTest {

    @Test
    void test() {

        ControlPersoaneMasini controlPersoaneMasini = new ControlPersoaneMasini();

//        controlPersoaneMasini.afisareMasini();
        controlPersoaneMasini.afisarePersoane();
//        controlPersoaneMasini.loadPersoane();
//        controlPersoaneMasini.loadMasini();

//        controlPersoaneMasini.loadMap();


    }

    @Test
    void test2() {

        ControlPersoaneMasini controlPersoaneMasini = new ControlPersoaneMasini();
        controlPersoaneMasini.masiniByPersoana("Vasile");
        System.out.println("=====================");
        controlPersoaneMasini.masiniByPersoana("Ion");
        System.out.println("=====================");
        controlPersoaneMasini.masiniByPersoana("Popescu");


    }

    @Test
    void test3() {

        ControlPersoaneMasini controlPersoaneMasini = new ControlPersoaneMasini();

        controlPersoaneMasini.afisareMasini();
        controlPersoaneMasini.stergereMasina("Vasile", "Dacia");
        System.out.println("======================");
        controlPersoaneMasini.afisareMasini();

    }

    @Test
    void testStergereMasina() {

        ControlPersoaneMasini controlPersoaneMasini = new ControlPersoaneMasini();


        controlPersoaneMasini.stergereMasina("Vasile","Dacia");

    }

    @Test
    void testAddCarToPerson() {

        ControlPersoaneMasini controlPersoaneMasini = new ControlPersoaneMasini();

        Persoana p = new Persoana("Vasile", "Ion", "Bucuresti", 44, 2);
        Masina m = new Masina("Audi", "A4", 2020, 23, 12, 14);


        controlPersoaneMasini.addCarToPerson(p, m);


    }

    @Test
    void testMasinaCeaMaiScumpa() {

        ControlPersoaneMasini controlPersoaneMasini = new ControlPersoaneMasini();

        controlPersoaneMasini.masinaCeaMaiScumpa();

    }

    @Test
    void testMasinaCeaMaiIeftina() {

        ControlPersoaneMasini controlPersoaneMasini = new ControlPersoaneMasini();

        controlPersoaneMasini.masinaCeaMaiIeftina();


    }

    @Test
    void masinaCeaMaiNouaTest(){

        ControlPersoaneMasini controlPersoaneMasini = new ControlPersoaneMasini();
        System.out.println(controlPersoaneMasini.ceaMaiNouaMasina());

    }


}