package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {

    @Test
    public void switchDisplayModeTest() {
        //Given
        DisplayMode d = new DisplayMode();

        //When
        d.switchDisplayMode();
        d.switchDisplayMode();
        String expected = "binary";
        String actual = d.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchDisplayMode2Test() {
        //Given
        DisplayMode d = new DisplayMode();

        //When
        d.switchDisplayMode("octal");
        String expected = "octal";
        String actual = d.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getModeTest() {
        //Given
        DisplayMode d = new DisplayMode();

        //When
        String expected = "decimal";
        String actual = d.getMode();

        //Then
        Assert.assertEquals(expected, actual);
    }
    
}