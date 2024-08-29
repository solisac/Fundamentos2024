/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class RegistroEstudiantes {
    static Scanner leer=new Scanner(System.in);
    static ArrayList<String> nomina= new ArrayList<>();
    static ArrayList<Double> nota= new ArrayList<>();
    
    public static void menu(){
        int op;
        do {            
            System.out.println("Ingresa una opción:\n"
                    + "1.- Agregar Estudiante\n"
                    + "2.- Agregar Nota\n"
                    + "3.- Mostrar nomina\n"
                    + "0.- Salir");
            op=leer.nextInt();
            switch (op) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    asignarNota();
                    break;
                case 3:
                    imprmirEstudiantes();
                     imprimirNotas();
                    break;
             
            }
        } while (op!=0);
    }
    
    public static void agregarEstudiante(){
        String nom;
        System.out.println("Ingresa el nombre");
        nom=leer.next();
        nomina.add(nom);
    }
    
    public static void imprmirEstudiantes(){
        System.out.println(nomina.toString());
    }
    
    public static void asignarNota(){
        RegistroEstudiantes.imprmirEstudiantes();
        System.out.println("Ingresa el indice de quien va ser cambiado la nota");
        int i=leer.nextInt();
        System.out.println("Ingresa la nota");
        nota.add(i,leer.nextDouble());
    }
    
    public static void imprimirNotas(){
        System.out.println(nota.toString());
    }
    
    
}
