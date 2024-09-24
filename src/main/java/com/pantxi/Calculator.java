package com.pantxi;

public class Calculator {
    public static int add(int opG, int opD) {

        double somme = (double) opG + (double) opD;
        return (int) somme;
    }

    public static int divide(int opG, int opD) {
        return opG / opD;
    }
}
