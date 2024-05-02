/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
      Scanner scanner = new Scanner(System.in);
   
        System.out.println("Ingrese el nombre del primer hospital:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese la ciudad del primer hospital:");
        String ciudad1 = scanner.nextLine();
        System.out.println("Ingrese el número de doctores del primer hospital:");
        int doctores1 = scanner.nextInt();
        System.out.println("Ingrese el número de enfermeros del primer hospital:");
        int enfermeros1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
      
        Hospital h1 = new Hospital();
        h1.establecerNombre(nombre1);
        h1.establecerCiudad(ciudad1);
        h1.establecerNumeroDoctores(doctores1);
        h1.establecerNumeroEnfermeros(enfermeros1);
        
        System.out.println("Ingrese el nombre del segundo hospital:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la ciudad del segundo hospital:");
        String ciudad2 = scanner.nextLine();
        System.out.println("Ingrese el número de doctores del segundo hospital:");
        int doctores2 = scanner.nextInt();
        System.out.println("Ingrese el número de enfermeros del segundo hospital:");
        int enfermeros2 = scanner.nextInt();
        
        Hospital h2 = new Hospital();
        h2.establecerNombre(nombre2);
        h2.establecerCiudad(ciudad2);
        h2.establecerNumeroDoctores(doctores2);
        h2.establecerNumeroEnfermeros(enfermeros2);
     
        System.out.println("Datos del primer hospital:");
        System.out.println("Nombre: " + h1.obtenerNombre());
        System.out.println("Ciudad: " + h1.obtenerCiudad());
        System.out.println("Número de doctores: " + h1.obtenerNumeroDoctores());
        System.out.println("Número de enfermeros: " + h1.obtenerNumeroEnfermeros());
        
        System.out.println("\nDatos del segundo hospital:");
        System.out.println("Nombre: " + h2.obtenerNombre());
        System.out.println("Ciudad: " + h2.obtenerCiudad());
        System.out.println("Número de doctores: " + h2.obtenerNumeroDoctores());
        System.out.println("Número de enfermeros: " + h2.obtenerNumeroEnfermeros());
    }
}