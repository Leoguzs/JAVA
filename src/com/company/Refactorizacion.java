package com.company;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //sum begins
        Scanner console = new Scanner( System.in);
        System.out.print("Enter addition number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter addition number 2  ");
        int num2 = console.nextInt();
        int addition =sum(num1, num2);
        System.out.println(addition);
        //sum ends

        //res begins
        System.out.print("Enter subtraction number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter subtraction number 2  ");
        num2 = console.nextInt();
        int subtraction = res(num1, num2);
        System.out.println( num1 +" - " +num2+" = "+ subtraction);
        //res ends

        //mult begins
        System.out.print("Enter multiplication number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter multiplication number 2  ");
        num2 = console.nextInt();
        int multiplication =mult(num1, num2);
        System.out.println( num1+" * "+num2+" = "+ multiplication);
        //mult ends

        //div begins
        System.out.print("Enter division number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter division number 2  ");
        num2 = console.nextInt();
        int division = div(num1, num2);
        System.out.println( num1+" / "+num2+" = "+ division);
        //div ends
    }

        //methods
        public static int sum (int num1, int num2){
        return num1+num2;
        }
        public static int res (int num1, int num2){
        return num1-num2;
    }
        public static int mult (int num1, int num2){
        return num1*num2;
    }
        public static int div (int num1, int num2){
        return num1/num2;
    }

}

