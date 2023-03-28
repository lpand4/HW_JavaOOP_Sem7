package org.example.Controller;

import org.example.Model.Calculable;
import org.example.Model.Calculator;
import org.example.Model.ComplexNumber;
import org.example.Model.ICalculableFactory;
import org.example.View.InputData;

public class Controller {
    private ICalculableFactory calculableFactory;

    public Controller(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void start() {
        InputData in = new InputData();
        do {
            ComplexNumber cn = in.requestNum("Введите первое комплексное число: (пример:  -2 - 4i)");
            Calculable calc = calculableFactory.create(cn);
            while (true) {
                String mathSign = in.requestMathSign("Введите команду (+, -, *, /, =) :");

                if(mathSign.equals("+")) {
                    ComplexNumber arg = in.requestNum("Введите второе комплексное число: ");
                    calc.sum(arg);
                    continue;
                }
                if(mathSign.equals("-")) {
                    ComplexNumber arg = in.requestNum("Введите второе комплексное число: ");
                    calc.sub(arg);
                    continue;
                }
                if(mathSign.equals("*")) {
                    ComplexNumber arg = in.requestNum("Введите второе комплексное число: ");
                    calc.multi(arg);
                    continue;
                }
                if(mathSign.equals("/")) {
                    ComplexNumber arg = in.requestNum("Введите второе комплексное число: ");
                    calc.div(arg);
                    continue;
                }
                if(mathSign.equals("=")) {
                    ComplexNumber result = calc.getResult();
                    System.out.printf("Результат: %s\n", result);
                    break;
                }
            }
        } while (in.requestContinue());

    }
}
