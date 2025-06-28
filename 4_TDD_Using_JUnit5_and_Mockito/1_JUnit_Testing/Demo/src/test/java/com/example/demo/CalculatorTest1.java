package com.example.demo;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest1 {
    Calculator calc;

    // Arrange: Setup method
    @Before
    public void setUp() {
        calc = new Calculator();
    }

    // Act & Assert: Test method
    @Test
    public void testAdd() {
        int result = calc.add(2, 3);  // Act
        assertEquals(5, result);      // Assert
    }

    // Teardown method
    @After
    public void tearDown() {
        calc = null;
    }
}
