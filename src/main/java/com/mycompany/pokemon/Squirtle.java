package com.mycompany.pokemon;

public class Squirtle extends Pokemon{

      public Squirtle(String nombrePersonalizado) {
        super(nombrePersonalizado);
        this.numPokedex=7;
        this.peso=9.0;
        this.sexo= random.nextBoolean() ? "Macho" : "Hembra";
        this.region="Kanto";
        this.tipo="Agua";    
        this.nombre="Squirtle";
        if (this.mote == null) {
            this.mote = this.nombre;
        }
        this.vidaBase= random.nextInt(44,54);
        this.vida=calcularVida();
        this.vidaActual=calcularVida();
    }  
}
