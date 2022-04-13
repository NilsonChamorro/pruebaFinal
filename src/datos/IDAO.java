package datos;

import java.util.ArrayList;
import modelo.gaseosa;

public interface IDAO {
    public ArrayList listar(String condicion);
    public void insertar(gaseosa gaseosa);
    public void modificar(gaseosa gaseosa);
    public void eliminar(gaseosa gaseosa);

}
