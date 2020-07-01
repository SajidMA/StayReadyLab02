package com.codedifferently;

public class DisplayMode {
    
    private String[] displays = {"binary", "octal", "decimal", "hexadecimal"};
    private int index = 2;
    protected String whichDisplay = displays[index];

    public void switchDisplayMode() {
        if (index < displays.length - 1) {
            index++;
            whichDisplay = displays[index];
        }
        else {
            index = 0;
            whichDisplay = displays[index];
        }
    }

    public void switchDisplayMode(String display) {
        switch (display) {
            case "binary":
                index = 0;
                whichDisplay = displays[index];
                break;
            case "octal":
                index = 1;
                whichDisplay = displays[index];
                break;
            case "decimal":
                index = 2;
                whichDisplay = displays[index];
                break;
            case "hexadecimal":
                index = 3;
                whichDisplay = displays[index];
                break;
            default:
                System.out.println("Not a display!");
        }
    }

    public String getMode() {
        return whichDisplay;
    }

}