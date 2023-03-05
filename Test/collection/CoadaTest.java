package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class CoadaTest {

    @Test
    void coadaTest() {


        Coada coada = new Coada();

        coada.testAdd();

    }

    @Test
    void stivaTest() {

        Coada coada = new Coada();

        coada.testStiva();
    }


    @Test
    void test() {

        //Se da un text folosind o stiva sa se verifice daca textul este corect balantat [(asdasdas)

        String text = "{[(asdsadas(asdasdasd))]asasdasddas}";

        Deque<Character> stiva = new ArrayDeque<>();

        boolean flag = true;

        for (int i = 0; i < text.length() && flag; i++) {

            char caracter = text.charAt(i);

            if (caracter == '(' || caracter == '[' || caracter == '{') {
                stiva.push(caracter);
            } else if (caracter == ')') {
                if (stiva.isEmpty() || stiva.pop() != '(') {
                    flag = false;
                }
            } else if (caracter == ']') {
                if (stiva.isEmpty() || stiva.pop() != '[') {
                    flag = false;
                }
            } else if (caracter == '}') {
                if (stiva.isEmpty() || stiva.pop() != '{') {
                    flag = false;
                }
            }
        }

        if (stiva.isEmpty() && flag) {
            System.out.println("Este corect balantat");
        } else {
            System.out.println("Nu este corect balantat");
        }


    }

    //sa se inverseze un text folosind o coada

    @Test
    void testStringInversat() {

        String text = "ANA ARE MERE";

        Queue<Character> coada = new ArrayDeque<>();

        for (int i = text.length()-1; i>=0; i--) {
            coada.add(text.charAt(i));

        }
        String textInversat = "";
        while (coada.isEmpty() == false) {
            textInversat += coada.peek();
            coada.remove();
        }
        System.out.println(textInversat);
    }
}
