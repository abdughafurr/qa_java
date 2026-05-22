package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    private Feline feline;

    @BeforeEach
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testEatMeatReturnsNotNull() throws Exception {
        assertNotNull(feline.eatMeat());
    }

    @Test
    public void testEatMeatReturnsThreeFoodItems() throws Exception {
        assertEquals(3, feline.eatMeat().size());
    }

    @Test
    public void testGetFamilyReturnsCats() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensDefaultReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithCountReturnsCount() {
        assertEquals(5, feline.getKittens(5));
    }
}
