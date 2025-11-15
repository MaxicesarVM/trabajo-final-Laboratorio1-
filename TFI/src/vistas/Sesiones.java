/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.DiaDeSpa;
import modelo.Instalacion;
import modelo.Masajista;
import modelo.Sesion;
import modelo.Tratamiento;
import persistencia.Conexion;
import persistencia.DiaDeSpaData;
import persistencia.InstalacionData;
import persistencia.MasajistaData;
import persistencia.SesionData;
import persistencia.TratamientoData;


public class Sesiones extends javax.swing.JInternalFrame {

    
    private DefaultTableModel modeloTabla;
    
    Conexion con = new Conexion();
    
    DiaDeSpaData operacionesDiaSpa = new DiaDeSpaData(con);
    TratamientoData operacionesTratamiento = new TratamientoData(con);
    MasajistaData operacionesMasajista = new MasajistaData(con);
    InstalacionData operacionesInstalaciones = new InstalacionData(con);
    SesionData operacionesSesion = new SesionData(con);
    
    
    ArrayList<DiaDeSpa> listad = (ArrayList<DiaDeSpa>) operacionesDiaSpa.listarDiaSpa();
    ArrayList<Tratamiento> listat = (ArrayList<Tratamiento>) operacionesTratamiento.listarTratamientos();
    ArrayList<Masajista> listam = (ArrayList<Masajista>) operacionesMasajista.listarMasajistas();
    ArrayList<String> listap = (ArrayList<String>) operacionesTratamiento.listarProductos();
    ArrayList<Instalacion> listainst = (ArrayList<Instalacion>) operacionesInstalaciones.listarInstalacion();
    
    
    
    public Sesiones() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        
        cargarColumnasTablas();
        
        cargarDiaSpa();
        cargarTratamientos();
        cargarInstalaciones();
        
    }

    
    private void cargarDiaSpa(){
        
            for(DiaDeSpa diaspa: listad){
            
                
                jcb_codPack.addItem(diaspa.getCodPack());
                
            
        }
        
        
    }
    
    
    
    private void cargarProductos(){
        
            for(String producto: listap){
            
                
                jcb_producto.addItem(producto);
                
            
        }
        
        
    }
    
    
    private void cargarTratamientos(){
        
            
            
        
            for(Tratamiento tratamiento: listat){
            
                
                jcombo_tratamiento.addItem(tratamiento);
                
            
        }
        
        
    }
    
    private void cargarInstalaciones(){
        
            
            for(Instalacion instalacion: listainst){
            
                
                
                jcb_instalacion.addItem(instalacion);
                
            
        }
        
        
    }
    
    
    private void cargarDuraciones(){
        
        
        Tratamiento tratamientoSeleccionado = (Tratamiento) jcombo_tratamiento.getSelectedItem();
        
        if (tratamientoSeleccionado != null) {
            txt_duracionMasajista.setText(String.valueOf(tratamientoSeleccionado.getDuracion()));
        } else {
        
            txt_duracionMasajista.setText(""); 
        }
        
            
        
    }
    

   
    private void cargarMasajistas(){
        
            
        
            
            
            for(Masajista masajista: listam){
            
                
                
                jcombo_masajista.addItem(masajista);
                
            
        }
        
        
    }
    
    
    
    
     private void cargarColumnasTablas(){
        
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Hora inicio");
        filaCabecera.add("Hora fin");
        for(Object it: filaCabecera){
            modeloTabla.addColumn(it);
        }
        tbl_horarios.setModel(modeloTabla);
        
    }
    
    
    private void borrarFilaTabla(){
        
        int indice = modeloTabla.getRowCount() - 1;
        for(int i = indice; i >= 0 ; i-- ){
        
            modeloTabla.removeRow(i);
            
        
        }
         
    }
     
    
    private void limpiarCombosDependientes() {
    
        jcb_producto.removeAllItems();
        
    
        jcombo_masajista.removeAllItems();
    }
    
    
    private void generarHorariosSesionSoloTratamiento30(){
        
        borrarFilaTabla();
        
        String[] horariosInicio = {
            "08:00", "08:30", "09:00", "09:30", "10:00", "10:30",
            "11:00", "11:30", "12:00", "12:30", "13:00", "13:30"
        };

        String[] horariosFin = {
            
            "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", 
            "11:30", "12:00", "12:30", "13:00", "13:30", "14:00"
            
        };
        
        for(int i = 0; i < horariosInicio.length; i++){
            
            modeloTabla.addRow(new Object[]{
                horariosInicio[i],
                horariosFin[i]
                   
            });
  
        }
        
    }
    
    private void generarHorariosSesionSoloTratamiento30ConIns(){
        
        borrarFilaTabla();
        
        String[] horariosInicio = {
            "08:00", "09:30", "11:00", "12:30"
        };

        String[] horariosFin = {
            
            "09:30", "11:00", "12:30", "14:00"
            
        };
        
        for(int i = 0; i < horariosInicio.length; i++){
            
            modeloTabla.addRow(new Object[]{
                horariosInicio[i],
                horariosFin[i]
                   
            });
  
        }
        
    }
    
    private void generarHorariosSesionSoloTratamiento60ConIns(){
        
        borrarFilaTabla();
        
        String[] horariosInicio = {
            "08:00", "10:00", "12:00"
        };

        String[] horariosFin = {
            
            "10:00", "12:00", "14:00"
            
        };
        
        for(int i = 0; i < horariosInicio.length; i++){
            
            modeloTabla.addRow(new Object[]{
                horariosInicio[i],
                horariosFin[i]
                   
            });
  
        }
        
    }
    
    private void generarHorariosSesionSoloTratamiento60(){
        
        borrarFilaTabla();
        
        String[] horariosInicio = {
            "08:00", "09:00", "10:00", "11:00", "12:00", "13:00",
            "14:00"
        };

        String[] horariosFin = {
            
            "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", 
            "15:00"
            
        };
        
        for(int i = 0; i < horariosInicio.length; i++){
            
            modeloTabla.addRow(new Object[]{
                horariosInicio[i],
                horariosFin[i]
                   
            });
  
        }
        
    }
    
    private void verificarHorarios(){
     Instalacion instalacionParaElegir = (Instalacion) jcb_instalacion.getSelectedItem();
     Tratamiento tratamientoElegido = (Tratamiento) jcombo_tratamiento.getSelectedItem();
     
     

     if(txt_duracionMasajista.getText().equalsIgnoreCase("30") && instalacionParaElegir.getNombre().equalsIgnoreCase("Ninguno")){
         generarHorariosSesionSoloTratamiento30(); // 30 min SIN instalación
         
     } else if(txt_duracionMasajista.getText().equalsIgnoreCase("60") && instalacionParaElegir.getNombre().equalsIgnoreCase("Ninguno")){
         generarHorariosSesionSoloTratamiento60(); // 60 min SIN instalación
         
     } else if(txt_duracionMasajista.getText().equalsIgnoreCase("30") && !instalacionParaElegir.getNombre().equalsIgnoreCase("Ninguno")){
         generarHorariosSesionSoloTratamiento30ConIns(); // 30 min CON instalación
         
     } else if(tratamientoElegido.getNombre().equalsIgnoreCase("Ninguno") && !instalacionParaElegir.getNombre().equalsIgnoreCase("Ninguno")){
         
         generarHorariosSesionSoloTratamiento60();
         
     } else if(txt_duracionMasajista.getText().equalsIgnoreCase("60") && !instalacionParaElegir.getNombre().equalsIgnoreCase("Ninguno")){
         generarHorariosSesionSoloTratamiento60ConIns(); 
         
     } 
     
     
     
}
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jL_codSesion = new javax.swing.JLabel();
        jl_masajista = new javax.swing.JLabel();
        jl_tratamiento = new javax.swing.JLabel();
        jcombo_masajista = new javax.swing.JComboBox<>();
        jcombo_tratamiento = new javax.swing.JComboBox<>();
        jtable_horarios = new javax.swing.JScrollPane();
        tbl_horarios = new javax.swing.JTable();
        jcl_fechas = new javax.swing.JLabel();
        btm_guardarReserva = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jl_titulo = new javax.swing.JLabel();
        txt_productoTitulo = new javax.swing.JLabel();
        jcb_producto = new javax.swing.JComboBox<>();
        jdc_fecha = new com.toedter.calendar.JDateChooser();
        txt_codSesion = new javax.swing.JTextField();
        lbl_codPack = new javax.swing.JLabel();
        lbl_horariosLista = new javax.swing.JLabel();
        jcb_codPack = new javax.swing.JComboBox<>();
        lbl_instalacion = new javax.swing.JLabel();
        jcb_instalacion = new javax.swing.JComboBox<>();
        lbl_duracion = new javax.swing.JLabel();
        lbl_matriculaMasj = new javax.swing.JLabel();
        txt_matriculaMasj = new javax.swing.JTextField();
        txt_duracionMasajista = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jL_codSesion.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        jL_codSesion.setForeground(new java.awt.Color(0, 0, 0));
        jL_codSesion.setText("Codigo Sesion");

        jl_masajista.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        jl_masajista.setForeground(new java.awt.Color(0, 0, 0));
        jl_masajista.setText("Masajista");

        jl_tratamiento.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        jl_tratamiento.setForeground(new java.awt.Color(0, 0, 0));
        jl_tratamiento.setText("Tratamiento");

        jcombo_masajista.setEnabled(false);
        jcombo_masajista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombo_masajistaActionPerformed(evt);
            }
        });

        jcombo_tratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombo_tratamientoActionPerformed(evt);
            }
        });

        tbl_horarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable_horarios.setViewportView(tbl_horarios);

        jcl_fechas.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        jcl_fechas.setForeground(new java.awt.Color(0, 0, 0));
        jcl_fechas.setText("Fecha");

        btm_guardarReserva.setBackground(new java.awt.Color(255, 255, 255));
        btm_guardarReserva.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btm_guardarReserva.setForeground(new java.awt.Color(0, 0, 0));
        btm_guardarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        btm_guardarReserva.setText("Reservar");
        btm_guardarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_guardarReservaActionPerformed(evt);
            }
        });

        btn_actualizar.setBackground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setForeground(new java.awt.Color(0, 0, 0));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-actualizar-50.png"))); // NOI18N
        btn_actualizar.setText("Modificar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        jl_titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        jl_titulo.setText("Gestor de reserva tratamiento ");

        txt_productoTitulo.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        txt_productoTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txt_productoTitulo.setText("Producto");

        jcb_producto.setEnabled(false);

        jdc_fecha.setEnabled(false);

        lbl_codPack.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        lbl_codPack.setForeground(new java.awt.Color(0, 0, 0));
        lbl_codPack.setText("Asignar a pack:");

        lbl_horariosLista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_horariosLista.setForeground(new java.awt.Color(0, 0, 0));
        lbl_horariosLista.setText("Horarios");

        jcb_codPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_codPackActionPerformed(evt);
            }
        });

        lbl_instalacion.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        lbl_instalacion.setForeground(new java.awt.Color(0, 0, 0));
        lbl_instalacion.setText("Instalacion");

        jcb_instalacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_instalacionActionPerformed(evt);
            }
        });

        lbl_duracion.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        lbl_duracion.setForeground(new java.awt.Color(0, 0, 0));
        lbl_duracion.setText("Duracion");

        lbl_matriculaMasj.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        lbl_matriculaMasj.setForeground(new java.awt.Color(0, 0, 0));
        lbl_matriculaMasj.setText("Matricula Masajista");

        txt_matriculaMasj.setEditable(false);
        txt_matriculaMasj.setEnabled(false);

        txt_duracionMasajista.setEditable(false);
        txt_duracionMasajista.setEnabled(false);
        txt_duracionMasajista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_duracionMasajistaActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(255, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda_1.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lbl_codPack)
                                .addGap(18, 18, 18)
                                .addComponent(jcb_codPack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 143, Short.MAX_VALUE)
                                        .addComponent(jcl_fechas))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_instalacion)))
                                .addGap(18, 18, 18)
                                .addComponent(jcb_instalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(296, 296, 296)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btm_guardarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_horariosLista)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_productoTitulo)
                            .addComponent(jl_masajista)
                            .addComponent(jl_tratamiento)
                            .addComponent(jL_codSesion)
                            .addComponent(lbl_matriculaMasj)
                            .addComponent(lbl_duracion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_matriculaMasj, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_duracionMasajista, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcombo_masajista, 0, 336, Short.MAX_VALUE)
                                        .addComponent(jcb_producto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcombo_tratamiento, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txt_codSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jtable_horarios, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jl_titulo)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_horariosLista)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtable_horarios, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_codSesion)
                            .addComponent(txt_codSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_buscar))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_tratamiento)
                            .addComponent(jcombo_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_productoTitulo)
                            .addComponent(jcb_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_masajista)
                            .addComponent(jcombo_masajista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_matriculaMasj)
                            .addComponent(txt_matriculaMasj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btm_guardarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_duracion)
                            .addComponent(txt_duracionMasajista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_instalacion)
                            .addComponent(jcb_instalacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcl_fechas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdc_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcb_codPack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_actualizar))
                    .addComponent(lbl_codPack))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btm_guardarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_guardarReservaActionPerformed
        
        Date fechaSesion = jdc_fecha.getDate();
        
        LocalDate fechaCasteada = fechaSesion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        

        int filaSeleccionada = tbl_horarios.getSelectedRow();
        
        LocalTime horaInicio = null;
        LocalTime horaFin = null;
                
                
        if (filaSeleccionada != -1) {
        
            String horarioInicio = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
        
            String horarioFin = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
        
            horaInicio = LocalTime.parse(horarioInicio);
            horaFin = LocalTime.parse(horarioFin);
        
            
            
           
        }
        
        
        Tratamiento tratamientoElegido = (Tratamiento) jcombo_tratamiento.getSelectedItem();
        
        if(tratamientoElegido.getNombre().equalsIgnoreCase("Ninguno")){
            
            Instalacion instalacionSeleccionada = (Instalacion) jcb_instalacion.getSelectedItem();
            int codigoSeleccionadoDiaSpa = (int) jcb_codPack.getSelectedItem();
            DiaDeSpa diaSeleccionado = (DiaDeSpa) operacionesDiaSpa.buscarDia(codigoSeleccionadoDiaSpa);
            boolean estadoSesion = true;
        
            Sesion sesionCreada = new Sesion(fechaCasteada, horaInicio, horaFin, tratamientoElegido, instalacionSeleccionada, diaSeleccionado, estadoSesion);
            
            try {
                operacionesSesion.crearSesion(sesionCreada);
                JOptionPane.showMessageDialog(this, "Se creo la sesion correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Se encontro un error al guardar la sesion");
            }
            
        
        } else{
            
            Masajista masajistaSeleccionado = (Masajista) jcombo_masajista.getSelectedItem();
            String productoSeleccionado = (String) jcb_producto.getSelectedItem();
            tratamientoElegido.setProductos(productoSeleccionado);
            Instalacion instalacionSeleccionada = (Instalacion) jcb_instalacion.getSelectedItem();
            int codigoSeleccionadoDiaSpa = (int) jcb_codPack.getSelectedItem();
            DiaDeSpa diaSeleccionado = (DiaDeSpa) operacionesDiaSpa.buscarDia(codigoSeleccionadoDiaSpa);
            boolean estadoSesion = true;
            
            Sesion sesionCreada = new Sesion(fechaCasteada, horaInicio, horaFin, tratamientoElegido, masajistaSeleccionado, instalacionSeleccionada, diaSeleccionado, estadoSesion);
            try {
                operacionesSesion.crearSesion(sesionCreada);
                JOptionPane.showMessageDialog(this, "Se creo la sesion correctamente");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Se encontro un error al guardar la sesion");
            }
            
        }
         
        this.dispose();
        
        
    }//GEN-LAST:event_btm_guardarReservaActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        
        
        int codigoSesion = Integer.valueOf(txt_codSesion.getText());
        Date fechaSesion = jdc_fecha.getDate();
        
        LocalDate fechaCasteada = fechaSesion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        

        int filaSeleccionada = tbl_horarios.getSelectedRow();
        
        LocalTime horaInicio = null;
        LocalTime horaFin = null;
                
                
        if (filaSeleccionada != -1) {
        
            String horarioInicio = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
        
            String horarioFin = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
        
            horaInicio = LocalTime.parse(horarioInicio);
            horaFin = LocalTime.parse(horarioFin);
        
            
            
           
        }
        
        
        Tratamiento tratamientoElegido = (Tratamiento) jcombo_tratamiento.getSelectedItem();
        
        if(tratamientoElegido.getNombre().equalsIgnoreCase("Ninguno")){
            
            Instalacion instalacionSeleccionada = (Instalacion) jcb_instalacion.getSelectedItem();
            int codigoSeleccionadoDiaSpa = (int) jcb_codPack.getSelectedItem();
            DiaDeSpa diaSeleccionado = (DiaDeSpa) operacionesDiaSpa.buscarDia(codigoSeleccionadoDiaSpa);
            boolean estadoSesion = true;
        
            Sesion sesionCreada = new Sesion(codigoSesion, fechaCasteada, horaInicio, horaFin, tratamientoElegido, instalacionSeleccionada, diaSeleccionado, estadoSesion);
            
            try {
                operacionesSesion.actualizarSesion(sesionCreada);
                JOptionPane.showMessageDialog(this, "Se actualizo la sesion correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Se encontro un error al actualizar la sesion");
            }
            
        
        } else{
            
            Masajista masajistaSeleccionado = (Masajista) jcombo_masajista.getSelectedItem();
            String productoSeleccionado = (String) jcb_producto.getSelectedItem();
            tratamientoElegido.setProductos(productoSeleccionado);
            Instalacion instalacionSeleccionada = (Instalacion) jcb_instalacion.getSelectedItem();
            int codigoSeleccionadoDiaSpa = (int) jcb_codPack.getSelectedItem();
            DiaDeSpa diaSeleccionado = (DiaDeSpa) operacionesDiaSpa.buscarDia(codigoSeleccionadoDiaSpa);
            boolean estadoSesion = true;
            
            Sesion sesionCreada = new Sesion(codigoSesion, fechaCasteada, horaInicio, horaFin, tratamientoElegido, masajistaSeleccionado, instalacionSeleccionada, diaSeleccionado, estadoSesion);
            try {
                operacionesSesion.actualizarSesion(sesionCreada);
                JOptionPane.showMessageDialog(this, "Se actualizo la sesion correctamente");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Se encontro un error al actualizar la sesion");
            }
            
        }
        
        this.dispose();
        
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void jcombo_tratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombo_tratamientoActionPerformed
        
        
        Tratamiento tratamientoSeleccionado = (Tratamiento) jcombo_tratamiento.getSelectedItem();
        String condicion = tratamientoSeleccionado.getNombre();
        if(tratamientoSeleccionado != null && !"Ninguno".equalsIgnoreCase(condicion)){
            
            jcb_producto.setEnabled(true);
            jcombo_masajista.setEnabled(true);
            txt_matriculaMasj.setEnabled(true);
            txt_duracionMasajista.setEnabled(true);
            limpiarCombosDependientes();
            cargarMasajistas();
            cargarProductos();
            cargarDuraciones();
            verificarHorarios();
            

            
        } else{
            
            jcb_producto.setEnabled(false);
            jcombo_masajista.setEnabled(false);
            txt_matriculaMasj.setEnabled(false);
            txt_duracionMasajista.setEnabled(false);
            limpiarCombosDependientes();
            
            txt_matriculaMasj.setText("");
            txt_duracionMasajista.setText("");
            borrarFilaTabla();
            
        }
        
        
          
    }//GEN-LAST:event_jcombo_tratamientoActionPerformed

    private void jcombo_masajistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombo_masajistaActionPerformed
        
        Masajista masajistaSeleccionado = (Masajista) jcombo_masajista.getSelectedItem();
        
        if (masajistaSeleccionado != null) {
            txt_matriculaMasj.setText(String.valueOf(masajistaSeleccionado.getMatricula()));
        } else {
        
            txt_matriculaMasj.setText(""); 
        }
        
 
        
    }//GEN-LAST:event_jcombo_masajistaActionPerformed

    private void jcb_instalacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_instalacionActionPerformed
        
       
        
        
        Tratamiento tratamientoSeleccionado = (Tratamiento) jcombo_tratamiento.getSelectedItem();
    
    
        boolean duracionLlena = !txt_duracionMasajista.getText().isEmpty();
    
    
        boolean esTratamientoNinguno = (tratamientoSeleccionado != null && tratamientoSeleccionado.getNombre().equalsIgnoreCase("Ninguno"));
    
    
        if (duracionLlena || esTratamientoNinguno) {
            verificarHorarios();
        }
        
        
        
        
    }//GEN-LAST:event_jcb_instalacionActionPerformed

    private void jcb_codPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_codPackActionPerformed
        
        int seleccionCodigo = (int) jcb_codPack.getSelectedItem();
        
        LocalDate fechaCreada = operacionesDiaSpa.buscarDia(seleccionCodigo).getFecha();
        java.util.Date fechaCasteada = java.util.Date.from(fechaCreada.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
        
        
        jdc_fecha.setDate(fechaCasteada);
        
    }//GEN-LAST:event_jcb_codPackActionPerformed

    private void txt_duracionMasajistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_duracionMasajistaActionPerformed
        
    }//GEN-LAST:event_txt_duracionMasajistaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        int codigoSesion = Integer.valueOf(txt_codSesion.getText());
        
        Sesion sesionBuscada = operacionesSesion.buscarSesion(codigoSesion);
        System.out.println("ESTO BUSCAS");
        System.out.println(sesionBuscada.getTratamiento());
        
        
        txt_codSesion.setText(String.valueOf(sesionBuscada.getCodSesion()));
        
        Tratamiento tratamientoEncontrado = sesionBuscada.getTratamiento();
        Instalacion instalacionEncontrada = sesionBuscada.getInstalaciones();
        LocalDate fecha = sesionBuscada.getFecha();
        Date fechaCasteada = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
        DiaDeSpa codigoEncontrado = sesionBuscada.getDiaDeSpa();
        
        
        jcombo_tratamiento.setSelectedItem(tratamientoEncontrado);
        jcb_codPack.setSelectedItem(codigoEncontrado.getCodPack());
        
        
        if(tratamientoEncontrado.getNombre().equalsIgnoreCase("Ninguno")){
            
            
            jcb_producto.setEnabled(false);
            jcombo_masajista.setEnabled(false);
            txt_matriculaMasj.setEnabled(false);
            txt_matriculaMasj.setText("");
            txt_duracionMasajista.setEnabled(false);
            txt_duracionMasajista.setText("");
            jcb_instalacion.setSelectedItem(instalacionEncontrada);
            jdc_fecha.setDate(fechaCasteada);
            
            
            
            
        } else{
            
            jcb_producto.setEnabled(true);
            jcombo_masajista.setEnabled(true);
            txt_matriculaMasj.setEnabled(true);
            txt_duracionMasajista.setEnabled(true);
            
            
            jcb_producto.setSelectedItem(sesionBuscada.getTratamiento().getProductos());
            jcombo_masajista.setSelectedItem(sesionBuscada.getMasajista());
            txt_matriculaMasj.setText(String.valueOf(sesionBuscada.getMasajista().getMatricula()));
            txt_duracionMasajista.setText(String.valueOf(sesionBuscada.getTratamiento().getDuracion()));
            jcb_instalacion.setSelectedItem(instalacionEncontrada);
            jdc_fecha.setDate(fechaCasteada);
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_guardarReserva;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JLabel jL_codSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<Integer> jcb_codPack;
    private javax.swing.JComboBox<Instalacion> jcb_instalacion;
    private javax.swing.JComboBox<String> jcb_producto;
    private javax.swing.JLabel jcl_fechas;
    private javax.swing.JComboBox<Masajista> jcombo_masajista;
    private javax.swing.JComboBox<Tratamiento> jcombo_tratamiento;
    private com.toedter.calendar.JDateChooser jdc_fecha;
    private javax.swing.JLabel jl_masajista;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_tratamiento;
    private javax.swing.JScrollPane jtable_horarios;
    private javax.swing.JLabel lbl_codPack;
    private javax.swing.JLabel lbl_duracion;
    private javax.swing.JLabel lbl_horariosLista;
    private javax.swing.JLabel lbl_instalacion;
    private javax.swing.JLabel lbl_matriculaMasj;
    private javax.swing.JTable tbl_horarios;
    private javax.swing.JTextField txt_codSesion;
    private javax.swing.JTextField txt_duracionMasajista;
    private javax.swing.JTextField txt_matriculaMasj;
    private javax.swing.JLabel txt_productoTitulo;
    // End of variables declaration//GEN-END:variables
}




