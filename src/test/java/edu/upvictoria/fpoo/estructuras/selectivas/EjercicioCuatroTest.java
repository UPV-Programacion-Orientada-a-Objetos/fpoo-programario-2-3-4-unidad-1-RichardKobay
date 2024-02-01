package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioCuatroTest {

    @Test
    void newPrice_1() {
        EjercicioCuatro ejercicioCuatro = new EjercicioCuatro(true);
        assertEquals(2125.85, ejercicioCuatro.newPrice(2501));
    }

    @Test
    void newPrice_2() {
        EjercicioCuatro ejercicioCuatro = new EjercicioCuatro(true);
        assertEquals(920, ejercicioCuatro.newPrice(1000));
    }

    @Test
    void newPrice_3() {
        EjercicioCuatro ejercicioCuatro = new EjercicioCuatro(true);
        assertEquals(1153.9652, ejercicioCuatro.newPrice(1254.31), 0.001);
    }

    @Test
    void newPrice_4() {
        EjercicioCuatro ejercicioCuatro = new EjercicioCuatro(true);
        assertEquals(55605.5244, ejercicioCuatro.newPrice(65418.264));
    }

}