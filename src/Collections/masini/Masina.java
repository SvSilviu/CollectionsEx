package Collections.masini;

public class Masina implements Comparable<Masina>{

    private String marca;
    private String model;
    private int an;
    private double pret;

    public Masina(String marca, String model, int an, double pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.pret = pret;
    }

    public Masina(String text) {
        String [] proprietati = text.split(",");
        this.marca = proprietati[0];
        this.model = proprietati[1];
        this.an = Integer.parseInt(proprietati[2]);
        this.pret = Integer.parseInt(proprietati[3]);
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

    public void setAn(int an) {
        this.an = an;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "masini{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", an=" + an +
                ", pret=" + pret +
                '}';
    }

    @Override
    public boolean equals(Object o){
        Masina m = (Masina) o;
        return this.pret==((Masina) o).pret&&this.an==((Masina) o).an;
    }

    @Override
    public int compareTo(Masina o) {


        if(this.an>o.an){

            return  1;
        }else if(this.an<o.an){
            return -1;
        }else
            return 0;

    }
}
