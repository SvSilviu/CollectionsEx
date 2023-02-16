package collections.masini;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ControlMasiniTest {
    @Test
    public void test() {

        ArrayList<Masina> masinaArrayList = new ArrayList<>();


        Masina masina = new Masina("audi", "a8", 2020, 6);
        Masina masina1 = new Masina("Dacia", "logan", 2020, 5.2);

        ControlMasini controlMasini = new ControlMasini();
        controlMasini.afisare();
        controlMasini.load();


        masinaArrayList.add(masina);
        masinaArrayList.add(masina1);


    }

    @Test
    public void byMarcaTest() {

        CompareMasiniByMarca compareMasiniByMarca = new CompareMasiniByMarca();

        Masina masina = new Masina("audi", "a8", 2020, 60);
        Masina masina1 = new Masina("Dacia", "logan", 2020, 52);
        Masina masina2 = new Masina("Bmw", "Seria 7", 2022, 90);
        Masina masina3 = new Masina("Kia", "Ceed", 2019, 25);

        assertEquals(1, compareMasiniByMarca.compare(masina1, masina));
        assertEquals(0, compareMasiniByMarca.compare(masina2, masina3));
        assertEquals(-1, compareMasiniByMarca.compare(masina2, masina1));


    }

    @Test
    public void byModelTest() {

        CompareMasiniByModel compareMasiniByModel = new CompareMasiniByModel();

        Masina masina = new Masina("audi", "a8", 2020, 60);
        Masina masina1 = new Masina("Dacia", "logan", 2020, 52);

        ArrayList<Masina> masinaArrayList = new ArrayList<>();
        masinaArrayList.add(masina);
        masinaArrayList.add(masina1);


        masinaArrayList.sort(new CompareMasiniByModel());

        assertEquals(masina, masinaArrayList.get(0));
        assertEquals(masina1, masinaArrayList.get(1));


    }

    @Test
    public void byPretTest() {

        CompareMasiniByPret compareMasiniByPret = new CompareMasiniByPret();

        Masina masina = new Masina("audi", "a8", 2020, 60);
        Masina masina1 = new Masina("Dacia", "logan", 2020, 52);

        assertEquals(1, compareMasiniByPret.compare(masina, masina1));
        assertEquals(-1, compareMasiniByPret.compare(masina1, masina));
    }

    @Test
    public void byAnTest() {

        ControlMasini controlMasini = new ControlMasini();
//        System.out.println(controlMasini.findByMarca("Bmw"));
//        System.out.println(controlMasini.masinaCeaMaiScumpa());
//        System.out.println(controlMasini.masinaCeaMaiVeche());
//        controlMasini.schimbareLoc(0,1);
//        controlMasini.shuffle(1,3);
    }





}