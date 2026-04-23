package com.mycompany.pokemon;

public class Charmander extends Pokemon implements TFuego {

      public Charmander(String nombrePersonalizado) {
        super(nombrePersonalizado);
        this.numPokedex=4;
        this.peso=8.5;
        this.sexo= random.nextBoolean() ? "Macho" : "Hembra";
        this.region="Kanto";  
        this.tipo="Fuego";    
        this.nombre="Charmander";
        if (this.mote == null) {
            this.mote = this.nombre;
        }
        this.vidaBase= random.nextInt(39,51);
        this.vida=calcularVida();
        this.vidaActual=calcularVida();
    }

    @Override
    public void PunioFuego(Pokemon p) {
    }

    @Override
    public void Ascuas(Pokemon p) {
    }

    @Override
    public void Lanzallamas(Pokemon p) {
    }

    @Override
    public void RuedaFuego(Pokemon p) {
    }
    
}
