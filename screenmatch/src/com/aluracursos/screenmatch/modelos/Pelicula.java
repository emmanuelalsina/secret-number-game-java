package com.aluracursos.screenmatch.modelos;

// cuando se crea un paquete se necesita indicar forzosamente que tipo de de atributo/ metodos son.
// Hereda los atrubutos de la clase Titulo y agrega unos nuevos , sus propios atributos


import com.aluracursos.screenmatch.calculos.Clasificacion;

//Estoy aplicando Herencia con extends
//Polimorfismo de Interfaz e implementando (implements) el metodo especificado en Clasificacion
public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    // debe implementarse forzosamente para que compile
    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}





