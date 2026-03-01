import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

//Aqui estamos crendo objetos con clase Titulo,

public class Principal {
    public static void main(String[] args) {
        //Vamos a crear una Clase de Tipo Película
        //new crea una nueva instancia de Película
        //Crea un nuevo espacio en la memoria para almacenar todos los datos que se colocarán dentro de ese objeto
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Shrek");
        miPelicula.setFechaDeLanzamiento(2001);
        miPelicula.setDuracionEnMinutos(89);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(8);
        //Y así es como otra clase accedería al valor:
        //En este caso Llama al metodo getTotalDeLasEvualuaciones() y lo muestra en pantalla
        System.out.println(miPelicula.getTotalDeLasEvualuaciones());

        System.out.println(String.format("%.2f", miPelicula.calculaMedia()));


        //creamoos un objeto Serie
        Serie casaDragon = new Serie();
        casaDragon.setNombre("La Casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Spiderman");
        otraPelicula.setFechaDeLanzamiento(2000);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario apra ver tus títulos favoritos estas vacaciones: " + calculadora.getTiempoTotal() +
                " minutos.");

        //Instanciamos
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        //instanciamos
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La Casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);




    }
}
