package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioSieteTest {

    @Test
    void initialPrice_1() {
        EjercicioSiete ejercicioSiete = new EjercicioSiete(true);
        assertEquals(40,ejercicioSiete.initialPrice("a", 1, 20));
    }

    @Test
    void initialPrice_2() {
        EjercicioSiete ejercicioSiete = new EjercicioSiete(true);
        assertEquals(80, ejercicioSiete.initialPrice("A", 2, 50));
    }

    @Test
    void initialPrice_3() {
        EjercicioSiete ejercicioSiete = new EjercicioSiete(true);
        assertEquals(60, ejercicioSiete.initialPrice("b", 1, 30));
    }

    @Test
    void initialPrice_4() {
        EjercicioSiete ejercicioSiete = new EjercicioSiete(true);
        assertEquals(100,ejercicioSiete.initialPrice("B", 2, 50));
    }
}