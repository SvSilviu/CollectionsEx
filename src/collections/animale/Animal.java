package collections.animale;

public class Animal implements Comparable<Animal> {

    private String denumire="";
    private Sex sex=Sex.INIT;
    private int ani=0;
    private String nume="";

    public Animal() {
    }

    public Animal(String denumire, Sex sex, int ani, String nume) {
        this.denumire = denumire;
        this.sex = sex;
        this.ani = ani;
        this.nume = nume;
    }

    public Animal(String text) {

        String[] proprietati = text.split(",");
        this.denumire = proprietati[0];
        this.nume = proprietati[1];
        this.sex = Sex.valueOf(proprietati[2]);
        this.ani = Integer.parseInt(proprietati[3]);
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAni() {
        return ani;
    }

    public void setAni(int ani) {
        this.ani = ani;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Denumire -" + this.denumire + "\n" + "Nume - " + this.nume + "\n" + "Sex - " + sex + "\n" + "Varsta :" + ani + "\n";
    }

    @Override
    public boolean equals(Object o) {
        return this.denumire.equals(((Animal) o).denumire);
    }

    @Override
    public int  compareTo(Animal o) {
        if (this.ani > o.ani) {
            return 1;
        } else if (this.ani < o.ani) {
            return -1;
        } else
            return 0;
    }
}
