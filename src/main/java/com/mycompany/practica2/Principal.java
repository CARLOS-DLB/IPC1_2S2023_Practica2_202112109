package com.mycompany.practica2;

import GUI.PrincipalJFrame;
import java.util.LinkedList;

public class Principal  {
         public static LinkedList<Producto> productos = new LinkedList<>();
         public static LinkedList<Pedidos> pedidos = new LinkedList<>();
    
         public static void main(String[] args) {
                  Producto producto1 = new Producto("Pizza", "Q50");
                  Producto producto2 = new Producto("Tacos", "Q15");
                  Producto producto3 = new Producto("Gringas", "Q20");
                  Producto producto4 = new Producto("Shucos", "Q15");
                  Producto producto5 = new Producto("Hamburguesas", "Q30"); 
                  Producto producto6 = new Producto("Lasania", "Q40"); 
                  Producto producto7 = new Producto("Spaguetti", "Q35"); 
                  Producto producto8 = new Producto("Ensalada", "Q20"); 
                  Producto producto9 = new Producto("Hilachas", "Q15"); 
                  Producto producto10 = new Producto("Atol", "Q3"); 
                  productos.add(producto1);
                  productos.add(producto2);
                  productos.add(producto3);
                  productos.add(producto4);
                  productos.add(producto5);
                  productos.add(producto6);
                  productos.add(producto7);
                  productos.add(producto8);
                  productos.add(producto9);
                  productos.add(producto10);
                  
                  PrincipalJFrame main = new PrincipalJFrame();
    }

}