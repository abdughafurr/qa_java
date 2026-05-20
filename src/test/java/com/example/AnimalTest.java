package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    @Test
    public void testGetFoodHerbivore() throws Exception {
        Animal animal = new Animal();
        assertEquals(2, animal.getFood("Травоядное").size());
    }

    @Test
    public void testGetFoodPredator() throws Exception {
        Animal animal = new Animal();
        assertEquals(3, animal.getFood("Хищник").size());
    }

    @Test
    public void testGetFoodUnknownThrowsException() {
        Animal animal = new Animal();
        assertThrows(Exception.class, () -> animal.getFood("Неизвестный"));
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        assertNotNull(animal.getFamily());
    }
}