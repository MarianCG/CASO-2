/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaabarrotes;

import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class PresentarInformacion {

    private Producto[] productos;
    private static final String[] Dias = {"lunes", "Martes", "Miercoles", "Jueves", "viernes", "Sabado", "Domingo"};

    public PresentarInformacion(String[] NombreProductos) {
        productos = new Producto[NombreProductos.length];
        
      
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    public void MostrarProductos(){
            JOptionPane.showMessageDialog(null, "\n El total de ventas de los productos es:" );
            for (Producto p: productos){
                JOptionPane.showInternalMessageDialog(null,"." + p.getNombre()+":"+ p.TotalVentas());
            }
    }
    
    public void DiaConMasVentas(){
        int MasVentas = 0;
        int MasDias = 0;
        for (int dia = 0; dia < 7; dia ++){
            int SumaVentas = 0;
           for (Producto p: productos){
               SumaVentas += p.getVentasPorSemana()[dia];
           }
                    
                   
        }  
              
    }

    public PresentarInformacion(Producto[] productos) {
        this.productos = productos;
    }
}
