package dictionarEx2;

public class Persoana {
    private int id;
    private String nume;
    private String prenume;
    private String adresa;
    private int varsta;


    public Persoana(String nume, String prenume, String adresa, int varsta, int id) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
        this.varsta = varsta;
        this.id = id;
    }

    public Persoana(String text) {
        String[] proprietati = text.split(",");
        this.nume = proprietati[0];
        this.prenume = proprietati[1];
        this.adresa = proprietati[2];
        this.varsta = Integer.parseInt(proprietati[3]);
        this.id = Integer.parseInt(proprietati[4]);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nume - " + nume + "\n" + "Prenume - " + prenume + "\n" + "Adresa - " +
                adresa + "\n" + "Varsta - " + varsta + "\n" + "Id - " + id + "\n";
    }

    @Override
    public boolean equals(Object o) {
        Persoana p = (Persoana) o;
        return id == p.id;
    }
}
