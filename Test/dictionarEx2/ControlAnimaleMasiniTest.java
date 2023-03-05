package dictionarEx2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControlAnimaleMasiniTest {

    @Test
    void test() {

        ControlAnimalePersoane controlAnimaleMasini = new ControlAnimalePersoane();


        controlAnimaleMasini.afisareAnimale();

        controlAnimaleMasini.afisarePersoana();
    }

    @Test
    void loadPersoaneTest() {

        ControlAnimalePersoane controlAnimalePersoane = new ControlAnimalePersoane();

        controlAnimalePersoane.loadPersoane();

        List<Persoana> persoanaList = controlAnimalePersoane.getPersoanaList();

        assertEquals(2, persoanaList.size());
        assertEquals("Vasile",persoanaList.get(1).getNume());
        System.out.println(persoanaList.get(0));


    }

}