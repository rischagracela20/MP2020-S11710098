package com.multiplatform;

public class SimpleCalculator {
    //Fields
    private  double firstNumber;
    private double secondNumber;

    //Method
    public  double getFirstNumber(){
        return  this.firstNumber;
    }
    public  double getSecondNumber(){
        return  this.secondNumber;
    }
    public  double setFirstNumber(double firstNumber){
        return  this.firstNumber = firstNumber;
    }
    public double setSecondNumber(double secondNumber){
        return  this.secondNumber = secondNumber;
    }
    public double getAdditionalResult(){
        return  this.firstNumber + this.secondNumber;
    }
    public  double getSubstractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return  this.firstNumber * this.secondNumber;
    }
    public  double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0;

        }
        return this.firstNumber / this.secondNumber;
    }
}
