package control;

import datos.IDAO;
import datos.MarcasDAO;
import java.util.ArrayList;
import modelo.gaseosa;

public class MarcasControl implements IDAO {

    @Override
    public ArrayList listar(String condicion) {
        return new MarcasDAO().listar(condicion);
    }

    @Override
    public void insertar(gaseosa gaseosa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(gaseosa gaseosa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(gaseosa gaseosa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
