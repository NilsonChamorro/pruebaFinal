package control;

import datos.GaseosasDAO;
import datos.IDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.gaseosa;

public class GaseosaControl implements IDAO {

    @Override
    public ArrayList listar(String condicion) {
        try {
            return new GaseosasDAO().listar(condicion);
            //} catch (SQLException ex) {
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }

    @Override
    public void insertar(gaseosa gaseosa) {
        try {
            new GaseosasDAO().insertar(gaseosa);
            //} catch (SQLException ex) {
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void modificar(gaseosa gaseosa) {
        try {
            new GaseosasDAO().modificar(gaseosa);
            //} catch (SQLException ex) {
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void eliminar(gaseosa gaseosa) {
        try {
            new GaseosasDAO().eliminar(gaseosa);
            //} catch (SQLException ex) {
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

}
