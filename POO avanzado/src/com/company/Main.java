package com.company;

import com.company.banco.CuentaBancaria;

public class Main {

    /* public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Carlos Eduardo");
        cuenta.setClave("dfdfd-33");
        cuenta.setSaldo(54836458);


        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();



        Persona persona = new Persona();
        persona.nombre = "Carlos";
        persona.edad = 93;

    }
    */
    public static void main(String[] args) {
        CuentaBancaria person = new CuentaBancaria();
        person.setName("Pepe");
        person.setAge(40);
        person.setId("scs944");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Id: " + person.getId());
    }
}
