package fr.lernejo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    static final Sample s = new Sample();

    @org.junit.jupiter.api.Test
    void opAddOneAdd() {
        assertEquals(2, s.op(Sample.Operation.ADD, 1,1));
    }

    @org.junit.jupiter.api.Test
    void opOneMultZero() {
        assertEquals(0, s.op(Sample.Operation.MULT, 0,1));
    }

    @org.junit.jupiter.api.Test
    void opSixMultSeven() {
        assertEquals(42, s.op(Sample.Operation.MULT, 6, 7));
    }

    @org.junit.jupiter.api.Test
    void factNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Sample().fact(-1));
    }

    @Test
    void factZero() {
        assertEquals(1, new Sample().fact(0));
    }

    @Test
    void factOne() {
        assertEquals(1, new Sample().fact(1));
    }

    @Test
    void factTen() {
        assertEquals(3628800, new Sample().fact(10));
    }
}
