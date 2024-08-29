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
public class ListaArreglos {
    static Scanner leer= new Scanner(System.in);
    int x[]=new int[5];
    static ArrayList<Integer> lista= new ArrayList<>();
    
    public static void agregadDatos(){
        int x;
        System.out.println("Ingresa un valor a la lista (ArrayList)");
        x=leer.nextInt();
        lista.add(x);
    }
    
    public static void imprimir(){
        System.out.println(lista.toString());
    }
}
