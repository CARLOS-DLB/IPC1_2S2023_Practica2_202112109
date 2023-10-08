
package com.mycompany.practica2;

import java.io.Serializable;

public class Historial implements Serializable{
    public String vehiculo;
    public int distancia;
    public Double total;
    public String horaInicio;
    public String horaEntrega;
    
    public Historial (String vehiculo, int distancia, Double total, String horaInicio, String horaEntrega) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.total = total;
        this.horaInicio = horaInicio;
        this.horaEntrega = horaEntrega;
    }
}
