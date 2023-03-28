package org.example.View;

import org.example.Controller.Controller;
import org.example.Model.ComplexNumber;


import java.util.Scanner;

public class InputData {

    public InputData() {
    }

    public ComplexNumber requestNum(String msg) {
        while (true){
            try {
                Scanner in = new Scanner(System.in);
                System.out.println(msg);
                String userNumber = in.nextLine();
                String[] partsOfNumber = userNumber.split(" ");
                if (partsOfNumber.length == 3) {
                    if (partsOfNumber[1].equals("-"))
                        return new ComplexNumber(Double.parseDouble(partsOfNumber[0]),
                                Double.parseDouble(partsOfNumber[2].toLowerCase().replace("i", "")) * -1);
                    else
                        return new ComplexNumber(Double.parseDouble(partsOfNumber[0]),
                                Double.parseDouble(partsOfNumber[2].toLowerCase().replace("i", "")));
                } else if (partsOfNumber[0].equals("i"))
                    return new ComplexNumber(0, 1);
                else if (partsOfNumber[0].equals("-i"))
                    return new ComplexNumber(0, -1);
                else if (partsOfNumber[0].contains("i"))
                    return new ComplexNumber(0, Double.parseDouble(partsOfNumber[0].replace("i", "")));
                else
                    return new ComplexNumber(Double.parseDouble(partsOfNumber[0]), 0);
            }catch (NumberFormatException e){
                System.out.println("Неверный ввод числа");
            }
        }
    }
    public String requestMathSign(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        String userMathSign;
        while (true){
            userMathSign = in.nextLine();
            if("+ - * / =".contains(userMathSign)){
                return userMathSign;
            }else
                System.out.println("Вы ввели неверный знак");
        }
    }

    public boolean requestContinue(){
        Scanner in = new Scanner(System.in);
        System.out.print("Желаете посчитать ещё?\nY/N?");
        String userAnswer;
        while (true) {
            userAnswer = in.nextLine();
            if(userAnswer.equals("Y"))
                return true;
            else if (userAnswer.equals("N"))
                return false;
            else
                System.out.println("Вы ввели неверное значение!");
        }

    }
}
