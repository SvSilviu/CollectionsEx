package Collections.produse;

public class Produs implements Comparable<Produs> {

    private String denumire;
    private String marca;
    private String model;
    private int nrStoc;
    private int an;
    private int pret;

    public Produs(String denumire, String marca, String model, int nrStoc, int an, int pret) {

        this.denumire = denumire;
        this.marca = marca;
        this.model = model;
        this.nrStoc = nrStoc;
        this.an = an;
        this.pret = pret;
    }

    public Produs(String text) {

        String[] proprietati = text.split(",");

        this.denumire = proprietati[0];
        this.marca = proprietati[1];
        this.model = proprietati[2];
        this.nrStoc = Integer.parseInt(proprietati[3]);
        this.an = Integer.parseInt(proprietati[4]);
        this.pret = Integer.parseInt(proprietati[5]);
    }

    public Produs() {

    }


    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrStoc() {
        return nrStoc;
    }

    public void setNrStoc(int nrStoc) {
        this.nrStoc = nrStoc;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", nrStoc=" + nrStoc +
                ", an=" + an +
                ", pret=" + pret +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Produs produs = (Produs) object;
        return this.nrStoc == produs.nrStoc && this.denumire.equals(produs.denumire);
    }

    @Override
    public int compareTo(Produs o) {
        if (this.an > o.an) {
            return 1;
        } else if (this.an < o.an) {
            return -1;
        } else
            return 0;
    }

}
