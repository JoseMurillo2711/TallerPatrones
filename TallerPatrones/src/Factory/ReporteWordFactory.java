/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author richardo
 */
public class ReporteWordFactory implements IReporteFactory {
    
    @Override
    public Reporte crearReporte() {
        return new ReporteWord();
    }
    
}
