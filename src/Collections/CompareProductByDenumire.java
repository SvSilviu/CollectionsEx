package Collections;

import java.util.Comparator;

public class CompareProductByDenumire implements Comparator<Produs> {
    @Override
    public int compare(Produs o1, Produs o2) {

        return o1.getDenumire().compareTo(o2.getDenumire());
    }
}
