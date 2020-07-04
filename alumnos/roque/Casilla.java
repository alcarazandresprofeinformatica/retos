package com.rflores.my2048;

public class Casilla {
    /*
    Clase Casilla
    Esta clase representa una casilla del juego.
     */
    // Estados
    protected int posX;
    protected int posY;
    protected int lado;
    protected int valor;
    //Comportamientos
    // Constructtor
    public Casilla (int miX, int miY, int miLado, int miValor){
        posX=miX;
        posY=miY;
        lado=miLado;
        valor=miValor;
    }
    // Resto de comportamientos

    /*
        EsIgual comprueba que la casilla facilitada tiene el mismo número que la casilla actual
        Devuelve un verdadero si son iguales
     */
    public boolean esIgual (Casilla miCasilla){
     // devolvemos verdadero si el valor de ambas casillas son iguales
        return (miCasilla.valor==this.valor) ;
    }
    /*
        Suma los valores de la casilla facilitada y de la actual si son iguales
        devuelve un verdadero si se ha podido sumar
     */
    public boolean compruebaYSuma (Casilla miCasilla) {
        boolean resultado=false;

        if (esIgual(miCasilla)) {
            valor=valor*2;
            resultado=true;
        }
        return resultado;
    }

    // getters

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getLado() {
        return lado;
    }

    public int getValor() {
        return valor;
    }
}
