/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import modelo.Estudiante;
import vista.Entrada;

/**
 *
 * @author Estudiante
 */
public class Controlador {
    private Entrada ent;
    private Estudiante objE;

    public Controlador() {
        this.ent = new Entrada();
        this.objE = new Estudiante();
    }
    
    public void iniciar(){
        //Usi de la vista
        ent.Mostrar("Programa notas estudiante");
        objE.setNombre(ent.leerTexto("Nombre: "));
        objE.setCodigo(ent.leerTexto("Codigo: "));
        for(int i=0;i<objE.getNotas().length;i++){
            objE.getNotas()[i]=(ent.leerDecimal("Nota "+(i+1)+": "));
        }
       //Pasar del modelo(objE) a la vista(ent) 
       ent.Mostrar(objE.toString()+"\n promedio= "+objE.calcularPromedio());
    }
    
    
}
