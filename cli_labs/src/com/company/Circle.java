package com.company;

import java.lang.Math;
import java.text.NumberFormat;

public class Circle {
    private double radius;
    private static int count;

    public Circle(double r) {
        radius = r;
        count++;
    }

    public double getCircumference() {

        return 2 * (Math.PI * radius);
    }
    public String getFormattedCircumference() {

        return formatNumber(getCircumference());
    }
    public double getArea() {

        return (Math.PI * Math.pow(radius, 2));
    }
    public String getFormattedArea() {
        return formatNumber(getArea());
    }
    private String formatNumber(double x) {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(2);
        String formattedNumber = number.format(x);
        return formattedNumber;
    }
    public static int getObjectCount() {
        return count;
    }
}
