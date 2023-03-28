package org.example;

import org.example.Controller.Controller;
import org.example.Model.CalculableFactory;
import org.example.Model.ICalculableFactory;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new CalculableFactory();
        Controller c = new Controller(calculableFactory);
        c.start();
    }
}