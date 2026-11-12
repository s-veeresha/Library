
package com.aiml.LibraryFineCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App a = new App();

    @Test
    public void test1() {
        assertEquals(0, a.calculateFine(0));
    }

    @Test
    public void test2() {
        assertEquals(4, a.calculateFine(2));
    }

    @Test
    public void test3() {
        assertEquals(10, a.calculateFine(5));
    }

    @Test
    public void test4() {
        assertEquals(30, a.calculateFine(6));
    }

    @Test
    public void test5() {
        assertEquals(50, a.calculateFine(10));
    }
}
