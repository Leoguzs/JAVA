package com.company;
import static java.lang.Math. *;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String mensaje = saludar( "Leonardo");
            System.out.println(mensaje);
            int resultado = suma(4,5);
            System.out.println(resultado);
            resultado = suma(1,55);
            System.out.println(resultado);

         */
        double num1 = 19.77;
        double num2 = 23.23;
        System.out.println(Math.pow(5, 2));

        String nombre = "leon";
        String apellido = "guzman";
        System.out.println(nombre.length());

        //equals compara dos string y nos devuelve verdadero si son iguales
        //equalsIgnoreCase compara sin tener en cuenta minusculas y mayusculas
        System.out.println(nombre.equals(4));
        System.out.println(nombre.toUpperCase());
    }

    public static String saludar(String nombre) {
        return "Hola, " + nombre + " que hay!!";
    }

    public static int suma (int numero1, int numero2){
        return numero1+numero2;
    }
}
