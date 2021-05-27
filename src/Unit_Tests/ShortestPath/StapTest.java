package ShortestPath;

import org.junit.Test;

import static org.junit.Assert.*;

public class StapTest {

    @Test
    public void getZwaarte() {
        Vlucht vlucht = new Vlucht(30, 10);
        Rit rit = new Rit(20);
        Treinrit treinrit = new Treinrit(25);

        assertEquals(40, vlucht.getZwaarte());
        assertEquals(40, rit.getZwaarte());
        assertEquals(50, treinrit.getZwaarte());
    }
}