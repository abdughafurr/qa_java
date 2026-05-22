package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private Animal animal;

    @BeforeEach
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void testGetFoodHerbivore() throws Exception {
        assertEquals(2, animal.getFood("Травоядное").size());
    }

    @Test
    public void testGetFoodPredator() throws Exception {
        assertEquals(3, animal.getFood("Хищник").size());
    }

    @Test
    public void testGetFoodUnknownThrowsException() {
        assertThrows(Exception.class, () -> animal.getFood("Неизвестный"));
    }

    @Test
    public void testGetFamily() {
        assertNotNull(animal.getFamily());
    }
}
