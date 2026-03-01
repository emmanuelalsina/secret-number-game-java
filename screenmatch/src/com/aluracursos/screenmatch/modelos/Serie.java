package com.aluracursos.screenmatch.modelos;

// Hereda los atrubutos de la clase Titulo y agrega unos nuevos , sus propios atributos

public class Serie extends Titulo{
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    // como este metodo no satisface l necesidades para Serie, podemos sobreescribirlo
    @Override //sobre escritura de metodos del metodo original en titulo
    public int getDuracionEnMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
