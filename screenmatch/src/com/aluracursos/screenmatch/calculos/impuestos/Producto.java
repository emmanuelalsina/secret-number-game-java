package com.aluracursos.screenmatch.calculos.impuestos;



public class Producto extends Item implements Tributable{

    private double peso;

    public double calculaImpuesto() {
        //producto tiene 10% de impuesto:
        return getPrecio() * 0.1;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}