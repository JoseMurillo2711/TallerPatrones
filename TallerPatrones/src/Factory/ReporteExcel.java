/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author richardo
 */
public class ReporteExcel extends Reporte {
    
    @Override
    public void generarContenido() {
        System.out.println("Generando contenido para el reporte Excel.");
    }
    
}
