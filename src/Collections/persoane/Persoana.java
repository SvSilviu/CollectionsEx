package Collections.persoane;

public class Persoana implements Comparable<Persoana> {

    private String nume;
    private String prenume;
    private String adresa;
    private int varsta;

    public Persoana(String nume, String prenume, String adresa, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.varsta = varsta;
    }

    public Persoana(String text) {
        String[] proprietati = text.split(",");
        this.nume = proprietati[0];
        this.prenume = proprietati[1];
        this.adresa = proprietati[2];
        this.varsta = Integer.parseInt(proprietati[3]);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Nume -" + nume + "\n" + "Prenume -" + prenume + "\n" + "Adresa -" + adresa + "\n" + "Varsta -" + varsta;
    }

    @Override
    public boolean equals(Object o) {
        Persoana persoana = (Persoana) o;
        return this.varsta == ((Persoana) o).varsta && this.nume.equals(((Persoana) o).nume) && this.prenume.equals(((Persoana) o).prenume);
    }

    @Override
    public int compareTo(Persoana o) {
        if (this.varsta > o.varsta) {
            return 1;
        } else if (this.varsta < o.varsta) {
            return -1;
        }
        return 0;
    }
}
