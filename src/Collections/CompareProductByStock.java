package Collections;

import java.util.Comparator;

public class CompareProductByStock implements Comparator<Produs> {

    @Override
    public int compare(Produs o1, Produs o2) {
        if (o1.getNrStoc() > o2.getNrStoc()) {
            return 1;
        } else if (o1.getNrStoc() < o2.getNrStoc()) {
            return -1;
        } else
            return 0;
    }
}
