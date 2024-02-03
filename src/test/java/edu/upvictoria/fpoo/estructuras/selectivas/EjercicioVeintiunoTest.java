package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioVeintiunoTest {

    @Test
    void amount_1() {
        EjercicioVeintiuno ejercicioVeintiuno = new EjercicioVeintiuno(true);
        assertEquals(2000, ejercicioVeintiuno.amount(29, 9));
    }

    @Test
    void amount_2() {
        EjercicioVeintiuno ejercicioVeintiuno = new EjercicioVeintiuno(true);
        assertEquals(1000, ejercicioVeintiuno.amount(29, 7.5));
    }

    @Test
    void amount_3() {
        EjercicioVeintiuno ejercicioVeintiuno = new EjercicioVeintiuno(true);
        assertEquals(500, ejercicioVeintiuno.amount(29, 6));
    }

    @Test
    void amount_4() {
        EjercicioVeintiuno ejercicioVeintiuno = new EjercicioVeintiuno(true);
        assertEquals(2000, ejercicioVeintiuno.amount(29, 9));
    }

    @Test
    void amount_5() {
        EjercicioVeintiuno ejercicioVeintiuno = new EjercicioVeintiuno(true);
        assertEquals(3000, ejercicioVeintiuno.amount(15, 9));
    }

    @Test
    void amount_6() {
        EjercicioVeintiuno ejercicioVeintiuno = new EjercicioVeintiuno(true);
        assertEquals(2000, ejercicioVeintiuno.amount(15, 8));
    }

    @Test
    void amount_7() {
        EjercicioVeintiuno ejercicioVeintiuno = new EjercicioVeintiuno(true);
        assertEquals(100, ejercicioVeintiuno.amount(15, 6));
    }

}