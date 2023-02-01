package collections.produse;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControllerProduseTest {

    @Test
    public void byDenumireTest() {

        Produs produs = new Produs("Masina", "BMW", "X6", 2, 2021, 75);
        Produs produs1 = new Produs("TV", "LG", "UltraLight", 10, 2020, 5);

        ArrayList<Produs> produses = new ArrayList<>();
        produses.add(produs);
        produses.add(produs1);

        produses.sort(new CompareProductByDenumire());

        assertEquals(produs, produses.get(0));
        assertEquals(produs1, produses.get(1));

    }

    @Test
    public void byMarcaTest() {

        Produs produs = new Produs("Masina", "BMW", "X6", 2, 2021, 75);
        Produs produs1 = new Produs("TV", "LG", "UltraLight", 10, 2020, 5);

        ArrayList<Produs> produses = new ArrayList<>();

        produses.add(produs);
        produses.add(produs1);
        produses.sort(new CompareProductByMarca());

        assertEquals(produs, produses.get(0));
        assertEquals(produs1, produses.get(1));

    }

    @Test
    public void byModelTest() {

        Produs produs = new Produs("Masina", "BMW", "X6", 2, 2021, 75);
        Produs produs1 = new Produs("TV", "LG", "UltraLight", 10, 2020, 5);

        ArrayList<Produs> produses = new ArrayList<>();
        produses.add(produs);
        produses.add(produs1);
        produses.sort(new CompareProductByModel());

        assertEquals(produs, produses.get(0));
        assertEquals(produs1, produses.get(1));

    }

    @Test
    public void byPretTest() {

        CompareProductByPret compareProductByPret = new CompareProductByPret();

        Produs produs = new Produs("Masina", "BMW", "X6", 2, 2021, 75);
        Produs produs1 = new Produs("TV", "LG", "UltraLight", 10, 2020, 5);

        assertEquals(-1, compareProductByPret.compare(produs1, produs));


    }

    @Test
    public void byStockTest() {

        CompareProductByStock compareProductByStock = new CompareProductByStock();

        Produs produs = new Produs("Masina", "BMW", "X6", 2, 2021, 75);
        Produs produs1 = new Produs("TV", "LG", "UltraLight", 10, 2020, 5);

        assertEquals(1, compareProductByStock.compare(produs1, produs));
    }

    @Test
    public void controllerProduseTest() {

        ControllerProduse controllerProduse = new ControllerProduse();

//        controllerProduse.afisare();
//        System.out.println(controllerProduse.findProductByName("Masina"));
//        System.out.println(controllerProduse.produsulCelMaiScump());
//        System.out.println(controllerProduse.ProdusulCelMaiIeftin());
//        System.out.println(controllerProduse.produsulCuCelMaiMareStock());
//        controllerProduse.shuffle(0,3);
//        controllerProduse.schimbareLocInLista(1,3);
//        controllerProduse.afisareInversa();
    }

}
