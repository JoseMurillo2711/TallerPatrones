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
public abstract class FormatoDecorator implements IFormatoReporte {
    
    protected Reporte reporte;

    public FormatoDecorator(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public abstract void aplicarFormato(Reporte reporte);
    
}
