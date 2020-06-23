package com.iespablopicasso.game2048;

public class Casilla {
    //ESTADO

    protected int posX;
    protected int posY;
    protected int casillaX;
    protected int casillaY;

    protected int ancho;
    protected int alto;

    protected int valor;
    protected String color;


    //CONSTRUCTOR
    public Casilla(int miCasillaX, int miCasillaY, int nuevaPosX,int nuevaPosY, int miAncho, int miAlto, int miValor, String miColor) {
        posX = nuevaPosX;
        posY = nuevaPosY;
        casillaX = miCasillaX;
        casillaY = miCasillaY;
        ancho = miAncho;
        alto = miAlto;
        valor = miValor;
        color = miColor;
    }

    //COMPORTAMIENTOs
    private boolean esIgual(Casilla miCasilla) {
        boolean resultado = false;

        if(miCasilla.getValor() == this.getValor()) {
            resultado = true;
        }

        return resultado;
    }
    public void compruebaYSuma(Casilla miCasilla) {
        boolean compara= this.esIgual(miCasilla);

        if (compara) {
            valor = this.getValor()*2;
            //miCasilla.pintarse();

        }

    }


    private void pintarse() {
        // TODO Auto-generated method stub

    }

    public int getPosX() {
        return posX;
    }


    public String getColor() {
        return color;
    }

    public int getPosY() {
        return posY;
    }


    public int getCasillaX() {
        return casillaX;
    }


    public int getCasillaY() {
        return casillaY;
    }


    public int getAncho() {
        return ancho;
    }


    public int getAlto() {
        return alto;
    }


    public int getValor() {
        return valor;
    }
}
