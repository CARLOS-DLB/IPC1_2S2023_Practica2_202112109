package com.mycompany.practica2;

import java.io.Serializable;

public class Producto implements Serializable{
        public String nombre;
        public String precio;
    
        public Producto (String nombre, String precio) {
                 this.nombre = nombre;
                 this.precio = precio;
    }
}
