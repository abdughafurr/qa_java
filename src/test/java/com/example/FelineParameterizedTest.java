package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 10})
    public void testGetKittensWithDifferentValues(int count) {
        Feline feline = new Feline();
        assertEquals(count, feline.getKittens(count));
    }
}