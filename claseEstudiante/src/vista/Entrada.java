/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;


/**
 *
 * @author Estudiante
 */
public class Entrada {
    private Scanner ent;

    public Entrada(Scanner ent) {
        this.ent = ent;
    }
    
    public Entrada() {
        this.ent = new Scanner(System.in);
    }
    
    public String leerTexto(String msg) {
        System.out.println("Nombre");
        return ent.next();
    }
    
    public int leerEntero(String msg) {
        System.out.println("Codigo");
        return ent.nextInt();
    }
    
    public double leerDecimal(String msg) {
        System.out.println("Notas");
        return ent.nextDouble();
    }
    
    public void Mostrar(String msg) {
        System.out.println(msg);
    }
    
}
