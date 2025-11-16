package persistencia;

import java.sql.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.DiaDeSpa;
import modelo.Instalacion;
import modelo.Masajista;
import modelo.Sesion;
import modelo.Tratamiento;
import persistencia.Conexion;

public class SesionData {

    private Connection con = null;
    private Conexion conexion;

    public SesionData(Conexion conexion) {
        this.conexion = conexion;

        this.con = conexion.getConexion();

    }

    public boolean verificadorDeHora(LocalDate fecha, LocalTime hora_inicio, LocalTime hora_fin) {
        String sql = "SELECT verificarSuperposicionSesion(?, ?, ?) ;";
        boolean validador_hora = false;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(fecha));
            ps.setTime(2, java.sql.Time.valueOf(hora_inicio));
            ps.setTime(3, java.sql.Time.valueOf(hora_fin));
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                validador_hora = rs.getBoolean(1);
            }

            ps.close();
            System.out.println("verificacion hecha");

        } catch (SQLException ex) {

            System.out.println("Error al verificar: " + ex);

        }

        return validador_hora;

    }

    public void crearSesion(Sesion s) throws SQLException {

        String sql = "INSERT into sesion (fecha, hora_inicio, hora_fin, codTratamiento, codMasajista, codPack, estado, codInstalacion) VALUES(?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(s.getFecha()));
            ps.setTime(2, Time.valueOf(s.getHoraInicio()));
            ps.setTime(3, Time.valueOf(s.getHoraFin()));
            ps.setInt(4, s.getTratamiento().getCodTratam());
            ps.setInt(5, s.getMasajista().getMatricula());
            ps.setInt(6, s.getDiaDeSpa().getCodPack());
            ps.setBoolean(7, s.isEstado());
            ps.setInt(8, s.getInstalaciones().getCodInstal());

            int creacion = ps.executeUpdate();
            System.out.println(creacion);
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                s.setCodSesion(rs.getInt(1));
                System.out.println("Sesion agendada exitosamente");

            } else {

                System.out.println("Error al agendar la sesion");

            }

        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }

    }

    public void crearSesionSinTratamiento(Sesion s) throws SQLException {

        String sql = "INSERT into sesion (fecha, hora_inicio, hora_fin, codTratamiento, codPack, estado, codInstalacion) VALUES(?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(s.getFecha()));
            ps.setTime(2, Time.valueOf(s.getHoraInicio()));
            ps.setTime(3, Time.valueOf(s.getHoraFin()));
            ps.setInt(4, 0);
            ps.setInt(5, s.getDiaDeSpa().getCodPack());
            ps.setBoolean(6, s.isEstado());
            ps.setInt(7, s.getInstalaciones().getCodInstal());

            int creacion = ps.executeUpdate();
            System.out.println(creacion);
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                s.setCodSesion(rs.getInt(1));
                System.out.println("Sesion agendada exitosamente");

            } else {

                System.out.println("Error al agendar la sesion");

            }

        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }

    }

    public void eliminarSesion(int codSesion) {

        String sql = "DELETE from sesion WHERE codSesion = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codSesion);
            ps.executeUpdate();
            ps.close();
            System.out.println("Sesion eliminada correctamente");

        } catch (SQLException ex) {

            System.out.println("Error al eliminar la sesion: " + ex);

        }

    }

    public void actualizarSesion(Sesion s) throws SQLException {

        String sql = "UPDATE sesion SET fecha = ?, hora_inicio = ?, hora_fin = ?, codTratamiento = ?, codMasajista = ?, codPack = ?, estado = ?, codInstalacion = ? WHERE codSesion = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(s.getFecha()));
            ps.setTime(2, Time.valueOf(s.getHoraInicio()));
            ps.setTime(3, Time.valueOf(s.getHoraFin()));
            ps.setInt(4, s.getTratamiento().getCodTratam());
            ps.setInt(5, s.getMasajista().getMatricula());
            ps.setInt(6, s.getDiaDeSpa().getCodPack());
            ps.setBoolean(7, s.isEstado());
            ps.setInt(8, s.getInstalaciones().getCodInstal());
            ps.setInt(9, s.getCodSesion());

            ps.executeUpdate();
            ps.close();
            System.out.println("Sesion actualizada correctamente");

        } catch (SQLException ex) {
            System.out.println("Error al actualizar la sesion: " + ex);
        }
    }

    public void actualizarSesionSinTratamiento(Sesion s) throws SQLException {

        String sql = "UPDATE sesion SET fecha = ?, hora_inicio = ?, hora_fin = ?, codTratamiento = ?, codPack = ?, estado = ?, codInstalacion = ? WHERE codSesion = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(s.getFecha()));
            ps.setTime(2, Time.valueOf(s.getHoraInicio()));
            ps.setTime(3, Time.valueOf(s.getHoraFin()));
            ps.setInt(4, 0);
            ps.setInt(6, s.getDiaDeSpa().getCodPack());
            ps.setBoolean(7, s.isEstado());
            ps.setInt(8, s.getInstalaciones().getCodInstal());
            ps.setInt(9, s.getCodSesion());

            ps.executeUpdate();
            ps.close();
            System.out.println("Sesion actualizada correctamente");

        } catch (SQLException ex) {
            System.out.println("Error al actualizar la sesion: " + ex);
        }
    }

    public List<Sesion> listarSesiones() {

        Sesion s = null;
        List<Sesion> Sesiones = new ArrayList<>();
        String sql = "SELECT * from sesion WHERE estado = 1";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            TratamientoData td = new TratamientoData(this.conexion);
            DiaDeSpaData dd = new DiaDeSpaData(this.conexion);
            MasajistaData md = new MasajistaData(this.conexion);
            InstalacionData id = new InstalacionData(this.conexion);

            while (rs.next()) {

                s = new Sesion();
                s.setCodSesion(rs.getInt("codSesion"));
                s.setFecha(rs.getDate("fecha").toLocalDate());
                s.setHoraInicio(rs.getTime("hora_inicio").toLocalTime());
                s.setHoraFin(rs.getTime("hora_fin").toLocalTime());

                Tratamiento ta = td.buscarTratamiento(rs.getInt("codTratamiento"));
                s.setTratamiento(ta);
                Masajista ma = md.buscarMasajista(rs.getInt("codMasajista"));
                s.setMasajista(ma);
                DiaDeSpa ds = dd.buscarDia(rs.getInt("codPack"));
                s.setDiaDeSpa(ds);
                s.setEstado(rs.getBoolean("estado"));
                Instalacion ic = id.buscarInstalacion(rs.getInt("codInstalacion"));
                s.setInstalaciones(ic);

                Sesiones.add(s);

            }

            for (Sesion ss : Sesiones) {

                System.out.println(Sesiones);

            }

            ps.close();

        } catch (SQLException ex) {

            System.out.println("Error al listar las sesiones: " + ex);

        }

        return Sesiones;
    }

    public Sesion buscarSesion(int codSesion) {
        Sesion s = null;
        String sql = "SELECT * FROM sesion WHERE codSesion = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codSesion);
            ResultSet rs = ps.executeQuery();
            TratamientoData td = new TratamientoData(this.conexion);
            MasajistaData md = new MasajistaData(this.conexion);
            InstalacionData id = new InstalacionData(this.conexion);
            DiaDeSpaData dd = new DiaDeSpaData(this.conexion);
            while (rs.next()) {
                s = new Sesion();
                s.setCodSesion(rs.getInt("codSesion"));
                s.setFecha(rs.getDate("fecha").toLocalDate());
                s.setHoraInicio(rs.getTime("hora_inicio").toLocalTime());
                s.setHoraFin(rs.getTime("hora_fin").toLocalTime());
                Tratamiento ta = td.buscarTratamiento(rs.getInt("codTratamiento"));
                s.setTratamiento(ta);
                Masajista ma = md.buscarMasajista(rs.getInt("codMasajista"));
                s.setMasajista(ma);
                DiaDeSpa ds = dd.buscarDia(rs.getInt("codPack"));
                s.setDiaDeSpa(ds);
                s.setEstado(rs.getBoolean("estado"));
                Instalacion ic = id.buscarInstalacion(rs.getInt("codInstalacion"));
                s.setInstalaciones(ic);

            }
            System.out.println(s.toString());

        } catch (SQLException ex) {
            System.out.println("No existe esa sesion" + ex);
        }

        return s;
    }

    public void altaLogica(Sesion s) {

        String sql = "UPDATE sesion SET estado=1 WHERE codSesion=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, s.getCodSesion());
            ps.executeUpdate();
            ps.close();
            System.out.println("Sesion dada de alta correctamente");

        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }

    }

    public void bajaLogica(Sesion s) {

        String sql = "UPDATE sesion SET estado=0 WHERE codSesion=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, s.getCodSesion());
            ps.executeUpdate();
            ps.close();
            System.out.println("Sesion dada de baja correctamente");

        } catch (SQLException ex) {
            System.out.println("Error de actualizacion " + ex);
        }

    }

    public double calculodeCosto(int cod_pack) {
        String sql = "SELECT s.codPack, SUM(IFNULL(i.precio, 0) + IFNULL(t.costo, 0)) AS Costo_Total_Pack FROM sesion s LEFT JOIN tratamiento t ON s.codTratamiento = t.codTratamiento LEFT JOIN instalacion i ON s.codInstalacion = i.codInstalacion WHERE s.codPack = ? GROUP BY s.codPack;";
        double costoFinal = 0.0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod_pack);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                costoFinal = rs.getDouble("Costo_Total_Pack");
            }
        } catch (SQLException ex) {
            System.out.println("Error al calcular el costo " + ex);
        }

        return costoFinal;
    }

    public List<Instalacion> instalacionesMassolicitadas(LocalDate fecha_inicio, LocalDate fecha_final) {
        Instalacion i = null;
        List<Instalacion> instalaciones = new ArrayList<>();
        String sql = "CALL instalacionesMasSolicitadas(?,?)";
        InstalacionData id = new InstalacionData(this.conexion);
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(fecha_inicio));
            ps.setDate(2, java.sql.Date.valueOf(fecha_final));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                i = new Instalacion();
                i.setCodInstal(rs.getInt("codInstalacion"));
                i.setNombre(rs.getString("nombre"));
                i.setDetalleUso(rs.getString("detalle"));
                i.setPrecio30m(rs.getDouble("precio"));
                i.setEstado(rs.getBoolean("estado"));
                instalaciones.add(i);
            }
            for (Instalacion li : instalaciones) {

                System.out.println(li);

            }
            ps.close();

        } catch (SQLException ex) {

            System.out.println("Error al listar las sesiones en esa fecha: " + ex);

        }
        return instalaciones;
    }

    public List<Tratamiento> tratamientoMasSolicitados(LocalDate fecha_inicio, LocalDate fecha_final) {
        Tratamiento t = null;
        List<Tratamiento> tratamientos = new ArrayList<>();
        String sql = "CALL tratamientoMasSolicitados (?,?);";
        TratamientoData td = new TratamientoData(this.conexion);
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(fecha_inicio));
            ps.setDate(2, java.sql.Date.valueOf(fecha_final));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                t = new Tratamiento();
                t.setCodTratam(rs.getInt("codTratamiento"));
                t.setNombre(rs.getString("nombre"));
                t.setTipo(rs.getString("tipo"));
                t.setDetalle(rs.getString("detalle"));
                t.setProductos(rs.getString("producto"));
                t.setDuracion(rs.getInt("duracion"));
                t.setCosto(rs.getDouble("costo"));
                t.setActivo(rs.getBoolean("estado"));
                tratamientos.add(t);
            }
            for (Tratamiento lt : tratamientos) {

                System.out.println(lt);

            }
            ps.close();

        } catch (SQLException ex) {

            System.out.println("Error al listar los tratamientos en esa fecha: " + ex);

        }

        return tratamientos;

    }

    public List<Sesion> listarSesionesPorFecha(LocalDate fecha) {

        Sesion s = null;
        List<Sesion> Sesiones = new ArrayList<>();
        String sql = "SELECT * from sesion WHERE estado = 1 AND fecha = ?";
        TratamientoData td = new TratamientoData(this.conexion);
        DiaDeSpaData dd = new DiaDeSpaData(this.conexion);
        MasajistaData md = new MasajistaData(this.conexion);
        InstalacionData id = new InstalacionData(this.conexion);
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                s = new Sesion();
                s.setCodSesion(rs.getInt("codSesion"));
                s.setFecha(rs.getDate("fecha").toLocalDate());
                s.setHoraInicio(rs.getTime("hora_inicio").toLocalTime());
                s.setHoraFin(rs.getTime("hora_fin").toLocalTime());

                Tratamiento ta = td.buscarTratamiento(rs.getInt("codTratamiento"));
                s.setTratamiento(ta);
                int codMasajista = rs.getInt("codMasajista");
                if (codMasajista > 0) {
                    Masajista ma = md.buscarMasajista(codMasajista);
                    s.setMasajista(ma);
                } else {
                    
                    s.setMasajista(null);
                }
                DiaDeSpa ds = dd.buscarDia(rs.getInt("codPack"));
                s.setDiaDeSpa(ds);
                s.setEstado(rs.getBoolean("estado"));
                Instalacion ic = id.buscarInstalacion(rs.getInt("codInstalacion"));
                s.setInstalaciones(ic);

                Sesiones.add(s);

            }

            for (Sesion ss : Sesiones) {

                System.out.println(Sesiones);

            }

            ps.close();

        } catch (SQLException ex) {

            System.out.println("Error al listar las sesiones en esa fecha: " + ex);

        }

        return Sesiones;
    }

}
