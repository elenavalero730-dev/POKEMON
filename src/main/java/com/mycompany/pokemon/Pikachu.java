package com.mycompany.pokemon;

public class Pikachu extends Pokemon  {

    public Pikachu(String nombrePersonalizado) {
        super(nombrePersonalizado);   
        this.numPokedex=25;
        this.peso=6.0;
        this.sexo= random.nextBoolean() ? "Macho" : "Hembra";
        this.region="Kanto";
        this.tipo="Eléctrico";    
        this.nombre="Pikachu";
        //SI EN LA CLASE PADRE NO HEMOS PODIDO ASIGNAR UN NOMBRE, AÑADIMOS EL 
        //NOMBRE POR DEFECTO
        if (this.mote==null) {
            this.mote=this.nombre;
        }       
        //LA VIDABASE SE GENERA RANDOM SEGUN EL RANGO ESPECIFICO DE CADA POKEMON
        this.vidaBase= random.nextInt(35,46);
        this.vida=calcularVida();
        this.vidaActual=calcularVida();
    }
}