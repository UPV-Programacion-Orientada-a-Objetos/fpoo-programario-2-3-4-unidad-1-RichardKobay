package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioDieciochoTest {

    @Test
    void totalCost_1() {
        EjercicioDieciocho ejercicioDieciocho = new EjercicioDieciocho(true);

        assertEquals(5, ejercicioDieciocho.totalCost(1));
    }

    @Test
    void totalCost_2() {
        EjercicioDieciocho ejercicioDieciocho = new EjercicioDieciocho(true);

        assertEquals(12, ejercicioDieciocho.totalCost(3));
    }

    @Test
    void totalCost_3() {
        EjercicioDieciocho ejercicioDieciocho = new EjercicioDieciocho(true);

        assertEquals(30, ejercicioDieciocho.totalCost(10));
    }

    @Test
    void totalCost_4() {
        EjercicioDieciocho ejercicioDieciocho = new EjercicioDieciocho(true);

        assertEquals(60, ejercicioDieciocho.totalCost(30));
    }
}