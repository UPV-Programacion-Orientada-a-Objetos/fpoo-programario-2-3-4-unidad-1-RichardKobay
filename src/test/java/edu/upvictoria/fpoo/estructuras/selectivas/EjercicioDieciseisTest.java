package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioDieciseisTest {

    @Test
    void total_1() {
        EjercicioDieciseis ejercicioDieciseis = new EjercicioDieciseis(true);
        assertEquals(200, ejercicioDieciseis.total(5, 40));
    }

    @Test
    void total_2() {
        EjercicioDieciseis ejercicioDieciseis = new EjercicioDieciseis(true);
        assertEquals(210, ejercicioDieciseis.total(5, 41));
    }

    @Test
    void total_3() {
        EjercicioDieciseis ejercicioDieciseis = new EjercicioDieciseis(true);
        assertEquals(20, ejercicioDieciseis.total(4, 5));
    }

    @Test
    void total_4() {
        EjercicioDieciseis ejercicioDieciseis = new EjercicioDieciseis(true);
        assertEquals(100, ejercicioDieciseis.total(50, 2));
    }

}