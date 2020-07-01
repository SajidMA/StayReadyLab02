package com.codedifferently;

public class SciCalculator {

    protected static double currentValue;
    protected DisplayMode displayMode;
    protected TrigFunctions trigFunctions;
    protected Memory memory;
    protected CoreFeatures coreFeatures;
    protected TrigUnits trigUnits;

    public SciCalculator() {
        currentValue = 0;
        displayMode = new DisplayMode();
        trigFunctions = new TrigFunctions();
        memory = new Memory();
        coreFeatures = new CoreFeatures();
        trigUnits = new TrigUnits();
    }

    public SciCalculator(double num) {
        this();
        currentValue = num;
    }

    public DisplayMode getDisplay() {
        return displayMode;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public Memory getMemory() {
        return memory;
    }

    public CoreFeatures getCoreFeatures() {
        return coreFeatures;
    }

    public void clearCurrentValue() {
        currentValue = 0;
    }

    public TrigFunctions getTrigFunctions() {
        return trigFunctions;
    }

    public void setCurrentValue(double num) {
        currentValue = num;
    }

    public TrigUnits getTrigUnits() {
        return trigUnits;
    }

}