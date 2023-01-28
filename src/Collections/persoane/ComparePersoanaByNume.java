package Collections.persoane;

import java.util.Comparator;

public class ComparePersoanaByNume implements Comparator<Persoana> {

    @Override
    public int compare(Persoana o1, Persoana o2) {
        if (o1.getNume().length() > o2.getNume().length()) {
            return 1;
        } else if (o1.getNume().length() < o2.getNume().length()) {
            return -1;
        } else
            return 0;
    }
}
