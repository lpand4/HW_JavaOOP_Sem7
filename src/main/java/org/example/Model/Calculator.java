package org.example.Model;

public class Calculator implements Calculable {
    private ComplexNumber complexNumber;

    public Calculator(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        complexNumber.imgPart += arg.imgPart;
        complexNumber.realPart += arg.realPart;
        return this;
    }

    @Override
    public Calculable sub(ComplexNumber arg) {
        complexNumber.imgPart -= arg.imgPart;
        complexNumber.realPart -= arg.realPart;
        return this;
    }

    @Override
    public Calculable div(ComplexNumber arg) {
        double real = (complexNumber.realPart*arg.realPart + complexNumber.imgPart*arg.imgPart)/
                (arg.realPart* arg.realPart + arg.imgPart* arg.imgPart);
        double img = (arg.realPart*complexNumber.imgPart - complexNumber.realPart* arg.imgPart)/
                (arg.realPart* arg.realPart + arg.imgPart* arg.imgPart);
        complexNumber.realPart = real;
        complexNumber.imgPart = img;
        return this;
    }

    @Override
    public Calculable multi(ComplexNumber arg) {
        double real = (complexNumber.realPart * arg.realPart) - ((complexNumber.imgPart*arg.imgPart));
        double img = (complexNumber.realPart * arg.imgPart) + (complexNumber.imgPart * arg.realPart);
        complexNumber.realPart = real;
        complexNumber.imgPart = img;
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return complexNumber;
    }
}
