package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void getFamilyReturnsCorrectString() {
        String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamily = animal.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test(expected = Exception.class)
    public void getFoodWithUnknownKindThrowsException() throws Exception {
        animal.getFood("Всеядное");
    }
}