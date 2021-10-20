package com.company.banco;
/*
public class CuentaBancaria {

    private String nombre;
    private String clave;
    private float saldo;

    public String getNombre() {
        return this.nombre;
    }

    public String getClave() {
        return this.clave;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setClave (String clave){
        this.clave = clave;
    }

    public void setSaldo (float saldo){
        if( saldo < 0 ){
            this.saldo = 0;
            System.out.println("Estas pobre, chavx");
        } else{
            this.saldo=saldo;
        }

    }

    public void mostrarSaldo() {
        System.out.println(this.saldo);
    }
} */
public class CuentaBancaria {

    private String name;

    private int age;

    private String id;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 50) {
            System.out.println("Ya estas grande");
            this.age = age;
        } else {
            this.age = age;
        }
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void mostrarId() {
        System.out.println(this.id);
    }
}
