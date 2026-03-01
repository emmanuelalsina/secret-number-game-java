package com.aluracursos.screenmatch.calculos.impuestos;


public class CalculadoraImpuesto {

    private double totalImpuesto = 0;

    //recibe un parámetro, este debe ser
    //¿por qué usar la interfaz como tipo?  Tributable (tipo) tributable (variable).
    // Porque así el metodo puede recibir:
    //Este metodo recibe cualquier objeto que implemente la interfaz Tributable,en este caso : Servicio y Producto
    public void calculaImpuesto(Tributable tributable) {

        //
        //Al parametro ingresado se le aplica el metodo calculaImpuesto() dependiendo el objeto, ya sea Servicio o Producto (Polimorfismo)
        //El resultado se le suma a totalImpuesto, que se inicializa en 0.
        totalImpuesto += tributable.calculaImpuesto();
    }

}
//CalculadoraImpuesto usa la interfaz Tributable como tipo de parámetro, pero no la implementa. Hay diferencia entre usar algo y ser algo.
//La pregunta es: ¿CalculadoraImpuesto paga impuestos? No, ella los calcula. Por eso no debería implementar Tributable.