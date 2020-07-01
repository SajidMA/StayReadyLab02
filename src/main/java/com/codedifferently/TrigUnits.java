package com.codedifferently;

public class TrigUnits {

    private String[] units = {"degrees", "radians"};
    private int index = 0;
    protected String whichUnit = units[index];

    public void switchUnitsMode() {
        if (index < units.length - 1) {
            index++;
            whichUnit = units[index];
        }
        else {
            index = 0;
            whichUnit = units[index];
        }
    }

    public void switchUnitsMode(String unit) {
        switch (unit) {
            case "degrees":
                index = 0;
                whichUnit = units[index];
                break;
            case "radians":
                index = 1;
                whichUnit = units[index];
                break;
            default:
                System.out.println("Not a unit!");
        }
    }

    public String getMode() {
        return whichUnit;
    }
    
}