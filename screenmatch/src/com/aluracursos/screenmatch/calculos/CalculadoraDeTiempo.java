package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    //creamos un getter para que se pueda acceder a la variable tiempoTotal
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    //se llama inlcluye, porque se vana a ir incluyendo peliculas o series dentro de la lista
    //al final se calcula el tiempo en minutos que tome ver todas las series/peliculas incluidas
    public void incluye(Titulo titulo){  //Asi podemos agregar una peliculas
        //colococamos el this para indicar que nos estamos refiriendo
        this.tiempoTotal += titulo.getDuracionEnMinutos(); // tiempo total= el mismo + DuracionEnMinutos(), con el permiso de accederse mediante get


    }
}


