package com.company;

public class Main {

    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;

    public static void main(String[] args) {
        System.out.println("antes de division");


        try {
            division = numerador/denominador;
        } catch (Exception ex) {
            System.out.println( ex.getMessage());
        } finally {
            System.out.println("despues de division");
        }
    }
}
