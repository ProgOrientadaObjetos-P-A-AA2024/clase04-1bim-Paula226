/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author Paula Lopez
 */
public class Ejecutor {
       public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        Hospital h1 = new Hospital("Militar", "Loja", 1000, 3000);
        
        h1.establecerNombre("Hospital Militar Privado");
        
        Hospital h2 = new Hospital("Militar DOS", "Loja", 1000, 3000);
        
        System.out.printf("%s\n", h1);
        System.out.printf("%s\n", h2);
        
        
    }
}


