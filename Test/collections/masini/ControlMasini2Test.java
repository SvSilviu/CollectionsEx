package collections.masini;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControlMasini2Test {

    @Test
    void testCreate(){

        List<Masina> masini = new ArrayList<>();

        Masina dacia = new Masina("Dacia","Logan",2020,12);
        Masina audi = new Masina("Audi","A6",2021,35);

        masini.add(dacia);
        masini.add(audi);

        ControlMasini2 controlMasini2 = new ControlMasini2(masini);
        for(Masina m : masini){
            System.out.println(m.toString());
        }
        controlMasini2.createMasina(new Masina("BMW","Seria 7", 2022, 70));
        Iterator<Masina> iterator = masini.iterator();

        int contor = 0;

        while (iterator.hasNext()){
            contor++;
            iterator.next();
        }

        assertEquals(3,contor);
        System.out.println("=========================");
        for(Masina m : masini){
            System.out.println(m.toString());
        }

    }

    @Test
    void updateTest(){

        List<Masina> masini = new ArrayList<>();

        Masina dacia = new Masina("Dacia","Logan",2020,12);
        Masina audi = new Masina("Audi","A6",2021,35);

        masini.add(dacia);
        masini.add(audi);

        ControlMasini2 controlMasini2 = new ControlMasini2(masini);
        MasinaDTO masinaDTO = new MasinaDTO("Dacia");

        controlMasini2.afisare();

        System.out.println("==================================");

        masinaDTO.setAn(2017);
        masinaDTO.setPret(8);
        masinaDTO.setModel("Duster");

        controlMasini2.updateMasina(masinaDTO);

        controlMasini2.afisare();
    }

}