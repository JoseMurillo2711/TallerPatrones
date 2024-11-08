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
public class FormatoFuente extends FormatoDecorator {
    
    public FormatoFuente(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void aplicarFormato(Reporte reporte) {
        System.out.println("Aplicando formato de fuente al reporte.");
        reporte.generarContenido();
    }
}
