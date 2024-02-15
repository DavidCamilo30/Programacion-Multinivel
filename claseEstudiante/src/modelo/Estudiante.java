/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class Estudiante {
    private String nombre;
    private String codigo;
    private double[]notas;
//Constructor parametrico
    public Estudiante(String nombre, String codigo, double[] notas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.notas = notas;
    }
//Constructor basico
    public Estudiante() {
        this.nombre = "";
        this.codigo = "";
        this.notas =  new double [3];
    }
    // el get retorna
    public String getNombre(){
        return this.nombre;
    }
    
    //el set es un procedimiento que modifica
    public void setNombre(String n){
        this.nombre = n;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularPromedio(){
        double total = 0;
        for (int i=0;i<notas.length;i++ ){
            total+=notas[i];
        }
        return total/notas.length;
    }
    
    public String datosNotas(){
        String total = "";
        for (int i=0;i<notas.length;i++ ){
            total+=notas[i]+" ";
        }
        return total;
    }
    
    @Override
    public String toString() {
        return "Datos Estudiante: " + "nombre=" + nombre + ", codigo=" + codigo + ", notas=" + datosNotas() ;
    }
    
    
    
    
}
