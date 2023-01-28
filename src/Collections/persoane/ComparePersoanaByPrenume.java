package Collections.persoane;

import java.util.Comparator;

public class ComparePersoanaByPrenume implements Comparator<Persoana> {
    @Override
    public int compare(Persoana o1, Persoana o2) {
        return o1.compareTo(o2);
    }
}
