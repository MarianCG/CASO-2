/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaabarrotes;

import java.util.Random;

/**
 *
 * @author maria
 */
public class Producto {
    
    private String nombre;
    private int[] VentasPorSemana;

    public String getNombre() {
        return nombre;
    }

    public int[] getVentasPorSemana() {
        return VentasPorSemana;
    }

    public Producto(String nombre, int VentasPorSemana) {
        this.nombre = nombre;
        this.VentasPorSemana = new int[7];
        generarVentas();

    }

    private void generarVentas() {
        Random rand = new Random();
        for (int i = 0; i < 7; i++) {
            VentasPorSemana[i] = rand.nextInt(10);

        }

    }

    public int TotalVentas() {
        int Total = 0;
        for (int Ventas : VentasPorSemana) {
            Total += Ventas;
        }
        return Total;
    }

}

