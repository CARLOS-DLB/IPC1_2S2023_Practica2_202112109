package com.mycompany.practica2;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MovimientoMotocicleta extends Thread {
    private JLabel label;
    private String rutaImagenDE;
    private String rutaImagenIZ;
    ImageIcon iconoIzquierda;
    ImageIcon iconoDerecha;

    public MovimientoMotocicleta(JLabel label, String rutaImagenDE, String rutaImagenIZ) {
        this.label = label;
        this.rutaImagenDE = rutaImagenDE;
        this.rutaImagenIZ = rutaImagenIZ;
    }

public void run() {
    int x = label.getX(); // Obtiene la posición inicial en X
    int limiteDerecho = 600; // Ajusta esto al ancho de tu panel
    int velocidad = 5; // Ajusta la velocidad de movimiento
    int limiteIzquierdo = 150;

    // Mover a la derecha
    while (x < limiteDerecho) {
        x += velocidad; // Incrementa la posición en X
        label.setLocation(x, label.getY()); // Actualiza la posición del JLabel
        try {
            Thread.sleep(100); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    ImageIcon miIcono = new ImageIcon(rutaImagenIZ);
    iconoIzquierda = new ImageIcon(miIcono.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    label.setIcon(iconoIzquierda);

    // Mover a la izquierda
    while (x > limiteIzquierdo) {
        x -= velocidad; // Decrementa la posición en X
        label.setLocation(x, label.getY()); // Actualiza la posición del JLabel
        try {
            Thread.sleep(100); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Restaurar la imagen original
   ImageIcon miIcono1 = new ImageIcon(rutaImagenDE);
   iconoDerecha = new ImageIcon(miIcono1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
   label.setIcon(iconoDerecha);
}
}