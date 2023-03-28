package org.example.Model;

import java.security.SecureRandom;

public class ComplexNumber {
    double realPart;
    double imgPart;


    public ComplexNumber(double realPart, double imgPart) {
        this.imgPart = imgPart;
        this.realPart = realPart;
    }

    @Override
    public String toString() {
        if(realPart!=0&&imgPart!=0) {
            if (imgPart > 0)
                return String.format("%s + %si", realPart, imgPart);
            else
                return String.format("%s - %si", realPart, Math.abs(imgPart));
        } else if (realPart == 0 && imgPart!=0) {
            return String.format("%si", imgPart);
        } else if (realPart != 0 && imgPart==0) {
            return String.format("%s", realPart);
        } else
            return "0";
    }
}
