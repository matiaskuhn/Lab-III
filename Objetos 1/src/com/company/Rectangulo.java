package com.company;

public class Rectangulo {

    private float ancho;
    private float alto;

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public void calcular(float alto,float ancho){
        System.out.println("Perimetro: "+(2*(ancho+alto))+"  Area: "+(ancho*alto));
    }
}
