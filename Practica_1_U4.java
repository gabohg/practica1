/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_1_u4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica_1_U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arreglo = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner scanner = new Scanner(System.in);

        boolean salir = true;
        while (salir) {

            System.out.println("Elija una opcion");
            System.out.println("1. Sumar elementos del arreglo");
            System.out.println("2. Multiplicar los elementos del arreglo");
            System.out.println("3. Salir.");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    double suma = 0;
                    for (double elemento : arreglo) {
                        suma += elemento;
                    }
                    System.out.println("La suma de los elementos es: " + suma);
                    break;
                case 2:
                    double multiplicacion = 1;
                    for (double elemento : arreglo) {
                        multiplicacion *= elemento;
                    }
                    System.out.println("La multiplicacion de los elementos es: " + multiplicacion);
                    break;
                case 3:
                    salir = false;
                    System.out.println("Muchas gracias por su participacion");
                    break;
                default:
                    System.out.println("Opcion invaida");
                    break;
            }
        }

    }

}
