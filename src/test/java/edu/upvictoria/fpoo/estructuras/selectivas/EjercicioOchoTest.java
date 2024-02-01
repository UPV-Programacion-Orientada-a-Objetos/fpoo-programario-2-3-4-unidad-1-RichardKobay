package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioOchoTest {

    @Test
    void totalPricePerKid_1() {
        EjercicioOcho ejercicioOcho = new EjercicioOcho(true);
        assertEquals(65, ejercicioOcho.totalPricePerKid(100));
    }

    @Test
    void totalPricePerKid_2() {
        EjercicioOcho ejercicioOcho = new EjercicioOcho(true);
        assertEquals(70, ejercicioOcho.totalPricePerKid(99));
    }

    @Test
    void totalPricePerKid_3() {
        EjercicioOcho ejercicioOcho = new EjercicioOcho(true);
        assertEquals(95, ejercicioOcho.totalPricePerKid(40));
    }

    @Test
    void totalPricePerKid_4() {
        EjercicioOcho ejercicioOcho = new EjercicioOcho(true);
        assertEquals(200, ejercicioOcho.totalPricePerKid(20));
    }

}