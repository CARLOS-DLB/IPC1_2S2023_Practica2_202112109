package GUI;
import com.mycompany.practica2.MovimientoMotocicleta;
import com.mycompany.practica2.Principal;
import com.mycompany.practica2.Producto;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalJFrame extends javax.swing.JFrame {
    Principal principal;
    private MovimientoMotocicleta movimientoMotocicleta1;
    private MovimientoMotocicleta movimientoMotocicleta2;
    private MovimientoMotocicleta movimientoMotocicleta3;
    
    // Variables globales
    double total = 0.0;
    String vehiculo;
    int distancia = 0;
    String rutaImagenDE = "C:/Users/deleo/OneDrive/Documents/NetBeansProjects/Practica2/Icons/deliveryDE.jpg";
    String rutaImagenIZ = "C:/Users/deleo/OneDrive/Documents/NetBeansProjects/Practica2/Icons/deliveryIZ.jpg";
    ImageIcon iconoDerecha;
    
    public PrincipalJFrame() {
            initComponents();
            this.setVisible(true); 
            this.setLocationRelativeTo(null);
            this.setResizable(false); 
            this.setTitle("Delivery David");
            this.agregarProductos();
            
            
            ImageIcon derecha = new ImageIcon(rutaImagenDE);
            iconoDerecha = new ImageIcon(derecha.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PedidosTabla = new javax.swing.JTable();
        confirmarButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AgregarButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductosTabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        vehiculoBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        distanciaText = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        enviarM1Button = new javax.swing.JToggleButton();
        enviarTodosButton = new javax.swing.JToggleButton();
        enviarM2Button = new javax.swing.JToggleButton();
        enviarM3Button = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DistanciaM1Label = new javax.swing.JLabel();
        DistanciaM2Label = new javax.swing.JLabel();
        DistanciaM3Label = new javax.swing.JLabel();
        M3Label = new javax.swing.JLabel();
        M1Label = new javax.swing.JLabel();
        M2Label = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        HistorialTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        PedidosTabla.setForeground(new java.awt.Color(0, 0, 0));
        PedidosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PedidosTabla);

        confirmarButton.setBackground(new java.awt.Color(102, 102, 102));
        confirmarButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmarButton.setText("Confirmar Pedido");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mi Pedido");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Productos");

        AgregarButton.setBackground(new java.awt.Color(102, 102, 102));
        AgregarButton.setForeground(new java.awt.Color(255, 255, 255));
        AgregarButton.setText("Agregar");
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });

        ProductosTabla.setForeground(new java.awt.Color(0, 0, 0));
        ProductosTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProductosTabla);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vehículo:");

        vehiculoBox.setBackground(new java.awt.Color(102, 102, 102));
        vehiculoBox.setForeground(new java.awt.Color(255, 255, 255));
        vehiculoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motocicleta 1", "Motocicleta 2", "Motocicleta 3", " " }));
        vehiculoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculoBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Km");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Distancia a recorrer:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total:");

        distanciaText.setBackground(new java.awt.Color(102, 102, 102));
        distanciaText.setForeground(new java.awt.Color(255, 255, 255));
        distanciaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanciaTextActionPerformed(evt);
            }
        });

        totalLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AgregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(distanciaText, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(vehiculoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(33, 33, 33)
                                    .addComponent(totalLabel)
                                    .addGap(30, 30, 30))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(confirmarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(totalLabel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vehiculoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distanciaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedidos", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Motocicleta 2");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Motocicleta 3");

        enviarM1Button.setBackground(new java.awt.Color(102, 102, 102));
        enviarM1Button.setForeground(new java.awt.Color(255, 255, 255));
        enviarM1Button.setText("Enviar");
        enviarM1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarM1ButtonActionPerformed(evt);
            }
        });

        enviarTodosButton.setText("Enviar Todos");
        enviarTodosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarTodosButtonActionPerformed(evt);
            }
        });

        enviarM2Button.setBackground(new java.awt.Color(102, 102, 102));
        enviarM2Button.setForeground(new java.awt.Color(255, 255, 255));
        enviarM2Button.setText("Enviar");
        enviarM2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarM2ButtonActionPerformed(evt);
            }
        });

        enviarM3Button.setBackground(new java.awt.Color(102, 102, 102));
        enviarM3Button.setForeground(new java.awt.Color(255, 255, 255));
        enviarM3Button.setText("Enviar");
        enviarM3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarM3ButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Visualización De Trayectorias");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Motocicleta 1 ");

        DistanciaM1Label.setForeground(new java.awt.Color(255, 255, 255));
        DistanciaM1Label.setText("Distancia:");

        DistanciaM2Label.setForeground(new java.awt.Color(255, 255, 255));
        DistanciaM2Label.setText("Distancia:");

        DistanciaM3Label.setForeground(new java.awt.Color(255, 255, 255));
        DistanciaM3Label.setText("Distancia:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(enviarTodosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(enviarM1Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(DistanciaM1Label)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(enviarM2Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(DistanciaM2Label)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(enviarM3Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(DistanciaM3Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(M1Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M3Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviarM1Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DistanciaM1Label))
                    .addComponent(M1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviarM2Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DistanciaM2Label))
                    .addComponent(M2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enviarM3Button)
                        .addGap(18, 18, 18)
                        .addComponent(DistanciaM3Label))
                    .addComponent(M3Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(enviarTodosButton)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Envio", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Historial De Pedidos");

        HistorialTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vehículo", "Distancia", "Monto", "Fecha y Hora Solicitado", "Fecha y Hora De Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(HistorialTabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(281, 281, 281))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Historial", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProductos() {
        DefaultTableModel modeloProductos = new DefaultTableModel();
        modeloProductos.addColumn("Producto");
        modeloProductos.addColumn("Precio");

        for (Producto producto : this.principal.productos) {
                 Object[] fila = {producto.nombre, producto.precio};
                 modeloProductos.addRow(fila);
        }
        ProductosTabla.setModel(modeloProductos);
    }
    private String fechaYHoraPedido() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    private String fechaYHoraEntrega(String horaActual) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date fechaActual = null;
    try {
        fechaActual = dateFormat.parse(horaActual);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    
    Random random = new Random();
    int minutosAleatorios = random.nextInt(31); 
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(fechaActual);
    calendar.add(Calendar.MINUTE, minutosAleatorios);
    
    return dateFormat.format(calendar.getTime());
}
    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed
        int selectedRowCount = ProductosTabla.getSelectedRowCount();
        if (selectedRowCount != 1) {
                 return;
        }
        int selectedRow = ProductosTabla.getSelectedRow();
        DefaultTableModel productosModel = (DefaultTableModel) ProductosTabla.getModel();
        DefaultTableModel pedidoModel = (DefaultTableModel) PedidosTabla.getModel(); 

        Object producto = productosModel.getValueAt(selectedRow, 0);
        Object precio = productosModel.getValueAt(selectedRow, 1);   

        pedidoModel.insertRow(0, new Object[]{producto, precio});
        
        // Total dinamico
        total += Double.parseDouble(precio.toString().substring(1)); 
        totalLabel.setText("Q" + String.format("%.2f", total));
    }//GEN-LAST:event_AgregarButtonActionPerformed
    private void vehiculoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculoBoxActionPerformed
    private void distanciaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanciaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distanciaTextActionPerformed
    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        vehiculo = vehiculoBox.getSelectedItem().toString();
        distancia = Integer.parseInt(distanciaText.getText());

        if (distancia <= 10 && distancia > 0) {
            DefaultTableModel pedidosModel = (DefaultTableModel) PedidosTabla.getModel();
            int rowCount = pedidosModel.getRowCount();

            if (rowCount > 0) {
                  String horaActual = fechaYHoraPedido();
                  String horaEntrega = fechaYHoraEntrega(horaActual);
                
                // Crear una fila con los datos del pedido
                Object[] pedido = {vehiculo, distancia + " Km", "Q" + total, horaActual, horaEntrega};
                DefaultTableModel historialModel = (DefaultTableModel) HistorialTabla.getModel();
                historialModel.insertRow(0, pedido);
                
                pedidosModel.setRowCount(0);
                vehiculoBox.setSelectedIndex(0);
                distanciaText.setText("");
                total = 0.0;
                totalLabel.setText("Q0.00");
                
                if (vehiculo.equals("Motocicleta 1")) {
                DistanciaM1Label.setText("Distancia: " + distancia + " Km");
                } else if (vehiculo.equals("Motocicleta 2")) {
                DistanciaM2Label.setText("Distancia: " + distancia + " Km");
                } else if (vehiculo.equals("Motocicleta 3")) {
                DistanciaM3Label.setText("Distancia: " + distancia + " Km");
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "No ha agregado ningún producto al pedido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese una distancia entre 0 y 10.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void enviarM1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarM1ButtonActionPerformed
        M1Label.setIcon(iconoDerecha);        
        movimientoMotocicleta1 = new MovimientoMotocicleta(M1Label, rutaImagenDE, rutaImagenIZ);
        movimientoMotocicleta1.start();
    }//GEN-LAST:event_enviarM1ButtonActionPerformed

    private void enviarM2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarM2ButtonActionPerformed
        M2Label.setIcon(iconoDerecha);
        
        movimientoMotocicleta2 = new MovimientoMotocicleta(M2Label, rutaImagenDE, rutaImagenIZ);
        movimientoMotocicleta2.start();
    }//GEN-LAST:event_enviarM2ButtonActionPerformed

    private void enviarM3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarM3ButtonActionPerformed
        M3Label.setIcon(iconoDerecha);
        
        movimientoMotocicleta3 = new MovimientoMotocicleta(M3Label, rutaImagenDE, rutaImagenIZ);
        movimientoMotocicleta3.start();
    }//GEN-LAST:event_enviarM3ButtonActionPerformed

    private void enviarTodosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarTodosButtonActionPerformed
        M1Label.setIcon(iconoDerecha);
        M2Label.setIcon(iconoDerecha);
        M3Label.setIcon(iconoDerecha);
        
        movimientoMotocicleta1 = new MovimientoMotocicleta(M1Label, rutaImagenDE, rutaImagenIZ);
        movimientoMotocicleta1.start();
        movimientoMotocicleta2 = new MovimientoMotocicleta(M2Label, rutaImagenDE, rutaImagenIZ);
        movimientoMotocicleta2.start();
        movimientoMotocicleta3 = new MovimientoMotocicleta(M3Label, rutaImagenDE, rutaImagenIZ);
        movimientoMotocicleta3.start();
    }//GEN-LAST:event_enviarTodosButtonActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AgregarButton;
    private javax.swing.JLabel DistanciaM1Label;
    private javax.swing.JLabel DistanciaM2Label;
    private javax.swing.JLabel DistanciaM3Label;
    private javax.swing.JTable HistorialTabla;
    private javax.swing.JLabel M1Label;
    private javax.swing.JLabel M2Label;
    private javax.swing.JLabel M3Label;
    private javax.swing.JTable PedidosTabla;
    private javax.swing.JTable ProductosTabla;
    private javax.swing.JToggleButton confirmarButton;
    private javax.swing.JTextField distanciaText;
    private javax.swing.JToggleButton enviarM1Button;
    private javax.swing.JToggleButton enviarM2Button;
    private javax.swing.JToggleButton enviarM3Button;
    private javax.swing.JToggleButton enviarTodosButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JComboBox<String> vehiculoBox;
    // End of variables declaration//GEN-END:variables
}
