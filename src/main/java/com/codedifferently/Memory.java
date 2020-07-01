package com.codedifferently;

public class Memory {

    private double memoryValue = 0;

    public void addToMemory() {
        memoryValue = SciCalculator.currentValue;
    }

    public void resetMemory() {
        memoryValue = 0;
    }

    public Double recallMemory() {
        return SciCalculator.currentValue = memoryValue;
    }
    
}