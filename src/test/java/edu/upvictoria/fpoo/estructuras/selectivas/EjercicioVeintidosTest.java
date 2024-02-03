package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioVeintidosTest {

    @Test
    void getNewSalary_1() {
        EjercicioVeintidos ejercicioVeintidos = new EjercicioVeintidos(true);
        assertEquals(1250, ejercicioVeintidos.getNewSalary(1000, 0));
    }

    @Test
    void getNewSalary_2() {
        EjercicioVeintidos ejercicioVeintidos = new EjercicioVeintidos(true);
        assertEquals(11000, ejercicioVeintidos.getNewSalary(10000, 0));
    }

    @Test
    void getNewSalary_3() {
        EjercicioVeintidos ejercicioVeintidos = new EjercicioVeintidos(true);
        assertEquals(13200, ejercicioVeintidos.getNewSalary(10000, 3));
    }

    @Test
    void getNewSalary_4() {
        EjercicioVeintidos ejercicioVeintidos = new EjercicioVeintidos(true);
        assertEquals(14300, ejercicioVeintidos.getNewSalary(10000, 7));
    }

}