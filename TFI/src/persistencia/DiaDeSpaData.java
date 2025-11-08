package persistencia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.DiaDeSpa;



public class DiaDeSpaData {

    private Connection con = null;
    private Conexion conexion;

    public DiaDeSpaData(Conexion conexion) {
        this.conexion = conexion;

        this.con = conexion.getConexion();

    }

    public void agregarDiaSpa(DiaDeSpa ds) {

        String sql = "INSERT into dia_de_spa (fecha, preferencias, codCli, estado, monto) VALUES(?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(ds.getFecha()));
            ps.setString(2, ds.getPreferencias());
            ps.setInt(3, ds.getCliente().getCodCli());
            ps.setBoolean(4, true);
            ps.setDouble(5, 0);

            int registros = ps.executeUpdate();
            System.out.println(registros);
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                ds.setCodPack(rs.getInt(1));
                System.out.println("Dia de spa fue agregado exitosamente");

            } else {

                System.out.println("Error al cargar este dia de spa");

            }

        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }

    }

    public List<DiaDeSpa> listarDiaSpa() {
        DiaDeSpa unDiasdeSpa = null;
        List<DiaDeSpa> listadoDiaDeSpa = new ArrayList<>();
        String sql = "SELECT * from dia_de_spa WHERE estado = 1";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ClienteData cd = new ClienteData(this.conexion);

            while (rs.next()) {

                unDiasdeSpa = new DiaDeSpa();
                unDiasdeSpa.setCodPack(rs.getInt("codPack"));
                unDiasdeSpa.setFecha(rs.getDate("fecha").toLocalDate());
                unDiasdeSpa.setPreferencias(rs.getString("preferencias"));
                Cliente cliente = cd.buscarCliente(rs.getInt("codCli"));
                unDiasdeSpa.setCliente(cliente);
                unDiasdeSpa.setEstado(rs.getBoolean("estado"));
                unDiasdeSpa.setMonto(rs.getDouble("monto"));

                listadoDiaDeSpa.add(unDiasdeSpa);

            }

            for (DiaDeSpa dias : listadoDiaDeSpa) {

                System.out.println(dias);

            }

            ps.close();

        } catch (SQLException ex) {

            System.out.println("Error al listar los dias: " + ex);

        }

        return listadoDiaDeSpa;
    }

    public void eliminarDiadeSpa(int codigodelpaquete) {

        String sql = "DELETE from dia_de_spa WHERE codPack = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigodelpaquete);
            ps.executeUpdate();
            ps.close();
            System.out.println("Tu dia de Spa se ha eliminado correctamente");

        } catch (SQLException ex) {

            System.out.println("Error al eliminar el dia: " + ex);

        }

    }

    public void actualizarDiaSpa(DiaDeSpa c) {

        String sql = "UPDATE dia_de_spa SET fecha= ? ,preferencias= ? , codCli = ? , estado= ?, monto = ? WHERE codPack = ?";

        try {
            ClienteData cd = new ClienteData(this.conexion);

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(c.getFecha()));
            ps.setString(2, c.getPreferencias());
            ps.setInt(3, c.getCliente().getCodCli());
            ps.setBoolean(4, true);
            ps.setDouble(5, c.getMonto());

            ps.executeUpdate();
            ps.close();
            System.out.println("Dia actualizado correctamente");

        } catch (SQLException ex) {
            System.out.println("Error al actualizar el Dia: " + ex);
        }
    }

    public void altaLogica(DiaDeSpa c) {

        String sql = "UPDATE dia_de_spa SET estado=1 WHERE codPack=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCodPack());
            ps.executeUpdate();
            ps.close();
            System.out.println("Dia dado de alta correctamente");

        } catch (SQLException ex) {
            System.out.println("Error al dar de alta " + ex);
        }

    }

    public void bajaLogica(DiaDeSpa c) {

        String sql = "UPDATE dia_de_spa SET estado=0 WHERE codPack=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCodPack());
            ps.executeUpdate();
            ps.close();
            System.out.println("Dia dado de baja correctamente");

        } catch (SQLException ex) {
            System.out.println("Error al dar de baja " + ex);
        }

    }

    public DiaDeSpa buscarDia(int codPack) {
        Cliente c = null;
        String sql = "SELECT * FROM dia_de_spa WHERE codPack=?";
        PreparedStatement ps;
        DiaDeSpa unDiasdeSpa = new DiaDeSpa();
        try {
            ClienteData cd = new ClienteData(this.conexion);
            ps = con.prepareStatement(sql);
            ps.setInt(1, codPack);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                unDiasdeSpa.setCodPack(rs.getInt("codPack"));
                unDiasdeSpa.setFecha(rs.getDate("fecha").toLocalDate());
                unDiasdeSpa.setPreferencias(rs.getString("preferencias"));
                Cliente cliente = cd.buscarCliente(rs.getInt("codCli"));
                unDiasdeSpa.setCliente(cliente);
                unDiasdeSpa.setEstado(rs.getBoolean("estado"));
                unDiasdeSpa.setMonto(rs.getDouble("monto"));

            }
            

        } catch (SQLException ex) {
            System.out.println("No existe ese dia" + ex);
        }

        return unDiasdeSpa;
    }
}
