package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioOnceTest {

    @Test
    void calculateTotal_1() {
        EjercicioOnce ejercicioOnce = new EjercicioOnce(true);
        assertEquals(21, ejercicioOnce.calculateTotal(1, 1, true));
    }

    @Test
    void calculateTotal_2() {
        EjercicioOnce ejercicioOnce = new EjercicioOnce(true);
        assertEquals(20, ejercicioOnce.calculateTotal(1, 1, false));
    }

    @Test
    void calculateTotal_3() {
        EjercicioOnce ejercicioOnce = new EjercicioOnce(true);
        assertEquals(393.75, ejercicioOnce.calculateTotal(2, 15, true));
    }

    @Test
    void calculateTotal_4() {
        EjercicioOnce ejercicioOnce = new EjercicioOnce(true);
        assertEquals(50, ejercicioOnce.calculateTotal(2, 2, false));
    }

}