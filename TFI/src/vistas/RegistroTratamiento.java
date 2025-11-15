
package vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Masajista;
import modelo.Tratamiento;
import persistencia.Conexion;
import persistencia.TratamientoData;



public class RegistroTratamiento extends javax.swing.JInternalFrame {

    
    
    Conexion con = new Conexion();
    TratamientoData operacionesTratamiento = new TratamientoData(con);
    private ArrayList<String> listaP;
    
    
    
    public RegistroTratamiento() {
        initComponents();
        
        
        listaP = (ArrayList<String>)operacionesTratamiento.listarProductos();
        cargarProducto();
        
        
        
    }

    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_RegistroTrat = new javax.swing.JPanel();
        lbl_titulovista = new javax.swing.JLabel();
        lbl_codTrat = new javax.swing.JLabel();
        lbl_nombreTrat = new javax.swing.JLabel();
        lbl_tipotrat = new javax.swing.JLabel();
        lbl_detalleTrat = new javax.swing.JLabel();
        lbl_productosTrat = new javax.swing.JLabel();
        lbl_duracionTrat = new javax.swing.JLabel();
        lbl_costoTrat = new javax.swing.JLabel();
        lbl_estadoTrat = new javax.swing.JLabel();
        txt_codTrat = new javax.swing.JTextField();
        txt_nombreTrat = new javax.swing.JTextField();
        txt_tipoTrat = new javax.swing.JTextField();
        txt_detalleTrat = new javax.swing.JTextField();
        jcb_productosTrat = new javax.swing.JComboBox<>();
        txt_duracionTrat = new javax.swing.JTextField();
        txt_costoTrat = new javax.swing.JTextField();
        btn_guardarTrat = new javax.swing.JButton();
        btn_borrarTrat = new javax.swing.JButton();
        btn_actuTrat = new javax.swing.JButton();
        btn_limpiarTrat = new javax.swing.JButton();
        btn_bajaTrat = new javax.swing.JButton();
        btn_altaTrat = new javax.swing.JButton();
        ck_estadoTratamiento = new javax.swing.JCheckBox();
        btn_buscarTratamiento = new javax.swing.JButton();

        setClosable(true);

        pnl_RegistroTrat.setBackground(new java.awt.Color(0, 153, 153));

        lbl_titulovista.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_titulovista.setForeground(new java.awt.Color(0, 0, 0));
        lbl_titulovista.setText("Registro Tratamientos");

        lbl_codTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_codTrat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_codTrat.setText("Codigo Tratamiento");

        lbl_nombreTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_nombreTrat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombreTrat.setText("Nombre Tratamiento");

        lbl_tipotrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_tipotrat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_tipotrat.setText("Tipo Tratamiento");

        lbl_detalleTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_detalleTrat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_detalleTrat.setText("Detalle Tratamiento");

        lbl_productosTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_productosTrat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_productosTrat.setText("Productos ");

        lbl_duracionTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_duracionTrat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_duracionTrat.setText("Duracion");

        lbl_costoTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_costoTrat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_costoTrat.setText("Costo");

        lbl_estadoTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_estadoTrat.setForeground(new java.awt.Color(0, 0, 0));
        lbl_estadoTrat.setText("Activo");

        txt_codTrat.setForeground(new java.awt.Color(0, 0, 0));

        txt_nombreTrat.setForeground(new java.awt.Color(0, 0, 0));

        txt_tipoTrat.setForeground(new java.awt.Color(0, 0, 0));

        txt_detalleTrat.setForeground(new java.awt.Color(0, 0, 0));

        jcb_productosTrat.setForeground(new java.awt.Color(0, 0, 0));

        txt_duracionTrat.setForeground(new java.awt.Color(0, 0, 0));

        txt_costoTrat.setForeground(new java.awt.Color(0, 0, 0));

        btn_guardarTrat.setBackground(new java.awt.Color(255, 255, 255));
        btn_guardarTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_guardarTrat.setForeground(new java.awt.Color(0, 0, 0));
        btn_guardarTrat.setText("Guardar");
        btn_guardarTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarTratActionPerformed(evt);
            }
        });

        btn_borrarTrat.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_borrarTrat.setForeground(new java.awt.Color(0, 0, 0));
        btn_borrarTrat.setText("Borrar");
        btn_borrarTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarTratActionPerformed(evt);
            }
        });

        btn_actuTrat.setBackground(new java.awt.Color(255, 255, 255));
        btn_actuTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_actuTrat.setForeground(new java.awt.Color(0, 0, 0));
        btn_actuTrat.setText("Actualizar");
        btn_actuTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actuTratActionPerformed(evt);
            }
        });

        btn_limpiarTrat.setBackground(new java.awt.Color(255, 255, 255));
        btn_limpiarTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_limpiarTrat.setForeground(new java.awt.Color(0, 0, 0));
        btn_limpiarTrat.setText("Limpiar");
        btn_limpiarTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarTratActionPerformed(evt);
            }
        });

        btn_bajaTrat.setBackground(new java.awt.Color(255, 255, 255));
        btn_bajaTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_bajaTrat.setForeground(new java.awt.Color(0, 0, 0));
        btn_bajaTrat.setText("Baja Logica");
        btn_bajaTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bajaTratActionPerformed(evt);
            }
        });

        btn_altaTrat.setBackground(new java.awt.Color(255, 255, 255));
        btn_altaTrat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_altaTrat.setForeground(new java.awt.Color(0, 0, 0));
        btn_altaTrat.setText("Alta Logica");
        btn_altaTrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altaTratActionPerformed(evt);
            }
        });

        ck_estadoTratamiento.setBackground(new java.awt.Color(255, 255, 255));
        ck_estadoTratamiento.setForeground(new java.awt.Color(0, 153, 255));

        btn_buscarTratamiento.setBackground(new java.awt.Color(255, 255, 255));
        btn_buscarTratamiento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_buscarTratamiento.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscarTratamiento.setText("Buscar");
        btn_buscarTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarTratamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_RegistroTratLayout = new javax.swing.GroupLayout(pnl_RegistroTrat);
        pnl_RegistroTrat.setLayout(pnl_RegistroTratLayout);
        pnl_RegistroTratLayout.setHorizontalGroup(
            pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                        .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_codTrat)
                            .addComponent(lbl_nombreTrat)
                            .addComponent(lbl_tipotrat)
                            .addComponent(lbl_detalleTrat))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombreTrat, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(txt_tipoTrat)
                            .addComponent(txt_codTrat)
                            .addComponent(txt_detalleTrat)))
                    .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                        .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_productosTrat)
                            .addComponent(lbl_duracionTrat))
                        .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_RegistroTratLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jcb_productosTrat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_duracionTrat, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                                    .addComponent(txt_costoTrat)))))
                    .addComponent(lbl_costoTrat)
                    .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                        .addComponent(lbl_estadoTrat)
                        .addGap(33, 33, 33)
                        .addComponent(ck_estadoTratamiento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_buscarTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(btn_guardarTrat)
                .addGap(81, 81, 81)
                .addComponent(btn_borrarTrat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btn_actuTrat)
                .addGap(49, 49, 49)
                .addComponent(btn_limpiarTrat)
                .addGap(157, 157, 157))
            .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_bajaTrat)
                .addGap(206, 206, 206)
                .addComponent(btn_altaTrat)
                .addGap(218, 218, 218))
            .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(lbl_titulovista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_RegistroTratLayout.setVerticalGroup(
            pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                        .addComponent(lbl_titulovista, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_codTrat)
                            .addComponent(txt_codTrat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nombreTrat)
                            .addComponent(txt_nombreTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_buscarTratamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipotrat)
                    .addComponent(txt_tipoTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_detalleTrat)
                    .addGroup(pnl_RegistroTratLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_detalleTrat, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_productosTrat)
                    .addComponent(jcb_productosTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_duracionTrat)
                    .addComponent(txt_duracionTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_costoTrat)
                    .addComponent(txt_costoTrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_estadoTrat)
                    .addComponent(ck_estadoTratamiento))
                .addGap(40, 40, 40)
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarTrat)
                    .addComponent(btn_borrarTrat)
                    .addComponent(btn_actuTrat)
                    .addComponent(btn_limpiarTrat))
                .addGap(73, 73, 73)
                .addGroup(pnl_RegistroTratLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bajaTrat)
                    .addComponent(btn_altaTrat))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroTrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_RegistroTrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void cargarProducto(){
            
        for(String producto: listaP){
            
            jcb_productosTrat.addItem(producto);
            
        }
        
        
    }
    
    private void borrarProductos(){
            
        for(String producto: listaP){
            
            jcb_productosTrat.removeItem(producto);
            
        }
        
    }
    
    
    private void btn_buscarTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarTratamientoActionPerformed
       
        try {
        
        borrarProductos();
        int seleccion = Integer.parseInt(txt_codTrat.getText().trim());
        txt_nombreTrat.setText(String.valueOf(operacionesTratamiento.buscarTratamiento(seleccion).getNombre()));
        txt_tipoTrat.setText(String.valueOf(operacionesTratamiento.buscarTratamiento(seleccion).getTipo()));
        txt_detalleTrat.setText(String.valueOf(operacionesTratamiento.buscarTratamiento(seleccion).getDetalle()));
        jcb_productosTrat.addItem(String.valueOf(operacionesTratamiento.buscarTratamiento(seleccion).getProductos()));
        txt_duracionTrat.setText(String.valueOf(operacionesTratamiento.buscarTratamiento(seleccion).getDuracion()));
        txt_costoTrat.setText(String.valueOf(operacionesTratamiento.buscarTratamiento(seleccion).getCosto()));
        ck_estadoTratamiento.setSelected(operacionesTratamiento.buscarTratamiento(seleccion).getActivo());
        
        } catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        } catch (NullPointerException a) {
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        } catch (Exception e) { 
        JOptionPane.showMessageDialog(this, "Error al buscar el tratamiento. Detalles: " + e.getMessage(), "Error de Base de Datos", JOptionPane.ERROR_MESSAGE);
    }
        
        
        
    }//GEN-LAST:event_btn_buscarTratamientoActionPerformed

    private void btn_guardarTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarTratActionPerformed
        
        try {
        
        String seleccionNombre = txt_nombreTrat.getText();
        String seleccionTipoTrat = txt_tipoTrat.getText();
        String seleccionDetalle = txt_detalleTrat.getText();
        String seleccionProductos = String.valueOf(jcb_productosTrat.getSelectedItem());
        int seleccionDuracion = Integer.parseInt(txt_duracionTrat.getText());
        double seleccionCosto = Double.parseDouble(txt_costoTrat.getText());
        boolean seleccionEstado = ck_estadoTratamiento.isSelected();
        
        Tratamiento tratamientoCreado = new Tratamiento(seleccionNombre, seleccionTipoTrat, seleccionDetalle, seleccionProductos, seleccionDuracion, seleccionCosto, seleccionEstado);
        operacionesTratamiento.agregarTratamiento(tratamientoCreado);
        JOptionPane.showMessageDialog(this, "Se agrego el tratamiento: " + seleccionNombre + " correctamente");
        
        
        } catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        } catch (NullPointerException a) {
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        } catch (Exception e) { 
        
        JOptionPane.showMessageDialog(this, "Error al guardar el tratamiento en la base de datos. Detalles: " + e.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        
         
        }
        
           
    }//GEN-LAST:event_btn_guardarTratActionPerformed

    private void btn_borrarTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarTratActionPerformed
       
        try {
        
        int seleccionCodigoTratamiento = Integer.parseInt(txt_codTrat.getText());
        
        operacionesTratamiento.eliminarTratamiento(seleccionCodigoTratamiento);
        JOptionPane.showMessageDialog(this, "Tratamiento borrado actualmente"); 
        
        } catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar un codigo valido", "Error: Codigo invalido", JOptionPane.ERROR_MESSAGE);
        
        }   catch (Exception e) { 
       
        JOptionPane.showMessageDialog(this, "Error al eliminar el tratamiento. Revise si está asociado a otras tablas. Detalles: " + e.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btn_borrarTratActionPerformed

    private void btn_actuTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actuTratActionPerformed
        
        try {
        
        int seleccionCodigoTratamiento = Integer.parseInt(txt_codTrat.getText());
        String seleccionNombre = txt_nombreTrat.getText();
        String seleccionTipoTrat = txt_tipoTrat.getText();
        String seleccionDetalle = txt_detalleTrat.getText();
        String seleccionProductos = String.valueOf(jcb_productosTrat.getSelectedItem());
        int seleccionDuracion = Integer.parseInt(txt_duracionTrat.getText());
        double seleccionCosto = Double.parseDouble(txt_costoTrat.getText());
        boolean seleccionEstado = ck_estadoTratamiento.isSelected();
        
        Tratamiento tratamientoActualizado = new Tratamiento(seleccionCodigoTratamiento, seleccionNombre, seleccionTipoTrat, seleccionDetalle, seleccionProductos, seleccionDuracion, seleccionCosto, seleccionEstado);
        operacionesTratamiento.actualizarTratamiento(tratamientoActualizado);
        JOptionPane.showMessageDialog(this, "Se actualizo el tratamiento: " + seleccionNombre + " correctamente");
        
        } catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        } catch (NullPointerException a) {
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        }catch (Exception e) {
        
        JOptionPane.showMessageDialog(this, "Error al actualizar el tratamiento en la base de datos. Revise la Matrícula. Detalles: " + e.getMessage(), 
                                      "Error de Base de Datos", JOptionPane.ERROR_MESSAGE);
    }
        
        
    }//GEN-LAST:event_btn_actuTratActionPerformed

    private void btn_bajaTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bajaTratActionPerformed
        
        try {
        
        int seleccionCodigoTratamiento = Integer.parseInt(txt_codTrat.getText());
        String seleccionNombre = txt_nombreTrat.getText();
        String seleccionTipoTrat = txt_tipoTrat.getText();
        String seleccionDetalle = txt_detalleTrat.getText();
        String seleccionProductos = String.valueOf(jcb_productosTrat.getSelectedItem());
        int seleccionDuracion = Integer.parseInt(txt_duracionTrat.getText());
        double seleccionCosto = Double.parseDouble(txt_costoTrat.getText());
        boolean seleccionEstado = ck_estadoTratamiento.isSelected();
        
        Tratamiento tratamientoActualizado = new Tratamiento(seleccionCodigoTratamiento, seleccionNombre, seleccionTipoTrat, seleccionDetalle, seleccionProductos, seleccionDuracion, seleccionCosto, seleccionEstado);
        operacionesTratamiento.bajaLogica(tratamientoActualizado);
        JOptionPane.showMessageDialog(this, "Se actualizo el tratamiento: " + seleccionNombre + " correctamente");
        
        } catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        } catch (NullPointerException a) {
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        } catch (Exception e) { 
      
        JOptionPane.showMessageDialog(this, "Error al dar de baja el tratamiento. Detalles: " + e.getMessage(), "Error de Base de Datos", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btn_bajaTratActionPerformed

    private void btn_altaTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altaTratActionPerformed
        
        try {
        
        int seleccionCodigoTratamiento = Integer.parseInt(txt_codTrat.getText());
        String seleccionNombre = txt_nombreTrat.getText();
        String seleccionTipoTrat = txt_tipoTrat.getText();
        String seleccionDetalle = txt_detalleTrat.getText();
        String seleccionProductos = String.valueOf(jcb_productosTrat.getSelectedItem());
        int seleccionDuracion = Integer.parseInt(txt_duracionTrat.getText());
        double seleccionCosto = Double.parseDouble(txt_costoTrat.getText());
        boolean seleccionEstado = ck_estadoTratamiento.isSelected();
        
        Tratamiento tratamientoActualizado = new Tratamiento(seleccionCodigoTratamiento, seleccionNombre, seleccionTipoTrat, seleccionDetalle, seleccionProductos, seleccionDuracion, seleccionCosto, seleccionEstado);
        operacionesTratamiento.altaLogica(tratamientoActualizado);
        JOptionPane.showMessageDialog(this, "Se actualizo el tratamiento: " + seleccionNombre + " correctamente");
        
        } catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        } catch (NullPointerException a) {
            
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar datos valido", "Error: Datos invalidos", JOptionPane.ERROR_MESSAGE);
            
        }catch (Exception e) { 
        
        JOptionPane.showMessageDialog(this, "Error al dar de alta el tratamiento. Detalles: " + e.getMessage(), "Error de Base de Datos", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btn_altaTratActionPerformed

    private void btn_limpiarTratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarTratActionPerformed
        
        borrarProductos();
        
        txt_codTrat.setText("");
        txt_nombreTrat.setText("");
        txt_tipoTrat.setText("");
        txt_detalleTrat.setText("");
        txt_duracionTrat.setText("");
        txt_costoTrat.setText("");
        ck_estadoTratamiento.setSelected(false);
        
        cargarProducto();
        
    }//GEN-LAST:event_btn_limpiarTratActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actuTrat;
    private javax.swing.JButton btn_altaTrat;
    private javax.swing.JButton btn_bajaTrat;
    private javax.swing.JButton btn_borrarTrat;
    private javax.swing.JButton btn_buscarTratamiento;
    private javax.swing.JButton btn_guardarTrat;
    private javax.swing.JButton btn_limpiarTrat;
    private javax.swing.JCheckBox ck_estadoTratamiento;
    private javax.swing.JComboBox<String> jcb_productosTrat;
    private javax.swing.JLabel lbl_codTrat;
    private javax.swing.JLabel lbl_costoTrat;
    private javax.swing.JLabel lbl_detalleTrat;
    private javax.swing.JLabel lbl_duracionTrat;
    private javax.swing.JLabel lbl_estadoTrat;
    private javax.swing.JLabel lbl_nombreTrat;
    private javax.swing.JLabel lbl_productosTrat;
    private javax.swing.JLabel lbl_tipotrat;
    private javax.swing.JLabel lbl_titulovista;
    private javax.swing.JPanel pnl_RegistroTrat;
    private javax.swing.JTextField txt_codTrat;
    private javax.swing.JTextField txt_costoTrat;
    private javax.swing.JTextField txt_detalleTrat;
    private javax.swing.JTextField txt_duracionTrat;
    private javax.swing.JTextField txt_nombreTrat;
    private javax.swing.JTextField txt_tipoTrat;
    // End of variables declaration//GEN-END:variables
}
