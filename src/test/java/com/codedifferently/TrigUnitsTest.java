package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {

    @Test
    public void switchUnitsModeTest() {
        //Given
        TrigUnits t = new TrigUnits();

        //When
        t.switchUnitsMode();
        String expected = "radians";
        String actual = t.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchUnitsMode2Test() {
        //Given
        TrigUnits t = new TrigUnits();

        //When
        t.switchUnitsMode("radians");
        String expected = "radians";
        String actual = t.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getModeTest() {
        //Given
        TrigUnits t = new TrigUnits();

        //When
        String expected = "degrees";
        String actual = t.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }
    
}