package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class Conexion {

    private String bd = "3ra_final";
    private String url = "jdbc:postgresql://localhost:5432/" + bd;
    private String user = "postgres";
    private String pass = "SCT-2014";
    private String driver = "org.postgresql.Driver";

    public Connection conectar() {
        try {
            Connection link = null;
            Class.forName(driver);
            link = (Connection) DriverManager.getConnection(url, user, pass);
            return link;

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }

}
