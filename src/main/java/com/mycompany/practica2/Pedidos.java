package com.mycompany.practica2;

import java.io.Serializable;

public class Pedidos implements Serializable {
        public int distancia;
    
   public Pedidos (String nombre, String precio, int distancia, String motocicleta) {
            this.distancia = distancia;
   }
}
