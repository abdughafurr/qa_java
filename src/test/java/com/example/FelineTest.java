package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FelineTest {

    @Test
    public void testEatMeatReturnsCorrectFood() throws Exception {
        Feline feline = new Feline();
        assertNotNull(feline.eatMeat());
        assertEquals(3, feline.eatMeat().size());
    }

    @Test
    public void testGetFamilyReturnsCats() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensDefaultReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithCountReturnsCount() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}