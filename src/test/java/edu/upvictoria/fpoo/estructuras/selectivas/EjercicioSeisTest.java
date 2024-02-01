package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioSeisTest {

    @Test
    void newPrice_1() {
        EjercicioSeis ejercicioSeis = new EjercicioSeis(true);
        assertEquals(95*5, ejercicioSeis.newPrice(5));
    }

    @Test
    void newPrice_2() {
        EjercicioSeis ejercicioSeis = new EjercicioSeis(true);
        assertEquals(95*150, ejercicioSeis.newPrice(150));
    }

    @Test
    void newPrice_3() {
        EjercicioSeis ejercicioSeis = new EjercicioSeis(true);
        assertEquals(75*500, ejercicioSeis.newPrice(500));
    }

    @Test
    void newPrice_4() {
        EjercicioSeis ejercicioSeis = new EjercicioSeis(true);
        assertEquals(95*100, ejercicioSeis.newPrice(100));
    }

}