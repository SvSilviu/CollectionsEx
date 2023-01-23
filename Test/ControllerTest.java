import Collections.Controller;
import Collections.Produs;
import org.testng.annotations.Test;

public class ControllerTest {
    @Test
    public void testController() {

        Produs produs = new Produs();

        Controller controller = new Controller();
//        controller.afisare();
//        System.out.println(controller.produsulCelMaiScump());
//        System.out.println(controller.findProductByName("Ceas"));
//        System.out.println(controller.ProdusulCelMaiIeftin());
//        controller.afisareInversa();
//        controller.shuffle();
//        System.out.println(controller.produsulCuCelMaiMareStock());
        controller.schimbareLocInLista(3, 2);

    }

}
