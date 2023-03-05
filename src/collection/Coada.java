package collection;

import collections.persoane.Persoana;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Coada {


    public void testAdd() {

        Persoana persoana1 = new Persoana("Ion", "Marin", "Bucuresti", 44);
        Persoana persoana2 = new Persoana("Maria", "Popescu", "Iasi", 30);
        Persoana persoana3 = new Persoana("Vali", "Ionescu", "Oradea", 55);

        Queue<Persoana> coada = new ArrayDeque<>();

        coada.add(persoana1);
        coada.add(persoana2);
        coada.add(persoana3);


        coada.remove();
        coada.remove();
        System.out.println(coada.element());

    }

    public void testStiva(){

        Persoana persoana1 = new Persoana("Ion", "Marin", "Bucuresti", 44);
        Persoana persoana2 = new Persoana("Maria", "Popescu", "Iasi", 30);
        Persoana persoana3 = new Persoana("Vali", "Ionescu", "Oradea", 55);

        Deque<Persoana> stiva = new ArrayDeque<>();

        stiva.push(persoana1);
        stiva.push(persoana2);
        stiva.push(persoana3);
        stiva.pop();

        System.out.println(stiva.peek());

    }


}
