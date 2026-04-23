package com.mycompany.pokemon;

public class Squirtle extends Pokemon implements TAgua {

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

    @Override
    public void Hidrobomba(Pokemon p) {
        
    }

    @Override
    public void PistolaAgua(Pokemon p) {
         System.out.println(this.nombre+" está atacando a "+p.getNombre()+" con Pistola Agua");
    }

    @Override
    public void Burbuja(Pokemon p) {
        
    }

    @Override
    public void Hidropulso(Pokemon p) {
       
    }
    
}
