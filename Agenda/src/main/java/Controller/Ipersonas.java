
package Controller;

import javax.swing.table.DefaultTableModel;
import modelo.personas;

public interface Ipersonas {
    
     public boolean Guardar(personas persona);
    
    public boolean Actualizar(personas persona, int id_persona);
    
    public boolean Eliminar(int id_persona);
    
    public void Consultar(DefaultTableModel modelo);
    
}
