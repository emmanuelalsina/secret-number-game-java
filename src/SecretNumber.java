/*
Crea un programa que simule un juego de adivinanzas.
El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos.
En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.

Consejos:

Para generar un número aleatorio en Java: new Random().nextInt(100);

Utiliza el Scanner para obtener los datos del usuario.

Utiliza una variable para contar los intentos.

Utiliza un bucle para controlar los intentos.

Utiliza la instrucción ‘break;’ para salir del bucle.
 */

//importamos las clases que vamos a ocupar
//random para generar un número aleatorio
import java.util.Random;
//scanner sirve para leer lo que introduzca el usuario
import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {

        //Creando un objeto de la clase Random y guardándolo en una variable llamada random para poder usarlo después.
        Random random = new Random();
        //Creando un objeto de la clase scanner y guardándolo en una variable, Para permitir que que se pueda leer y usar la info que el usuario introduzca
        Scanner scanner = new Scanner(System.in);

        // flag que actua como interruptor , cambia a true cuando ocurre algo específico
        boolean encontrado = false;
        //Se declara afuera y se usa adentro.
        //no necesitas crear un nuevo objeto Scanner en cada vuelta, con uno solo es suficiente para toda la ejecución del programa.
        int number ; //lo hago asi porque de otra forma con el scanner.nextInt() el programa leeria antes de siquiera recibir algo
        
        
        int secretNumber = random.nextInt(101);


        //creamos un bucle el cual dará 5 oportunidades de adivinar el número
        for (int i = 0; i < 5; i++) {
            //el programa necesita leer el numero del usuario Una vez al inicio de cada vuelta
            System.out.println("Ingresa un número de 0 a 100: ");
            //Se declara afuera y se usa adentro. si o Cada vuelta estarías creando una variable nueva en lugar de reutilizar la misma.
            //lee lo que introduzca el usuario
            number = scanner.nextInt();
            //condicional si el numero es mayor que el secreto
            if (number > secretNumber) {
                System.out.println("El número es mayor que el número secreto, Por favor ingresa otro número:  ");

                //condicional si el numero es menor que el secreto
            } else if (number < secretNumber) {
                System.out.println("El número es menor que el número secreto, Por favor ingresa otro número:  ");


                //condicional si el numero es el número secreto
            } else {
                //el interruptor se prende cuando se encontró el numero y libera el mensaje de victoria
                encontrado = true;
                System.out.println("Felicidades , encontraste el numero secreto: " + secretNumber);
                // sale abruptamente del bucle
                break;
            }

            //en caso de que se agoten las oportunidades es decir que el interruptor nunca se encienda
            // imprimira el mensaje de derrota
        }
        if (encontrado==false){
            System.out.println("Has agotado todos los intentos , más suerte para la próxima");
        }

    }
}
