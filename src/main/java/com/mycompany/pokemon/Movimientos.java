
package com.mycompany.pokemon;

public class Movimientos {
    
    //pensar sobre pp restantes, lo creo como atributo? me seria util para 
    //crear un metodo que compruebe si puedo seguir usando ese movimiento
    //tendria que crear una manera de calcularlo y que por cada uso se le reste -1
    //tras conseguir logica de ataque se puede implementar, no es necesario
    //pedir parametro en el constructor
    
    private String nombre;
    private int potencia;
    private int precision;
    private ClaseMovimiento clase;
    private Tipos tipo;
    private int pp;
    //private int ppRestante; 
    private String descripcion;

    public Movimientos(String nombre, int potencia, int precision, ClaseMovimiento clase, Tipos tipo, int pp, String descripcion) {
        this.nombre = nombre;
        this.potencia = potencia;
        this.precision = precision;
        this.clase = clase;
        this.tipo = tipo;
        this.pp = pp;
        //this.ppRestante = ppRestante;
        this.descripcion = descripcion;
    }
    
    
    
}
