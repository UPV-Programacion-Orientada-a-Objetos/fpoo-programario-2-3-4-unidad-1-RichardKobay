package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioDosTest {

    @Test
    void isPositive_1() {
        EjercicioDos ejercicioDos = new EjercicioDos(true);
        assertTrue(ejercicioDos.isPositive(2));
    }

    @Test
    void isPositive_2() {
        EjercicioDos ejercicioDos = new EjercicioDos(true);
        assertTrue(ejercicioDos.isPositive(2435));
    }

    @Test
    void isPositive_3() {
        EjercicioDos ejercicioDos = new EjercicioDos(true);
        assertFalse(ejercicioDos.isPositive(-2));
    }

    @Test
    void isPositive_4() {
        EjercicioDos ejercicioDos = new EjercicioDos(true);
        assertFalse(ejercicioDos.isPositive(-47));
    }

}