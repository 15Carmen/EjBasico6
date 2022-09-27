package ejbasico6;

import java.util.Scanner;

public class EjBasico6 {

    public static void main(String[] args) {
        //Declaro el Scanenr para leer por consola
        Scanner sc = new Scanner (System.in);

        //Le pido al ususario que introduzca un numero entero
        System.out.println("Introduzca un número entero:");

        //Declaro la variable num1 donde se guarda el numero introducido por consola y lo guardo
        int num1=sc.nextInt();

        //Le pido al ususario que introduzca otro numero entero
        System.out.println("Introduzca otro número entero:");

        //Declaro la variable num2 donde se guarda el numero introducido por consola y lo guardo
        int num2=sc.nextInt();

        //Declaro las variables de las operaciones donde hago los calculos usando las dos variables num introduzidas por
        //consola anteriormente
        int suma = num1+num2;
        int resta = num1-num2;
        int multi = num1*num2;
        double division = (double)num1/(double)num2;

        //Muestro por consola el resultado de las operaciones
        System.out.println("La suma de esos numeros es: "+suma);
        System.out.println("La resta de esos numeros es: "+resta);
        System.out.println("La multiplicación de esos numeros es: "+multi);
        System.out.println("La división de esos numeros es: "+division);

    }
}
