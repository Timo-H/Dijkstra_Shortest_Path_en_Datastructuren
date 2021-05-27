package ShortestPath;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReisTest {

    @Test
    public void getStappen() {
        Vlucht vlucht = new Vlucht(30, 10);
        Rit rit = new Rit(20);
        Treinrit treinrit = new Treinrit(25);

        ArrayList<Stap> stappen1 = new ArrayList<>();
        stappen1.add(vlucht);
        ArrayList<Stap> stappen2 = new ArrayList<>();
        stappen2.add(rit);
        stappen2.add(treinrit);

        Reis reis1 = new Reis(stappen1);
        Reis reis2 = new Reis(stappen2);

        assertEquals(1, reis1.getStappen().size());
        assertEquals(2, reis2.getStappen().size());
    }

    @Test
    public void getZwaarte() {
        Vlucht vlucht = new Vlucht(30, 10);
        Rit rit = new Rit(20);
        Treinrit treinrit = new Treinrit(25);

        ArrayList<Stap> stappen1 = new ArrayList<>();
        stappen1.add(vlucht);
        ArrayList<Stap> stappen2 = new ArrayList<>();
        stappen2.add(rit);
        stappen2.add(treinrit);

        Reis reis1 = new Reis(stappen1);
        Reis reis2 = new Reis(stappen2);

        assertEquals(40, reis1.getZwaarte());
        assertEquals(90, reis2.getZwaarte());
    }

    @Test
    public void compareTo() {
        Vlucht vlucht = new Vlucht(30, 10);
        Rit rit = new Rit(20);
        Treinrit treinrit = new Treinrit(25);

        ArrayList<Stap> stappen1 = new ArrayList<>();
        stappen1.add(vlucht);
        ArrayList<Stap> stappen2 = new ArrayList<>();
        stappen2.add(rit);
        stappen2.add(treinrit);

        Reis reis1 = new Reis(stappen1);
        Reis reis2 = new Reis(stappen2);

        assertEquals(-1, reis1.compareTo(reis2));
        assertEquals(1, reis2.compareTo(reis1));
    }
}