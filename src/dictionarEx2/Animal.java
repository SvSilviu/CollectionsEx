package dictionarEx2;

import collections.animale.Sex;

public class Animal {
    private String denumire = "";
    private int ani = 0;
    private String nume = "";
    private int idAnimal;
    private int id;

    public Animal(String denumire, int ani, String nume, int idAnimal, int id) {
        this.denumire = denumire;
        this.ani = ani;
        this.nume = nume;
        this.idAnimal = idAnimal;
        this.id = id;
    }

    public Animal(String text) {

        String[] proprietati = text.split(",");
        this.denumire = proprietati[0];
        this.nume = proprietati[1];
        this.ani = Integer.parseInt(proprietati[2]);
        this.idAnimal = Integer.parseInt(proprietati[3]);
        this.id = Integer.parseInt(proprietati[4]);
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Denumire -" + this.denumire + "\n" + "Nume - " + this.nume + "\n" + "Varsta :" + ani + "\n" + "Id Animal - " + idAnimal + "\n" + "Id - " + id + "\n";
    }

    @Override
    public boolean equals(Object o) {
        Animal a = (Animal) o;
        return id == a.id;
    }

}
