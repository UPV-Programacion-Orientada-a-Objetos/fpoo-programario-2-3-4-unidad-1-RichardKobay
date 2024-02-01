package edu.upvictoria.fpoo.helpers.math;

import static org.junit.jupiter.api.Assertions.*;

class AritmethicTest {

    @org.junit.jupiter.api.Test
    void getPercentage_1() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(4, aritmethic.getPercentage(100, 4));
    }

    @org.junit.jupiter.api.Test
    void getPercentage_2() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(401.25, aritmethic.getPercentage(625, 64.2));
    }

    @org.junit.jupiter.api.Test
    void getPercentage_3() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(831.315057, aritmethic.getPercentage(243.2467, 341.758), 0.003);
    }

    @org.junit.jupiter.api.Test
    void getPercentage_4() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(1101.301357, aritmethic.getPercentage(3498.416, 31.48), 0.003);
    }

    @org.junit.jupiter.api.Test
    void getPercentage_5() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(0.31329, aritmethic.getPercentage(125.316, 0.25));
    }

    @org.junit.jupiter.api.Test
    void getPercentage_6() {
        Aritmethic aritmethic = new Aritmethic();
        assertEquals(4, aritmethic.getPercentage(100, 4));
    }

}