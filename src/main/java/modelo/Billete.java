/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pablo
 */
public class Billete {
    private String fechaVuelo;
    private int cantidad;
    

    public Billete() {
    }

    public Billete(String fechaVuelo, int cantidad) {
        this.fechaVuelo = fechaVuelo;
        this.cantidad = cantidad;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getImporte () {
        
        double precio;
        int mes;
        
        mes = Integer.parseInt(this.fechaVuelo.substring(5, 7));
        if (mes >= 5  && mes <=9) {
            precio = 150;
        } else {
            precio = 90;
        }
        double precioSinIva = precio * this.cantidad;
        
        return Math.round(precioSinIva * 1.21);
    }
    
}
