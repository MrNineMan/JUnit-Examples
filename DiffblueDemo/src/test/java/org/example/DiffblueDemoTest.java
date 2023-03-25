package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DiffblueDemoTest {
    /**
     * Method under test: {@link DiffblueDemo#addInt(int, int)}
     */
    @Test
    void testAddInt() {
        assertEquals(4, (new DiffblueDemo()).addInt(2, 2));
        assertEquals(2, (new DiffblueDemo()).addInt(1, 1));
        assertEquals(5, (new DiffblueDemo()).addInt(3, 2));
        assertEquals(3, (new DiffblueDemo()).addInt(1, 2));
    }
}

