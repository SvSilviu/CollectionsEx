package collections.produse;

import java.util.Comparator;

public class CompareProductByPret implements Comparator<Produs> {

    @Override
    public int compare(Produs o1, Produs o2) {
        if (o1.getPret() > o2.getPret()) {
            return 1;
        } else if (o1.getPret() < o2.getPret()) {
            return -1;
        } else
            return 0;
    }
}
