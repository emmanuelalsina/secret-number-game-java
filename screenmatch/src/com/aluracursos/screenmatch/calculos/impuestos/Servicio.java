package com.aluracursos.screenmatch.calculos.impuestos;


// Servicio Hereda los parámetros de la case made Item y añade su propio atributo cantidadHoras
//implemeta Tributable, que es una interfaz donde vive el metodo calculaImpuesto()
public class Servicio extends Item implements Tributable{

    private int cantidadHoras;

    public double calculaImpuesto() {
        //servicio tiene 12% de impuesto:
        return getPrecio() * 0.12;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    // otros métodos de la clase Servicio

}