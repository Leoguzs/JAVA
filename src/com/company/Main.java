package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Estructura If
        /*if(condicion){

        }else if {

        }else{

        }*/

        /*System.out.println("ingresa tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        System.out.println("Cual es tu nombre?");
        sc.nextLine();
        String nombre = sc.nextLine();

        if(edad>=18){
            System.out.println(nombre + " puedes votar");
        } else {
            System.out.println("Aun no puedes votar, " + nombre + ":(");
        }
        sc.close();*/
        /* Solicitar al usuario 3 angulos de un triangulo y determinar si el triangulo
          es válido
         */
       /* int triangulo=180;
        System.out.println("Ingresa angulo 1");
        Scanner sc=  new Scanner (System.in);
        int angulo1 = sc.nextInt();
        System.out.println("Ingresa angulo 2");
        sc.nextLine();
        int angulo2 = sc.nextInt();
        System.out.println("Ingresa angulo 3");
        sc.nextLine();
        int angulo3 = sc.nextInt();

        if(angulo1+angulo3+angulo2==triangulo){
            System.out.println("Indeed, it's a triangle");
        } else {
            System.out.println("no es un triangulo ;(");
        }*/


        //Pedir un año al usuario por consola, y determinar si el
        //año es bisiesto.
        System.out.println("Ingresa el año que quieras, chaval");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%100!=0)&&(year%4==0)) {
            System.out.printf("Es bisiesto <3");
        } else {
            System.out.println("no es bisiesto :(");
        }

    }
}
