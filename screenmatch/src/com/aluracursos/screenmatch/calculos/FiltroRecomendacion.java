package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Muy buen evaluado en el momento");
        }else if (clasificacion.getClasificacion() >= 2){
            System.out.println("popular por el momentp");

        }else{
            System.out.println("Colocalo en tu lista para verlo después");
        }

    }
}
