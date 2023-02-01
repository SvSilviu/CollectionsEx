package collections.masini;

import java.util.Comparator;

public class CompareMasiniByPret implements Comparator<Masina> {

    @Override
    public int compare(Masina o1, Masina o2) {
        if (o1.getPret() > o2.getPret()) {
            return 1;
        } else if (o1.getPret() < o2.getPret()) {
            return -1;
        } else
            return 0;
    }
}
