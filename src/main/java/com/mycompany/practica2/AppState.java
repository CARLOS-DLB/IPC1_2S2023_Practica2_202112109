package com.mycompany.practica2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AppState {
         public static LinkedList<Producto> productos = new LinkedList<>();
         public static LinkedList<Pedidos> pedidos = new LinkedList<>();
         public static LinkedList<Historial> historial = new LinkedList<>();
         public static String rutaHistorialSerializado = "./DatosSerializados/appState.bin";
    
        public static void serializar() {
                  File file = new File(rutaHistorialSerializado);
                           if (!file.exists()) {
                           file.getParentFile().mkdir();
                           }
                           try {
                                    file.createNewFile();
                           } catch(IOException ex) {
                                   System.out.println("No se pudo crear el archvio de serialización.");
                           }
                           try {
                                    FileOutputStream fos = new FileOutputStream(rutaHistorialSerializado);
                                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                                    oos.writeObject(historial);
                           } catch (FileNotFoundException ex) {
                                    System.out.println("No se encotro el archivo para serializar");
                           } catch (IOException ex) {
                                    System.out.println("Ocurrio un error al intentar escribir sobre el archivo.");
                           }
        }
        public static void deserializar() {
            try {
                File file = new File(rutaHistorialSerializado);
                            if (!file.exists()) {
                            return;
                            }
                            FileInputStream fis = new FileInputStream(rutaHistorialSerializado);
                            ObjectInputStream ois = new ObjectInputStream(fis);
                            historial = (LinkedList<Historial>) ois.readObject();
                            
                             for (Historial pedido : historial) {
                                System.out.println("Pedido agregado - Vehículo: " + pedido.vehiculo +
                               ", Distancia: " + pedido.distancia + " Km" +
                               ", Total: Q" + pedido.total +
                               ", Hora de Inicio: " + pedido.horaInicio +
                               ", Hora de Entrega: " + pedido.horaEntrega);
                            }   

            } catch (FileNotFoundException ex) {
                   Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                   Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                   Logger.getLogger(AppState.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
