package Collections;

import java.util.Comparator;

public class CompareProductByMarca implements Comparator<Produs> {
    @Override
    public int compare(Produs o1, Produs o2) {
      return o1.getMarca().compareTo(o2.getMarca());
    }
}
