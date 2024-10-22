package com.nseaf.mycalculator;

public class Calculator {
    String numberString = "0";
    String detailsString = "";
    long intNumber;
    double realNumber;
    boolean isIntNumber = true;
    boolean numHasRadixPoint = false;
    long memoryInt = 0;
    double memoryDouble = 0.0;
    boolean isIntMemory = true;
    double lastOperand = 0;
    String lastOperation = "";

    public Calculator() {}

    public void processNumber(int i) {
        if (numberString.length() < 12) {
            intNumber = intNumber * 10 + i;
            numberString = String.valueOf(intNumber);
            detailsString = "Clicked: " + i;
        } else {
            detailsString = "The number is too long..";
        }
    }

    public void clearClicked() {
        numberString = "0";
        detailsString = "";
        intNumber = 0;
        realNumber = 0.0;
        isIntNumber = true;
        numHasRadixPoint = false;
        lastOperand = 0;
        lastOperation = "";
    }

    public void memPlusClicked() {
        if (isIntMemory) {
            if (isIntNumber) {
                memoryInt += intNumber;
                detailsString = "Memory +: " + memoryInt;
            } else {
                isIntNumber = false;
                memoryDouble = memoryInt + realNumber;
                detailsString = "Memory +: " + memoryDouble;
            }
        }
    }

    public void memMinusClicked() {
        if (isIntMemory) {
            if (isIntNumber) {
                memoryInt -= intNumber;
                detailsString = "Memory -: " + memoryInt;
            } else {
                isIntNumber = false;
                memoryDouble = memoryInt - realNumber;
                detailsString = "Memory -: " + memoryDouble;
            }
        }
    }

    public void memClearClicked() {
        memoryInt = 0;
        memoryDouble = 0.0;
        isIntMemory = true;
        detailsString = "Memory Cleared";
    }

    public void memRecallClicked() {
        if (isIntMemory) {
            numberString = String.valueOf(memoryInt);
            detailsString = "Memory Recall: " + memoryInt;
            intNumber = memoryInt;
        } else {
            numberString = String.valueOf(memoryDouble);
            detailsString = "Memory Recall: " + memoryDouble;
            realNumber = memoryDouble;
        }
    }

    public void eToXClicked() {
        if (isIntNumber) {
            realNumber = Math.exp(intNumber);
            numberString = String.valueOf(realNumber);
            detailsString = "e^" + intNumber + " = " + numberString;
            isIntNumber = false;
        }
    }

    public void piClicked() {
        realNumber = Math.PI;
        numberString = String.valueOf(realNumber);
        detailsString = "π = " + numberString;
        isIntNumber = false;
    }

    public void divClicked() {
        if (isIntNumber) {
            lastOperand = intNumber;
            lastOperation = "divide";
            numberString = "0";
            intNumber = 0;
            detailsString = "Divide by: " + lastOperand;
        }
    }

    public void multiplyClicked() {
        if (isIntNumber) {
            lastOperand = intNumber;
            lastOperation = "multiply";
            numberString = "0";
            intNumber = 0;
            detailsString = "Multiply by: " + lastOperand;
        }
    }

    public void addClicked() {
        if (isIntNumber) {
            lastOperand = intNumber;
            lastOperation = "add";
            numberString = "0";
            intNumber = 0;
            detailsString = "Add: " + lastOperand;
        }
    }

    public void subtractClicked() {
        if (isIntNumber) {
            lastOperand = intNumber;
            lastOperation = "subtract";
            numberString = "0";
            intNumber = 0;
            detailsString = "Subtract: " + lastOperand;
        }
    }

    public void calculateLastOperation(double secondOperand) {
        if (lastOperation.equals("multiply")) {
            realNumber = lastOperand * secondOperand;
            numberString = String.valueOf(realNumber);
            detailsString = lastOperand + " × " + secondOperand + " = " + numberString;
            isIntNumber = false;
        } else if (lastOperation.equals("divide")) {
            realNumber = lastOperand / secondOperand;
            numberString = String.valueOf(realNumber);
            detailsString = lastOperand + " / " + secondOperand + " = " + numberString;
            isIntNumber = false;
        } else if (lastOperation.equals("add")) {
            realNumber = lastOperand + secondOperand;
            numberString = String.valueOf(realNumber);
            detailsString = lastOperand + " + " + secondOperand + " = " + numberString;
            isIntNumber = false;
        } else if (lastOperation.equals("subtract")) {
            realNumber = lastOperand - secondOperand;
            numberString = String.valueOf(realNumber);
            detailsString = lastOperand + " - " + secondOperand + " = " + numberString;
            isIntNumber = false;
        }
    }
}
