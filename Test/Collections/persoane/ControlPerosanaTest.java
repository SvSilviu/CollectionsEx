package collections.persoane;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControlPerosanaTest {

    @Test
    public void byAdresaTest() {

        ComparePersoanaByAdresa comparePersoanaByAdresa = new ComparePersoanaByAdresa();

        Persoana persoana = new Persoana("Stancu", "Marian", "Bucuresti", 44);
        Persoana persoana1 = new Persoana("Marin", "Ion", "Targoviste", 38);

        ArrayList<Persoana> listaDePersoane = new ArrayList<>();

        listaDePersoane.add(persoana);
        listaDePersoane.add(persoana1);

        assertEquals(1, comparePersoanaByAdresa.compare(persoana1, persoana));
        assertEquals(-1, comparePersoanaByAdresa.compare(persoana, persoana1));
    }

    @Test
    public void ByNumeTest() {

        ComparePersoanaByNume comparePersoanaByNume = new ComparePersoanaByNume();
        Persoana persoana = new Persoana("Stancu", "Marian", "Bucuresti", 44);
        Persoana persoana1 = new Persoana("Marin", "Ion", "Targoviste", 38);

        ArrayList<Persoana> listaDePersoane = new ArrayList<>();

        listaDePersoane.add(persoana);
        listaDePersoane.add(persoana1);

        assertEquals(1, comparePersoanaByNume.compare(persoana, persoana1));
        assertEquals(-1, comparePersoanaByNume.compare(persoana1, persoana));
    }

    @Test
    public void byPrenumeTest() {

        ComparePersoanaByPrenume comparePersoanaByPrenume = new ComparePersoanaByPrenume();
        Persoana persoana = new Persoana("Stancu", "Marian", "Bucuresti", 44);
        Persoana persoana1 = new Persoana("Marin", "Ion", "Targoviste", 38);

        ArrayList<Persoana> listaDePersoane = new ArrayList<>();

        listaDePersoane.add(persoana);
        listaDePersoane.add(persoana1);
        listaDePersoane.sort(new ComparePersoanaByPrenume());

//        assertEquals(-1,comparePersoanaByPrenume.compare(persoana1,persoana));
        assertEquals(persoana, listaDePersoane.get(1));
        assertEquals(persoana1, listaDePersoane.get(0));

    }
    @Test
    public void afisare(){

        ControlPerosana controlPerosana = new ControlPerosana();
        controlPerosana.afisare();

    }

}