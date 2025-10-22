package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.DiaDeSpa;
import modelo.Instalacion;
import modelo.Masajista;
import modelo.Sesion;
import modelo.Tratamiento;
import persistencia.Conexion;

public class SesionData {

    private Connection con = null;

    public SesionData(Conexion conexion) {

        this.con = (Connection) conexion.getConexion();
    }

//ssssssssssssssssssssssss
    public void crearSesion(Sesion s) throws SQLException {

        String sql = "INSERT into sesion (fecha_hora_inicio, fecha_hora_fin, codTratamiento, codMasajista, codPack, estado) VALUES(?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(s.getFechaHoraInicio()));
            ps.setDate(2, Date.valueOf(s.getFechaHoraFin()));
            ps.setInt(3, s.getTratamiento().getCodTratam());
            ps.setInt(4, s.getMasajista().getMatricula());
            ps.setInt(5, s.getDiaDeSpa().getCodPack());
            ps.setBoolean(6, s.isEstado());

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

        String sql = "DELETE from sesion/pack WHERE codSesion = ?";

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

        String sql = "UPDATE sesion SET fecha_hora_inicio = ?, fecha_hora_fin = ?, codTratamiento = ?, codMasajista = ?, codPack = ?, estado = ? WHERE = codSesion = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(s.getFechaHoraInicio()));
            ps.setDate(2, Date.valueOf(s.getFechaHoraFin()));
            ps.setInt(3, s.getTratamiento().getCodTratam());
            ps.setInt(4, s.getMasajista().getMatricula());
            ps.setInt(5, s.getDiaDeSpa().getCodPack());
            ps.setBoolean(6, s.isEstado());

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
        String sql = "SELECT * from sesion/pack";
        
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            TratamientoData td = new TratamientoData((Conexion) con);
            DiaDeSpaData dd = new DiaDeSpaData((Conexion) con);
            MasajistaData md = new MasajistaData((Conexion) con);

            while (rs.next()) {

                s = new Sesion();
                s.setCodSesion(rs.getInt("codSesion"));
                s.setFechaHoraInicio(rs.getDate("fecha_hora_inicio").toLocalDate());
                s.setFechaHoraFin(rs.getDate("fecha_hora_fin").toLocalDate());

                Tratamiento ta = td.buscarTratamiento(rs.getInt("codTratamiento"));
                s.setTratamiento(ta);
                Masajista ma = md.buscarMasajista(rs.getInt("codMasajista"));
                s.setMasajista(ma);
                DiaDeSpa ds = dd.buscarDia(rs.getInt("codPack"));
                s.setDiaDeSpa(ds);

                s.setEstado(rs.getBoolean("estado"));

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
        String sql = "SELECT * FROM sesion/pack WHERE codSesion = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codSesion);
            ResultSet rs = ps.executeQuery();
            TratamientoData td = new TratamientoData((Conexion) con);
            MasajistaData md = new MasajistaData((Conexion) con);
            InstalacionData id = new InstalacionData((Conexion) con);
            DiaDeSpaData dd = new DiaDeSpaData((Conexion) con);
            while (rs.next()) {
                s = new Sesion();
                s.setCodSesion(rs.getInt("codSesion"));
                s.setFechaHoraInicio(rs.getDate("fecha_hora_inicio").toLocalDate());
                s.setFechaHoraFin(rs.getDate("fecha_hora_fin").toLocalDate());
                Tratamiento t = td.buscarTratamiento(rs.getInt("codTratamiento"));
                s.setTratamiento(t);
                Masajista m = md.buscarMasajista(rs.getInt("codMasajista"));
                s.setMasajista(m);
                DiaDeSpa dp = dd.buscarDia(rs.getInt("codPack"));
                s.setDiaDeSpa(dp);// arreglar o revisar llegado el momento
                s.setEstado(rs.getBoolean("estado"));
                Instalacion i = id.buscarInstalacion(rs.getInt("codInstalacion"));
                s.setInstalaciones((List<Instalacion>) i);

            }
            System.out.println(s.toString());

        } catch (SQLException ex) {
            System.out.println("No existe ese cliente" + ex);
        }

        return s;
    }

    public void altaLogica(Sesion s) {

        String sql = "UPDATE sesion/pack SET estado=1 WHERE codSesion=?";

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

        String sql = "UPDATE sesion/pack SET estado=0 WHERE codSesion=?";

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
}
