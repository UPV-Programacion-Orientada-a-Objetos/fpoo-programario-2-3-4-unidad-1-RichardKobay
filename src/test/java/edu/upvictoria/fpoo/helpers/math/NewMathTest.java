package edu.upvictoria.fpoo.helpers.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewMathTest {

    @Test
    void max_1() {
        NewMath newMath = new NewMath();
        assertEquals(3, newMath.max(2, 3));
    }

    @Test
    void max_2() {
        NewMath newMath = new NewMath();
        assertEquals(3.5, newMath.max(-2, 3.5));
    }

    @Test
    void max_3() {
        NewMath newMath = new NewMath();
        assertEquals(-4.89, newMath.max(-4.89, -10));
    }

    @Test
    void max_4() {
        NewMath newMath = new NewMath();
        assertEquals(8, newMath.max(8, -0.25));
    }

    @Test
    void testMax_1() {
        NewMath newMath = new NewMath();
        assertEquals(22, newMath.max(2.6, -7.21, 22));
    }

    @Test
    void testMax_2() {
        NewMath newMath = new NewMath();
        assertEquals(-8.86, newMath.max(-9.6, -9.21, -8.86));
    }

    @Test
    void testMax_3() {
        NewMath newMath = new NewMath();
        assertEquals(22, newMath.max(-123, -7.21, 22));
    }

    @Test
    void testMax_4() {
        NewMath newMath = new NewMath();
        assertEquals(4.22, newMath.max(2.25, 4.22, 1.2));
    }

}