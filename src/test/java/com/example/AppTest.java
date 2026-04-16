package com.library;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testCalculateFine() {
        assertEquals(0, App.calculateFine(10, 14, 10));
        assertEquals(20, App.calculateFine(16, 14, 10));
    }
}
