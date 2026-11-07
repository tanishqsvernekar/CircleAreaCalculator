
package com.devops;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleAreaTest {

    @Test
    public void testRadiusFive() {
        assertEquals(78.5398,
            CircleArea.calculateArea(5), 0.001);
    }

    @Test
    public void testRadiusZero() {
        assertEquals(0.0,
            CircleArea.calculateArea(0));
    }

    @Test
    public void testRadiusTwo() {
        assertEquals(12.5664,
            CircleArea.calculateArea(2), 0.001);
    }

    @Test
    public void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class,
            () -> CircleArea.calculateArea(-5));
    }
}
