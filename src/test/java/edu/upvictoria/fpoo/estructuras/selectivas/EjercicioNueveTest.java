package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioNueveTest {

    @Test
    void totalPrice_1() {
        EjercicioNueve ejercicioNueve = new EjercicioNueve(true);
        assertEquals(3.5, ejercicioNueve.totalPrice(5, 7, 0));
    }

    @Test
    void totalPrice_2() {
        EjercicioNueve ejercicioNueve = new EjercicioNueve(true);
        assertEquals(11, ejercicioNueve.totalPrice(20, 5, 2));
    }

    @Test
    void totalPrice_3() {
        EjercicioNueve ejercicioNueve = new EjercicioNueve(true);
        assertEquals(3.5, ejercicioNueve.totalPrice(5, 7, 2));
    }

    @Test
    void totalPrice_4() {
        EjercicioNueve ejercicioNueve = new EjercicioNueve(true);
        assertEquals(3.85, ejercicioNueve.totalPrice(5, 5, 0));
    }

}