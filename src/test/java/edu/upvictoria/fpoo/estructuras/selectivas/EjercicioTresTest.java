package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioTresTest {

    @Test
    void pricePerUnit_1() {
        EjercicioTres ejercicioTres = new EjercicioTres(true);
        assertEquals(3.65, ejercicioTres.pricePerUnit(1000));
    }

    @Test
    void pricePerUnit_2() {
        EjercicioTres ejercicioTres = new EjercicioTres(true);
        assertEquals(3.65, ejercicioTres.pricePerUnit(204954));
    }

    @Test
    void pricePerUnit_3() {
        EjercicioTres ejercicioTres = new EjercicioTres(true);
        assertEquals(4.83, ejercicioTres.pricePerUnit(500));
    }

    @Test
    void pricePerUnit_4() {
        EjercicioTres ejercicioTres = new EjercicioTres(true);
        assertEquals(4.83, ejercicioTres.pricePerUnit(3));
    }

}