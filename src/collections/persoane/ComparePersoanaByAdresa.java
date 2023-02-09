package collections.persoane;

import java.util.Comparator;

public class ComparePersoanaByAdresa implements Comparator<Persoana> {
    @Override
    public int compare(Persoana o1, Persoana o2) {
        if (o1.getAdresa().length() > o2.getAdresa().length()) {
            return 1;
        } else if (o1.getAdresa().length() < o2.getAdresa().length()) {
            return -1;
        } else
            return 0;
    }
}
