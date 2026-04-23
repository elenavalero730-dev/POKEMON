package com.mycompany.pokemon;

public class Bulbasaur extends Pokemon implements TPlanta {

    public Bulbasaur(String nombrePersonalizado) {
        super(nombrePersonalizado);
        this.numPokedex = 1;
        this.peso = 6.9;
        this.sexo = random.nextBoolean() ? "Macho" : "Hembra";
        this.region = "Kanto";
        this.tipo = "Planta";
        this.nombre = "Bulbasaur";
        if (this.mote == null) {
            this.mote = this.nombre;
        }
        this.vidaBase = random.nextInt(45, 50);
        this.vida=calcularVida();
        this.vidaActual=calcularVida();
    }

    @Override
    public void Paralizar(Pokemon p) {
    }

    @Override
    public void Drenaje(Pokemon p) {
    }

    @Override
    public void HojaAfilada(Pokemon p) {
    }

    @Override
    public void LatigoCepa(Pokemon p) {
    }

}
