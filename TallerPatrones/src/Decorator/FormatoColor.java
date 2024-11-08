/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;
import Factory.*;
/**
 *
 * @author richardo
 */
public class FormatoColor extends FormatoDecorator {
     
    public FormatoColor(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void aplicarFormato(Reporte reporte) {
        System.out.println("Aplicando formato de color al reporte.");
        reporte.generarContenido();
    }
}
