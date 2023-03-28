package org.example.Model;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(ComplexNumber complexNumber) {
        return new Calculator(complexNumber);
    }
}
