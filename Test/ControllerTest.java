import Collections.produse.ControllerProduse;
import Collections.produse.Produs;
import org.testng.annotations.Test;

public class ControllerTest {
    @Test
    public void testController() {

        Produs produs = new Produs();

        ControllerProduse controllerProduse = new ControllerProduse();
//        controller.afisare();
//        System.out.println(controller.produsulCelMaiScump());
//        System.out.println(controller.findProductByName("Ceas"));
//        System.out.println(controller.ProdusulCelMaiIeftin());
//        controller.afisareInversa();
//        controller.shuffle();
//        System.out.println(controller.produsulCuCelMaiMareStock());
        controllerProduse.schimbareLocInLista(3, 2);

    }

}
