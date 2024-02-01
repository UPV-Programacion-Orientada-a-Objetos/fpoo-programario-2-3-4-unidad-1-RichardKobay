package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioQuinceTest {

    @Test
    void canVote_1() {
        EjercicioQuince ejercicioQuince = new EjercicioQuince(true);
        assertTrue(ejercicioQuince.canVote(18));
    }

    @Test
    void canVote_2() {
        EjercicioQuince ejercicioQuince = new EjercicioQuince(true);
        assertTrue(ejercicioQuince.canVote(21));
    }

    @Test
    void canVote_3() {
        EjercicioQuince ejercicioQuince = new EjercicioQuince(true);
        assertFalse(ejercicioQuince.canVote(12));
    }

    @Test
    void canVote_4() {
        EjercicioQuince ejercicioQuince = new EjercicioQuince(true);
        assertFalse(ejercicioQuince.canVote(17));
    }

}