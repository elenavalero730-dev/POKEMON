package com.mycompany.pokemon;

import java.util.Random;
import java.util.Scanner;

public class JuegoPokemon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //INT PARA DESPUES ELEGIR POKEMON  -------------------------------------
        int opcion = 0;
        //INT PARA CONTAR CUANTOS POKEMON TENGO EN MI EQUIPO  ------------------
        int tamanioEquipo = 0;
        //STRING PARA ASIGNAR EL NOMBRE DEL RIVAL  -----------------------------
        String nombreRival="";
        while (nombreRival.isBlank() || nombreRival.isEmpty()) {
            System.out.println("\n+--------------------------------------+");
            System.out.println("|        COMO SE LLAMA TU RIVAL?       |");
            System.out.println("+--------------------------------------+\n");
            nombreRival = sc.nextLine();
        }

        //STRING PARA ASIGNAR MOTE AL POKEMON  ---------------------------------
        String nombrePersonalizado = null;
        //CREO UN OBJETO RANDOM PARA MULTIPLES USOS  ---------------------------
        Random random1 = new Random();
        //ARRAY DE LOS EQUIPOS POKEMON  ----------------------------------------
        Pokemon[] miEquipo = new Pokemon[2];
        Pokemon[] equipoRival = new Pokemon[2];

        //BUCLE PARA ELEGIR POKEMON, CON OPCION A MOTE, NO SALE HASTA QUE EL 
        //TAMAÑO DE EQUIPO SEA =2  ---------------------------------------------
        while (tamanioEquipo < 2) {

            System.out.println("\n+--------------------------------------+");
            System.out.println("|  ELIGE EL POKEMON " + (tamanioEquipo + 1) + " PARA TU EQUIPO   |");
            System.out.println("+--------------------------------------+");
            System.out.println("| 1. CHARMANDER   | 2. SQUIRTLE        |");
            System.out.println("| 3. BULBASAUR    | 4. PIKACHU         |");
            System.out.println("+--------------------------------------+");
            //GUARDO OPCION Y LIMPIO LINEA  ------------------------------------
            opcion = sc.nextInt();
            sc.nextLine();

            //OPCION A MOTE (SI LA OPCION ANTERIOR ES VÁLIDA)  -----------------
            if (opcion > 0 && opcion < 5) {
                System.out.println("\n¿Quieres ponerle un mote? (S/N)");
                //GUARDO LO ELEGIDO EN NUEVO STRING RESPUESTA
                String respuesta = sc.nextLine();
                //INICIALIZO VALOR DE NOMBREPERSONALIZADO A NULL (EN CASO DE QUE
                //NO ELIJA, AL SER NULL, NO DARA ERROR DE COMPILACION AL PASAR
                //LA VARIABLE NOMBREPERSONALIZADO VACÍA)
                nombrePersonalizado = null; //     

                //SI LA RESPUESTA ES SI, PIDE MOTE Y LO GUARDA EN NOMBREPERSONALIZADO
                if (respuesta.equalsIgnoreCase("S")) {
                    System.out.println("\nEscribe el mote:");
                    nombrePersonalizado = sc.nextLine();
                } else if (respuesta.equalsIgnoreCase("N")) {
                    System.out.println("\nEl nombre se asignará por defecto.");
                }
            }

            //SEGUN LA OPCION, AÑADE UN POKEMON U OTRO AL EQUIPO Y AUMENTA TAMAÑO
            switch (opcion) {
                case 1 -> {
                    miEquipo[tamanioEquipo] = new Charmander(nombrePersonalizado);
                    tamanioEquipo++;
                }
                case 2 -> {
                    miEquipo[tamanioEquipo] = new Squirtle(nombrePersonalizado);
                    tamanioEquipo++;
                }
                case 3 -> {
                    miEquipo[tamanioEquipo] = new Bulbasaur(nombrePersonalizado);
                    tamanioEquipo++;
                }
                case 4 -> {
                    miEquipo[tamanioEquipo] = new Pikachu(nombrePersonalizado);
                    tamanioEquipo++;
                }

                default ->
                    System.out.println("\nOPCION NO VALIDA. ELIGE ENTRE 1 Y 4");
            }
        }
        nombrePersonalizado = null;

        System.out.println( "\n+--------------------------------------+" +
                            "\n|      ESTADISTICAS DE TU EQUIPO       |" +
                            "\n+--------------------------------------+");
        
        //IMPRIME MI EQUIPO ----------------------------------------------------
        imprimirEquipoEstadisticas(miEquipo);

        //  ELIGE EQUIPO RIVAL ALEATORIAMENTE ----------------------------------
        for (int i = 0 ; i < equipoRival.length ; i++) {
            //en el randm1.nextInt SI INCLUYE el primer valor, pero NO INCLUYE
            //el segundo, por lo que le tenemos que dar uno más para que pueda tener pikachu
            opcion = random1.nextInt(1, 5);
            switch (opcion) {
                case 1 -> equipoRival[i] = new Charmander(nombrePersonalizado);
                case 2 -> equipoRival[i] = new Squirtle(nombrePersonalizado);                  
                case 3 -> equipoRival[i] = new Bulbasaur(nombrePersonalizado);               
                case 4 -> equipoRival[i] = new Pikachu(nombrePersonalizado); 
            }
        }
        
        System.out.println( "\n+--------------------------------------+" +
                            "\n|    ESTADISTICAS DEL EQUIPO RIVAL     |" +
                            "\n+--------------------------------------+");
        
        //IMPRIME EQUIPO RIVAL con un for-each ---------------------------------
        imprimirEquipoEstadisticas(equipoRival);
        
    }

    public static void imprimirEquipoEstadisticas(Pokemon[] equipo){
        for (Pokemon p : equipo) {
            System.out.println(p);
        }
    }
}
