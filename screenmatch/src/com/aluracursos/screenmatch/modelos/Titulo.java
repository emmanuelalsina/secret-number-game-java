package com.aluracursos.screenmatch.modelos;

public class Titulo {
    public String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;

    //solo puede usarse dentro de la misma clase donde fue declarada.
    //No puede ser accedida directamente desde otras clases.
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvualuaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    //permite al usario introducir un nombre
    public void setNombre(String nombre) {
        //this.nombre:nos referimos al valor de esta clase(nombre), no al valor que el usario va a ingresar
        // nombre (del lado derecho) se refiere al valor que el usuario introducirá
        this.nombre = nombre;
    }
    // es necesario usar this pporque el parámetro se llama igual que el atrinuto
    //Si no usaras this, Java se confundiría porque ambos se llaman igual.
    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    //Cuando una variable es private, no puede ser accedida directamente desde fuera de la clase.
    //Para permitir que otras clases puedan leer su valor de forma controlada, se crea un metodo público que lo retorne.
    //A este tipo de metodo normalmente se le llama getter, y por convención se usa el prefijo get
    public int getTotalDeLasEvualuaciones(){
        return totalDeLasEvualuaciones;
    }

    //void significa que ese metodo no devuelve nada. Solo ejecuta acciones, en este caso imprimir en pantalla, y ya.
    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de Lanzamiento fue en: "+ fechaDeLanzamiento);
        //El programa va a identificar al getDuracionEnMinutos de clase Titulo o getDuracionEnMinutos de Serie
        System.out.println("Duración en minutos: " + getDuracionEnMinutos() + "min");
        //System.out.println("¿Se encuentra incluido en el plan? "+ incluidoEnElPlan);
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvualuaciones ++;

    }

    public double calculaMedia (){
        return sumaDeLasEvaluaciones / totalDeLasEvualuaciones;
    }
}
