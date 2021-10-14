package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // declaramos tamaño
        String universidades [] = new String [] {"ITVH", "ICEL", "BUAP", "UAM", "UNAM"};


        /*for(String universidad : universidades){
            System.out.println(universidad);
        }*/

        Set<String> frutas = new HashSet(4);
        //No puede contener elementos duplicados
        //El orden de los elementos puede variar
        //inicializar con valor minimo
        frutas.add("Mango");
        frutas.add("Fresa");
        frutas.add("Uva");
        frutas.add("Melon");
        frutas.add("Lima");

        for (String fruta : frutas){
            System.out.println(fruta);
        }
        System.out.println("-------------------------");

        Set<String> frutas2 = new TreeSet();
        //almacena por inicial
        frutas2.add("Mango");
        frutas2.add("Fresa");
        frutas2.add("Uva");
        frutas2.add("Melon");
        frutas2.add("Lima");


        for (String fruta : frutas2){
            System.out.println(fruta);
        }
        System.out.println("--------------------");

        Set<String> frutas3 = new LinkedHashSet<>(5);
        //Almacena en orden
        frutas3.add("Mango");
        frutas3.add("Fresa");
        frutas3.add("Uva");
        frutas3.add("Melon");
        frutas3.add("Lima");


        for (String fruta : frutas3){
            System.out.println(fruta);
        }

        System.out.println("--------------------");
        List<String> frutas4 =new ArrayList<>();
        //List sí admite duplicados
        frutas4.add("Mango");
        frutas4.add("Fresa");
        frutas4.add("Uva");
        frutas4.add("Melon");
        frutas4.add("Lima");
        frutas4.add("Lima");

        for(String fruta : frutas4) {
            System.out.println(fruta);
        }
        System.out.println(frutas4.get(4));
        int indice =frutas4.indexOf("Melon");
        System.out.println(frutas4.get(indice));

        System.out.println("---------LinkedList--------");
        List<String> frutas5 =new LinkedList<>();
        //List sí admite duplicados
        frutas5.add("Mango");
        frutas5.add("Fresa");
        frutas5.add("Uva");
        frutas5.add("Melon");
        frutas5.add("Lima");
        frutas5.add("Lima");

        for(String fruta : frutas4) {
            System.out.println(fruta);
        }
        System.out.println(frutas4.get(4));

        System.out.println("---------Map--------");
        Map<Integer, String> universidadess = new HashMap<Integer, String>();
        //Asocia claves con valores
        //no puede tener claves repetidas
        //Sólo puede teber un valior asociado a la clave
        universidadess.put(1, "IPN");
        universidadess.put(2, "UNAM");
        universidadess.put(3, "fff");
        universidadess.put(4, "UAMMM");
        universidadess.put(5, "IPN");
        System.out.println(universidadess.get(3));

        for (Map.Entry<Integer, String> universidad : universidadess.entrySet()) {
            System.out.println("clave=" + universidad.getKey() + ", valor=" + universidad.getValue());
        }

    }
}
