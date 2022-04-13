package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.gaseosa;
import modelo.marcas;

public class GaseosasDAO implements IDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ArrayList<gaseosa> lista = new ArrayList<>();
    gaseosa gaseosaObj;

    @Override
    public ArrayList listar(String condicion) {
        try {
            con = new Conexion().conectar();
            String sql = "SELECT * \n"
                    + "FROM gaseosa g \n"
                    + "LEFT JOIN marcas m on g.marca=m.id\n"
                    + "" + condicion + ";";
            System.err.println(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                marcas marca = new marcas();
                marca.setId(rs.getInt("id"));
                marca.setNombre(rs.getString("nombre"));
                gaseosaObj = new gaseosa(rs.getInt("id"), rs.getString("sabor"), rs.getInt("litros"), rs.getString("envase"), rs.getInt("precio"), rs.getInt("cantidad"), marca);
                lista.add(gaseosaObj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return lista;
    }

    @Override
    public void insertar(gaseosa gaseosa) {
        try {
            con = new Conexion().conectar();
            String sql = "INSERT INTO gaseosa(\n"
                    + "            id, sabor, litros, envase, precio, cantidad, marca)\n"
                    + "    VALUES ((select coalesce((max(id)+1),1) as id from gaseosa), ?, ?, ?, ?, ?, ?);";
            System.err.println(sql);
            ps = con.prepareStatement(sql);
            ps.setString(1, gaseosa.getSabor());
            ps.setInt(2, gaseosa.getLitros());
            ps.setString(3, gaseosa.getEnvase());
            ps.setInt(4, gaseosa.getPrecio());
            ps.setInt(5, gaseosa.getCantidad());
            ps.setInt(6, gaseosa.getMarck().getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void modificar(gaseosa gaseosa) {
        try {
            con = new Conexion().conectar();
            String sql = "UPDATE gaseosa\n"
                    + "   set sabor=?, litros=?, envase=?, precio=?, cantidad=?, marca=?\n"
                    + " WHERE id=?;";
            System.err.println(sql);
            ps = con.prepareStatement(sql);
            ps.setString(1, gaseosa.getSabor());
            ps.setInt(2, gaseosa.getLitros());
            ps.setString(3, gaseosa.getEnvase());
            ps.setInt(4, gaseosa.getPrecio());
            ps.setInt(5, gaseosa.getCantidad());
            ps.setInt(6, gaseosa.getMarck().getId());
            ps.setInt(7, gaseosa.getID());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void eliminar(gaseosa gaseosa) {
        try {
            con = new Conexion().conectar();
            String sql = "DELETE FROM gaseosa\n"
                    + " WHERE id=?;";
            System.err.println(sql);
            ps = con.prepareStatement(sql);
            ps.setInt(1, gaseosa.getID());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
