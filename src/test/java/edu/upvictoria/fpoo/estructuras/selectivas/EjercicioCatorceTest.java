package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioCatorceTest {

    @Test
    void calculateNewCreditLimit_1() {
        EjercicioCatorce ejercicioCatorce = new EjercicioCatorce(true);
        assertEquals(125, ejercicioCatorce.calculateNewCreditLimit(100, 1));
    }

    @Test
    void calculateNewCreditLimit_2() {
        EjercicioCatorce ejercicioCatorce = new EjercicioCatorce(true);
        assertEquals(135, ejercicioCatorce.calculateNewCreditLimit(100, 2));
    }

    @Test
    void calculateNewCreditLimit_3() {
        EjercicioCatorce ejercicioCatorce = new EjercicioCatorce(true);
        assertEquals(140, ejercicioCatorce.calculateNewCreditLimit(100, 3));
    }

    @Test
    void calculateNewCreditLimit_4() {
        EjercicioCatorce ejercicioCatorce = new EjercicioCatorce(true);
        assertEquals(150, ejercicioCatorce.calculateNewCreditLimit(100, 4));
    }

}