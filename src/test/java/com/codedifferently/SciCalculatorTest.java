package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest {

    @Test
    public void SciCalculatorConstructorTest() {
        //Given
        SciCalculator c = new SciCalculator();

        //When
        double expected = 0;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void SciCalculatorConstructor2Test() {
        //Given
        SciCalculator c = new SciCalculator(20);

        //When
        double expected = 20;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void getCurrentValueTest() {
        //Given
        SciCalculator c = new SciCalculator();

        //When
        c.setCurrentValue(50);
        double expected = 50;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void clearCurrentValueTest() {
        //Given
        SciCalculator c = new SciCalculator();

        //When
        c.setCurrentValue(20);
        c.clearCurrentValue();
        double expected = 0;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void setCurrentValueTest() {
        //Given
        SciCalculator c = new SciCalculator();

        //When
        c.setCurrentValue(5);
        double expected = 5;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }
    
}
