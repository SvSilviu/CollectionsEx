    package Collections.masini;

    import java.util.Comparator;

    public class CompareMasiniByModel implements Comparator<Masina> {
        @Override
        public int compare(Masina o1, Masina o2) {
            return o1.getModel().compareTo(o2.getModel());
        }
    }
