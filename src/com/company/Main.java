package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ciclo for
        /*
        for (contador = 0; contador < numero; contador ++) {

        }*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int numero = sc.nextInt();
        sc.close();

        for(int i = 1; i<=10; i++){
            System.out.println(numero + "x" + i + "=" + ( numero*i));
        } */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numero = sc.nextInt();
        sc.close();
        int inicio1=0, inicio2=1, sumaInicios= inicio1+inicio2;
        System.out.println(inicio1);

        for(int i= 0; i<numero; i++){
            System.out.println(sumaInicios);

            sumaInicios = inicio1 + inicio2;
            inicio1=inicio2;
            inicio2=sumaInicios;
        } */
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero secreto");
        int numero = sc.nextInt();
        int numeroSecreto=47;

        while(numero != numeroSecreto){
            System.out.println("No has encontrado el número secreto");
            numero = sc.nextInt();
        }
        System.out.println("Eres la ostia, lo adivinaste!!!!");
        sc.close(); */
/*
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int numeroSecreto=47;
        do {
            System.out.println("Adivina el numero secreto");
            numero = sc.nextInt();
        }
        while(numero != numeroSecreto);
        System.out.println("Eres la ostia, lo adivinaste!!!!");
        sc.close(); */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();

        int factorial = numero -1, multiplicación= numero  * factorial;

        while (factorial !=1) {
            System.out.println(multiplicación);
            factorial--;
            multiplicación=multiplicación*factorial;

        }
    }
}
