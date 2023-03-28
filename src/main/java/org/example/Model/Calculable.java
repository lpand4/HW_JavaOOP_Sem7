package org.example.Model;

public interface Calculable {
    Calculable sum(ComplexNumber arg);
    Calculable sub(ComplexNumber arg);
    Calculable div(ComplexNumber arg);
    Calculable multi(ComplexNumber arg);
    ComplexNumber getResult();
}
