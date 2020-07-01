package com.codedifferently;

public class CoreFeatures {

    public Double add(Double num) {
        return SciCalculator.currentValue += num;
    }

    public Double subtract(Double num) {
        return SciCalculator.currentValue -= num;
    }

    public Double divide(Double num) {
        if (num == 0) {
            System.out.println("Can't divide by 0!");
            return SciCalculator.currentValue = 0;
        }
        return SciCalculator.currentValue /= num;
    }
    
    public Double multiply(Double num) {
        return SciCalculator.currentValue *= num;
    }

    public Double exponent(Double num) {
        return SciCalculator.currentValue = Math.pow(SciCalculator.currentValue, num);
    }

    public Double square() {
        return SciCalculator.currentValue *= SciCalculator.currentValue;
    }

    public Double squareRoot() {
        return SciCalculator.currentValue = Math.sqrt(SciCalculator.currentValue);
    }

    public Double inverse() {
        return SciCalculator.currentValue = 1 / SciCalculator.currentValue;
    }

    public Double invertSign() {
        return SciCalculator.currentValue *= -1;
    }

    public Double max(Double num) {
        return SciCalculator.currentValue = Math.max(SciCalculator.currentValue, num);
    }

    public Double min(Double num) {
        return SciCalculator.currentValue = Math.min(SciCalculator.currentValue, num);
    }

}