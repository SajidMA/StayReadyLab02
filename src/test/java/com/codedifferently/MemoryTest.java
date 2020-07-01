package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {

    @Test
    public void addToMemoryTest() {
        //Given
        Memory m = new Memory();
        SciCalculator c = new SciCalculator();

        //When
        c.setCurrentValue(10);
        m.addToMemory();
        double expected = 10;
        double actual = m.recallMemory();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void resetMemoryTest() {
        //Given
        Memory m = new Memory();
        SciCalculator c = new SciCalculator();

        //When
        c.setCurrentValue(10);
        m.addToMemory();
        m.resetMemory();
        double expected = 0;
        double actual = m.recallMemory();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void recallMemoryTest() {
        //Given
        Memory m = new Memory();

        //When
        double expected = 0;
        double actual = m.recallMemory();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }
    
}