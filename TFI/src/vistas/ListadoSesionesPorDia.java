/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Masajista;
import modelo.Sesion;
import persistencia.Conexion;
import persistencia.DiaDeSpaData;
import persistencia.InstalacionData;
import persistencia.MasajistaData;
import persistencia.SesionData;
import persistencia.TratamientoData;

/**
 *
 * @author Maxi
 */
public class ListadoSesionesPorDia extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla;

    Conexion con = new Conexion();

    DiaDeSpaData operacionesDiaSpa = new DiaDeSpaData(con);
    TratamientoData operacionesTratamiento = new TratamientoData(con);
    MasajistaData operacionesMasajista = new MasajistaData(con);
    InstalacionData operacionesInstalaciones = new InstalacionData(con);
    SesionData operacionesSesion = new SesionData(con);

    private ArrayList<Sesion> listaS;

    public ListadoSesionesPorDia() {
        initComponents();

        modeloTabla = new DefaultTableModel();

        cargarColumnasTablas();

    }

    private void cargarListadoSesiones() {

        borrarFilaTabla();

        Date fechaSesion = jcd_buscar_dia.getDate();

        LocalDate fechaCasteada = fechaSesion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        listaS = (ArrayList<Sesion>) operacionesSesion.listarSesionesPorFecha(fechaCasteada);

        for (Sesion sesion : listaS) {
            String masajistaNonulo;
            if (sesion.getMasajista() != null) {
                masajistaNonulo = String.valueOf(sesion.getMasajista().getNombre_completo());

            }else{
                masajistaNonulo="No aplica";
            }
            modeloTabla.addRow(new Object[]{
                sesion.getCodSesion(),
                sesion.getHoraInicio(),
                sesion.getHoraFin(),
                operacionesTratamiento.buscarTratamiento(sesion.getTratamiento().getCodTratam()).getNombre(),
                masajistaNonulo,
                operacionesDiaSpa.buscarDia(sesion.getDiaDeSpa().getCodPack()),
                operacionesInstalaciones.buscarInstalacion(sesion.getInstalaciones().getCodInstal()).getNombre(),
                operacionesSesion.calculodeCosto(sesion.getDiaDeSpa().getCodPack())

            });

        }

    }

    private void cargarColumnasTablas() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo Sesion");
        filaCabecera.add("Hora Inicio");
        filaCabecera.add("Hora Fin");
        filaCabecera.add("Tratamiento");
        filaCabecera.add("Masajista");
        filaCabecera.add("Codigo Dia Spa");
        filaCabecera.add("Instalacion");
        filaCabecera.add("Costo Total");
        for (Object it : filaCabecera) {
            modeloTabla.addColumn(it);
        }
        jTable_sesiones.setModel(modeloTabla);

    }

    private void borrarFilaTabla() {

        int indice = modeloTabla.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {

            modeloTabla.removeRow(i);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_buscarDia = new javax.swing.JLabel();
        jcd_buscar_dia = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_sesiones = new javax.swing.JTable();
        lbl_sesionesDia = new javax.swing.JLabel();
        btn_buscarSesion = new javax.swing.JButton();
        lbl_buscarDia1 = new javax.swing.JLabel();
        btn_anularSesion = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbl_buscarDia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_buscarDia.setText("Elija el dia que quiere consultar");

        jcd_buscar_dia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jcd_buscar_diaFocusLost(evt);
            }
        });
        jcd_buscar_dia.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jcd_buscar_diaPropertyChange(evt);
            }
        });

        jTable_sesiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_sesiones);

        lbl_sesionesDia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_sesionesDia.setText("Sesiones del dia");

        btn_buscarSesion.setBackground(new java.awt.Color(0, 102, 102));
        btn_buscarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda_1.png"))); // NOI18N
        btn_buscarSesion.setText("Buscar");
        btn_buscarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarSesionActionPerformed(evt);
            }
        });

        lbl_buscarDia1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_buscarDia1.setText("Elija una sesion en caso de querer cancelarla");

        btn_anularSesion.setBackground(new java.awt.Color(0, 102, 102));
        btn_anularSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_anularSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btn_anularSesion.setText("Anular Sesion");
        btn_anularSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anularSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(611, 611, 611)
                .addComponent(lbl_sesionesDia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(lbl_buscarDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_buscarDia1)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jcd_buscar_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_anularSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_buscarDia)
                    .addComponent(lbl_buscarDia1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcd_buscar_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_buscarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_anularSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(lbl_sesionesDia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcd_buscar_diaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jcd_buscar_diaPropertyChange


    }//GEN-LAST:event_jcd_buscar_diaPropertyChange

    private void jcd_buscar_diaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcd_buscar_diaFocusLost

    }//GEN-LAST:event_jcd_buscar_diaFocusLost

    private void btn_buscarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarSesionActionPerformed
        cargarListadoSesiones();
    }//GEN-LAST:event_btn_buscarSesionActionPerformed

    private void btn_anularSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anularSesionActionPerformed

<<<<<<< Updated upstream
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{ 
        int filaSeleccionada = jTable_sesiones.getSelectedRow();
              
              
=======
        int filaSeleccionada = jTable_sesiones.getSelectedRow();

>>>>>>> Stashed changes
        if (filaSeleccionada != -1) {

            int codigoSesionSeleccionado = (int) modeloTabla.getValueAt(filaSeleccionada, 0);

            operacionesSesion.eliminarSesion(codigoSesionSeleccionado);

            JOptionPane.showMessageDialog(this, "Sesion borrada correctamente");

            cargarListadoSesiones();

        }
<<<<<<< Updated upstream
      
    } catch (NumberFormatException e) {
        
        JOptionPane.showMessageDialog(this, "Error: El código de sesión seleccionado no es un número válido.", 
                                      "Error de Formato", JOptionPane.ERROR_MESSAGE);
                                      
    }catch (Exception e) {
        
        JOptionPane.showMessageDialog(this, "Error al anular la sesión en la base de datos. Detalles: " + e.getMessage(), 
                                      "Error de Base de Datos", JOptionPane.ERROR_MESSAGE);
    }
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
=======


    }//GEN-LAST:event_btn_anularSesionActionPerformed
>>>>>>> Stashed changes


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anularSesion;
    private javax.swing.JButton btn_buscarSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_sesiones;
    private com.toedter.calendar.JDateChooser jcd_buscar_dia;
    private javax.swing.JLabel lbl_buscarDia;
    private javax.swing.JLabel lbl_buscarDia1;
    private javax.swing.JLabel lbl_sesionesDia;
    // End of variables declaration//GEN-END:variables
}
