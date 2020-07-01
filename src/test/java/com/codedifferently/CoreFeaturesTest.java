package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {
    
    @Test
    public void addTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 5;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.add(5.0);
        double expected = 10;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void subtractTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 10;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.subtract(5.0);
        double expected = 5;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void divideTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 50;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.divide(10.0);
        double expected = 5;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void multiplyTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 5;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.multiply(10.0);
        double expected = 50;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void exponentTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 5;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.exponent(3.0);
        double expected = 125;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void squareTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 10;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.square();
        double expected = 100;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void squareRootTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 49;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.squareRoot();
        double expected = 7;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void inverseTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 10;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.inverse();
        double expected = 0.1;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void invertSignTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 5;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.invertSign();
        double expected = -5;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void maxTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 5;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.max(10.0);
        double expected = 10.0;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void minTest() {
        //Given
        SciCalculator c = new SciCalculator();
        double num = 5;

        //When
        c.setCurrentValue(num);
        c.coreFeatures.min(10.0);
        double expected = 5;
        double actual = c.getCurrentValue();

        //Then
        Assert.assertEquals(expected, actual, 0.001);
    }

}