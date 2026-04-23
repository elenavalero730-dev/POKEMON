package com.mycompany.pokemon;

import java.util.Random;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected String region;
    protected String tipo;
    protected int nivel;
    protected int vidaBase;
    protected int vida;
    protected int vidaActual; //NUEVO
    protected boolean estaVivo;
    protected String mote;
    

    protected Random random = new Random();

    public Pokemon(String nombrePersonalizado) {
        //SI EL NOMBRE ES NULO O NO HA ESCRITO NADA, LO DEJAMOS COMO NULO PARA
        //LUEGO EN CADA CLASE HIJA DARLE SU NOMBRE POR DEFECTO
        if (nombrePersonalizado == null || nombrePersonalizado.isBlank() || nombrePersonalizado.isEmpty()) {
            this.mote = null;
        } else {
            this.mote = nombrePersonalizado;
        }
        
        this.estaVivo = true;
        this.nivel = 5;
    }

    //   METODO CALCULAR VIDA USANDO VIDABASE Y NIVEL   ------------------------
    protected int calcularVida() {
         
        return (((2 * this.vidaBase * this.nivel) / 100) + this.nivel + 10);
    }
    
    protected void setVidaActual(){
    this.vidaActual=this.vida;
    }
    
    public int getVidaActual(){
    return vidaActual;
    }

    //   NIVEL   ---------------------------------------------------------------
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //   VIDA   ----------------------------------------------------------------
    public int getVida() {
        return vida; 
    }

    public void setVida(int vida) {
        this.vida = vida; 
    }

    //   VIDA BASE   -----------------------------------------------------------
    public int getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(int vidaBase) {
        this.vidaBase = vidaBase;
    }

    //   ESTA VIVO   -----------------------------------------------------------
    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    //   NUM POKEDEX   ---------------------------------------------------------
    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    //   NOMBRE   --------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //   PESO   ----------------------------------------------------------------
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //   SEXO   ----------------------------------------------------------------
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //   REGION   --------------------------------------------------------------
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    //   TIPO   ----------------------------------------------------------------
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //   MOTE   ----------------------------------------------------------------
    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote; 
    }

//   ATAQUES BASICOS   ---------------------------------------------------------
    public void Placaje(Pokemon p) {
        //int danio = 0;
        System.out.println(this.nombre + " ha usado Placaje " + p.getNombre());

    }

    public void Araniazo(Pokemon p) {
        System.out.println(this.nombre + " ha usado Arañazo " + p.getNombre());
    }

    public void Mordisco(Pokemon p) {
        System.out.println(this.nombre + " ha usado Mordisco " + p.getNombre());
        System.out.println(p.getNombre() + "ha recibido (xdaño). Tiene +(p.getVida)+ puntos de vida) ");
    }

    //   ToString   ------------------------------------------------------------
    
    @Override
    public String toString() {
            
        return "\n\nESTADISTICAS DE " + mote.toUpperCase()
                + "\n========================================"
                + "\nNº POKEDEX : " + numPokedex
                + "\nNOMBRE     : " + nombre.toUpperCase()
                + "\nPESO       : " + peso + " KG"
                + "\nSEXO       : " + sexo.toUpperCase()
                + "\nREGION     : " + region.toUpperCase()
                + "\nTIPO       : " + tipo.toUpperCase()
                + "\nNIVEL      : " + nivel
                + "\nVIDA       : " + vidaActual +"/"+ vida +" HP" 
                + "\nESTADO     : " + (this.estaVivo ? "VIVO" : "DEBILITADO")
                + "\n========================================";
    }
}