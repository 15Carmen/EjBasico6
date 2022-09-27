package ejbasico6;

import java.util.Scanner;

public class EjBasico6 {

    public static void main(String[] args) {
        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner (System.in);

        //Declaramos las variables num1, num2, suma, resta, multi y division
        int num1, num2,suma, resta, multi;
        double division;

        /**
         * Le pedimos al usuario que introduzca por consola un número y después
         * le pedimos otro más. Ambos lo guardamos en las variables num
         * anteriormente declaradas
         */
        System.out.println("Introduzca un número:");
        num1=sc.nextInt();
        System.out.println("Introduzca otro número:");
        num2=sc.nextInt();

        /**
         * Realizamos las operaciones correspondientes sumando, restando, multiplicando
         * y dividiendo las variables num
         */
        suma = num1+num2;
        resta = num1-num2;
        multi = num1*num2;

        /**
         * Destacamos la operación de división porque para resolverla debemos castear
         * las variables num para que el resultado de la división nos pueda dar decimales
         */
        division = (double)num1/(double)num2;

        //Mostramos por consola el resultado de las operaciones
        System.out.println("La suma de esos numeros es: "+suma);
        System.out.println("La resta de esos numeros es: "+resta);
        System.out.println("La multiplicación de esos numeros es: "+multi);
        System.out.println("La división de esos numeros es: "+division);

    }
}
