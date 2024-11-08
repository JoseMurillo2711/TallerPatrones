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
public class FormatoEstilo extends FormatoDecorator {
    
    public FormatoEstilo(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void aplicarFormato(Reporte reporte) {
        System.out.println("Aplicando estilo al reporte.");
        reporte.generarContenido();
    }
    
}
