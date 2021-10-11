package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// control de flujo
        /*switch(condicion){
            case 1:
                codigo
            break;
            case 1:
                codigo
            break;
            default:
                break;
        }*/
        /*Scanner sc = new Scanner(System.in);


        System.out.println("Ingresa un numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro numero");
        int numero2 = sc.nextInt();
        System.out.println("Ingresa la operacion deseada:\n1) Suma \n2) Resta" +
                "\n3) Multiplicación \n4) División");
        int operacion = sc.nextInt();
        sc.nextLine();
        float resultado = 0;

        switch (operacion){
            case 1:
                resultado = numero1+numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1*numero2;
                break;
            case 4:
                resultado = numero1/numero2;
                break;
            default:
                System.out.println("La operacion que seleccionaste es inválida");
                break;
        }
        sc.close();
        System.out.println(resultado);*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero de día de la semana");
        int numero = sc.nextInt();



        switch (numero){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Debe de ser un numero del 1-7 :p");
                break;

        }
    }
}
