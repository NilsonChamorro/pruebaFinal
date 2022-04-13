package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.gaseosa;
import modelo.marcas;

public class MarcasDAO implements IDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ArrayList<marcas> lista = new ArrayList<>();
    marcas tiposObj;

    @Override
    public ArrayList listar(String condicion) {
        try {
            con = new Conexion().conectar();
            String sql = "SELECT *FROM marcas " + condicion;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tiposObj = new marcas();
                tiposObj.setId(rs.getInt("id"));
                tiposObj.setNombre(rs.getString("nombre"));
                lista.add(tiposObj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return lista;
    }

    @Override
    public void insertar(gaseosa gaseosa) {

    }

    @Override
    public void modificar(gaseosa gaseosa) {

    }

    @Override
    public void eliminar(gaseosa gaseosa) {

    }

}
