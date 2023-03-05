package dictionar;

import collections.masini.Masina;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Dictionar {

    public void exemplu() {

        Map<String, Masina> map = new Hashtable<>();

        Masina dacia = new Masina("Dacia", "Duster", 2020, 15);
        Masina audi = new Masina("Audi", "A8", 2022, 75);
        Masina bmw = new Masina("Bmw", "X6", 2021, 64);
        Masina mercedes = new Masina("Mercedes", "E-Class", 2023, 92);


        map.put("andrei", dacia);
        map.put("mihai", audi);
        map.put("george", bmw);
        map.put("maria", mercedes);

        Set<Map.Entry<String, Masina>> entrySet = map.entrySet();

        Iterator<Map.Entry<String, Masina>> it = entrySet.iterator();

        while (it.hasNext()) {

            Map.Entry<String, Masina> entry = it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

//        System.out.println(map.get("andrei"));
//
//        System.out.println(map.get("maria"));

        //afisare tuturor cheilor

        for (String key : map.keySet()){
            System.out.println(key);
        }

        //afisarea key-lor cu Iterator

        Iterator<Masina> iterator = map.values().iterator();
        Iterator<String> iterator2 = map.keySet().iterator();


        while (iterator.hasNext()){
            Masina m = iterator.next();
            System.out.println(m);
        }



        Map<String, List<Masina>> ex1 = new Hashtable<>();


    }
}


