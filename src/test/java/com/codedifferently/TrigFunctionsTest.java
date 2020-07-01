package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionsTest {

    @Test
    public void sineTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 30;

        //When
        c.setCurrentValue(num);
        c.trigFunctions.sine();
        double expected = Math.sin(30);
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void cosineTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 30;

        //When
        c.setCurrentValue(num);
        c.trigFunctions.cosine();
        double expected = Math.cos(30);
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void tangentTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 30;

        //When
        c.setCurrentValue(num);
        c.trigFunctions.tangent();
        double expected = Math.tan(30);
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseSineTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 30;

        //When
        c.setCurrentValue(num);
        c.trigFunctions.inverseSine();
        double expected = Math.asin(30);
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseCosineTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 30;

        //When
        c.setCurrentValue(num);
        c.trigFunctions.inverseCosine();
        double expected = Math.acos(30);
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseTangentTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 30;

        //When
        c.setCurrentValue(num);
        c.trigFunctions.inverseTangent();
        double expected = Math.atan(30);
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }
    
}