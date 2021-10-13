package com.company;

public class dd {
    public static void main(String[] args) {
        String nombre = "Paul";
        //datos primitivos numericos
        byte num1 = 10;
        short numShort1 = num1;
        int numInt1= numShort1;


        short num2 = 10;
        int num3 = 9;
        long num4 = 24;

        float decimal1 = 10.45666665656f;
        double decimal2 = 10.57667d;

        boolean verdadero = true;
        char letra = 'A';

        byte numByte1= 120;
        byte numByte2=120;
        short suma = (short) (numByte1 + numByte2);

       // System.out.println(suma);

        //Operadores aritméticos en Java
        //+ sumar o concarenar cadenas
        // -, *, /, %

        //SUMA
        int numero1 = 10, numero2 =9;
        int res = numero1+numero2;
        System.out.println(res);
        //Resta
        int restaRes = numero1-numero2;
        System.out.println(restaRes);
        //Multiplicacion
        int multRes = numero1*numero2;
        System.out.println(multRes);
        //División
        double numDiv1= 30, numDiv2=9;
        double divRes =  (numDiv1/numDiv2);
        System.out.println(divRes);
        //Residuo
        double residuo= (numDiv1%numDiv2);
        System.out.println(residuo);


    }
}