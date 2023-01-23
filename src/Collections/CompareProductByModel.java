package Collections;

import java.util.Comparator;

public class CompareProductByModel implements Comparator<Produs> {
    @Override
    public int compare(Produs o1, Produs o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
