package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioVeinteTest {

    @Test
    void totalWithDiscount_1() {
        EjercicioVeinte ejercicioVeinte = new EjercicioVeinte(true);
        assertEquals(89.1, ejercicioVeinte.totalWithDiscount(99));
    }

    @Test
    void totalWithDiscount_2() {
        EjercicioVeinte ejercicioVeinte = new EjercicioVeinte(true);
        assertEquals(175.12, ejercicioVeinte.totalWithDiscount(199));
    }

    @Test
    void totalWithDiscount_3() {
        EjercicioVeinte ejercicioVeinte = new EjercicioVeinte(true);
        assertEquals(340, ejercicioVeinte.totalWithDiscount(400));
    }

    @Test
    void totalWithDiscount_4() {
        EjercicioVeinte ejercicioVeinte = new EjercicioVeinte(true);
        assertEquals(89.1, ejercicioVeinte.totalWithDiscount(99));
    }

}