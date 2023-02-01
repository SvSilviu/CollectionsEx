package collections.masini;

import java.util.Comparator;

public class CompareMasiniByMarca implements Comparator<Masina> {

    @Override
    public int compare(Masina o1, Masina o2) {

        if (o1.getMarca().length() > o2.getMarca().length()) {
            return 1;
        } else if (o1.getMarca().length() < o2.getMarca().length()) {
            return -1;
        } else
            return 0;

    }
}
