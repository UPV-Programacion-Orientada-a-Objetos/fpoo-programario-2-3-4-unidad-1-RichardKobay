package edu.upvictoria.fpoo.estructuras.selectivas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioDiecisieteTest {

    @Test
    void gift_1() {
        EjercicioDiecisiete ejercicioDiecisiete = new EjercicioDiecisiete(true);
        assertEquals("card", ejercicioDiecisiete.gift(10));
    }

    @Test
    void gift_2() {
        EjercicioDiecisiete ejercicioDiecisiete = new EjercicioDiecisiete(true);
        assertEquals("chocolate", ejercicioDiecisiete.gift(100));
    }

    @Test
    void gift_3() {
        EjercicioDiecisiete ejercicioDiecisiete = new EjercicioDiecisiete(true);
        assertEquals("flowers", ejercicioDiecisiete.gift(120));
    }

    @Test
    void gift_4() {
        EjercicioDiecisiete ejercicioDiecisiete = new EjercicioDiecisiete(true);
        assertEquals("ring", ejercicioDiecisiete.gift(450));
    }

}