package dictionar;

public class Masina {

    private int id;
    private String marca;
    private String model;
    private int an;
    private double pret;
    private int idPersoana;


    public Masina(String marca, String model, int an, double pret, int idPersoana, int id) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.pret = pret;
        this.idPersoana = idPersoana;
        this.id = id;
    }

    public Masina(String text) {
        String[] proprietati = text.split(",");
        this.marca = proprietati[0];
        this.model = proprietati[1];
        this.an = Integer.parseInt(proprietati[2]);
        this.pret = Integer.parseInt(proprietati[3]);
        this.idPersoana = Integer.parseInt(proprietati[4]);
        this.id = Integer.parseInt(proprietati[5]);
    }

    public Masina() {

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

    public int getAn() {
        return an;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public double getPret() {
        return pret;
    }
    public int getIdPersoana() {
        return idPersoana;
    }

    public void setIdPersoana(int idPersoana) {
        this.idPersoana = idPersoana;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Marca - " + marca + "\n" + "Model - " + model + "\n" + "An de fabricatie - " + an +
                "\n" + "Pret - " + pret + "\n" + "Id Persoana - " + idPersoana + "\n" + "Id - " + id + "\n";
    }

    @Override
    public boolean equals(Object o) {

       Masina m = (Masina) o;
       return pret==m.pret;
    }

}


