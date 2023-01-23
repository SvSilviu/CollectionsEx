import Collections.Controller;
import Collections.Produs;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ControllerTest {

    @Test
    public void testController(){

        Produs produs = new Produs();

        Controller controller = new Controller();
//        controller.afisare();
//        System.out.println(controller.produsulCelMaiScump());
        System.out.println(controller.findProductByName("Ceas"));
    }

}
